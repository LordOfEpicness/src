package MHF.Model;

import org.lwjgl.opengl.GL11;

import MHF.Entity.EntityCephadrome;


import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.MathHelper;

public class ModelCephadrome extends ModelBase
{
    private float wingspeed = 1.0F;
    ModelRenderer leftfoot;
    ModelRenderer butt;
    ModelRenderer rightfoot;
    ModelRenderer topfin1;
    ModelRenderer topfin2;
    ModelRenderer topfin3;
    ModelRenderer topfin4;
    ModelRenderer leftshoulder;
    ModelRenderer lefwingfin1;
    ModelRenderer tailfin1;
    ModelRenderer tailmembrane2;
    ModelRenderer tailfin2;
    ModelRenderer tailfin4;
    ModelRenderer tailfin3;
    ModelRenderer tailmembrane1;
    ModelRenderer topmem1;
    ModelRenderer topmem2;
    ModelRenderer topmem3;
    ModelRenderer topmem4;
    ModelRenderer neck1;
    ModelRenderer body;
    ModelRenderer chest1;
    ModelRenderer leftleg1;
    ModelRenderer mouth;
    ModelRenderer neck2;
    ModelRenderer head;
    ModelRenderer hammerhead;
    ModelRenderer chest;
    ModelRenderer neck3;
    ModelRenderer tail1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg2;
    ModelRenderer rightleg2;
    ModelRenderer body2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer tail2;
    ModelRenderer tail3;
    ModelRenderer tailmembrane3;
    ModelRenderer leftwingfin2;
    ModelRenderer leftwingfin3;
    ModelRenderer leftwingfin4;
    ModelRenderer leftwingmembrane;
    ModelRenderer rightshoulder;
    ModelRenderer rightwingfin1;
    ModelRenderer rightwingfin2;
    ModelRenderer rightwingfin3;
    ModelRenderer rightwingfin4;
    ModelRenderer rightwingmembrane;
    ModelRenderer hammerhead2;

  
  public ModelCephadrome(float f1)
  {
    this.wingspeed = f1;
    
    textureWidth = 512;
    textureHeight = 256;
    
      leftfoot = new ModelRenderer(this, 41, 194);
      leftfoot.addBox(-2F, 34F, -12F, 9, 4, 10);
      leftfoot.setRotationPoint(7F, -14F, 17F);
      leftfoot.setTextureSize(512, 256);
      leftfoot.mirror = true;
      setRotation(leftfoot, 0F, 0F, 0F);
      butt = new ModelRenderer(this, 367, 235);
      butt.addBox(0F, 0F, -2F, 9, 14, 6);
      butt.setRotationPoint(-4.5F, -8F, 29F);
      butt.setTextureSize(512, 256);
      butt.mirror = true;
      setRotation(butt, -0.8726646F, 0F, 0F);
      rightfoot = new ModelRenderer(this, 41, 170);
      rightfoot.addBox(-7F, 34F, -12F, 9, 4, 10);
      rightfoot.setRotationPoint(-7F, -14F, 17F);
      rightfoot.setTextureSize(512, 256);
      rightfoot.mirror = true;
      setRotation(rightfoot, 0F, 0F, 0F);
      topfin1 = new ModelRenderer(this, 64, 112);
      topfin1.addBox(-3F, -2F, -30F, 6, 3, 30);
      topfin1.setRotationPoint(0F, -15F, -7F);
      topfin1.setTextureSize(512, 256);
      topfin1.mirror = true;
      setRotation(topfin1, -1.850049F, 0F, 0F);
      topfin2 = new ModelRenderer(this, 69, 81);
      topfin2.addBox(-3F, -2F, -25F, 6, 3, 25);
      topfin2.setRotationPoint(0F, -15F, -2F);
      topfin2.setTextureSize(512, 256);
      topfin2.mirror = true;
      setRotation(topfin2, -2.076942F, 0F, 0F);
      topfin3 = new ModelRenderer(this, -1, 140);
      topfin3.addBox(-3F, -2F, -20F, 6, 3, 20);
      topfin3.setRotationPoint(0F, -16F, 3F);
      topfin3.setTextureSize(512, 256);
      topfin3.mirror = true;
      setRotation(topfin3, -2.426008F, 0F, 0F);
      topfin4 = new ModelRenderer(this, 148, 148);
      topfin4.addBox(-3F, -2F, -10F, 6, 3, 10);
      topfin4.setRotationPoint(0F, -17F, 13F);
      topfin4.setTextureSize(512, 256);
      topfin4.mirror = true;
      setRotation(topfin4, -2.635447F, 0F, 0F);
      leftshoulder = new ModelRenderer(this, 144, 236);
      leftshoulder.addBox(0F, 0F, 1F, 6, 8, 11);
      leftshoulder.setRotationPoint(6F, -16F, -14F);
      leftshoulder.setTextureSize(512, 256);
      leftshoulder.mirror = true;
      setRotation(leftshoulder, -0.1745329F, 0F, 0F);
      lefwingfin1 = new ModelRenderer(this, 147, 96);
      lefwingfin1.addBox(0F, -2F, -2F, 70, 5, 3);
      lefwingfin1.setRotationPoint(9F, -12F, -11F);
      lefwingfin1.setTextureSize(512, 256);
      lefwingfin1.mirror = true;
      setRotation(lefwingfin1, -0.2617994F, -0.1745329F, 0F);
      tailfin1 = new ModelRenderer(this, 168, 0);
      tailfin1.addBox(-6F, -1F, 0F, 12, 3, 30);
      tailfin1.setRotationPoint(0F, -9F, 56F);
      tailfin1.setTextureSize(512, 256);
      tailfin1.mirror = true;
      setRotation(tailfin1, 0.1396263F, 0F, 0F);
      tailmembrane2 = new ModelRenderer(this, 201, 38);
      tailmembrane2.addBox(0F, -8F, 3F, 0, 10, 19);
      tailmembrane2.setRotationPoint(0F, 0F, 56F);
      tailmembrane2.setTextureSize(512, 256);
      tailmembrane2.mirror = true;
      setRotation(tailmembrane2, -0.296706F, 0F, 0F);
      tailfin2 = new ModelRenderer(this, 186, 184);
      tailfin2.addBox(-4F, 0F, 0F, 8, 2, 27);
      tailfin2.setRotationPoint(0F, -7F, 56F);
      tailfin2.setTextureSize(512, 256);
      tailfin2.mirror = true;
      setRotation(tailfin2, -0.1919862F, 0F, 0F);
      tailfin4 = new ModelRenderer(this, 186, 137);
      tailfin4.addBox(-4F, 1F, 1F, 8, 3, 22);
      tailfin4.setRotationPoint(0F, -3F, 56F);
      tailfin4.setTextureSize(512, 256);
      tailfin4.mirror = true;
      setRotation(tailfin4, -0.837758F, 0F, 0F);
      tailfin3 = new ModelRenderer(this, 185, 216);
      tailfin3.addBox(-1F, 0F, 1F, 8, 2, 23);
      tailfin3.setRotationPoint(-3F, -5F, 57F);
      tailfin3.setTextureSize(512, 256);
      tailfin3.mirror = true;
      setRotation(tailfin3, -0.5759587F, 0F, 0F);
      tailmembrane1 = new ModelRenderer(this, 245, 38);
      tailmembrane1.addBox(0F, 0F, 4F, 0, 11, 21);
      tailmembrane1.setRotationPoint(0F, -9F, 56F);
      tailmembrane1.setTextureSize(512, 256);
      tailmembrane1.mirror = true;
      setRotation(tailmembrane1, 0.1396263F, 0F, 0F);
      topmem1 = new ModelRenderer(this, 25, 0);
      topmem1.addBox(0F, -25F, 0F, 0, 24, 10);
      topmem1.setRotationPoint(0F, -15F, -6F);
      topmem1.setTextureSize(512, 256);
      topmem1.mirror = true;
      setRotation(topmem1, -0.2617994F, 0F, 0F);
      topmem2 = new ModelRenderer(this, 135, 0);
      topmem2.addBox(1F, -22F, 0F, 0, 20, 10);
      topmem2.setRotationPoint(-1F, -15F, -2F);
      topmem2.setTextureSize(512, 256);
      topmem2.mirror = true;
      setRotation(topmem2, -0.5235988F, 0F, 0F);
      topmem3 = new ModelRenderer(this, 258, 0);
      topmem3.addBox(0F, -18F, 0F, 0, 18, 8);
      topmem3.setRotationPoint(0F, -16F, 3F);
      topmem3.setTextureSize(512, 256);
      topmem3.mirror = true;
      setRotation(topmem3, -0.8901179F, 0F, 0F);
      topmem4 = new ModelRenderer(this, 282, 0);
      topmem4.addBox(0F, -9F, 0F, 0, 9, 10);
      topmem4.setRotationPoint(0F, -17F, 13F);
      topmem4.setTextureSize(512, 256);
      topmem4.mirror = true;
      setRotation(topmem4, -1.117011F, 0F, 0F);
      neck1 = new ModelRenderer(this, 404, 235);
      neck1.addBox(-6F, -5F, -10F, 10, 9, 10);
      neck1.setRotationPoint(1F, -6F, -33F);
      neck1.setTextureSize(512, 256);
      neck1.mirror = true;
      setRotation(neck1, 0.3665191F, 0F, 0F);
      body = new ModelRenderer(this, 28, 220);
      body.addBox(-6F, -11F, -10F, 12, 15, 19);
      body.setRotationPoint(0F, -7F, 3F);
      body.setTextureSize(512, 256);
      body.mirror = true;
      setRotation(body, 0.1745329F, 0F, 0F);
      chest1 = new ModelRenderer(this, 98, 210);
      chest1.addBox(-3F, -4F, -2F, 10, 11, 5);
      chest1.setRotationPoint(-2F, -6F, -13F);
      chest1.setTextureSize(512, 256);
      chest1.mirror = true;
      setRotation(chest1, 1.029744F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 135, 183);
      leftleg1.addBox(-1F, 0F, -4F, 7, 18, 10);
      leftleg1.setRotationPoint(7F, -14F, 17F);
      leftleg1.setTextureSize(512, 256);
      leftleg1.mirror = true;
      setRotation(leftleg1, -0.5759587F, 0F, 0F);
      mouth = new ModelRenderer(this, 92, 150);
      mouth.addBox(-7F, 1F, 3F, 14, 15, 4);
      mouth.setRotationPoint(0F, -6F, -43F);
      mouth.setTextureSize(512, 256);
      mouth.mirror = true;
      setRotation(mouth, -0.8726646F, 0F, 0F);
      neck2 = new ModelRenderer(this, 152, 110);
      neck2.addBox(-6F, -5F, -17F, 11, 10, 17);
      neck2.setRotationPoint(0.5F, -10F, -19F);
      neck2.setTextureSize(512, 256);
      neck2.mirror = true;
      setRotation(neck2, 0.2617994F, 0F, 0F);
      head = new ModelRenderer(this, 275, 219);
      head.addBox(-10F, -3F, -16F, 20, 7, 16);
      head.setRotationPoint(0F, -6F, -43F);
      head.setTextureSize(512, 256);
      head.mirror = true;
      setRotation(head, 0.5061455F, 0F, 0F);
      hammerhead = new ModelRenderer(this, 258, 134);
      hammerhead.addBox(-18F, -2F, -15F, 36, 6, 14);
      hammerhead.setRotationPoint(0F, -6F, -43F);
      hammerhead.setTextureSize(512, 256);
      hammerhead.mirror = true;
      setRotation(hammerhead, 0.4537856F, 0F, 0F);
      chest = new ModelRenderer(this, 100, 15);
      chest.addBox(-3F, -3F, 0F, 9, 29, 7);
      chest.setRotationPoint(-1.5F, 0F, -5F);
      chest.setTextureSize(512, 256);
      chest.mirror = true;
      setRotation(chest, 1.413717F, 0F, 0F);
      neck3 = new ModelRenderer(this, 264, 173);
      neck3.addBox(-6F, -5F, -16F, 12, 11, 16);
      neck3.setRotationPoint(0F, -11F, -6F);
      neck3.setTextureSize(512, 256);
      neck3.mirror = true;
      setRotation(neck3, 0.0872665F, 0F, 0F);
      tail1 = new ModelRenderer(this, 51, 5);
      tail1.addBox(-5F, -6F, 0F, 10, 13, 14);
      tail1.setRotationPoint(0F, -10F, 22F);
      tail1.setTextureSize(512, 256);
      tail1.mirror = true;
      setRotation(tail1, -0.1745329F, 0F, 0F);
      rightleg1 = new ModelRenderer(this, 94, 175);
      rightleg1.addBox(-6F, 0F, -4F, 7, 18, 10);
      rightleg1.setRotationPoint(-7F, -14F, 17F);
      rightleg1.setTextureSize(512, 256);
      rightleg1.mirror = true;
      setRotation(rightleg1, -0.5759587F, 0F, 0F);
      leftleg2 = new ModelRenderer(this, 28, 112);
      leftleg2.addBox(-1F, 6F, -17F, 7, 12, 7);
      leftleg2.setRotationPoint(7F, -14F, 17F);
      leftleg2.setTextureSize(512, 256);
      leftleg2.mirror = true;
      setRotation(leftleg2, 0.9773844F, 0F, 0F);
      rightleg2 = new ModelRenderer(this, 32, 90);
      rightleg2.addBox(-6F, 6F, -17F, 7, 12, 7);
      rightleg2.setRotationPoint(-7F, -14F, 17F);
      rightleg2.setTextureSize(512, 256);
      rightleg2.mirror = true;
      setRotation(rightleg2, 0.9773844F, 0F, 0F);
      body2 = new ModelRenderer(this, 400, 179);
      body2.addBox(0F, 3F, 3F, 12, 16, 16);
      body2.setRotationPoint(-6F, -23F, 6F);
      body2.setTextureSize(512, 256);
      body2.mirror = true;
      setRotation(body2, -0.1919862F, 0F, 0F);
      leftleg3 = new ModelRenderer(this, 351, 192);
      leftleg3.addBox(-1F, 17F, 10F, 7, 17, 6);
      leftleg3.setRotationPoint(7F, -14F, 17F);
      leftleg3.setTextureSize(512, 256);
      leftleg3.mirror = true;
      setRotation(leftleg3, -0.5235988F, 0F, 0F);
      rightleg3 = new ModelRenderer(this, 323, 192);
      rightleg3.addBox(-6F, 17F, 10F, 7, 17, 6);
      rightleg3.setRotationPoint(-7F, -14F, 17F);
      rightleg3.setTextureSize(512, 256);
      rightleg3.mirror = true;
      setRotation(rightleg3, -0.5235988F, 0F, 0F);
      tail2 = new ModelRenderer(this, 51, 55);
      tail2.addBox(-6F, -6F, 0F, 9, 12, 14);
      tail2.setRotationPoint(1.5F, -7F, 35F);
      tail2.setTextureSize(512, 256);
      tail2.mirror = true;
      setRotation(tail2, -0.1396263F, 0F, 0F);
      tail3 = new ModelRenderer(this, 105, 52);
      tail3.addBox(-5F, -6F, 0F, 8, 11, 14);
      tail3.setRotationPoint(1F, -5F, 48F);
      tail3.setTextureSize(512, 256);
      tail3.mirror = true;
      setRotation(tail3, -0.1396263F, 0F, 0F);
      tailmembrane3 = new ModelRenderer(this, 155, 38);
      tailmembrane3.addBox(0F, -10F, 0F, 0, 10, 18);
      tailmembrane3.setRotationPoint(0F, 2F, 56F);
      tailmembrane3.setTextureSize(512, 256);
      tailmembrane3.mirror = true;
      setRotation(tailmembrane3, -0.837758F, 0F, 0F);
      leftwingfin2 = new ModelRenderer(this, 160, 83);
      leftwingfin2.addBox(0F, -2F, 0F, 64, 4, 2);
      leftwingfin2.setRotationPoint(9F, -12F, -11F);
      leftwingfin2.setTextureSize(512, 256);
      leftwingfin2.mirror = true;
      setRotation(leftwingfin2, -0.2617994F, -0.4363323F, 0F);
      leftwingfin3 = new ModelRenderer(this, 209, 106);
      leftwingfin3.addBox(0F, -2F, 0F, 48, 4, 2);
      leftwingfin3.setRotationPoint(9F, -11F, -10F);
      leftwingfin3.setTextureSize(512, 256);
      leftwingfin3.mirror = true;
      setRotation(leftwingfin3, -0.2617994F, -0.7853982F, 0F);
      leftwingfin4 = new ModelRenderer(this, 233, 120);
      leftwingfin4.addBox(0F, 0F, 0F, 37, 4, 2);
      leftwingfin4.setRotationPoint(9F, -13F, -6F);
      leftwingfin4.setTextureSize(512, 256);
      leftwingfin4.mirror = true;
      setRotation(leftwingfin4, -0.2617994F, -1.186824F, 0F);
      leftwingmembrane = new ModelRenderer(this, 300, 27);
      leftwingmembrane.addBox(3F, 0F, 0F, 64, 0, 34);
      leftwingmembrane.setRotationPoint(9F, -13F, -10F);
      leftwingmembrane.setTextureSize(512, 256);
      leftwingmembrane.mirror = true;
      setRotation(leftwingmembrane, -0.0872665F, -0.1745329F, 0F);
      rightshoulder = new ModelRenderer(this, 0, 193);
      rightshoulder.addBox(0F, 0F, 0F, 6, 8, 11);
      rightshoulder.setRotationPoint(-12F, -16F, -13F);
      rightshoulder.setTextureSize(512, 256);
      rightshoulder.mirror = true;
      setRotation(rightshoulder, -0.1745329F, 0F, 0F);
      rightwingfin1 = new ModelRenderer(this, 344, 109);
      rightwingfin1.addBox(-69F, -2F, 0F, 69, 5, 3);
      rightwingfin1.setRotationPoint(-10F, -12F, -13F);
      rightwingfin1.setTextureSize(512, 256);
      rightwingfin1.mirror = true;
      setRotation(rightwingfin1, -0.2617994F, 0.1745329F, 0F);
      rightwingfin2 = new ModelRenderer(this, 349, 119);
      rightwingfin2.addBox(-63F, -2F, 0F, 64, 4, 2);
      rightwingfin2.setRotationPoint(-9F, -12F, -11F);
      rightwingfin2.setTextureSize(512, 256);
      rightwingfin2.mirror = true;
      setRotation(rightwingfin2, -0.2617994F, 0.4363323F, 0F);
      rightwingfin3 = new ModelRenderer(this, 368, 128);
      rightwingfin3.addBox(-49F, 0F, 0F, 48, 4, 2);
      rightwingfin3.setRotationPoint(-9F, -13F, -9F);
      rightwingfin3.setTextureSize(512, 256);
      rightwingfin3.mirror = true;
      setRotation(rightwingfin3, -0.2617994F, 0.7679449F, 0F);
      rightwingfin4 = new ModelRenderer(this, 379, 137);
      rightwingfin4.addBox(-35F, 0F, 0F, 37, 4, 2);
      rightwingfin4.setRotationPoint(-9F, -13F, -6F);
      rightwingfin4.setTextureSize(512, 256);
      rightwingfin4.mirror = true;
      setRotation(rightwingfin4, -0.2617994F, 1.186824F, 0F);
      rightwingmembrane = new ModelRenderer(this, 300, 67);
      rightwingmembrane.addBox(-67F, -1F, 0F, 64, 0, 34);
      rightwingmembrane.setRotationPoint(-9F, -12F, -12F);
      rightwingmembrane.setTextureSize(512, 256);
      rightwingmembrane.mirror = true;
      setRotation(rightwingmembrane, -0.0872665F, 0.1745329F, 0F);
      hammerhead2 = new ModelRenderer(this, 258, 157);
      hammerhead2.addBox(-25F, 0F, -14F, 50, 4, 7);
      hammerhead2.setRotationPoint(0F, -7F, -43F);
      hammerhead2.setTextureSize(512, 256);
      hammerhead2.mirror = true;
      setRotation(hammerhead2, 0.4537856F, 0F, 0F);
      
  }
  
