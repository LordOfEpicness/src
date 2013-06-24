package MHF.Renderer;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import MHF.Model.*;
import MHF.Entity.*;
public class RenderMosswine extends RenderLiving{

	protected ModelMosswine model;
	 
	public RenderMosswine (ModelMosswine modelMosswine, float f)
	{
	 super(modelMosswine, f);
	 model = ((ModelMosswine)mainModel);
	}

	public void renderMosswine(EntityMosswine entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderMosswine((EntityMosswine)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderMosswine((EntityMosswine)par1Entity, par2, par4, par6, par8, par9);
    }

}
