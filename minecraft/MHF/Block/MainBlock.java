package MHF.Block;

import MHF.Block.Plant.BlockMushroom1;
import MHF.Block.Plant.BlockMushroom2;
import MHF.Block.Plant.BlockMushroom3;
import MHF.TileEntity.TileEntityBBQSpit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MainBlock {

	public static Block Mush1;
	public static Block Mush2;
	public static Block Mush3;
	public static Block BonePile;
	
	public static Block SpecialFire;
	public static Block Portal;
	
	public static Block oreArmorjewel0;
	public static Block oreArmorjewel1;
	public static Block oreArmorjewel2;
	public static Block oreArmorjewel3;
	
	public static Block oreStone0;
	public static Block oreStone1;
	public static Block oreStone2;
	public static Block oreStone3;
	public static Block oreStone4;
	public static Block oreStone5;
	public static Block oreStone6;
	public static Block oreStone7;
	public static Block oreStone8;
	public static Block oreStone9;
	
	public static Block oreArmorstone0;
	public static Block oreArmorstone1;
	public static Block oreArmorstone2;
	public static Block oreArmorstone3;
	public static Block oreArmorstone4;
	public static Block oreArmorstone5;
	public static Block oreArmorstone6;
	public static Block DiscStone;
    public static Block ArmorSphere;
    public static Block MachaliteOre;
    public static Block blockDesertSand_1;
    public static Block blockDesign;
    public static Block blockFUCGrass_1;
    public static Block blockFUCDirt_1;
    
   
	public static void init() {

		//Blocks
		  DiscStone = new FUCBlockClass(2201, "Disc Stone").setUnlocalizedName("discStone").setHardness(1.5F).setResistance(1.0F);
		  ArmorSphere = new FUCOreBlock1(2202, "Armor Sphere").setUnlocalizedName("oreArmorSphere").setHardness(2.0F).setResistance(2.0F);
	      MachaliteOre = new FUCOreBlock2(2203, "MachaliteOre").setUnlocalizedName("oreMachalite").setHardness(4.5F).setResistance(3.7F);
	      blockDesertSand_1 = new FUCBlockSand_1(2204, "Desert Sand").setUnlocalizedName("blockSand_1").setHardness(0.7F).setResistance(0.7F);
	      blockDesign = new FUCBlockDesign_1(2205, "Block Design").setUnlocalizedName("blockDesign").setHardness(3.7F).setResistance(1.7F);
	      blockFUCGrass_1 = new FUCBlockGrass1(2206).setUnlocalizedName("fucGrassSide");
	      blockFUCDirt_1 = new FUCBlockDirt(2207, Material.ground).setUnlocalizedName("fucDirt");
	     
		  oreArmorjewel0 = new BlockArmorjewelOre0(2301, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorjewel0");
		  oreArmorjewel1 = new BlockArmorjewelOre1(2302, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorjewel1");
		  oreArmorjewel2 = new BlockArmorjewelOre2(2303, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorjewel2");
		  oreArmorjewel3 = new BlockArmorjewelOre3(2304, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorjewel3");
		  
		  oreStone0 = new BlockStoneOre0(2305, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone0");
		  oreStone1 = new BlockStoneOre1(2306, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone1");
		  oreStone2 = new BlockStoneOre2(2307, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone2");
		  oreStone3 = new BlockStoneOre3(2308, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone3");
		  oreStone4 = new BlockStoneOre4(2309, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone4");
		  oreStone5 = new BlockStoneOre5(2310, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone5");
		  oreStone6 = new BlockStoneOre6(2311, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone6");
		  oreStone7 = new BlockStoneOre7(2312, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone7");
		  oreStone8 = new BlockStoneOre8(2313, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone8");
		  oreStone9 = new BlockStoneOre9(2314, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreStone9");
		  
		  oreArmorstone0 = new BlockArmorstoneOre0(2315, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone0");
		  oreArmorstone1 = new BlockArmorstoneOre1(2316, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone1");
		  oreArmorstone2 = new BlockArmorstoneOre2(2317, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone2");
		  oreArmorstone3 = new BlockArmorstoneOre3(2318, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone3");
		  oreArmorstone4 = new BlockArmorstoneOre4(2319, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone4");
		  oreArmorstone5 = new BlockArmorstoneOre5(2320, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone5");
		  oreArmorstone6 = new BlockArmorstoneOre6(2321, Material.rock).setHardness(3.0F).setResistance(5.0F).setUnlocalizedName("oreArmorstone6");
		  
		  
		  
		  BonePile = new BlockBonePile(2325, 300).setUnlocalizedName("BonePile");
		  Portal = new BlockWyverniaPortal(2327).setUnlocalizedName("Portal");

		  Mush1 = new BlockMushroom1(2330, "MonsterHunterCrafted:mushroom1").setUnlocalizedName("Mushroom1");
		  Mush2 = new BlockMushroom2(2331, "MonsterHunterCrafted:mushroom2").setUnlocalizedName("Mushroom2");
		  Mush3 = new BlockMushroom3(2332, "MonsterHunterCrafted:mushroom3").setUnlocalizedName("Mushroom3");
		  
		  // -------------------------------------------------------GameRegistry------------------------------------------------------//
		  
		  GameRegistry.registerBlock(oreArmorjewel0, "Suiko Jewel Ore");
		  GameRegistry.registerBlock(oreArmorjewel1, "Akito Jewel Ore");
		  GameRegistry.registerBlock(oreArmorjewel2, "Battlefield Jewel Ore");
		  GameRegistry.registerBlock(oreArmorjewel3, "LapiLazuli Jewel Ore");
		  
		  GameRegistry.registerBlock(oreStone0, "Earth Crystal Ore");
		  GameRegistry.registerBlock(oreStone1, "Machalite Ore");
		  GameRegistry.registerBlock(oreStone2, "Dragonire Ore");
		  GameRegistry.registerBlock(oreStone3, "Carbonite Ore");
		  GameRegistry.registerBlock(oreStone4, "Eltalite Ore");
		  GameRegistry.registerBlock(oreStone5, "Union Ore");
		  GameRegistry.registerBlock(oreStone6, "Mellanje Ore");
		  GameRegistry.registerBlock(oreStone7, "Firestone Ore");
		  GameRegistry.registerBlock(oreStone8, "Firecell Ore");
		  GameRegistry.registerBlock(oreStone9, "Rainbow Ore");
		  
		  GameRegistry.registerBlock(oreArmorstone0, "Armor Stone Ore");
		  GameRegistry.registerBlock(oreArmorstone1, "Armor Sphere Ore");
		  GameRegistry.registerBlock(oreArmorstone2, "Armor Sphere+ Ore");
		  GameRegistry.registerBlock(oreArmorstone3, "Hrd Armor Sphere Ore");
		  GameRegistry.registerBlock(oreArmorstone4, "Hvy Armor Sphere Ore");
		  GameRegistry.registerBlock(oreArmorstone5, "Ryl Armor Sphere Ore");
		  GameRegistry.registerBlock(oreArmorstone6, "Tru Armor Sphere Ore");
		  

			GameRegistry.registerBlock(DiscStone, "Disc Stone");
			GameRegistry.registerBlock(ArmorSphere, "ArmorSphere");
			GameRegistry.registerBlock(MachaliteOre, "MachaliteOre");
			GameRegistry.registerBlock(blockDesertSand_1, "DesertSand");
			GameRegistry.registerBlock(blockDesign, "BlockDesign");
			GameRegistry.registerBlock(blockFUCGrass_1, "MHFBlockGrass");
			GameRegistry.registerBlock(blockFUCDirt_1, "MHF Dirt");
		  
		  GameRegistry.registerBlock(Portal, "Wyvernian Portal");
		  
		  GameRegistry.registerBlock(BonePile, "BonePile");
		  GameRegistry.registerBlock(Mush1, "Mushroom1");	  
		  GameRegistry.registerBlock(Mush2, "Mushroom2");
		  GameRegistry.registerBlock(Mush3, "Mushroom3");
		  
		 
		  
		  //---------------------------------LanguageRegistry--------------------------------------------------------//
		  
		  LanguageRegistry.addName(oreArmorjewel0, "Suiko Jewel Ore");
		  LanguageRegistry.addName(oreArmorjewel1, "Akito Jewel Ore");
		  LanguageRegistry.addName(oreArmorjewel2, "Battlefield Jewel Ore");
		  LanguageRegistry.addName(oreArmorjewel3, "LapiLazuli Ore");
		  
		  LanguageRegistry.addName(oreStone0, "Earth Crystal Ore");
		  LanguageRegistry.addName(oreStone1, "Machalite Ore");
		  LanguageRegistry.addName(oreStone2, "Dragonite Ore");
		  LanguageRegistry.addName(oreStone3, "Carbolite Ore");
		  LanguageRegistry.addName(oreStone4, "Eltalite Ore");
		  LanguageRegistry.addName(oreStone5, "Union Ore");
		  LanguageRegistry.addName(oreStone6, "Mellanje Ore");
		  LanguageRegistry.addName(oreStone7, "Firestone Ore");
		  LanguageRegistry.addName(oreStone8, "Firecell Ore");
		  LanguageRegistry.addName(oreStone9, "Rainbow Ore"); 
		  
		  LanguageRegistry.addName(oreArmorstone0, "Armor Stone Ore");
		  LanguageRegistry.addName(oreArmorstone1, "Armor Sphere Ore");
		  LanguageRegistry.addName(oreArmorstone2, "Armor Sphere+ Ore");
		  LanguageRegistry.addName(oreArmorstone3, "Hrd Armor Sphere Ore");
		  LanguageRegistry.addName(oreArmorstone4, "Hvy Armor Sphere Ore");
		  LanguageRegistry.addName(oreArmorstone5, "Ryl Armor Sphere Ore");
		  LanguageRegistry.addName(oreArmorstone6, "Tru Armor Sphere Ore");
		  
		  
		  LanguageRegistry.addName(Portal, "Wyvernian Portal");
		  LanguageRegistry.addName(BonePile, "Bone Pile");
		  LanguageRegistry.addName(Mush2 , "Select Mushroom");
		  LanguageRegistry.addName(Mush1 , "Blue Mushroom");
		  LanguageRegistry.addName(Mush3, "Special Mushroom"); 	  
		  
		  LanguageRegistry.addName(DiscStone, "Disc Stone");
		  LanguageRegistry.addName(ArmorSphere, "Armor Sphere");
		  LanguageRegistry.addName(MachaliteOre, "Machalite Ore");
		  LanguageRegistry.addName(blockDesertSand_1, "Desert Sand");
		  LanguageRegistry.addName(blockDesign, "Block Design");
		    LanguageRegistry.addName(blockFUCGrass_1, "MHF Block Grass");
		    LanguageRegistry.addName(blockFUCDirt_1, "MHF Block Dirt");
    }

}
