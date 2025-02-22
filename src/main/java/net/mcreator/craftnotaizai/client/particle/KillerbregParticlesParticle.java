
package net.mcreator.craftnotaizai.client.particle;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderLevelStageEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftnotaizai.client.model.ModelKiller_iceberg;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;

@OnlyIn(Dist.CLIENT)
public class KillerbregParticlesParticle extends TextureSheetParticle {
	public static KillerbregParticlesParticleProvider provider(SpriteSet spriteSet) {
		return new KillerbregParticlesParticleProvider(spriteSet);
	}

	public static class KillerbregParticlesParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public KillerbregParticlesParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			KillerbregParticlesParticle particle = new KillerbregParticlesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
			class KillerbregParticlesRenderSequence {
				private ClientLevel world;
				public EntityModel model = new ModelKiller_iceberg(Minecraft.getInstance().getEntityModels().bakeLayer(ModelKiller_iceberg.LAYER_LOCATION));
				private float scale = (float) 1;
				private int rotX = (int) 50;
				private int rotY = (int) 50;
				private int rotZ = (int) 50;

				@SubscribeEvent
				public void render(RenderLevelStageEvent event) {
					if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_PARTICLES) {
						VertexConsumer consumer = Minecraft.getInstance().renderBuffers().bufferSource().getBuffer(RenderType.entityTranslucent(new ResourceLocation("craft_no_taizai:textures/particle/killerbreg_particles.png")));
						Vec3 camPos = event.getCamera().getPosition();
						double x = Mth.lerp(event.getPartialTick(), particle.xo, particle.x) - camPos.x();
						double y = Mth.lerp(event.getPartialTick(), particle.yo, particle.y) - camPos.y();
						double z = Mth.lerp(event.getPartialTick(), particle.zo, particle.z) - camPos.z();
						event.getPoseStack().pushPose();
						event.getPoseStack().translate(x, y, z);
						event.getPoseStack().mulPose(Axis.XP.rotationDegrees(180));
						event.getPoseStack().scale(scale, scale, scale);
						event.getPoseStack().mulPose(Axis.XP.rotationDegrees(rotX));
						event.getPoseStack().mulPose(Axis.YP.rotationDegrees(rotY));
						event.getPoseStack().mulPose(Axis.ZP.rotationDegrees(rotZ));
						model.renderToBuffer(event.getPoseStack(), consumer, particle.getLightColor(event.getPartialTick()), OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
						event.getPoseStack().popPose();
					}
				}

				public void start(ClientLevel world) {
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ClientTickEvent event) {
					if (!particle.isAlive())
						end();
				}

				@SubscribeEvent
				public void dimensionChange(PlayerEvent.PlayerChangedDimensionEvent event) {
					end();
				}

				@SubscribeEvent
				public void loggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
					end();
				}

				private void end() {
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}
			KillerbregParticlesRenderSequence sequence = new KillerbregParticlesRenderSequence();
			sequence.start(worldIn);
			return particle;
		}
	}

	private final SpriteSet spriteSet;

	protected KillerbregParticlesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.lifetime = (int) Math.max(1, 7 + (this.random.nextInt(8) - 4));
		this.gravity = 0f;
		this.hasPhysics = true;
		this.xd = vx * 1;
		this.yd = vy * 1;
		this.zd = vz * 1;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.NO_RENDER;
	}

	@Override
	public void tick() {
		super.tick();
	}
}
