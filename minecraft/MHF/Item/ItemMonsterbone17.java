package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMonsterbone17 extends Item {
	public ItemMonsterbone17(int id) {
		super(id);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterDrops); //Tells the game what creative mode tab it goes in
		setMaxDamage(0);
		setMaxStackSize(64);	
	}
	
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:monsterbone17-18");
    }
	
 }