  //f1 appears to be a scale of xyz motion.
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    EntityCephadrome e = (EntityCephadrome)entity;
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    float newangle = 0.0F;
    /*
    //System.out.printf("floats: %f,  %f, %f, %f, %f, %f\n", f, f1, f2, f3, f4, f5);
    */
    
    //Do legs for when walking.
    if(f1 > 0.1){
    	newangle = MathHelper.cos(f2 * 0.65F * this.wingspeed ) * (float)Math.PI * 0.11F * f1;
    }else{
    	newangle = 0.0F;
    }
    
    if(e.getActivity() != 0){
    	newangle = 1.00f; //Legs up! We are flying!!!
       	this.rightleg1.rotateAngleX =  -0.58F + newangle;
    	this.rightleg2.rotateAngleX =  0.98F + newangle;
    	this.rightleg3.rotateAngleX =  -0.52F + newangle;
    	this.rightfoot.rotateAngleX =  newangle;
    	this.leftleg1.rotateAngleX = -0.58F + newangle;
    	this.leftleg2.rotateAngleX = 0.98F + newangle;
    	this.leftleg3.rotateAngleX = -0.52F + newangle;
    	this.leftfoot.rotateAngleX = newangle;
    }else{    //Legs down - walking
    	this.rightleg1.rotateAngleX =  -0.58F + newangle;
    	this.rightleg2.rotateAngleX =  0.98F + newangle;
    	this.rightleg3.rotateAngleX =  -0.52F + newangle;
    	this.rightfoot.rotateAngleX =  newangle;
    	this.leftleg1.rotateAngleX = -0.58F - newangle;
    	this.leftleg2.rotateAngleX = 0.98F - newangle;
    	this.leftleg3.rotateAngleX = -0.52F - newangle;
    	this.leftfoot.rotateAngleX = -newangle;
    }
    
