package MHF.FrontierBiomes;

import java.util.Random;

import MHF.Entity.EntityFish;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.Block;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenWyverniaVolcanoe extends BiomeGenBase{

	private WorldGenerator theWorldGenerator;
	
	public BiomeGenWyverniaVolcanoe(int par1) {
		super(par1);
		this.setBiomeName("Volcanoe");
		this.setDisableRain();
		this.setMinMaxHeight(0.6F, 1.0F);
		this.setTemperatureRainfall(2.0F, 0.0F);
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableWaterCreatureList.clear();
		this.spawnableWaterCreatureList.add(new SpawnListEntry(EntityFish.class, 2, 1, 1));
		this.topBlock = ((byte) Block.stone.blockID);
		this.fillerBlock = ((byte)Block.stone.blockID);
		this.theBiomeDecorator.generateLakes = false;
		this.theBiomeDecorator.treesPerChunk = -999;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.deadBushPerChunk = 4;

		this.theWorldGenerator = new WorldGenMinable(Block.lavaStill.blockID, 20);
	}	
	
	@SideOnly(Side.CLIENT)
	public int getBiomeGrassColor(){
		return 0xFF9000;
		}
	
	@SideOnly(Side.CLIENT)
	public int getBiomeFoliageColor(){
		return 0xFF9A00;
		}
	
	@SideOnly(Side.CLIENT)
	public int getSkyColorByTemp(float par1){
		return 0xFF9400;
		}
	
	@SideOnly(Side.CLIENT)
	public int getWaterColor(){
		return 0x2C455D;
	}
	
}
