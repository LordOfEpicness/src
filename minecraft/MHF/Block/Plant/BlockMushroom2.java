package MHF.Block.Plant;


import MHF.MonsterHunterFrontier;
import net.minecraft.block.BlockMushroom;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMushroom2 extends BlockMushroom{

	public BlockMushroom2(int par1, String par2) {
		super(par1, par2);
		this.setCreativeTab(MonsterHunterFrontier.tabMonsterHunterBlocks);
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister)
    {
            this.blockIcon = par1IconRegister.registerIcon("monsterhunter:mushroom2");
    }

}
