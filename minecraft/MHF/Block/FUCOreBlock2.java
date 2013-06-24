package MHF.Block;

import java.util.Random;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class FUCOreBlock2 extends Block {



public FUCOreBlock2(int par1, String texture) {
super(par1, Material.rock);
this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
 //place in creative tabs

}

//drops when broken with pickaxe
public int idDropped(int par1, Random par2Random, int par3)
{
return MainBlock.MachaliteOre.blockID;
}
public int quantityDropped(Random random)
{
return 2;
}



//texure the block (Not sure if it's required)
public void registerIcons(IconRegister par1IconRegister)
{
        this.blockIcon = par1IconRegister.registerIcon("monsterhunter:oreMachalite");
}






}
