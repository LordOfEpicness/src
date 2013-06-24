package MHF.Item;

import MHF.MonsterHunterFrontier;
import MHF.Block.MainBlock;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemBBQ extends Item{

	public ItemBBQ(int par1) {
		super(par1);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
	}
	
	public void registerIcons(IconRegister iconRegister)
    {
            itemIcon = iconRegister.registerIcon("monsterhunter:BBQPlacer");
    }
	
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
             if(!par3World.isRemote)
             {
            	 par3World.setBlock(par4, par5+1, par6, MainBlock.blockDesertSand_1.blockID);
                    return true;
             }
             else
                    return false;
    }
}
