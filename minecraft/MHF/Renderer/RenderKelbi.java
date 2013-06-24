package MHF.Renderer;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import MHF.Model.*;
import MHF.Entity.*;

public class RenderKelbi extends RenderLiving{
	
	protected ModelKelbi model;
	 
	public RenderKelbi (ModelKelbi modelKelbi, float f)
	{
	 super(modelKelbi, f);
	 model = ((ModelKelbi)mainModel);
	}
	
	public void renderKelbi(EntityKelbi entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderKelbi((EntityKelbi)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderKelbi((EntityKelbi)par1Entity, par2, par4, par6, par8, par9);
    }

}
