package MHF.Model;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;
public class ModelKirin extends ModelBase
{//fields
    ModelRenderer Head;
    ModelRenderer Neck;
    ModelRenderer FrontBody;
    ModelRenderer MidBody;
    ModelRenderer Core;
    ModelRenderer RightFoot;
    ModelRenderer LeftFoot;
    ModelRenderer BRightFoot;
    ModelRenderer BackBody;
    ModelRenderer Tail;
    ModelRenderer Hair;
    ModelRenderer BpdyHair;
    ModelRenderer HORN;
    ModelRenderer BLeftFoot;
    ModelRenderer tailHair;
    ModelRenderer ear1;
    ModelRenderer ear2;
  
  public ModelKirin()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      
      Head = new ModelRenderer(this, 96, 0);
      Head.addBox(-3F, -7F, -7F, 5, 5, 11);
      Head.setRotationPoint(1F, -3.466667F, -9.5F);
      Head.setTextureSize(128, 64);
      Head.mirror = true;
      setRotation(Head, 0.1487144F, 0F, 0F);
      
      Neck = new ModelRenderer(this, 106, 23);
      Neck.addBox(-2F, -15F, -3F, 5, 13, 6);
      Neck.setRotationPoint(0F, 9F, -9F);
      Neck.setTextureSize(128, 64);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      
      FrontBody = new ModelRenderer(this, 0, 44);
      FrontBody.addBox(-5F, 0F, -7F, 9, 9, 11);
      FrontBody.setRotationPoint(1F, 3F, -5F);
      FrontBody.setTextureSize(128, 64);
      FrontBody.mirror = true;
      setRotation(FrontBody, 0F, 0F, 0F);
      
    ;
      MidBody = new ModelRenderer(this, 0, 25);
      MidBody.addBox(-6F, 0F, 0F, 9, 7, 12);
      MidBody.setRotationPoint(2F, 3F, -1F);
      MidBody.setTextureSize(128, 64);
      MidBody.mirror = true;
      setRotation(MidBody, 0F, 0F, 0F);
      
      Core = new ModelRenderer(this, 55, 17);
      Core.addBox(0F, 0F, 0F, 7, 4, 3);
      Core.setRotationPoint(-3F, 11F, -5F);
      Core.setTextureSize(128, 64);
      Core.mirror = true;
      setRotation(Core, 1.237222F, 0F, 0F);
      
      RightFoot = new ModelRenderer(this, 58, 40);
      RightFoot.addBox(0F, 0F, 0F, 4, 20, 4);
      RightFoot.setRotationPoint(-4F, 4F, -11F);
      RightFoot.setTextureSize(128, 64);
      RightFoot.mirror = true;
      setRotation(RightFoot, 0F, 0F, 0F);
      
      LeftFoot = new ModelRenderer(this, 58, 40);
      LeftFoot.addBox(0F, 0F, 0F, 4, 20, 4);
      LeftFoot.setRotationPoint(1F, 4F, -11F);
      LeftFoot.setTextureSize(128, 64);
      LeftFoot.mirror = true;
      setRotation(LeftFoot, 0F, 0F, 0F);
      
      BRightFoot = new ModelRenderer(this, 58, 40);
      BRightFoot.addBox(0F, 0F, 0F, 4, 20, 4);
      BRightFoot.setRotationPoint(-4F, 5F, 8F);
      BRightFoot.setTextureSize(128, 64);
      BRightFoot.mirror = true;
      setRotation(BRightFoot, 0F, 0F, 0F);
      
      BackBody = new ModelRenderer(this, 51, 25);
      BackBody.addBox(2F, 0F, 0F, 9, 8, 7);
      BackBody.setRotationPoint(-6F, 3F, 5F);
      BackBody.setTextureSize(128, 64);
      BackBody.mirror = true;
      setRotation(BackBody, 0F, 0F, 0F);
     
      Tail = new ModelRenderer(this, 74, 43);
      Tail.addBox(-2F, 0F, 0F, 3, 19, 2);
      Tail.setRotationPoint(1F, 4F, 10F);
      Tail.setTextureSize(128, 64);
      Tail.mirror = true;
      setRotation(Tail, 0.4833219F, 0F, 0F);
      
