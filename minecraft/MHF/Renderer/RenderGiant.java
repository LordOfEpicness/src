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
public class RenderGiant extends RenderLiving
{
	private float scale;
	
	public RenderGiant(ModelBase par1ModelBase, float par2, float par3)
    {
        super(par1ModelBase, par2 * par3);
        this.scale = par3;
        
        }
	    protected void preRenderScale(EntityGiant par1EntityGiant, float par2)
	    {
	        GL11.glScalef(this.scale, this.scale, this.scale);
	    }

	    /**
	     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
	     * entityLiving, partialTickTime
	     */
	    protected void preRenderCallback(EntityLiving par1EntityGiant, float par2)
	    {
	        this.preRenderScale((EntityGiant)par1EntityGiant, par2);
	    }
	
}