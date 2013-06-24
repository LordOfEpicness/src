package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemSparkedDust extends Item
{

	public ItemSparkedDust(int par1) {
		super(par1);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterDrops);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	        this.itemIcon = par1IconRegister.registerIcon("monsterhunter:sparkedDust");
	}

	
}
