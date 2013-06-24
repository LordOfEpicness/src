package MHF.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelItemFUCDeluxeArmorBody extends ModelBase {
  //fields
    ModelRenderer body;
    ModelRenderer cape;
    ModelRenderer bottom1;
    ModelRenderer bottom2;
    ModelRenderer neck1;
    ModelRenderer neck2;
  
  public ModelItemFUCDeluxeArmorBody()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, 0F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      cape = new ModelRenderer(this, 47, -1);
      cape.addBox(0F, 0F, 0F, 8, 21, 0);
      cape.setRotationPoint(-4F, 0F, -2F);
      cape.setTextureSize(64, 32);
      cape.mirror = true;
      setRotation(cape, 0F, 0F, 0F);
      bottom1 = new ModelRenderer(this, 0, 0);
      bottom1.addBox(0F, 0F, 0F, 0, 10, 4);
      bottom1.setRotationPoint(4F, 11F, -2F);
      bottom1.setTextureSize(64, 32);
      bottom1.mirror = true;
      setRotation(bottom1, 0F, 0F, 0F);
      bottom2 = new ModelRenderer(this, 0, 0);
      bottom2.addBox(0F, 0F, 0F, 0, 10, 4);
      bottom2.setRotationPoint(-4F, 11F, -2F);
      bottom2.setTextureSize(64, 32);
      bottom2.mirror = true;
      setRotation(bottom2, 0F, 0F, 0F);
      neck1 = new ModelRenderer(this, 15, 0);
      neck1.addBox(0F, 0F, 0F, 1, 1, 3);
      neck1.setRotationPoint(-3F, -1F, -1F);
      neck1.setTextureSize(64, 32);
      neck1.mirror = true;
      setRotation(neck1, 0F, 0F, 0F);
      neck2 = new ModelRenderer(this, 15, 0);
      neck2.addBox(0F, 0F, 0F, 1, 1, 3);
      neck2.setRotationPoint(2F, -1F, -1F);
      neck2.setTextureSize(64, 32);
      neck2.mirror = true;
      setRotation(neck2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    body.render(f5);
    cape.render(f5);
    bottom1.render(f5);
    bottom1.render(f5);
    neck1.render(f5);
    neck2.render(f5);
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

