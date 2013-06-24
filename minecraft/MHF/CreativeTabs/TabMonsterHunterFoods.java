package MHF.CreativeTabs;

import MHF.Item.MainItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMonsterHunterFoods extends CreativeTabs {

	public TabMonsterHunterFoods(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{
	return new ItemStack(MainItem.FishFood1);
	}
	
	public String getTranslatedTabLabel()
	{
	return "MonsterHunter Foods"; //The name of the tab ingame
	}
	
}
