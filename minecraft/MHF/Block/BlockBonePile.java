package MHF.Block;

import java.util.Random;
import java.util.Random;

import MHF.MonsterHunterFrontier;
import MHF.Item.MainItem;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlockBonePile extends Block{

	public BlockBonePile(int id, int texture) {
		super(id, Material.ground);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.0625F, 1.0F);
		this.setTickRandomly(true);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
            this.blockIcon = par1IconRegister.registerIcon("monsterhunter:bonePile");
    }

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 23;
    }
    
    public int idDropped(int var1, Random var2, int var3)
    {
        int i = (new Random()).nextInt(1000);
        if(i < 25)  return MainItem.monsterbone14.itemID;
        if(i < 50)	return MainItem.monsterbone15.itemID;
        if(i < 250)	return Item.bone.itemID;
        if(i < 450)	return MainItem.monsterbone17.itemID;
        if(i < 900)	return MainItem.monsterbone16.itemID;
        return MainItem.monsterbone03.itemID;
    }
    
}
