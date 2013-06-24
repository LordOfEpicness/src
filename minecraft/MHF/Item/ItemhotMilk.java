package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemhotMilk extends ItemFood {

	public ItemhotMilk(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterFoods); 
		// TODO Auto-generated constructor stub
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	        this.itemIcon = par1IconRegister.registerIcon("monsterhunter:hotMilk");
	}


}
