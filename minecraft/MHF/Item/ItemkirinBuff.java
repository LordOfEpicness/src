package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemkirinBuff extends ItemFood
{

	public ItemkirinBuff(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterFoods);
		
	
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	        this.itemIcon = par1IconRegister.registerIcon("monsterhunter:kirinBuff");
	}


}