    /*
     * Wings
     */
    if(e.getActivity() != 0){ //Flying
    	newangle = MathHelper.cos(f2 * 0.55F * this.wingspeed ) * (float)Math.PI * 0.28F;
    }else{
    	newangle = -0.85f + MathHelper.cos(f2 * 0.20F * this.wingspeed ) * (float)Math.PI * 0.028F;
    }
	this.lefwingfin1.rotateAngleZ = newangle;
	this.leftwingfin2.rotateAngleZ = newangle;
	this.leftwingfin3.rotateAngleZ = newangle;
	this.leftwingfin4.rotateAngleZ = newangle;
	this.leftwingmembrane.rotateAngleZ = newangle;
	
	this.rightwingfin1.rotateAngleZ = -newangle;
	this.rightwingfin2.rotateAngleZ = -newangle;
	this.rightwingfin3.rotateAngleZ = -newangle;
	this.rightwingfin4.rotateAngleZ = -newangle;
	this.rightwingmembrane.rotateAngleZ = -newangle;
	
	/*
	 * Top fin
	 */
	newangle = MathHelper.cos(f2 * 0.15F * this.wingspeed ) * (float)Math.PI * 0.05F;
	this.topfin1.rotateAngleX = -1.85F - Math.abs(newangle);
	this.topmem1.rotateAngleX = -0.26F - Math.abs(newangle);
	this.topfin2.rotateAngleX = -2.07F - Math.abs(newangle/2);
	this.topmem2.rotateAngleX = -0.52F - Math.abs(newangle/2);
	this.topfin3.rotateAngleX = -2.42F - Math.abs(newangle/4);
	this.topmem3.rotateAngleX = -0.89F - Math.abs(newangle/4);
	this.topfin4.rotateAngleX = -2.63F - Math.abs(newangle/8);
	this.topmem4.rotateAngleX = -1.11F - Math.abs(newangle/8);
	
