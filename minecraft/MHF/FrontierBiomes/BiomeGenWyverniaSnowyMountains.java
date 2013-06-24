package MHF.FrontierBiomes;

import MHF.Entity.EntityKirin;
import MHF.Entity.EntityPopo;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class BiomeGenWyverniaSnowyMountains extends BiomeGenBase{

	private WorldGenMinable theWorldGenerator;

	public BiomeGenWyverniaSnowyMountains(int par1) {
		super(par1);
		this.setBiomeName("Snowy Mountains");
		this.setEnableSnow();
		this.setMinMaxHeight(1.5F, 2.0F);
		this.setTemperatureRainfall(0.1F, 1.0F);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = ((byte) Block.blockSnow.blockID);
		this.fillerBlock = ((byte)Block.stone.blockID);
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPopo.class, 5, 1, 3));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityKirin.class, 2, 1, 1));
	
		this.theWorldGenerator = new WorldGenMinable(Block.ice.blockID, 50);
	}

}
