package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.common.IArmorTextureProvider;

public class ItemcrestKirin extends ItemArmor implements IArmorTextureProvider
{

	 int armtype;



	public ItemcrestKirin(int par1, EnumArmorMaterial par2EnumArmorMaterial,
			int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.armtype=par4;
		
	}
	public String getArmorTextureFile(ItemStack itemstack)
  {

 if ((itemstack.itemID == MainItem.kirinHelm.itemID) || (itemstack.itemID == MainItem.kirincape.itemID) || (itemstack.itemID == MainItem.kirinboots.itemID))
   {
     return "/mods/monsterhunter/textures/armor/kirin_1.png";
 }
 

 else if (itemstack.itemID == MainItem.kirinshorts.itemID)
  {
     return "/mods/monsterhunter/textures/armor/kirin_2.png";
     }
 else{ return "/mods/monsterhunter/textures/armor/kirin_2.png";
  }
  }

	

 public void updateIcons(IconRegister iconRegister)
 {
	 Icon iconIndex;
	switch (armtype)
	 {
	 case 0:
         iconIndex = iconRegister.registerIcon("monsterhunter:helmetKirin");
         break;
  case 1:
   iconIndex = iconRegister.registerIcon("monsterhunter:kirincape");
         break;
  case 2:
   iconIndex = iconRegister.registerIcon("monsterhunter:kirinshorts");
         break;
  case 3:
   iconIndex = iconRegister.registerIcon("monsterhunter:kirinboots");
         break;
	 }
	 
	 
	

}

}