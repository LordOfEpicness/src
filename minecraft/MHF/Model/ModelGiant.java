package MHF.Model;

import MHF.Entity.EntityGiant;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.MathHelper;

public class ModelGiant extends ModelBase
{
  //fields
    ModelRenderer mustache;
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftleg;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
  
  public ModelGiant()
  {
    textureWidth = 64;
    textureHeight = 128;
    
      mustache = new ModelRenderer(this, 0, 42);
      mustache.addBox(0F, 0F, 0F, 9, 9, 3);
      mustache.setRotationPoint(-4F, -1F, 3F);
      mustache.setTextureSize(64, 128);
      mustache.mirror = true;
      setRotation(mustache, 0F, 0F, 0F);
      head = new ModelRenderer(this, 0, 84);
      head.addBox(-4F, -8F, -4F, 11, 9, 9);
      head.setRotationPoint(-1F, -1F, -1F);
      head.setTextureSize(64, 128);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 19, 105);
      body.addBox(-4F, 0F, -2F, 13, 14, 9);
      body.setRotationPoint(-2F, 0F, -3F);
      body.setTextureSize(64, 128);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      rightarm = new ModelRenderer(this, 34, 16);
      rightarm.addBox(-3F, -2F, -2F, 5, 14, 9);
      rightarm.setRotationPoint(-7F, 2F, -3F);
      rightarm.setTextureSize(64, 128);
      rightarm.mirror = true;
      setRotation(rightarm, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 6, 12, 8);
      leftleg.setRotationPoint(2F, 12F, -2F);
      leftleg.setTextureSize(64, 128);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      leftarm = new ModelRenderer(this, 34, 16);
      leftarm.addBox(0F, 0F, 0F, 5, 14, 9);
      leftarm.setRotationPoint(7F, 0F, -5F);
      leftarm.setTextureSize(64, 128);
      leftarm.mirror = true;
      setRotation(leftarm, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(0F, 0F, 0F, 6, 12, 8);
      rightleg.setRotationPoint(-6F, 12F, -4F);
      rightleg.setTextureSize(64, 128);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    mustache.render(f5);
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftleg.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
    this.leftleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.rightleg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    this.rightarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
    this.leftarm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
    
    
  }
  public void setLivingAnimations(EntityLiving par1EntityLiving, float par2, float par3, float par4)
  {
      EntityGiant entitygiant = (EntityGiant)par1EntityLiving;
      int i = entitygiant.getAttackTimer();

      if (i > 0)
      {
          this.rightarm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F);
          this.leftarm.rotateAngleX = -2.0F + 1.5F * this.func_78172_a((float)i - par4, 10.0F);
      }
  }
       
     
  

  private float func_78172_a(float par1, float par2)
  {
      return (Math.abs(par1 % par2 - par2 * 0.5F) - par2 * 0.25F) / (par2 * 0.25F);
  }
}


