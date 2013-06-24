package MHF.Renderer;

import MHF.Model.*;
import MHF.Entity.*;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;

public class RenderFish extends RenderLiving{

	protected ModelFish model;
	 
	public RenderFish (ModelFish modelFish, float f)
	{
	 super(modelFish, f);
	 model = ((ModelFish)mainModel);
	}
	
	public void renderFish(EntityFish entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityFish par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderFish((EntityFish)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderFish((EntityFish)par1Entity, par2, par4, par6, par8, par9);
    }

}