	/*
	 * Put a nice swimming motion on the tail.
	 * bigger and faster when flying, smaller and slower when walking
	 */
    float pi4 = 3.1415927F/4.0F;
    float tailspeed = 0.76f;
    float tailamp = 0.10f;
    
    if(e.getActivity() == 0){ //Walking
    	tailspeed = 0.22f;
    	tailamp = 0.03f;
    }
    this.tail1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed) * (float)Math.PI * 0.04F;
    
    this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float)Math.cos(this.tail1.rotateAngleY)*13;
    this.tail2.rotationPointX = this.tail1.rotationPointX +1.5F + (float)Math.sin(this.tail1.rotateAngleY)*13;   
    this.tail2.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - pi4) * (float)Math.PI * tailamp;
    
    this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float)Math.cos(this.tail2.rotateAngleY)*13;
    this.tail3.rotationPointX = this.tail2.rotationPointX -0.5F + (float)Math.sin(this.tail2.rotateAngleY)*13;    
    this.tail3.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - 2.0F*pi4) * (float)Math.PI * tailamp;
    
    this.tailfin1.rotationPointZ = this.tail3.rotationPointZ + (float)Math.cos(this.tail3.rotateAngleY)*10;
    this.tailfin1.rotationPointX = this.tail3.rotationPointX -1.0F + (float)Math.sin(this.tail3.rotateAngleY)*10;    
    this.tailfin1.rotateAngleY = MathHelper.cos(f2 * tailspeed * this.wingspeed - 3.0F*pi4) * (float)Math.PI * tailamp;
    
    this.tailfin2.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin2.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailfin2.rotateAngleY =    tailfin1.rotateAngleY;
    
    this.tailfin3.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin3.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailfin3.rotateAngleY =    tailfin1.rotateAngleY;
    
    this.tailfin4.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailfin4.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailfin4.rotateAngleY =    tailfin1.rotateAngleY;
    
    this.tailmembrane1.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane1.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailmembrane1.rotateAngleY =    tailfin1.rotateAngleY;
    
    this.tailmembrane2.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane2.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailmembrane2.rotateAngleY =    tailfin1.rotateAngleY;
    
    this.tailmembrane3.rotationPointZ = this.tailfin1.rotationPointZ;
    this.tailmembrane3.rotationPointX = this. tailfin1.rotationPointX; 
    this.tailmembrane3.rotateAngleY =    tailfin1.rotateAngleY;
	
    /*
     * Rotate head to look at things
     */
    //f3 is in degrees!  
    this.neck3.rotateAngleY = (float)Math.toRadians((double)f3) * 0.125F;
    this.neck2.rotationPointZ = this.neck3.rotationPointZ - (float)Math.cos(this.neck3.rotateAngleY)*14; 
    this.neck2.rotationPointX = this.neck3.rotationPointX + 0.5f - (float)Math.sin(this.neck3.rotateAngleY)*14;
    this.neck2.rotateAngleY = (float)Math.toRadians((double)f3) * 0.25F;
    this.neck1.rotationPointZ = this.neck2.rotationPointZ - (float)Math.cos(this.neck2.rotateAngleY)*14;
    this.neck1.rotationPointX = this.neck2.rotationPointX + 0.5f - (float)Math.sin(this.neck2.rotateAngleY)*14;
    this.neck1.rotateAngleY = (float)Math.toRadians((double)f3) * 0.5F;   
    this.head.rotationPointZ = this.neck1.rotationPointZ - (float)Math.cos(this.neck1.rotateAngleY)*8;
    this.head.rotationPointX = this.neck1.rotationPointX - (float)Math.sin(this.neck1.rotateAngleY)*8;   
    this.head.rotateAngleY = (float)Math.toRadians((double)f3) * 0.75F;    
    this.hammerhead.rotationPointZ = this.head.rotationPointZ;
    this.hammerhead.rotationPointX = this.head.rotationPointX;   
    this.hammerhead.rotateAngleY = this.head.rotateAngleY;    
    this.hammerhead2.rotationPointZ = this.head.rotationPointZ;
    this.hammerhead2.rotationPointX = this.head.rotationPointX;   
    this.hammerhead2.rotateAngleY = this.head.rotateAngleY;    
    this.mouth.rotationPointZ = this.head.rotationPointZ;
    this.mouth.rotationPointX = this.head.rotationPointX;   
    this.mouth.rotateAngleY = this.head.rotateAngleY;
    
    /*
     * Mouth open/closed for when attacking
     */
	newangle = MathHelper.cos(f2 * 0.50F * this.wingspeed ) * (float)Math.PI * 0.14F;
	//resting is -0.87
	if(e.getAttacking() != 0){
		this.mouth.rotateAngleX = -0.61f + newangle;
	}else{
		this.mouth.rotateAngleX = -0.87f;
	}
    
	/*
	 * Draw it!
	 */
    leftfoot.render(f5);
    butt.render(f5);
    rightfoot.render(f5);
    topfin1.render(f5);
    topfin2.render(f5);
    topfin3.render(f5);
    topfin4.render(f5);
    leftshoulder.render(f5);
    lefwingfin1.render(f5);
    tailfin1.render(f5);
    tailmembrane2.render(f5);
    tailfin2.render(f5);
    tailfin4.render(f5);
    tailfin3.render(f5);
    tailmembrane1.render(f5);
    topmem1.render(f5);
    topmem2.render(f5);
    topmem3.render(f5);
    topmem4.render(f5);
    neck1.render(f5);
    body.render(f5);
    chest1.render(f5);
    leftleg1.render(f5);
    mouth.render(f5);
    neck2.render(f5);
    head.render(f5);
    hammerhead.render(f5);
    chest.render(f5);
    neck3.render(f5);
    tail1.render(f5);
    rightleg1.render(f5);
    leftleg2.render(f5);
    rightleg2.render(f5);
    body2.render(f5);
    leftleg3.render(f5);
    rightleg3.render(f5);
    tail2.render(f5);
    tail3.render(f5);
    tailmembrane3.render(f5);
    leftwingfin2.render(f5);
    leftwingfin3.render(f5);
    leftwingfin4.render(f5);
    leftwingmembrane.render(f5);
    rightshoulder.render(f5);
    rightwingfin1.render(f5);
    rightwingfin2.render(f5);
    rightwingfin3.render(f5);
    rightwingfin4.render(f5);
    rightwingmembrane.render(f5);
    hammerhead2.render(f5);
 
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity par7Entity)
  {
    super.setRotationAngles(par1, par2, par3, par4, par5, par6, par7Entity);
  }

}