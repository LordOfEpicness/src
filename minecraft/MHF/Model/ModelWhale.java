package MHF.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWhale extends ModelBase
{
  //fields
    ModelRenderer AMain_body;
    ModelRenderer AFront_piece_1;
    ModelRenderer AFront_piece_2;
    ModelRenderer AFront_piece_3;
    ModelRenderer ASide_piece_1;
    ModelRenderer Aside_piece_2;
    ModelRenderer Atop_bottom_piece_1;
    ModelRenderer ATop_bottom_piece_2;
    ModelRenderer ATop_bottom_piece_3;
    ModelRenderer BMain_body;
    ModelRenderer BSide_piece_1;
    ModelRenderer Bside_piece_2;
    ModelRenderer Btop_bottom_piece_1;
    ModelRenderer BTop_bottom_piece_2;
    ModelRenderer BTop_bottom_piece_3;
    ModelRenderer CMain_body;
    ModelRenderer CSide_piece_1;
    ModelRenderer Cside_piece_2;
    ModelRenderer Ctop_bottom_piece_1;
    ModelRenderer CTop_bottom_piece_2;
    ModelRenderer CTop_bottom_piece_3;
    ModelRenderer DMain_body;
    ModelRenderer DSide_piece_1;
    ModelRenderer Dside_piece_2;
    ModelRenderer Dtop_bottom_piece_1;
    ModelRenderer DTop_bottom_piece_2;
    ModelRenderer DTop_bottom_piece_3;
    ModelRenderer EMain_body;
    ModelRenderer EFront_piece_1;
    ModelRenderer EFront_piece_2;
    ModelRenderer ESide_piece_1;
    ModelRenderer Eside_piece_2;
    ModelRenderer Etop_bottom_piece_1;
    ModelRenderer ETop_bottom_piece_2;
    ModelRenderer ETop_bottom_piece_3;
    ModelRenderer Main_body;
    ModelRenderer Side_piece_1;
    ModelRenderer side_piece_2;
    ModelRenderer top_bottom_piece_1;
    ModelRenderer Top_bottom_piece_2;
    ModelRenderer Top_bottom_piece_3;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Shape15;
    ModelRenderer Shape16;
    ModelRenderer Shape17;
    ModelRenderer Shape18;
    ModelRenderer spot_long;
    ModelRenderer spot_wideS;
    ModelRenderer spot_longS;
    ModelRenderer spot_wideSS;
    ModelRenderer spot_wide;
    ModelRenderer spot_longss;
  
  public ModelWhale()
  {
    textureWidth = 256;
    textureHeight = 128;
    
      Main_body = new ModelRenderer(this, 0, 23);
      Main_body.addBox(-12F, 0F, 0F, 28, 18, 22);
      Main_body.setRotationPoint(-2F, -8F, -28F);
      Main_body.setTextureSize(256, 128);
      Main_body.mirror = true;
      setRotation(Main_body, 0F, 0F, 0F);
      AFront_piece_1 = new ModelRenderer(this, 0, 44);
      AFront_piece_1.addBox(-12F, 0F, 0F, 26, 16, 3);
      AFront_piece_1.setRotationPoint(-1F, -7F, -29F);
      AFront_piece_1.setTextureSize(256, 128);
      AFront_piece_1.mirror = true;
      setRotation(AFront_piece_1, 0F, 0F, 0F);
      AFront_piece_2 = new ModelRenderer(this, 0, 46);
      AFront_piece_2.addBox(-12F, 0F, 0F, 24, 14, 3);
      AFront_piece_2.setRotationPoint(0F, -6F, -30F);
      AFront_piece_2.setTextureSize(256, 128);
      AFront_piece_2.mirror = true;
      setRotation(AFront_piece_2, 0F, 0F, 0F);
      AFront_piece_3 = new ModelRenderer(this, 0, 51);
      AFront_piece_3.addBox(-12F, 0F, 0F, 22, 12, 1);
      AFront_piece_3.setRotationPoint(1F, -5F, -31F);
      AFront_piece_3.setTextureSize(256, 128);
      AFront_piece_3.mirror = true;
      setRotation(AFront_piece_3, 0F, 0F, 0F);
      ASide_piece_1 = new ModelRenderer(this, 0, 27);
      ASide_piece_1.addBox(-12F, 0F, 0F, 30, 16, 21);
      ASide_piece_1.setRotationPoint(-3F, -7F, -27F);
      ASide_piece_1.setTextureSize(256, 128);
      ASide_piece_1.mirror = true;
      setRotation(ASide_piece_1, 0F, 0F, 0F);
      Aside_piece_2 = new ModelRenderer(this, 0, 30);
      Aside_piece_2.addBox(-12F, 0F, 0F, 32, 14, 20);
      Aside_piece_2.setRotationPoint(-4F, -6F, -26F);
      Aside_piece_2.setTextureSize(256, 128);
      Aside_piece_2.mirror = true;
      setRotation(Aside_piece_2, 0F, 0F, 0F);
      Atop_bottom_piece_1 = new ModelRenderer(this, 0, 26);
      Atop_bottom_piece_1.addBox(-12F, 0F, 0F, 26, 20, 21);
      Atop_bottom_piece_1.setRotationPoint(-1F, -9F, -27F);
      Atop_bottom_piece_1.setTextureSize(256, 128);
      Atop_bottom_piece_1.mirror = true;
      setRotation(Atop_bottom_piece_1, 0F, 0F, 0F);
      ATop_bottom_piece_2 = new ModelRenderer(this, 0, 20);
      ATop_bottom_piece_2.addBox(-12F, 0F, 0F, 24, 22, 20);
      ATop_bottom_piece_2.setRotationPoint(0F, -10F, -26F);
      ATop_bottom_piece_2.setTextureSize(256, 128);
      ATop_bottom_piece_2.mirror = true;
      setRotation(ATop_bottom_piece_2, 0F, 0F, 0F);
      ATop_bottom_piece_3 = new ModelRenderer(this, 0, 19);
      ATop_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 24, 20);
      ATop_bottom_piece_3.setRotationPoint(2F, -11F, -26F);
      ATop_bottom_piece_3.setTextureSize(256, 128);
      ATop_bottom_piece_3.mirror = true;
      setRotation(ATop_bottom_piece_3, 0F, 0F, 0F);
      BMain_body = new ModelRenderer(this, 0, 31);
      BMain_body.addBox(-12F, 0F, 0F, 28, 18, 15);
      BMain_body.setRotationPoint(-2F, -8F, -6F);
      BMain_body.setTextureSize(256, 128);
      BMain_body.mirror = true;
      setRotation(BMain_body, 0F, 0F, 0F);
      BSide_piece_1 = new ModelRenderer(this, 0, 32);
      BSide_piece_1.addBox(-12F, 0F, 0F, 30, 16, 15);
      BSide_piece_1.setRotationPoint(-3F, -7F, -6F);
      BSide_piece_1.setTextureSize(256, 128);
      BSide_piece_1.mirror = true;
      setRotation(BSide_piece_1, 0F, 0F, 0F);
      Bside_piece_2 = new ModelRenderer(this, 0, 32);
      Bside_piece_2.addBox(-12F, 0F, 0F, 32, 14, 15);
      Bside_piece_2.setRotationPoint(-4F, -6F, -6F);
      Bside_piece_2.setTextureSize(256, 128);
      Bside_piece_2.mirror = true;
      setRotation(Bside_piece_2, 0F, 0F, 0F);
      Btop_bottom_piece_1 = new ModelRenderer(this, 0, 33);
      Btop_bottom_piece_1.addBox(-12F, 0F, 0F, 26, 20, 15);
      Btop_bottom_piece_1.setRotationPoint(-1F, -9F, -6F);
      Btop_bottom_piece_1.setTextureSize(256, 128);
      Btop_bottom_piece_1.mirror = true;
      setRotation(Btop_bottom_piece_1, 0F, 0F, 0F);
      BTop_bottom_piece_2 = new ModelRenderer(this, 0, 33);
      BTop_bottom_piece_2.addBox(-12F, 0F, 0F, 24, 22, 15);
      BTop_bottom_piece_2.setRotationPoint(0F, -10F, -6F);
      BTop_bottom_piece_2.setTextureSize(256, 128);
      BTop_bottom_piece_2.mirror = true;
      setRotation(BTop_bottom_piece_2, 0F, 0F, 0F);
      BTop_bottom_piece_3 = new ModelRenderer(this, 0, 33);
      BTop_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 24, 15);
      BTop_bottom_piece_3.setRotationPoint(2F, -11F, -6F);
      BTop_bottom_piece_3.setTextureSize(256, 128);
      BTop_bottom_piece_3.mirror = true;
      setRotation(BTop_bottom_piece_3, 0F, 0F, 0F);
      CMain_body = new ModelRenderer(this, 0, 32);
      CMain_body.addBox(-12F, 0F, 0F, 28, 18, 15);
      CMain_body.setRotationPoint(-2F, -8F, 9F);
      CMain_body.setTextureSize(256, 128);
      CMain_body.mirror = true;
      setRotation(CMain_body, 0F, 0F, 0F);
      CSide_piece_1 = new ModelRenderer(this, 0, 33);
      CSide_piece_1.addBox(-12F, 0F, 0F, 30, 16, 15);
      CSide_piece_1.setRotationPoint(-3F, -7F, 9F);
      CSide_piece_1.setTextureSize(256, 128);
      CSide_piece_1.mirror = true;
      setRotation(CSide_piece_1, 0F, 0F, 0F);
      Cside_piece_2 = new ModelRenderer(this, 0, 33);
      Cside_piece_2.addBox(-12F, 0F, 0F, 32, 14, 15);
      Cside_piece_2.setRotationPoint(-4F, -6F, 9F);
      Cside_piece_2.setTextureSize(256, 128);
      Cside_piece_2.mirror = true;
      setRotation(Cside_piece_2, 0F, 0F, 0F);
      Ctop_bottom_piece_1 = new ModelRenderer(this, 0, 33);
      Ctop_bottom_piece_1.addBox(-12F, 0F, 0F, 26, 20, 15);
      Ctop_bottom_piece_1.setRotationPoint(-1F, -9F, 9F);
      Ctop_bottom_piece_1.setTextureSize(256, 128);
      Ctop_bottom_piece_1.mirror = true;
      setRotation(Ctop_bottom_piece_1, 0F, 0F, 0F);
      CTop_bottom_piece_2 = new ModelRenderer(this, 0, 33);
      CTop_bottom_piece_2.addBox(-12F, 0F, 0F, 24, 22, 15);
      CTop_bottom_piece_2.setRotationPoint(0F, -10F, 9F);
      CTop_bottom_piece_2.setTextureSize(256, 128);
      CTop_bottom_piece_2.mirror = true;
      setRotation(CTop_bottom_piece_2, 0F, 0F, 0F);
      CTop_bottom_piece_3 = new ModelRenderer(this, 0, 33);
      CTop_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 24, 15);
      CTop_bottom_piece_3.setRotationPoint(2F, -11F, 9F);
      CTop_bottom_piece_3.setTextureSize(256, 128);
      CTop_bottom_piece_3.mirror = true;
      setRotation(CTop_bottom_piece_3, 0F, 0F, 0F);
      DMain_body = new ModelRenderer(this, 0, 34);
      DMain_body.addBox(-12F, 0F, 0F, 28, 18, 15);
      DMain_body.setRotationPoint(-2F, -8F, 24F);
      DMain_body.setTextureSize(256, 128);
      DMain_body.mirror = true;
      setRotation(DMain_body, 0F, 0F, 0F);
      DSide_piece_1 = new ModelRenderer(this, 0, 33);
      DSide_piece_1.addBox(-12F, 0F, 0F, 30, 16, 15);
      DSide_piece_1.setRotationPoint(-3F, -7F, 24F);
      DSide_piece_1.setTextureSize(256, 128);
      DSide_piece_1.mirror = true;
      setRotation(Side_piece_1, 0F, 0F, 0F);
      Dside_piece_2 = new ModelRenderer(this, 0, 34);
      Dside_piece_2.addBox(-12F, 0F, 0F, 32, 14, 15);
      Dside_piece_2.setRotationPoint(-4F, -6F, 24F);
      Dside_piece_2.setTextureSize(256, 128);
      Dside_piece_2.mirror = true;
      setRotation(side_piece_2, 0F, 0F, 0F);
      Dtop_bottom_piece_1 = new ModelRenderer(this, 0, 34);
      Dtop_bottom_piece_1.addBox(-12F, 0F, 0F, 26, 20, 15);
      Dtop_bottom_piece_1.setRotationPoint(-1F, -9F, 24F);
      Dtop_bottom_piece_1.setTextureSize(256, 128);
      Dtop_bottom_piece_1.mirror = true;
      setRotation(Dtop_bottom_piece_1, 0F, 0F, 0F);
      DTop_bottom_piece_2 = new ModelRenderer(this, 0, 30);
      DTop_bottom_piece_2.addBox(-12F, 0F, 0F, 24, 22, 15);
      DTop_bottom_piece_2.setRotationPoint(0F, -10F, 24F);
      DTop_bottom_piece_2.setTextureSize(256, 128);
      DTop_bottom_piece_2.mirror = true;
      setRotation(DTop_bottom_piece_2, 0F, 0F, 0F);
      DTop_bottom_piece_3 = new ModelRenderer(this, 0, 39);
      DTop_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 24, 15);
      DTop_bottom_piece_3.setRotationPoint(2F, -11F, 24F);
      DTop_bottom_piece_3.setTextureSize(256, 128);
      DTop_bottom_piece_3.mirror = true;
      setRotation(DTop_bottom_piece_3, 0F, 0F, 0F);
      EMain_body = new ModelRenderer(this, 0, 30);
      EMain_body.addBox(-12F, 0F, 0F, 24, 14, 22);
      EMain_body.setRotationPoint(0F, -7F, 39F);
      EMain_body.setTextureSize(256, 128);
      EMain_body.mirror = true;
      setRotation(Main_body, 0F, 0F, 0F);
      EFront_piece_1 = new ModelRenderer(this, 0, 50);
      EFront_piece_1.addBox(-12F, 0F, 0F, 22, 12, 3);
      EFront_piece_1.setRotationPoint(1F, -6F, 59F);
      EFront_piece_1.setTextureSize(256, 128);
      EFront_piece_1.mirror = true;
      setRotation(EFront_piece_1, 0F, 0F, 0F);
      EFront_piece_2 = new ModelRenderer(this, 0, 53);
      EFront_piece_2.addBox(-12F, 0F, 0F, 20, 10, 3);
      EFront_piece_2.setRotationPoint(2F, -5F, 60F);
      EFront_piece_2.setTextureSize(256, 128);
      EFront_piece_2.mirror = true;
      setRotation(EFront_piece_2, 0F, 0F, 0F);
      ESide_piece_1 = new ModelRenderer(this, 0, 31);
      ESide_piece_1.addBox(-12F, 0F, 0F, 26, 12, 21);
      ESide_piece_1.setRotationPoint(-1F, -6F, 39F);
      ESide_piece_1.setTextureSize(256, 128);
      ESide_piece_1.mirror = true;
      setRotation(ESide_piece_1, 0F, 0F, 0F);
      Eside_piece_2 = new ModelRenderer(this, 0, 32);
      Eside_piece_2.addBox(-12F, 0F, 0F, 28, 10, 20);
      Eside_piece_2.setRotationPoint(-2F, -5F, 39F);
      Eside_piece_2.setTextureSize(256, 128);
      Eside_piece_2.mirror = true;
      setRotation(Eside_piece_2, 0F, 0F, 0F);
      Etop_bottom_piece_1 = new ModelRenderer(this, 0, 26);
      Etop_bottom_piece_1.addBox(-12F, 0F, 0F, 22, 16, 21);
      Etop_bottom_piece_1.setRotationPoint(1F, -8F, 39F);
      Etop_bottom_piece_1.setTextureSize(256, 128);
      Etop_bottom_piece_1.mirror = true;
      setRotation(Etop_bottom_piece_1, 0F, 0F, 0F);
      ETop_bottom_piece_2 = new ModelRenderer(this, 0, 25);
      ETop_bottom_piece_2.addBox(-12F, 0F, 0F, 20, 18, 20);
      ETop_bottom_piece_2.setRotationPoint(2F, -9F, 39F);
      ETop_bottom_piece_2.setTextureSize(256, 128);
      ETop_bottom_piece_2.mirror = true;
      setRotation(ETop_bottom_piece_2, 0F, 0F, 0F);
      ETop_bottom_piece_3 = new ModelRenderer(this, 0, 24);
      ETop_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 20, 20);
      ETop_bottom_piece_3.setRotationPoint(2F, -10F, 39F);
      ETop_bottom_piece_3.setTextureSize(256, 128);
      ETop_bottom_piece_3.mirror = true;
      setRotation(ETop_bottom_piece_3, 0F, 0F, 0F);
      Main_body = new ModelRenderer(this, 0, 36);
      Main_body.addBox(-12F, 0F, 0F, 26, 14, 13);
      Main_body.setRotationPoint(-1F, -7F, 39F);
      Main_body.setTextureSize(256, 128);
      Main_body.mirror = true;
      setRotation(Main_body, 0F, 0F, 0F);
      Side_piece_1 = new ModelRenderer(this, 0, 39);
      Side_piece_1.addBox(-12F, 0F, 0F, 28, 12, 13);
      Side_piece_1.setRotationPoint(-2F, -6F, 39F);
      Side_piece_1.setTextureSize(256, 128);
      Side_piece_1.mirror = true;
      setRotation(Side_piece_1, 0F, 0F, 0F);
      side_piece_2 = new ModelRenderer(this, 0, 39);
      side_piece_2.addBox(-12F, 0F, 0F, 30, 10, 13);
      side_piece_2.setRotationPoint(-3F, -5F, 39F);
      side_piece_2.setTextureSize(256, 128);
      side_piece_2.mirror = true;
      setRotation(side_piece_2, 0F, 0F, 0F);
      top_bottom_piece_1 = new ModelRenderer(this, 0, 39);
      top_bottom_piece_1.addBox(-12F, 0F, 0F, 22, 12, 12);
      top_bottom_piece_1.setRotationPoint(1F, -3F, 39F);
      top_bottom_piece_1.setTextureSize(256, 128);
      top_bottom_piece_1.mirror = true;
      setRotation(top_bottom_piece_1, 0F, 0F, 0F);
      Top_bottom_piece_2 = new ModelRenderer(this, 0, 33);
      Top_bottom_piece_2.addBox(-12F, 0F, 0F, 20, 18, 12);
      Top_bottom_piece_2.setRotationPoint(2F, -8F, 39F);
      Top_bottom_piece_2.setTextureSize(256, 128);
      Top_bottom_piece_2.mirror = true;
      setRotation(Top_bottom_piece_2, 0F, 0F, 0F);
      Top_bottom_piece_3 = new ModelRenderer(this, 0, 32);
      Top_bottom_piece_3.addBox(-8F, 0F, 0F, 12, 20, 12);
      Top_bottom_piece_3.setRotationPoint(2F, -9F, 39F);
      Top_bottom_piece_3.setTextureSize(256, 128);
      Top_bottom_piece_3.mirror = true;
      setRotation(Top_bottom_piece_3, 0F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 0, 0);
      Shape1.addBox(-20F, 0F, 0F, 17, 3, 7);
      Shape1.setRotationPoint(0F, -21F, 63F);
      Shape1.setTextureSize(256, 128);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0.4363323F, 0F);
      Shape2 = new ModelRenderer(this, 0, 0);
      Shape2.addBox(0F, 0F, 0F, 10, 5, 11);
      Shape2.setRotationPoint(-5F, -11F, 50F);
      Shape2.setTextureSize(256, 128);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 0, 0);
      Shape3.setRotationPoint(0F, -5F, 50F);
      Shape3.setTextureSize(256, 128);
      Shape3.mirror = true;
      setRotation(Shape3, -0.669215F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(-3F, -14F, 0F, 4, 11, 7);
      Shape4.setRotationPoint(1F, -10F, 55F);
      Shape4.setTextureSize(256, 128);
      Shape4.mirror = true;
      setRotation(Shape4, -0.669215F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(-5F, 0F, 0F, 10, 3, 7);
      Shape5.setRotationPoint(0F, -21F, 63F);
      Shape5.setTextureSize(256, 128);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
      Shape6= new ModelRenderer(this, 0, 0);
      Shape6.addBox(3F, 0F, 0F, 17, 3, 7);
      Shape6.setRotationPoint(0F, -21F, 63F);
      Shape6.setTextureSize(256, 128);
      Shape6.mirror = true;
      setRotation(Shape6, 0F, -0.4363323F, 0F);
      Shape7 = new ModelRenderer(this, 0, 0);
      Shape7.addBox(-4F, 0F, 0F, 8, 2, 12);
      Shape7.setRotationPoint(14F, 3F, 13F);
      Shape7.setTextureSize(256, 128);
      Shape7.mirror = true;
      setRotation(Shape7, -0.6981317F, 1.396263F, 0.8552113F);
      Shape8 = new ModelRenderer(this, 0, 0);
      Shape8.addBox(-3F, 0F, 0F, 6, 1, 8);
      Shape8.setRotationPoint(20F, 8F, 20F);
      Shape8.setTextureSize(256, 128);
      Shape8.mirror = true;
      setRotation(Shape8, -2.356194F, -1.780236F, -1.064651F);
      Shape9 = new ModelRenderer(this, 0, 0);
      Shape9.addBox(-4F, 0F, 0F, 8, 2, 12);
      Shape9.setRotationPoint(14F, 3F, 32F);
      Shape9.setTextureSize(256, 128);
      Shape9.mirror = true;
      setRotation(Shape9, -0.6981317F, 1.396263F, 0.8552113F);
      Shape10 = new ModelRenderer(this, 0, 0);
      Shape10.addBox(-3F, 0F, 0F, 6, 1, 8);
      Shape10.setRotationPoint(20F, 8F, 39F);
      Shape10.setTextureSize(256, 128);
      Shape10.mirror = true;
      setRotation(Shape10, -2.356194F, -1.780236F, -1.064651F);
      Shape11 = new ModelRenderer(this, 0, 0);
      Shape11.addBox(-4F, 0F, 0F, 8, 2, 12);
      Shape11.setRotationPoint(-14F, 3F, 13F);
      Shape11.setTextureSize(256, 128);
      Shape11.mirror = true;
      setRotation(Shape11, -0.6981317F, -1.396263F, -0.8552113F);
      Shape12 = new ModelRenderer(this, 0, 0);
      Shape12.addBox(-3F, 0F, 0F, 6, 1, 8);
      Shape12.setRotationPoint(-20F, 8F, 20F);
      Shape12.setTextureSize(256, 128);
      Shape12.mirror = true;
      setRotation(Shape12, -2.356194F, 1.780236F, 1.064651F);
      Shape13 = new ModelRenderer(this, 0, 0);
      Shape13.addBox(-4F, 0F, 0F, 8, 2, 12);
      Shape13.setRotationPoint(-14F, 3F, 32F);
      Shape13.setTextureSize(256, 128);
      Shape13.mirror = true;
      setRotation(Shape13, -0.6981317F, -1.396263F, -0.8552113F);
      Shape14 = new ModelRenderer(this, 0, 0);
      Shape14.addBox(-3F, 0F, 0F, 6, 1, 8);
      Shape14.setRotationPoint(-20F, 8F, 39F);
      Shape14.setTextureSize(256, 128);
      Shape14.mirror = true;
      setRotation(Shape14, -2.356194F, 1.780236F, 1.064651F);
      Shape15 = new ModelRenderer(this, 0, 110);
      Shape15.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape15.setRotationPoint(-8F, 9F, 53F);
      Shape15.setTextureSize(256, 128);
      Shape15.mirror = true;
      setRotation(Shape15, 1.570796F, 1.570796F, 0.7853982F);
      Shape16 = new ModelRenderer(this, 0, 110);
      Shape16.addBox(0F, 0F, 0F, 8, 1, 8);
      Shape16.setRotationPoint(8F, 9F, 53F);
      Shape16.setTextureSize(256, 128);
      Shape16.mirror = true;
      setRotation(Shape16, 1.570796F, 1.570796F, 0.7853982F);
      Shape17 = new ModelRenderer(this, 250, 120);
      Shape17.addBox(0F, 0F, 0F, 1, 2, 2);
      Shape17.setRotationPoint(-17F, -1F, -11F);
      Shape17.setTextureSize(256, 128);
      Shape17.mirror = true;
      setRotation(Shape17, 0F, 0F, 0F);
      Shape18 = new ModelRenderer(this, 250, 120);
      Shape18.addBox(0F, 0F, 0F, 1, 2, 2);
      Shape18.setRotationPoint(16F, -1F, -11F);
      Shape18.setTextureSize(256, 128);
      Shape18.mirror = true;
      setRotation(Shape18, 0F, 0F, 0F);
      spot_long = new ModelRenderer(this, 200, 66);
      spot_long.addBox(0F, 0F, 0F, 2, 1, 4);
      spot_long.setRotationPoint(-1F, -11F, 41F);
      spot_long.setTextureSize(256, 128);
      spot_long.mirror = true;
      setRotation(spot_long, 0F, 0F, 0F);
      spot_wideS = new ModelRenderer(this, 200, 66);
      spot_wideS.addBox(0F, 0F, 0F, 4, 1, 4);
      spot_wideS.setRotationPoint(-2F, -12F, 27F);
      spot_wideS.setTextureSize(256, 128);
      spot_wideS.mirror = true;
      setRotation(spot_wideS, 0F, 0F, 0F);
      spot_longS = new ModelRenderer(this, 200, 66);
      spot_longS.addBox(0F, 0F, 0F, 2, 1, 6);
      spot_longS.setRotationPoint(-1F, -12F, 15F);
      spot_longS.setTextureSize(256, 128);
      spot_longS.mirror = true;
      setRotation(spot_longS, 0F, 0F, 0F);
      spot_wideSS = new ModelRenderer(this, 200, 66);
      spot_wideSS.addBox(0F, 0F, 0F, 4, 1, 4);
      spot_wideSS.setRotationPoint(-2F, -12F, 16F);
      spot_wideSS.setTextureSize(256, 128);
      spot_wideSS.mirror = true;
      setRotation(spot_wideSS, 0F, 0F, 0F);
      spot_wide = new ModelRenderer(this, 200, 66);
      spot_wide.addBox(0F, 0F, 0F, 4, 1, 4);
      spot_wide.setRotationPoint(-2F, -12F, 34F);
      spot_wide.setTextureSize(256, 128);
      spot_wide.mirror = true;
      setRotation(spot_wide, 0F, 0F, 0F);
      spot_longss = new ModelRenderer(this, 200, 66);
      spot_longss.addBox(0F, 0F, 0F, 2, 1, 6);
      spot_longss.setRotationPoint(-1F, -12F, 26F);
      spot_longss.setTextureSize(256, 128);
      spot_longss.mirror = true;
      setRotation(spot_longss, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    AMain_body.render(f5);
    AFront_piece_1.render(f5);
    AFront_piece_2.render(f5);
    AFront_piece_3.render(f5);
    ASide_piece_1.render(f5);
    Aside_piece_2.render(f5);
    Atop_bottom_piece_1.render(f5);
    ATop_bottom_piece_2.render(f5);
    ATop_bottom_piece_3.render(f5);
    BMain_body.render(f5);
    BSide_piece_1.render(f5);
    Bside_piece_2.render(f5);
    Btop_bottom_piece_1.render(f5);
    BTop_bottom_piece_2.render(f5);
    BTop_bottom_piece_3.render(f5);
    CMain_body.render(f5);
    CSide_piece_1.render(f5);
    Cside_piece_2.render(f5);
    Ctop_bottom_piece_1.render(f5);
    CTop_bottom_piece_2.render(f5);
    CTop_bottom_piece_3.render(f5);
    DMain_body.render(f5);
    DSide_piece_1.render(f5);
    Dside_piece_2.render(f5);
    Dtop_bottom_piece_1.render(f5);
    DTop_bottom_piece_2.render(f5);
    DTop_bottom_piece_3.render(f5);
    EMain_body.render(f5);
    EFront_piece_1.render(f5);
    EFront_piece_2.render(f5);
    ESide_piece_1.render(f5);
    Eside_piece_2.render(f5);
    Etop_bottom_piece_1.render(f5);
    ETop_bottom_piece_2.render(f5);
    ETop_bottom_piece_3.render(f5);
    Main_body.render(f5);
    Side_piece_1.render(f5);
    side_piece_2.render(f5);
    top_bottom_piece_1.render(f5);
    Top_bottom_piece_2.render(f5);
    Top_bottom_piece_3.render(f5);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Shape15.render(f5);
    Shape16.render(f5);
    Shape17.render(f5);
    Shape18.render(f5);
    spot_long.render(f5);
    spot_wideS.render(f5);
    spot_longS.render(f5);
    spot_wideSS.render(f5);
    spot_wide.render(f5);
    spot_longss.render(f5);
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

