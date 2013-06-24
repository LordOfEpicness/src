package MHF.FrontierBiomes;

import MHF.Block.MainBlock;
import MHF.Entity.EntityCephadrome;
import MHF.Entity.EntityCephalos;
import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;

public class BiomeGenWyverniaDesert extends BiomeGenBase {

	public BiomeGenWyverniaDesert(int par1) {
		super(par1);
		this.setBiomeName("Wide Desert");
		this.setMinMaxHeight(0.3F, 0.8F);
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();
		this.topBlock = (byte)MainBlock.blockDesertSand_1.blockID;
        this.fillerBlock = (byte)Block.sand.blockID;
        this.theBiomeDecorator.treesPerChunk = -999;
        this.theBiomeDecorator.deadBushPerChunk = 2;
        this.theBiomeDecorator.generateLakes = false;
        this.spawnableMonsterList.add(new SpawnListEntry(EntityCephadrome.class, 1, 1, 1));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityCephalos.class, 1, 1, 1));
	}

}
