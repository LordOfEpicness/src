package MHF.FrontierBiomes;

import java.util.Random;

import MHF.Entity.EntityGiant;
import MHF.Entity.EntityWarriorFinale;

import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenWyverniaForestHills extends BiomeGenBase{

	public BiomeGenWyverniaForestHills(int par1) {
		super(par1);
		this.setBiomeName("Forest Hills ");
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 5, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityWarriorFinale.class, 5, 1, 2));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityGiant.class, 5, 1, 2));
	}

	public WorldGenerator getRandomWorldGenForTrees(Random par1Random){
		return (WorldGenerator)(par1Random.nextInt(5) == 0 ? this.worldGeneratorForest : (par1Random.nextInt(10) == 0 ? this.worldGeneratorBigTree : this.worldGeneratorTrees));
	}
	
}
