package MHF.Block;

import java.util.Random;

import MHF.MonsterHunterFrontier;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockStoneOre2 extends Block{

	public BlockStoneOre2(int id, Material rock) {
		super(id, Material.rock);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
            this.blockIcon = par1IconRegister.registerIcon("monsterhunter:oreStone2");
    }

	public int idDropped(int par1, Random par2Random, int par3)
    {
        return MainBlock.oreStone2.blockID;
    }
	
}
