package MHF.Model;

import MHF.Entity.EntityWarriorFinale;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.src.*;

public class ModelWarriorFinale extends ModelBase
{
	//fields
   public ModelRenderer head;
   public ModelRenderer body;
   public ModelRenderer rightarm;
   public ModelRenderer leftarm;
   public ModelRenderer rightleg;
   public ModelRenderer leftleg;
   
      public int heldItemRight;
   
  
  public ModelWarriorFinale()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      this.  head = new ModelRenderer(this, 0, 0);
      this.  head.addBox(-4F, -8F, -4F, 8, 8, 8);
      this.  head.setRotationPoint(0F, 0F, 0F);
      this. head.setTextureSize(64, 32);
      this. head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      this.  body = new ModelRenderer(this, 16, 16);
      this.  body.addBox(-4F, 0F, -2F, 8, 12, 4);
      this.  body.setRotationPoint(0F, 0F, 0F);
      this.  body.setTextureSize(64, 32);
      this.  body.mirror = true;
      this. setRotation(body, 0F, 0F, 0F);
      this. rightarm = new ModelRenderer(this, 40, 16);
      this. rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      this. rightarm.setRotationPoint(-5F, 2F, 0F);
      this. rightarm.setTextureSize(64, 32);
      this. rightarm.mirror = true;
      this.setRotation(rightarm, 0F, 0F, 0F);
      this.leftarm = new ModelRenderer(this, 40, 16);
      this.leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      this.leftarm.setRotationPoint(5F, 2F, 0F);
      this.leftarm.setTextureSize(64, 32);
      this. leftarm.mirror = true;
      this.setRotation(leftarm, 0F, 0F, 0F);
      this.rightleg = new ModelRenderer(this, 0, 16);
      this. rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      this. rightleg.setRotationPoint(-2F, 12F, 0F);
      this. rightleg.setTextureSize(64, 32);
      this. rightleg.mirror = true;
      this.setRotation(rightleg, 0F, 0F, 0F);
      this.leftleg = new ModelRenderer(this, 0, 16);
      this. leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      this. leftleg.setRotationPoint(2F, 12F, 0F);
      this. leftleg.setTextureSize(64, 32);
      this. leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    
  }
  
  private void setRotation(ModelRenderer modelWarriorFinale, float x, float y, float z)
  {
    modelWarriorFinale.rotateAngleX = x;
    modelWarriorFinale.rotateAngleY = y;
    modelWarriorFinale.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

public void doRenderLiving(EntityWarriorFinale var1, double var2, double var4,
		double var6, float var8, float var9) {
	// TODO Auto-generated method stub
	
}

}

