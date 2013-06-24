package MHF;

import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	//: Configuration File
	  //:Blocks
	public static int Mush1ID;
	public static int Mush2ID;
	public static int Mush3ID;	
	public static int BBQSpitID;
	public static int CrystalStelactiteID;
	public static int IceStelactiteID;	
	public static int oreArmorstone1ID;
	public static int oreArmorstone2ID;
	public static int oreArmorstone3ID;
	public static int oreArmorstone4ID;
	public static int oreArmorstone5ID;
	public static int oreArmorstone6ID;
	public static int oreArmorstone7ID;
	public static int oreArmorjewel1ID;
	public static int oreArmorjewel2ID;
	public static int oreArmorjewel3ID;
	public static int oreArmorjewel4ID;
	public static int oreStone1ID;
	public static int oreStone2ID;
	public static int oreStone3ID;
	public static int oreStone4ID;
	public static int oreStone5ID;
	public static int oreStone6ID;
	public static int oreStone7ID;
	public static int oreStone8ID;
	public static int oreStone9ID;
	public static int oreStone10ID;
	public static int DiscStoneID;
	public static int ArmorSphereID;
	public static int MachaliteOreID;
	public static int blockDesertSand_1ID;
	public static int blockDesignID;
	public static int blockFUCGrass_1ID;
	public static int blockFUCDirt_1ID;
	
	
	//Item
	public static int armorstone1ID;
	public static int armorstone2ID;
	public static int armorstone3ID;
	public static int armorstone4ID;
	public static int armorstone5ID;
	public static int armorstone6ID;
	public static int armorstone7ID;	
	public static int armorjewel1ID;
	public static int armorjewel2ID;
	public static int armorjewel3ID;
	public static int armorjewel4ID;	
	public static int monsterbone1ID;
	public static int monsterbone2ID;
	public static int monsterbone3ID;
	public static int monsterbone4ID;
	public static int monsterbone5ID;
	public static int monsterbone6ID;
	public static int monsterbone7ID;
	public static int monsterbone8ID;
	public static int monsterbone9ID;
	public static int monsterbone10ID;
	public static int monsterbone11ID;
	public static int monsterbone12ID;
	public static int monsterbone13ID;
	public static int monsterbone14ID;
	public static int monsterbone15ID;
	public static int monsterbone16ID;
	public static int monsterbone17ID;
	public static int monsterbone18ID;
	public static int crystal1ID;
	public static int crystal2ID;
	public static int crystal3ID;
	public static int crystal4ID;
	public static int crystal5ID;
	public static int ignot1ID;
	public static int ignot2ID;
	public static int ignot3ID;
	public static int ignot4ID;
	public static int ignot5ID;
	public static int ignot6ID;
	public static int ignot7ID;
	public static int stone1ID;
	public static int stone2ID;
	public static int stone3ID;
	public static int MonsterCompendiumID;
	public static int BBQPlacerID;
	public static int FishFood1ID;
	public static int FishFood2ID;
	public static int FishFood3ID;
	public static int WyverniaID;
	public static int WyvernianVolcanoeID;
	public static int bugnet0;
	public static int itemhotMilkID;
	public static int itemkirinBuffID;
	public static int itemfleshKirinID;
	public static int itemsparkKirinID;
    public static int itemmonsterSmokeID;
	public static int itemkirinBladeID;		
	public static int itemwarHammerID;		
	public static int rawMeatID;
	public static int cookedMeatID;
	public static int craftedpopoMeatID;
	public static int intbruteBoneID;
    public static int popoLeatherID;
	public static int kirinHelmID;
    public static int kirincapeID;
    public static int kirinshortsID;
    public static int kirinbootsID;
    public static int intRockBID;
    public static int intbleededHornID;
    public static int intArmorSphereID;
    public static int intMachaliteIngotID;
    public static int agitoGreatSwordID;
    public static int cephadromeHideID;    
    public static int burnedIngotID;    
    public static int sparkedDustID;    
    public static int portalstaffID;
    

	
	
	
	
		
	public static void init(FMLPreInitializationEvent e){
	Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file

			config.load(); //Loads it
		
		Mush1ID = config.getBlock("Blue Mushroom", 2201).getInt();
		Mush2ID = config.getBlock("Select Mushroom", 2202).getInt();
		Mush3ID = config.getBlock("Special Mushroom", 2203).getInt();
		
		BBQSpitID = config.getBlock("BBQ Spit (Block)", 2204).getInt();
		IceStelactiteID = config.getBlock("Ice Stelactite", 2205).getInt();
		CrystalStelactiteID = config.getBlock("Crystal Stelactite", 2206).getInt();
		
		oreArmorstone1ID = config.getBlock("Armor Stone Ore", 2300).getInt();
		oreArmorstone2ID = config.getBlock("Armor Sphere Ore", 2301).getInt();
		oreArmorstone3ID = config.getBlock("Armor Sphere+ Ore", 2302).getInt();
		oreArmorstone4ID = config.getBlock("Hrd Armor Sphere Ore", 2303).getInt();
		oreArmorstone5ID = config.getBlock("Hvy Armor Sphere Ore", 2304).getInt();
		oreArmorstone6ID = config.getBlock("Ryl Armor Sphere Ore", 2305).getInt();
		oreArmorstone7ID = config.getBlock("Tru Armor Sphere Ore", 2306).getInt();
		oreArmorjewel1ID = config.getBlock("Suiko Jewel Ore", 2307).getInt();
		oreArmorjewel2ID = config.getBlock("Akito Jewel Ore", 2308).getInt();
		oreArmorjewel3ID = config.getBlock("Battlefield Jewel Ore", 2309).getInt();
		oreArmorjewel4ID = config.getBlock("LapisLazuli Jewel Ore", 2310).getInt();
		oreStone1ID = config.getBlock("Earth Crystal Ore", 2311).getInt();
		oreStone2ID = config.getBlock("Malachite Ore", 2312).getInt();
		oreStone3ID = config.getBlock("Dragonite Ore", 2313).getInt();
		oreStone4ID = config.getBlock("Carbolite Ore", 2314).getInt();
		oreStone5ID = config.getBlock("Eltalite Ore", 2315).getInt();
		oreStone6ID = config.getBlock("Union Ore", 2316).getInt();
		oreStone7ID = config.getBlock("Mellanje Ore", 2317).getInt();
		oreStone8ID = config.getBlock("Firestone Ore", 2318).getInt();
		oreStone9ID = config.getBlock("Firecell Ore", 2319).getInt();
		oreStone10ID = config.getBlock("Rainbow Ore", 2320).getInt();
	    DiscStoneID = config.getBlock("Disc Stone", 202).getInt();
		ArmorSphereID = config.getBlock("Armor Sphere", 203).getInt();
		MachaliteOreID = config.getBlock("Machalite Ore", 204).getInt();
		blockDesertSand_1ID = config.getBlock("Desert Sand", 205).getInt();
		blockDesignID = config.getBlock("Block Design 1", 206).getInt();
		blockFUCGrass_1ID = config.getBlock("New Grass", 207).getInt();
		blockFUCDirt_1ID = config.getBlock("New Dirt", 208).getInt();
		
		//:Item Configuration
		
		
		
		//:Food Configuration
		armorstone1ID = config.getItem("Armor Stone", 24301).getInt();
		armorstone2ID = config.getItem("Armor Sphere", 24302).getInt();
		armorstone3ID = config.getItem("Armor Sphere+", 24303).getInt();
		armorstone4ID = config.getItem("Hrd Armor Sphere", 24304).getInt();
		armorstone5ID = config.getItem("Hvy Armor Sphere", 24305).getInt();
		armorstone6ID = config.getItem("Ryl Armor Sphere", 24306).getInt();
		armorstone7ID = config.getItem("Tru Armor Sphere", 24307).getInt();
		armorjewel1ID = config.getItem("Suiko Jewel", 24308).getInt();
		armorjewel2ID = config.getItem("Akito Jewel", 24309).getInt();
		armorjewel3ID = config.getItem("Battlefield Jewel", 24310).getInt();
		armorjewel4ID = config.getItem("LapizLazuli Jewel", 24311).getInt();
		monsterbone1ID = config.getItem("Sm Monster Bone", 24312).getInt();
		monsterbone2ID = config.getItem("Md Monster Bone", 24313).getInt();
		monsterbone3ID = config.getItem("Lg Monster Bone", 24314).getInt();
		monsterbone4ID = config.getItem("Mystery Bone", 24315).getInt();
		monsterbone5ID = config.getItem("Monster Bone+", 24316).getInt();
		monsterbone6ID = config.getItem("Hrd Monster Bone", 24317).getInt();
		monsterbone7ID = config.getItem("Hvy Monster Bone", 24318).getInt();
		monsterbone8ID = config.getItem("Robust Wyvern Bone", 24319).getInt();
		monsterbone9ID = config.getItem("Massive Bone", 24320).getInt();
		monsterbone10ID = config.getItem("Stout Bone", 24321).getInt();
		monsterbone11ID = config.getItem("Giant Bone", 24322).getInt();
		monsterbone12ID = config.getItem("Brute Bone", 24323).getInt();
		monsterbone13ID = config.getItem("ElderDragon Bone", 24324).getInt();
		monsterbone14ID = config.getItem("Big ElderDragon Bone", 24325).getInt();
		monsterbone15ID = config.getItem("Master's Skull", 24326).getInt();
		monsterbone16ID = config.getItem("Unknown Skull", 24327).getInt();
		monsterbone17ID = config.getItem("Sm Bone Husk", 24333).getInt();
		monsterbone18ID = config.getItem("Lg Bone Husk", 24334).getInt();
		crystal1ID = config.getItem("Earth Crystal", 24335).getInt();
		crystal2ID = config.getItem("Lightcrystal", 24336).getInt();
		crystal3ID = config.getItem("Novacrystal", 24337).getInt();
		crystal4ID = config.getItem("Purecrystal", 24338).getInt();
		crystal5ID = config.getItem("Ice Crystal", 24339).getInt();
		ignot1ID = config.getItem("Machalite Ignot", 24340).getInt();
		ignot2ID = config.getItem("Dragonite Ignot", 24341).getInt();
		ignot3ID = config.getItem("Carbalite Ignot", 24342).getInt();
		ignot4ID = config.getItem("Eltalite Ignot", 24343).getInt();
		ignot5ID = config.getItem("Union Ignot", 24344).getInt();
		ignot6ID = config.getItem("Mellanje Ignot", 24345).getInt();
		ignot7ID = config.getItem("Rainbow Ignot", 24346).getInt();
		stone1ID = config.getItem("Firestone", 24347).getInt();
		stone2ID = config.getItem("Firecell Stone", 24348).getInt();
		stone3ID = config.getItem("Antiseptic Stone", 24349).getInt();
		MonsterCompendiumID = config.getItem("Monster Compendium", 24328).getInt();
		BBQPlacerID = config.getItem("BBQSpit (Item)", 24329).getInt();
		FishFood1ID = config.getItem("Sushifish", 24330).getInt();
		FishFood2ID = config.getItem("Glutton Tuna", 24331).getInt();
		FishFood3ID = config.getItem("Gastronome Tuna", 24332).getInt();
		itemhotMilkID = config.getItem("Hot Milk", 2014).getInt();
		itemkirinBuffID = config.getItem("Kirin Buff", 2015).getInt();
		itemfleshKirinID = config.getItem("Kirin Mane", 2016).getInt();
	    itemsparkKirinID = config.getItem("Kirin Charm", 2017).getInt();
	    itemmonsterSmokeID = config.getItem("Monster Smoke", 2018).getInt();
		itemkirinBladeID = config.getItem("Kirin Thundersword", 2019).getInt();		
		itemwarHammerID = config.getItem("War Hammer", 2020).getInt();		
		rawMeatID = config.getItem("Raw Meat", 3901).getInt();
		cookedMeatID = config.getItem("Cooked Meat", 3902).getInt();
		craftedpopoMeatID = config.getItem("Crafted Popo Meat", 3903).getInt();
		intbruteBoneID = config.getItem("Brute Bone EX", 3904).getInt();
	    popoLeatherID = config.getItem("Popo Leather", 3905).getInt();
		kirinHelmID = config.getItem("Kirin Helm", 3906).getInt();
	    kirincapeID = config.getItem("Kirin Cape", 3907).getInt();
	    kirinshortsID = config.getItem("Kirin Shorts", 3908).getInt();
	    kirinbootsID = config.getItem("Kirin Boots", 3909).getInt();
	    intRockBID = config.getItem("Erupe's Carve", 3910).getInt();
	    intbleededHornID = config.getItem("Bleeded Erupe Horn", 3911).getInt();
	    intArmorSphereID = config.getItem("Armor Sphere", 3912).getInt();
	    intMachaliteIngotID = config.getItem("Machalite Ingot", 3913).getInt();
	    agitoGreatSwordID = config.getItem("Agito Great Sword", 3914).getInt();
	    cephadromeHideID = config.getItem("Cephadrome Hide", 3915).getInt();    
	    burnedIngotID = config.getItem("Burned Ingot", 3916).getInt();    
	    sparkedDustID = config.getItem("Sparked Dust", 3917).getInt();   
	    portalstaffID = config.getItem("Portal Staff", 3918).getInt();
	    
		
		config.save();
		
	}

}
