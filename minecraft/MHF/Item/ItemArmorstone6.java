package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemArmorstone6 extends Item{
    public ItemArmorstone6(int id) {
		super(id);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterItems); 
		setMaxStackSize(64);
	}
    
    public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:armorstone6");
    }
    
}