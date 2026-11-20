package com.hungteen.pvz.client.render.layer;

import com.hungteen.pvz.common.entity.zombie.base.EdgarRobotEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.vector.Matrix4f;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.ArrayList;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class LightShieldLayer<T extends Entity> extends LayerRenderer<T, EntityModel<T>> {

    private static final List<float[][]> SOCCER_BALL_FACES = SoccerBallGenerator.generateSoccerBall();

    public LightShieldLayer(IEntityRenderer<T, EntityModel<T>> entityRendererIn) {
        super(entityRendererIn);
    }

    private static class ShieldRenderState extends net.minecraft.client.renderer.RenderState {
        public ShieldRenderState(String name, Runnable setup, Runnable clean) {
            super(name, setup, clean);
        }

        public static final RenderType SHIELD_FILL = RenderType.create(
                "pvz_shield_fill",
                DefaultVertexFormats.POSITION_COLOR_LIGHTMAP,
                7, // GL_QUADS
                256,
                true,
                true,
                RenderType.State.builder()
                        .setTextureState(NO_TEXTURE)
                        .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                        .setCullState(NO_CULL)
                        .setLightmapState(LIGHTMAP)
                        .setDepthTestState(LEQUAL_DEPTH_TEST)
                        .setWriteMaskState(COLOR_WRITE)
                        .createCompositeState(false)
        );
    }

    @Override
    public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn,
                       float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw,
                       float headPitch) {

        if (entitylivingbaseIn.isAlive() && !entitylivingbaseIn.isInvisible() && entitylivingbaseIn instanceof EdgarRobotEntity) {
            EdgarRobotEntity robot = (EdgarRobotEntity) entitylivingbaseIn;

            int[] colorRGB;
            EdgarRobotEntity.FieldStates state = robot.getFieldState();
            if (state == EdgarRobotEntity.FieldStates.Defensive) {
                colorRGB = new int[]{80, 140, 255}; // 蓝色
            } else if (state == EdgarRobotEntity.FieldStates.Resistance || state == EdgarRobotEntity.FieldStates.BallResistance) {
                colorRGB = new int[]{255, 30, 40};  // 红色
            } else if (state == EdgarRobotEntity.FieldStates.Rune) {
                colorRGB = new int[]{255, 220, 30}; // 金黄色
            } else {
                return; // Default 或 None，不进行渲染
            }
            float totalAge = entitylivingbaseIn.tickCount + partialTicks;
            float pulsate = (float) (Math.sin(totalAge * 0.12F) * 0.08F + 0.92F);
            float baseRadius = 3.5F;
            float yOffset = -1.5f;

            matrixStackIn.pushPose();
            matrixStackIn.mulPose(Vector3f.YP.rotationDegrees(totalAge * 1.5F));
            Matrix4f matrix4f = matrixStackIn.last().pose();

            // 渲染填充面
            IVertexBuilder fillBuffer = bufferIn.getBuffer(ShieldRenderState.SHIELD_FILL);
            for (float[][] face : SOCCER_BALL_FACES) {
                renderPolygon(fillBuffer, matrix4f, face, baseRadius, yOffset, pulsate, false, colorRGB);
            }

            // 渲染网格线框
            IVertexBuilder lineBuffer = bufferIn.getBuffer(RenderType.lines());
            for (float[][] face : SOCCER_BALL_FACES) {
                renderPolygon(lineBuffer, matrix4f, face, baseRadius + 0.01F, yOffset, pulsate, true, colorRGB);
            }

            matrixStackIn.popPose();
        }
    }

    private void renderPolygon(IVertexBuilder buffer, Matrix4f matrix, float[][] vertices,
                               float radius, float yOffset, float pulsate, boolean isLine, int[] color) {
        if (isLine) {
            for (int i = 0; i < vertices.length; i++) {
                float[] start = vertices[i];
                float[] end = vertices[(i + 1) % vertices.length];
                addVertex(buffer, matrix, start, radius, yOffset, pulsate, true, color);
                addVertex(buffer, matrix, end, radius, yOffset, pulsate, true, color);
            }
        } else {
            for (int i = 1; i < vertices.length - 1; i++) {
                addVertex(buffer, matrix, vertices[0], radius, yOffset, pulsate, false, color);
                addVertex(buffer, matrix, vertices[i], radius, yOffset, pulsate, false, color);
                addVertex(buffer, matrix, vertices[i+1], radius, yOffset, pulsate, false, color);
                addVertex(buffer, matrix, vertices[i+1], radius, yOffset, pulsate, false, color);
            }
        }
    }

    private void addVertex(IVertexBuilder buffer, Matrix4f matrix, float[] pos,
                           float radius, float yOffset, float pulsate, boolean isLine, int[] color) {
        int a = isLine ? 230 : 65;
        float whiteIntensity = isLine ? 0.3F : 0.05F;
        float whiteLerp = Math.max(0, (pulsate - 0.9F) / 0.1F);

        int finalR = (int) Math.min(255, color[0] + (255 - color[0]) * whiteLerp * whiteIntensity);
        int finalG = (int) Math.min(255, color[1] + (255 - color[1]) * whiteLerp * whiteIntensity);
        int finalB = (int) Math.min(255, color[2] + (255 - color[2]) * whiteLerp * whiteIntensity);
        int finalA = (int) (a * pulsate);

        float x = pos[0] * radius;
        float y = pos[1] * radius + yOffset;
        float z = pos[2] * radius;

        buffer.vertex(matrix, x, y, z).color(finalR, finalG, finalB, finalA);
        if (isLine) {
            buffer.normal(pos[0], pos[1], pos[2]).endVertex();
        } else {
            buffer.uv2(15728880).endVertex();
        }
    }

    private static class SoccerBallGenerator {
        public static List<float[][]> generateSoccerBall() {
            List<float[][]> faces = new ArrayList<>();
            float phi = (1.0f + (float) Math.sqrt(5.0f)) / 2.0f;
            float[][] v = {{-1, phi, 0}, {1, phi, 0}, {-1, -phi, 0}, {1, -phi, 0}, {0, -1, phi}, {0, 1, phi}, {0, -1, -phi}, {0, 1, -phi}, {phi, 0, -1}, {phi, 0, 1}, {-phi, 0, -1}, {-phi, 0, 1}};
            int[][] triangles = {{0,11,5}, {0,5,1}, {0,1,7}, {0,7,10}, {0,10,11}, {1,5,9}, {5,11,4}, {11,10,2}, {10,7,6}, {7,1,8}, {3,9,4}, {3,4,2}, {3,2,6}, {3,6,8}, {3,8,9}, {4,9,5}, {2,4,11}, {6,2,10}, {8,6,7}, {9,8,1}};
            int[][] neighbors = {{11, 5, 1, 7, 10}, {0, 5, 9, 8, 7}, {11, 4, 3, 6, 10}, {2, 4, 9, 8, 6}, {5, 9, 3, 2, 11}, {0, 11, 4, 9, 1}, {10, 2, 3, 8, 7}, {0, 1, 8, 6, 10}, {1, 9, 3, 6, 7}, {1, 5, 4, 3, 8}, {0, 7, 6, 2, 11}, {0, 10, 2, 4, 5}};

            for (int[] t : triangles) {
                float[][] hex = new float[6][3];
                hex[0]=interp(v[t[0]],v[t[1]],1/3f); hex[1]=interp(v[t[0]],v[t[1]],2/3f);
                hex[2]=interp(v[t[1]],v[t[2]],1/3f); hex[3]=interp(v[t[1]],v[t[2]],2/3f);
                hex[4]=interp(v[t[2]],v[t[0]],1/3f); hex[5]=interp(v[t[2]],v[t[0]],2/3f);
                faces.add(norm(hex));
            }
            for (int i=0; i<12; i++) {
                float[][] pent = new float[5][3];
                for (int j=0; j<5; j++) pent[j]=interp(v[i],v[neighbors[i][j]],1/3f);
                faces.add(norm(pent));
            }
            return faces;
        }
        private static float[] interp(float[] a, float[] b, float t) { return new float[]{a[0]+(b[0]-a[0])*t, a[1]+(b[1]-a[1])*t, a[2]+(b[2]-a[2])*t}; }
        private static float[][] norm(float[][] f) { for(float[] p:f){float m=(float)Math.sqrt(p[0]*p[0]+p[1]*p[1]+p[2]*p[2]);p[0]/=m;p[1]/=m;p[2]/=m;} return f; }
    }
}