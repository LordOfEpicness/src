package MHF.Renderer;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityIronGolem;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import MHF.Entity.EntityFelyne;
import MHF.Model.ModelFelyne;

public class RenderFelyne extends RenderLiving{

	protected ModelFelyne model;
	 
	public RenderFelyne (ModelFelyne modelFelyne, float f)
	 {
	  super(new ModelFelyne(), 0.5F);
	 }
	
	public void renderFelyne(EntityFelyne entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
	
	protected void renderIronGolemEquippedItems(EntityIronGolem par1EntityIronGolem, float par2)
    {
        super.renderEquippedItems(par1EntityIronGolem, par2);

        if (par1EntityIronGolem.getHoldRoseTick() != 0)
        {
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            GL11.glPushMatrix();
            GL11.glRotatef(5.0F + 180.0F * this.model.rightarm.rotateAngleX / (float)Math.PI, 1.0F, 0.0F, 0.0F);
            GL11.glTranslatef(-0.6875F, 1.25F, -0.9375F);
            GL11.glRotatef(90.0F, 1.0F, 0.0F, 0.0F);
            float var3 = 0.8F;
            GL11.glScalef(var3, -var3, var3);
            int var4 = par1EntityIronGolem.getBrightnessForRender(par2);
            int var5 = var4 % 65536;
            int var6 = var4 / 65536;
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)var5 / 1.0F, (float)var6 / 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.loadTexture("/terrain.png");
            this.renderBlocks.renderBlockAsItem(Block.plantRed, 0, 1.0F);
            GL11.glPopMatrix();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
        }
    }

    protected void renderEquippedItems(EntityLiving par1EntityLiving, float par2)
    {
        this.renderIronGolemEquippedItems((EntityIronGolem)par1EntityLiving, par2);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderFelyne((EntityFelyne)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderFelyne((EntityFelyne)par1Entity, par2, par4, par6, par8, par9);
    }
	
}


