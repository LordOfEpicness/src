package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemArmorjewel1 extends Item{

	public ItemArmorjewel1(int id) {
		super(id);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterItems);
		setMaxStackSize(64);
	}
	
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:armorjewel1");
    }
	
}
