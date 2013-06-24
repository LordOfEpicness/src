package MHF.CreativeTabs;

import MHF.Block.MainBlock;
import MHF.Item.MainItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TabMonsterHunterBlocks extends CreativeTabs {

	public TabMonsterHunterBlocks(int position, String tabID) {
		super(position, tabID);

	}

	@SideOnly(Side.CLIENT)
	public ItemStack getIconItemStack()
	{
	return new ItemStack(MainBlock.ArmorSphere);
	}
	
	public String getTranslatedTabLabel()
	{
	return "MonsterHunter Blocks"; //The name of the tab ingame
	}
}
