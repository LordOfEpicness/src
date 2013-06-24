package MHF.Block;

import java.util.Random;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockArmorjewelOre2 extends Block{

	public BlockArmorjewelOre2(int id, Material rock) {
		super(id, Material.rock);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
            this.blockIcon = par1IconRegister.registerIcon("monsterhunter:oreArmorjewel2");
    }

	public int idDropped(int par1, Random par2Random, int par3)
    {
        return MainItem.armorjewel2.itemID;
    }
	
}