      Hair = new ModelRenderer(this, 6, 3);
      Hair.addBox(0F, -11F, 0F, 1, 14, 6);
      Hair.setRotationPoint(0F, 1F, -9F);
      Hair.setTextureSize(128, 64);
      Hair.mirror = true;
      setRotation(Hair, 0F, 0F, 0F);
      BpdyHair = new ModelRenderer(this, 86, 20);
      BpdyHair.addBox(0F, 0F, 0F, 1, 14, 3);
      BpdyHair.setRotationPoint(0F, 4F, -3F);
      BpdyHair.setTextureSize(128, 64);
      BpdyHair.mirror = true;
      setRotation(BpdyHair, 1.570796F, 0F, 0F);
      HORN = new ModelRenderer(this, 48, 0);
      HORN.addBox(0F, 0F, -13F, 1, 1, 13);
      HORN.setRotationPoint(0F, -9F, -9F);
      HORN.setTextureSize(128, 64);
      HORN.mirror = true;
      setRotation(HORN, -0.5576792F, 0F, 0F);
      BLeftFoot = new ModelRenderer(this, 58, 40);
      BLeftFoot.addBox(0F, 0F, 0F, 4, 20, 4);
      BLeftFoot.setRotationPoint(1F, 5F, 8F);
      BLeftFoot.setTextureSize(128, 64);
      BLeftFoot.mirror = true;
      setRotation(BLeftFoot, 0F, 0F, 0F);
      tailHair = new ModelRenderer(this, 100, 40);
      tailHair.addBox(0F, 0F, 0F, 1, 17, 1);
      tailHair.setRotationPoint(0F, 4F, 12F);
      tailHair.setTextureSize(128, 64);
      tailHair.mirror = true;
      setRotation(tailHair, 0.4833166F, 0F, 0F);
      ear1 = new ModelRenderer(this, 0, 0);
      ear1.addBox(-2F, -3F, -1F, 2, 4, 1);
      ear1.setRotationPoint(0F, -9F, -8F);
      ear1.setTextureSize(128, 64);
      ear1.mirror = true;
      setRotation(ear1, 0F, 0F, -0.4833219F);
      ear2 = new ModelRenderer(this, 0, 0);
      ear2.addBox(-1F, -4F, -1F, 2, 4, 1);
      ear2.setRotationPoint(2F, -7.7F, -8F);
      ear2.setTextureSize(128, 64);
      ear2.mirror = true;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Head.render(f5);
    Neck.render(f5);
    FrontBody.render(f5);
    MidBody.render(f5);
    Core.render(f5);
    RightFoot.render(f5);
    LeftFoot.render(f5);
    BRightFoot.render(f5);
    BackBody.render(f5);
    Tail.render(f5);
    Hair.render(f5);
    BpdyHair.render(f5);
    HORN.render(f5);
    BLeftFoot.render(f5);
    tailHair.render(f5);
    ear1.render(f5);
    ear2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
    this.HORN.rotateAngleY = this.Head.rotateAngleY;
    this.Neck.rotateAngleY = this.Head.rotateAngleY;
    this.ear1.rotateAngleY = this.Head.rotateAngleY;
    this.ear2.rotateAngleY = this.Head.rotateAngleY;
    this.Hair.rotateAngleY = this.Head.rotateAngleY;
    this.LeftFoot.rotateAngleX = MathHelper.cos(f * 0.4F) * 1.0F * f1;
    this.RightFoot.rotateAngleX = MathHelper.cos(f * 0.4F + (float)Math.PI) * 1.0F * f1;
    this.BLeftFoot.rotateAngleX = MathHelper.cos(f * 0.4F) * 1.0F * f1;
    this.BRightFoot.rotateAngleX = MathHelper.cos(f * 0.4F + (float)Math.PI) * 1.0F * f1;
    this.Tail.rotateAngleY = MathHelper.cos(f2 * 0.7F);
    this.tailHair.rotateAngleY = this.Tail.rotateAngleY;
    
        	}
}
