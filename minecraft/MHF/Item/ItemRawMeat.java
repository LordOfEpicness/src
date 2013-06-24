package MHF.Item;


import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemRawMeat extends ItemFood {

	public ItemRawMeat(int par1, int par2, boolean par3) {
		super(par1, par2, par3);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterFoods); 
		
	}
	public void registerIcons(IconRegister par1IconRegister)
	{
	        this.itemIcon = par1IconRegister.registerIcon("monsterhunter:rawMeat");
	}


	

}
