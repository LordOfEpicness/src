package MHF.Item;

import MHF.MonsterHunterFrontier;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ItemArmorstone3 extends Item{
    public ItemArmorstone3(int id) {
		super(id);
		setCreativeTab(MonsterHunterFrontier.tabMonsterHunterItems); 
		setMaxStackSize(64);
	}
    
    public void registerIcons(IconRegister par1IconRegister)
    {
            itemIcon = par1IconRegister.registerIcon("monsterhunter:armorstone3");
    }
    
}