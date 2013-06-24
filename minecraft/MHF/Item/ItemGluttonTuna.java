package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemGluttonTuna extends ItemFood{

	public ItemGluttonTuna(int par1, int par2, float par3, boolean par4) {
		super(par1, par2, par3, par4);
        this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterFoods);
        this.maxStackSize = 64;
	}
	
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:fish");
    }

}
