package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemMonsterbone16 extends Item {
	public ItemMonsterbone16(int par1) {
		super(par1);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterDrops); //Tells the game what creative mode tab it goes in
		setMaxDamage(1);
		setMaxStackSize(64);	
	}
	
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:monsterbone17-18");
    }
	
 }


