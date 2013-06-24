package MHF.Renderer;
import MHF.Model.*;
import MHF.Entity.*;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;

public class RenderBullfango extends RenderLiving{

	protected ModelBullfango model;
	 
	public RenderBullfango (ModelBullfango modelBullfango, float f)
	{
	 super(modelBullfango, f);
	 model = ((ModelBullfango)mainModel);
	}
	
	public void renderBullfango(EntityBullfango entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(entity, par2, par4, par6, par8, par9);
    }
 
 public void doRenderLiving(EntityBullfango par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderBullfango((EntityBullfango)par1EntityLiving, par2, par4, par6, par8, par9);
    }
 
 public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderBullfango((EntityBullfango)par1Entity, par2, par4, par6, par8, par9);
    }

}


