package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemsparkKirin extends Item
{

	public ItemsparkKirin(int par1) {
		super(par1);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterDrops);
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	        this.itemIcon = par1IconRegister.registerIcon("monsterhunter:sparkKirin");
	}

	

}

