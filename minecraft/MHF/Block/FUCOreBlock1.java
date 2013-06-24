package MHF.Block;

import java.util.Random;

import MHF.MonsterHunterFrontier;

import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class FUCOreBlock1 extends Block {



public FUCOreBlock1(int par1, String texture) {
super(par1, Material.rock);
this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
 //place in creative tabs

}

//drops when broken with pickaxe
public int idDropped(int par1, Random par2Random, int par3)
{
return MainBlock.ArmorSphere.blockID;
}
public int quantityDropped(Random random)
{
return 2;
}



//texure the block (Not sure if it's required)
public void registerIcons(IconRegister par1IconRegister)
{
        this.blockIcon = par1IconRegister.registerIcon("monsterhunter:oreArmorSphere");
}





}
