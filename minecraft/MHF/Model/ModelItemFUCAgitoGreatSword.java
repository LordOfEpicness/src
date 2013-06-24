package MHF.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelItemFUCAgitoGreatSword extends ModelBase
{
  //fields
    ModelRenderer handle;
    ModelRenderer Handle_part;
    ModelRenderer Pummel;
    ModelRenderer hilt;
    ModelRenderer Blade_part_1;
    ModelRenderer Blade_part_2;
    ModelRenderer Blade_part_3;
    ModelRenderer Blade_part_4_;
    ModelRenderer Blade_part_5;
    ModelRenderer Blade_part_6;
    ModelRenderer Blade_part_7;
    ModelRenderer Blade_part_8;
    ModelRenderer Fang_part_1;
    ModelRenderer Fang_part_2;
    ModelRenderer Fang_part_3;
    ModelRenderer Fang_part_4;
    ModelRenderer Fang_part_5;
    ModelRenderer Fang_part_6;
    ModelRenderer Fang_part_8;
    ModelRenderer Fang_part_9;
    ModelRenderer Fang_part_10;
    ModelRenderer Fang_part_11;
  
  public ModelItemFUCAgitoGreatSword ()
  {
    textureWidth = 128;
    textureHeight = 128;
    
      handle = new ModelRenderer(this, 0, 111);
      handle.addBox(0F, 0F, 0F, 1, 16, 1);
      handle.setRotationPoint(0F, 0F, 0F);
      handle.setTextureSize(128, 128);
      handle.mirror = true;
      setRotation(handle, 0F, 0F, 0F);
      Handle_part = new ModelRenderer(this, 120, 0);
      Handle_part.addBox(0F, 0F, 0F, 2, 2, 2);
      Handle_part.setRotationPoint(-0.5F, -1.5F, -0.5F);
      Handle_part.setTextureSize(128, 128);
      Handle_part.mirror = true;
      setRotation(Handle_part, 0F, 0F, 0F);
      Pummel = new ModelRenderer(this, 120, 123);
      Pummel.addBox(0F, 0F, 0F, 2, 2, 2);
      Pummel.setRotationPoint(-0.5F, 15.5F, -0.5F);
      Pummel.setTextureSize(128, 128);
      Pummel.mirror = true;
      setRotation(Pummel, 0F, 0F, 0F);
      hilt = new ModelRenderer(this, 100, 0);
      hilt.addBox(0F, 0F, 0F, 5, 5, 3);
      hilt.setRotationPoint(-2F, -5F, -1F);
      hilt.setTextureSize(128, 128);
      hilt.mirror = true;
      setRotation(hilt, 0F, 0F, 0F);
      Blade_part_1 = new ModelRenderer(this, 100, 14);
      Blade_part_1.addBox(0F, 0F, 0F, 5, 6, 3);
      Blade_part_1.setRotationPoint(-6F, -4F, -1F);
      Blade_part_1.setTextureSize(128, 128);
      Blade_part_1.mirror = true;
      setRotation(Blade_part_1, 0F, 0F, -0.8552113F);
      Blade_part_2 = new ModelRenderer(this, 90, 90);
      Blade_part_2.addBox(0F, 0F, 0F, 4, 8, 3);
      Blade_part_2.setRotationPoint(-4F, -12F, -1F);
      Blade_part_2.setTextureSize(128, 128);
      Blade_part_2.mirror = true;
      setRotation(Blade_part_2, 0F, 0F, 0.122173F);
      Blade_part_3 = new ModelRenderer(this, 100, 105);
      Blade_part_3.addBox(0F, 0F, 0F, 5, 10, 3);
      Blade_part_3.setRotationPoint(0F, -11F, -1F);
      Blade_part_3.setTextureSize(128, 128);
      Blade_part_3.mirror = true;
      setRotation(Blade_part_3, 0F, 0F, -0.1745329F);
      Blade_part_4_ = new ModelRenderer(this, 0, 58);
      Blade_part_4_.addBox(0F, 0F, 0F, 7, 36, 2);
      Blade_part_4_.setRotationPoint(-6.5F, -45F, -0.5F);
      Blade_part_4_.setTextureSize(128, 128);
      Blade_part_4_.mirror = true;
      setRotation(Blade_part_4_, 0F, 0F, -0.0872665F);
      Blade_part_5 = new ModelRenderer(this, 46, 0);
      Blade_part_5.addBox(0F, 0F, 0F, 7, 39, 3);
      Blade_part_5.setRotationPoint(-1F, -48F, -1F);
      Blade_part_5.setTextureSize(128, 128);
      Blade_part_5.mirror = true;
      setRotation(Blade_part_5, 0F, 0F, -0.0174533F);
      
      Blade_part_6 = new ModelRenderer(this, 0, 40);
      Blade_part_6.addBox(0F, 0F, 0F, 5, 12, 2);
      Blade_part_6.setRotationPoint(6.5F, -55.5F, -0.5F);
      Blade_part_6.setTextureSize(128, 128);
      Blade_part_6.mirror = true;
      setRotation(Blade_part_6, 0F, 0F, 1.208931F);
      
      
      Blade_part_7 = new ModelRenderer(this, 0, 29);
      Blade_part_7.addBox(0F, 0F, 0F, 7, 6, 2);
      Blade_part_7.setRotationPoint(-5F, -51F, -0.5F);
      Blade_part_7.setTextureSize(128, 128);
      Blade_part_7.mirror = true;
      setRotation(Blade_part_7, 0F, 0F, 0.2583087F);
      
      Blade_part_8 = new ModelRenderer(this, 0, 20);
      Blade_part_8.addBox(11F, 0F, 0F, 4, 6, 2);
      Blade_part_8.setRotationPoint(-5F, -59F, -0.5F);
      Blade_part_8.setTextureSize(128, 128);
      Blade_part_8.mirror = true;
      setRotation(Blade_part_8, 0F, 0F, 0.5550147F);
      
      Fang_part_1 = new ModelRenderer(this, 70, 0);
      Fang_part_1.addBox(0F, 0F, 0F, 2, 7, 2);
      Fang_part_1.setRotationPoint(11F, -48F, -0.5F);
      Fang_part_1.setTextureSize(128, 128);
      Fang_part_1.mirror = true;
      setRotation(Fang_part_1, 0F, 0F, 1.32296F);
      Fang_part_2 = new ModelRenderer(this, 80, 0);
      Fang_part_2.addBox(0F, 0F, 0F, 1, 5, 2);
      Fang_part_2.setRotationPoint(9F, -42F, -0.5F);
      Fang_part_2.setTextureSize(128, 128);
      Fang_part_2.mirror = true;
      setRotation(Fang_part_2, 0F, 0F, 1.794199F);
      Fang_part_3 = new ModelRenderer(this, 0, 100);
      Fang_part_3.addBox(0F, 0F, 0F, 2, 6, 2);
      Fang_part_3.setRotationPoint(10F, -40F, -0.5F);
      Fang_part_3.setTextureSize(128, 128);
      Fang_part_3.mirror = true;
      setRotation(Fang_part_3, 0F, 0F, 1.427679F);
      Fang_part_4 = new ModelRenderer(this, 35, 90);
      Fang_part_4.addBox(0F, 0F, 0F, 1, 3, 2);
      Fang_part_4.setRotationPoint(8F, -36F, -0.5F);
      Fang_part_4.setTextureSize(128, 128);
      Fang_part_4.mirror = true;
      setRotation(Fang_part_4, 0F, 0F, 1.53589F);
      Fang_part_5 = new ModelRenderer(this, 0, 11);
      Fang_part_5.addBox(0F, 0F, 0F, 2, 6, 2);
      Fang_part_5.setRotationPoint(9F, -33F, -0.5F);
      Fang_part_5.setTextureSize(128, 128);
      Fang_part_5.mirror = true;
      setRotation(Fang_part_5, 0F, 0F, 1.706932F);
      Fang_part_6 = new ModelRenderer(this, 38, 0);
      Fang_part_6.addBox(0F, 0F, 0F, 1, 4, 2);
      Fang_part_6.setRotationPoint(7.866667F, -30F, -0.5F);
      Fang_part_6.setTextureSize(128, 128);
      Fang_part_6.mirror = true;
      setRotation(Fang_part_6, 0F, 0F, 1.21824F);
      Fang_part_8 = new ModelRenderer(this, 28, 0);
      Fang_part_8.addBox(0F, 0F, 0F, 2, 6, 2);
      Fang_part_8.setRotationPoint(8F, -26F, -0.5F);
      Fang_part_8.setTextureSize(128, 128);
      Fang_part_8.mirror = true;
      setRotation(Fang_part_8, 0F, 0F, 1.706932F);
      
      Fang_part_9 = new ModelRenderer(this, 0, 0);
      Fang_part_9.addBox(0F, 0F, 0F, 1, 3, 2);
      Fang_part_9.setRotationPoint(7F, -22F, -0.5F);
      Fang_part_9.setTextureSize(128, 128);
      Fang_part_9.mirror = true;
      setRotation(Fang_part_9, 0F, 0F, 1.375319F);
      
      Fang_part_10 = new ModelRenderer(this, 55, 85);
      Fang_part_10.addBox(0F, 0F, 0F, 2, 4, 2);
      Fang_part_10.setRotationPoint(8F, -20F, -0.5F);
      Fang_part_10.setTextureSize(128, 128);
      Fang_part_10.mirror = true;
      setRotation(Fang_part_10, 0F, 0F, 1.392773F);
      Fang_part_11 = new ModelRenderer(this, 0, 0);
      Fang_part_11.addBox(0F, 0F, 0F, 1, 2, 2);
      Fang_part_11.setRotationPoint(8F, -15F, -0.5F);
      Fang_part_11.setTextureSize(128, 128);
      Fang_part_11.mirror = true;
      setRotation(Fang_part_11, 0F, 0F, 1.706932F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    handle.render(f5);
    Handle_part.render(f5);
    Pummel.render(f5);
    hilt.render(f5);
    Blade_part_1.render(f5);
    Blade_part_2.render(f5);
    Blade_part_3.render(f5);
    Blade_part_4_.render(f5);
    Blade_part_5.render(f5);
    Blade_part_6.render(f5);
    Blade_part_7.render(f5);
    Blade_part_8.render(f5);
    Fang_part_1.render(f5);
    Fang_part_2.render(f5);
    Fang_part_3.render(f5);
    Fang_part_4.render(f5);
    Fang_part_5.render(f5);
    Fang_part_6.render(f5);
    Fang_part_8.render(f5);
    Fang_part_9.render(f5);
    Fang_part_10.render(f5);
    Fang_part_11.render(f5);
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
  }

}