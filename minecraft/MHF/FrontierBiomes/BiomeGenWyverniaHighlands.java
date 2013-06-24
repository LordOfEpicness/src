package MHF.FrontierBiomes;

import java.util.Random;

import MHF.Block.MainBlock;
import MHF.Entity.EntityErupe;
import MHF.Entity.EntityVillageDefender;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenWyverniaHighlands extends BiomeGenBase
{

	private MHF.World.gen.WorldGenWyverniaTree1 WorldGenWyverniaTree1;
	public BiomeGenWyverniaHighlands(int par1) {
		super(par1);
		this.setBiomeName("The Highlands");
		this.theBiomeDecorator.treesPerChunk = -999;
		this.spawnableMonsterList.clear();
		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = (byte)MainBlock.blockFUCGrass_1.blockID;
		this.fillerBlock = (byte)MainBlock.blockFUCDirt_1.blockID;
		this.theBiomeDecorator.grassPerChunk = 35;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, 5, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityErupe.class, 5, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityVillageDefender.class, 5, 1, 2));
		this.waterColorMultiplier = 50;
		
		
		
		
	}
	public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
	{
	return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.WorldGenWyverniaTree1 : this.worldGeneratorTrees));
	}
	public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);

        if (par2Random.nextInt(1500) == 0)
        {
            int k = par3 + par2Random.nextInt(16) + 8;
            int l = par4 + par2Random.nextInt(16) + 8;
            WorldGenDesertWells worldgendesertwells = new WorldGenDesertWells();
            worldgendesertwells.generate(par1World, par2Random, k, par1World.getHeightValue(k, l) + 1, l);
        }
        
    }

}
