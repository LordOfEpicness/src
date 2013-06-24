package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMonsterbone02 extends Item{

	public ItemMonsterbone02(int par1) {
		super(par1);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterItems);
	}
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:monsterbone1-4");
    }
	
 }


