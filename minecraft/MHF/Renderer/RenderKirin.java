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
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.passive.EntityCow;

@SideOnly(Side.CLIENT)
public class RenderKirin extends RenderLiving
{
	private float scale;
	
	public RenderKirin(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
        
        }
	    protected void preRenderScale(EntityKirin par1EntityKirin, float par2)
	    {
	        GL11.glScalef(this.scale, this.scale, this.scale);
	    }

	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void preRenderCallback(EntityLiving par1EntityKirin, float par2)
	    {
	        this.preRenderScale((EntityKirin)par1EntityKirin, par2);
	    }
	    public void renderCow(EntityKirin par1EntityKirin, double par2, double par4, double par6, float par8, float par9)
	    {
	        super.doRenderLiving(par1EntityKirin, par2, par4, par6, par8, par9);
	    }

	    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
	    {
	        this.renderCow((EntityKirin)par1EntityLiving, par2, par4, par6, par8, par9);
	    }
	    /**
	     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
	     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
	     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
	     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
	     */
	    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
	    {
	        this.renderCow((EntityKirin)par1Entity, par2, par4, par6, par8, par9);
	    }
}