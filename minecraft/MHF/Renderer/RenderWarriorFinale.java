package MHF.Renderer;

import MHF.Model.*;
import MHF.Entity.*;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityVillager;

@SideOnly(Side.CLIENT)
public class RenderWarriorFinale extends RenderBiped
{
    public RenderWarriorFinale(ModelBiped RenderBiped, float f)
    {
        super(new ModelBiped(), 0.5F);
    }

    public void renderEntityWarriorFinale(EntityWarriorFinale var1, double var2, double var4, double var6, float var8, float var9)
    {
        super.doRenderLiving(var1, var2, var4, var6, var8, var9);
    }

    public void doRender(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderEntityWarriorFinale((EntityWarriorFinale)var1, var2, var4, var6, var8, var9);
    }

    public void doRenderLiving(Entity var1, double var2, double var4, double var6, float var8, float var9)
    {
        this.renderEntityWarriorFinale((EntityWarriorFinale)var1, var2, var4, var6, var8, var9);
    }
}
