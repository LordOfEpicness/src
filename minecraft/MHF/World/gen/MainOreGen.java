package MHF.World.gen;

import java.util.Random;

import MHF.Block.MainBlock;
import MHF.World.gen.layer.WorldGenMinableWyvernia;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;


public class MainOreGen implements IWorldGenerator
{
	
	public static int rarity = 50;
	
	/** Methods For Ore Generation **/
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		/** switchs between dimension's**/
		// the case number must match the dimension id !!!!!!!!!!! i dont no y ? it just does lol
		switch(world.provider.dimensionId)
		{
		case 2 :
			generateWyvernia(world, random, chunkX * 16, chunkZ * 16);
		}
	}

	private void generateWyvernia(World world, Random random, int chunkX, int chunkZ)
	{
		for(int i = 0; i < 4; i++)
		{
			//this below just tells me if its generating or not
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(128);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			//The 230 on the line below is how meny will generate per vain, as an example i think diamond is like 2 or 4
			//and the Block.blockIron is what it will spawn
			(new WorldGenMinableWyvernia(MainBlock.oreStone0.blockID, 16)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorstone0.blockID, 13)).generate(world, random, xCoord, yCoord, zCoord);
		}
		// the 4 below is for how rare it will be
		for(int i = 0; i < 3; i++)
		{
			//this below just tells me if its generating or not
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(128);// the 128 is the max height the ore/block will generate
			int zCoord = chunkZ + random.nextInt(16);

			//The 230 on the line below is how meny will generate per vain, as an example i think diamond is like 2 or 4
			//and the Block.blockIron is what it will spawn
			(new WorldGenMinableWyvernia(MainBlock.oreStone1.blockID, 15)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone2.blockID, 12)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone3.blockID, 9)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone4.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone5.blockID, 7)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone7.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreStone9.blockID, 7)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorstone1.blockID, 11)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorstone2.blockID, 9)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorstone3.blockID, 7)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorstone5.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorjewel0.blockID, 10)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.oreArmorjewel1.blockID, 8)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.ArmorSphere.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
			(new WorldGenMinableWyvernia(MainBlock.ArmorSphere.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
		}
			
			for(int i = 0; i < 2; i++)
			{
				//this below just tells me if its generating or not
				int xCoord = chunkX + random.nextInt(16);
				int yCoord = random.nextInt(128);// the 128 is the max height the ore/block will generate
				int zCoord = chunkZ + random.nextInt(16);

				//The 230 on the line below is how meny will generate per vain, as an example i think diamond is like 2 or 4
				//and the Block.blockIron is what it will spawn
				(new WorldGenMinableWyvernia(MainBlock.oreStone6.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
				(new WorldGenMinableWyvernia(MainBlock.oreStone8.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
				(new WorldGenMinableWyvernia(MainBlock.oreArmorstone4.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
				(new WorldGenMinableWyvernia(MainBlock.oreArmorstone6.blockID, 5)).generate(world, random, xCoord, yCoord, zCoord);
				(new WorldGenMinableWyvernia(MainBlock.oreArmorjewel2.blockID, 6)).generate(world, random, xCoord, yCoord, zCoord);
				(new WorldGenMinableWyvernia(MainBlock.oreArmorjewel3.blockID, 4)).generate(world, random, xCoord, yCoord, zCoord);
		}
			
	}
}
