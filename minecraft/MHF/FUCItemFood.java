package MHF;

import cpw.mods.fml.relauncher.Side;
/*    */ import cpw.mods.fml.relauncher.SideOnly;
/*    */ import net.minecraft.client.renderer.texture.IconRegister;
/*    */ import net.minecraft.item.ItemFood;
/*    */ 
/*    */ public class FUCItemFood extends ItemFood
/*    */ {
private String unlocalizedName;
/*    */   public FUCItemFood(int i, int j)
/*    */   {
/* 15 */     super(i, j, 0.6F, false);
/* 16 */     this.maxStackSize = 32;
/*    */   }
/*    */ 
/*    */   public FUCItemFood(int i, int j, float f, boolean flag)
/*    */   {
/* 23 */     super(i, j, f, flag);
/*    */   }
/*    */ 
/*    */   @SideOnly(Side.CLIENT)
/*    */   public void registerIcons(IconRegister par1IconRegister)
/*    */   {
/* 42 */    this.itemIcon = par1IconRegister.registerIcon(this.unlocalizedName);
/*    */   }
/*    */ }