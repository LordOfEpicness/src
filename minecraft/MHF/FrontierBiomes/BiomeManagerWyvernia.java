package MHF.FrontierBiomes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;
import scala.xml.include.sax.Main;

	public class BiomeManagerWyvernia {
	
		public static final BiomeGenBase WyverniaSnowyMountains = new BiomeGenWyverniaSnowyMountains(20);
		//public static final BiomeGenBase WyverniaJungle = new BiomeGenWyverniaJungle(21);
		public static final BiomeGenBase WyverniaDesert = new BiomeGenWyverniaDesert(22);
		//public static final BiomeGenBase WyverniaSwamp = new BiomeGenWyverniaSwamp(23);
		public static final BiomeGenBase WyverniaForestHills = new BiomeGenWyverniaForestHills(24);
		public static final BiomeGenBase WyverniaHighlands = new BiomeGenWyverniaHighlands(25);
		
	}