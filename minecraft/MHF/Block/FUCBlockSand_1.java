package MHF.Block;

import java.util.Random;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class FUCBlockSand_1 extends BlockSand {



public FUCBlockSand_1(int par1, String texture) {
super(par1, Material.sand);
this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
 //place in creative tabs

}

//drops when broken with pickaxe
public int idDropped(int par1, Random par2Random, int par3)
{
return MainBlock.blockDesertSand_1.blockID;
}
public int quantityDropped(Random random)
{
return 1;
}



//texure the block (Not sure if it's required)
public void registerIcons(IconRegister par1IconRegister)
{
        this.blockIcon = par1IconRegister.registerIcon("monsterhunter:blockSand_1");
}






}