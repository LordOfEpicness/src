package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMonsterbone05 extends Item{

	public ItemMonsterbone05(int par1) {
		super(par1);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterDrops);
	}
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:monsterbone6");
    }
	
 }



