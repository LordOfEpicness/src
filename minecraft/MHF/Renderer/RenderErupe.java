package MHF.Renderer;

import org.lwjgl.opengl.GL11;
import MHF.Model.*;
import MHF.Entity.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityWolf;


@SideOnly(Side.CLIENT)
public class RenderErupe extends RenderLiving
{
	

	private float scale;
	
	public RenderErupe(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
        
        }
	    protected void preRenderScale(EntityErupe par1EntityErupe, float par2)
	    {
	        GL11.glScalef(this.scale, this.scale, this.scale);
	    }

	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void preRenderCallback(EntityLiving par1EntityErupe, float par2)
	    {
	        this.preRenderScale((EntityErupe)par1EntityErupe, par2);
	    }
	    public void renderCow(EntityErupe par1EntityErupe, double par2, double par4, double par6, float par8, float par9)
	    {
	        super.doRenderLiving(par1EntityErupe, par2, par4, par6, par8, par9);
	    }

	    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	    {
	        this.renderCow((EntityErupe)par1EntityLiving, par2, par4, par6, par8, par9);
	    }
	
}