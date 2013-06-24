package MHF.Item;
import MHF.MonsterHunterFrontier;
import MHF.CreativeTabs.TabMonsterHunterBlocks;
import MHF.CreativeTabs.TabMonsterHunterDrops;
import MHF.CreativeTabs.TabMonsterHunterFoods;
import MHF.CreativeTabs.TabMonsterHunterItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class MainItem {
	
	public static Item MonsterCompendium;
	
	public static Item armorstone0;
	public static Item armorstone1;
	public static Item armorstone2;
	public static Item armorstone3;
	public static Item armorstone4;
	public static Item armorstone5;
	public static Item armorstone6;
	
	public static Item armorjewel0;
	public static Item armorjewel1;
	public static Item armorjewel2;
	public static Item armorjewel3;	
	
	public static Item monsterbone00;
	public static Item monsterbone01;
	public static Item monsterbone02;
	public static Item monsterbone03;
	public static Item monsterbone04;
	public static Item monsterbone05;
	public static Item monsterbone06;
	public static Item monsterbone07;
	public static Item monsterbone08;
	public static Item monsterbone09;
	public static Item monsterbone10;
	public static Item monsterbone11;
	public static Item monsterbone12;
	public static Item monsterbone13;
	public static Item monsterbone14;
	public static Item monsterbone15;
	public static Item monsterbone16;
	public static Item monsterbone17;
	
	public static Item crystal1;
	public static Item crystal2;
	public static Item crystal3;
	public static Item crystal4;
	public static Item crystal5;
	
	public static Item ignot1;
	public static Item ignot2;
	public static Item ignot3;
	public static Item ignot4;
	public static Item ignot5;
	public static Item ignot6;
	public static Item ignot7;
	
	public static Item stone1;
	public static Item stone2;
	public static Item stone3;
	
	public static Item FishFood1;
	public static Item FishFood2;
	public static Item FishFood3;
	
	public static Item bugnet0;
	public static Item itemhotMilk;
	public static Item itemkirinBuff;
	public static Item itemfleshKirin;
	public static Item itemsparkKirin;
    public static Item itemmonsterSmoke;
	public static Item itemkirinBlade;		
	public static Item itemwarHammer;		
	public static Item rawMeat;
	public static Item cookedMeat;
	public static Item craftedpopoMeat;
	public static Item itembruteBone;
    public static Item popoLeather;
	public static Item kirinHelm;
    public static Item kirincape;
    public static Item kirinshorts;
    public static Item kirinboots;
    public static Item itemRockB;
    public static Item itembleededHorn;
    public static Item itemArmorSphere;
    public static Item itemMachaliteIngot;
    public static Item agitoGreatSword;
    public static Item cephadromeHide;    
    public static Item burnedIngot;    
    public static Item sparkedDust;    
    public static Item portalstaff;
       

	public static void init() {

		//Items
		
		itemhotMilk = new ItemhotMilk(3901, 5, false).setPotionEffect(Potion.moveSpeed.id, 150, 5, 5F).setUnlocalizedName("hotMilk");
		 itemkirinBuff = new ItemkirinBuff(3902, 7, 12.0F, false).setPotionEffect(Potion.resistance.id, 150, 12, 7F).setUnlocalizedName("kirinBuff");
		 itemfleshKirin = new ItemfleshKirin(3903).setUnlocalizedName("fleshKirin");
		 itemsparkKirin = new ItemsparkKirin(3904).setUnlocalizedName("sparkKirin");
	     itemmonsterSmoke = new ItemBlueSmoke(3905).setUnlocalizedName("blueSmokeGrenade");
		 itemkirinBlade = new FUCBladeOfKirin(3906, MonsterHunterFrontier.LIGHT).setUnlocalizedName("swordKirin").setCreativeTab(CreativeTabs.tabCombat);		
		 itemwarHammer = new FUCWarHammer(3907, MonsterHunterFrontier.Hamma).setUnlocalizedName("ItemwarHammer").setCreativeTab(CreativeTabs.tabCombat).setFull3D();		
		 rawMeat = new ItemRawMeat(3908, 0, true).setUnlocalizedName("rawMeat");
		 cookedMeat = new ItemCookedMeat(3909, 5, 6.0F, true).setUnlocalizedName("cookedMeat");
		 craftedpopoMeat = new ItemCraftedPopoMeat(3910, 7, 7.0F, true).setPotionEffect(Potion.jump.id, 150, 4, 3.5F).setUnlocalizedName("craftedPopoMeat");
		 itembruteBone = new ItemBruteBone(3911).setUnlocalizedName("bruteBone");
	     popoLeather = new ItemPopoLeather(3912).setUnlocalizedName("popoLeather");
		 kirinHelm = new ItemcrestKirin(3913, MonsterHunterFrontier.armorKirin , 2, 0).setUnlocalizedName("monsterhunter:helmetKirin");
	     kirincape = new ItemcrestKirin(3914, MonsterHunterFrontier.armorKirin , 2, 1).setUnlocalizedName("monsterhunter:chestplateKirin");
	     kirinshorts = new ItemcrestKirin(3915, MonsterHunterFrontier.armorKirin , 2, 2).setUnlocalizedName("monsterhunter:leggingsKirin");
	     kirinboots = new ItemcrestKirin(3916, MonsterHunterFrontier.armorKirin , 2, 3).setUnlocalizedName("monsterhunter:bootsKirin");
	     itemRockB = new ItemRockB(3917).setUnlocalizedName("itemRockB");
	     itembleededHorn = new ItemBleededHorn(3918).setUnlocalizedName("bleedBigHorn");
	     itemArmorSphere = new ItemArmorSphere(3919).setUnlocalizedName("armorSphere");
	     itemMachaliteIngot = new ItemMachaliteIngot(3920).setUnlocalizedName("machaliteIngot");
	     agitoGreatSword = new FUCAgitoGreatSword(3921, MonsterHunterFrontier.Agito).setUnlocalizedName("agitoGreatSword").setCreativeTab(CreativeTabs.tabCombat).setFull3D();
	     cephadromeHide = new ItemCephadromeHide(3922).setUnlocalizedName("cephadromeHide"); 
	     burnedIngot = new ItemBurnedIngot(3923).setUnlocalizedName("burnedIngot");
	     sparkedDust = new ItemSparkedDust(3924).setUnlocalizedName("sparkedDust");
	     portalstaff = new ItemWyverniaPortalStaff(3925).setUnlocalizedName("wyerniaStaff");
	   
		
		
		
		
		
		  armorstone0 = new ItemArmorstone1(24301).setUnlocalizedName("armorstone1");
		  armorstone1 = new ItemArmorstone2(24302).setUnlocalizedName("armorstone2");
		  armorstone2 = new ItemArmorstone3(24303).setUnlocalizedName("armorstone3");
		  armorstone3 = new ItemArmorstone4(24304).setUnlocalizedName("armorstone4");
		  armorstone4 = new ItemArmorstone5(24305).setUnlocalizedName("armorstone5");
		  armorstone5 = new ItemArmorstone6(24306).setUnlocalizedName("armorstone6");
		  armorstone6 = new ItemArmorstone7(24307).setUnlocalizedName("armorstone7");
		  
		  armorjewel0 = new ItemArmorjewel1(24308).setUnlocalizedName("armorjewel1");
		  armorjewel1 = new ItemArmorjewel2(24309).setUnlocalizedName("armorjewel2");
		  armorjewel2 = new ItemArmorjewel3(24310).setUnlocalizedName("armorjewel3");
		  armorjewel3 = new ItemArmorjewel4(24311).setUnlocalizedName("armorjewel4");
		  
		  monsterbone00 = new ItemMonsterbone00(24312).setUnlocalizedName("monsterbone1");
		  monsterbone01 = new ItemMonsterbone01(24313).setUnlocalizedName("monsterbone2");
		  monsterbone02 = new ItemMonsterbone02(24314).setUnlocalizedName("monsterbone3");
		  monsterbone03 = new ItemMonsterbone03(24315).setUnlocalizedName("monsterbone4");
		  monsterbone04 = new ItemMonsterbone04(24316).setUnlocalizedName("monsterbone5");
		  monsterbone05 = new ItemMonsterbone05(24317).setUnlocalizedName("Hrd Monster Bone");
		  monsterbone06 = new ItemMonsterbone06(24318).setUnlocalizedName("Hvy Monster Bone");
		  monsterbone07 = new ItemMonsterbone07(24319).setUnlocalizedName("Robust Wyvern Bone");
		  monsterbone08 = new ItemMonsterbone08(24320).setUnlocalizedName("Massive Bone");
		  monsterbone09 = new ItemMonsterbone09(24321).setUnlocalizedName("Stout Bone");
		  monsterbone10 = new ItemMonsterbone10(24322).setUnlocalizedName("Giant Bone");
		  monsterbone11 = new ItemMonsterbone11(24323).setUnlocalizedName("Brute Bone");
		  monsterbone12 = new ItemMonsterbone12(24324).setUnlocalizedName("ElderDragon Bone");
		  monsterbone13 = new ItemMonsterbone13(24325).setUnlocalizedName("Big ElderDragon Bone");
		  monsterbone14 = new ItemMonsterbone14(24326).setUnlocalizedName("Master's Skull");
		  monsterbone15 = new ItemMonsterbone15(24327).setUnlocalizedName("Unknown Skull");
		  monsterbone16 = new ItemMonsterbone16(24333).setUnlocalizedName("Sm Bone Husk");
		  monsterbone17 = new ItemMonsterbone17(24334).setUnlocalizedName("Lg bone Husk");
		  
		  crystal1 = new ItemCrystal1(24335).setUnlocalizedName("Earth Crystal");
		  crystal2 = new ItemCrystal2(24336).setUnlocalizedName("Lightcrystal");
		  crystal3 = new ItemCrystal2(24337).setUnlocalizedName("Novacrystal");
		  crystal4 = new ItemCrystal3(24338).setUnlocalizedName("Purecrystal");
		  crystal5 = new ItemCrystal4(24339).setUnlocalizedName("Ice Crystal");
		  
		  ignot1 = new ItemIgnot1(24340).setUnlocalizedName("Machalite Ignot");
		  ignot2 = new ItemIgnot2(24341).setUnlocalizedName("Dragonite Ignot");
		  ignot3 = new ItemIgnot3(24342).setUnlocalizedName("Carbalite Ignot");
		  ignot4 = new ItemIgnot4(24343).setUnlocalizedName("Eltalite Ignot");
		  ignot5 = new ItemIgnot5(24344).setUnlocalizedName("Union Ignot");
		  ignot6 = new ItemIgnot6(24345).setUnlocalizedName("Mellanje Ignot");
		  ignot7 = new ItemIgnot7(24346).setUnlocalizedName("Rainbow Ignot");
		  
		  stone1 = new ItemStone1(24347).setUnlocalizedName("Firestone");
		  stone2 = new ItemStone2(24348).setUnlocalizedName("Firecell Stone");
		  stone3 = new ItemStone3(24349).setUnlocalizedName("Antiseptic Stone");
		  
		  MonsterCompendium = new ItemMonsterCompendium(24328).setUnlocalizedName("compendium"); 
		  
		  
		  bugnet0 = new ItemBugnet(24333, EnumWyverniaToolMaterial.OLD).setUnlocalizedName("Old Bugnet");
		  
		  LanguageRegistry.addName(bugnet0, "WIP Old Bugnet");
	      LanguageRegistry.addName(armorstone0, "Armor Stone");
		  LanguageRegistry.addName(armorstone1, "Armor Sphere");
		  LanguageRegistry.addName(armorstone2, "Armor Sphere+");
		  LanguageRegistry.addName(armorstone3, "Hrd Armor Sphere");
		  LanguageRegistry.addName(armorstone4, "Hvy Armor Sphere");
		  LanguageRegistry.addName(armorstone5, "Ryl Armor Sphere");
		  LanguageRegistry.addName(armorstone6, "Tru Armor Sphere");  
		  LanguageRegistry.addName(armorjewel0, "Suiko Jewel");
		  LanguageRegistry.addName(armorjewel1, "Akito Jewel");
		  LanguageRegistry.addName(armorjewel2, "Batllefield Jewel");
		  LanguageRegistry.addName(armorjewel3, "LapisLazuli Jewel");	  
		  LanguageRegistry.addName(monsterbone00, "Sm Monster Bone");
		  LanguageRegistry.addName(monsterbone01, "Md Monster Bone");
		  LanguageRegistry.addName(monsterbone02, "Lg Monster Bone");
		  LanguageRegistry.addName(monsterbone03, "Mystery Bone");
		  LanguageRegistry.addName(monsterbone04, "Monster Bone+");
		  LanguageRegistry.addName(monsterbone05, "Hrd Monster Bone");
		  LanguageRegistry.addName(monsterbone06, "Hvy Monster Bone");
		  LanguageRegistry.addName(monsterbone07, "Robust Wyvern Bone");
		  LanguageRegistry.addName(monsterbone08, "Massive Bone");
		  LanguageRegistry.addName(monsterbone09, "Stout Bone");
		  LanguageRegistry.addName(monsterbone10, "Giant Bone");
		  LanguageRegistry.addName(monsterbone11, "Brute Bone");
		  LanguageRegistry.addName(monsterbone12, "ElderDragon Bone");
		  LanguageRegistry.addName(monsterbone13, "Big ElderDragon Bone");
		  LanguageRegistry.addName(monsterbone14, "Master's Skull");
		  LanguageRegistry.addName(monsterbone15, "Unknown Skull");
		  LanguageRegistry.addName(monsterbone16, "Sm Bone Husk");
		  LanguageRegistry.addName(monsterbone17, "Lg Bone Husk");
		  LanguageRegistry.addName(crystal1, "Earth Crystal");
		  LanguageRegistry.addName(crystal2, "Lightcrystal");
		  LanguageRegistry.addName(crystal3, "Novacrystal");
		  LanguageRegistry.addName(crystal4, "Purecrystal");
		  LanguageRegistry.addName(crystal5, "Ice Crystal");
		  LanguageRegistry.addName(ignot1, "Machalite Ignot");
		  LanguageRegistry.addName(ignot2, "Dragonite Ignot");  
		  LanguageRegistry.addName(ignot3, "Carbalite Ignot");
		  LanguageRegistry.addName(ignot4, "Eltalite Ignot");
		  LanguageRegistry.addName(ignot5, "Union Ingot");
		  LanguageRegistry.addName(ignot6, "Mellanje Ignot");	  
		  LanguageRegistry.addName(ignot7, "Rainbow Ignot");
		  LanguageRegistry.addName(stone1, "Firestone");
		  LanguageRegistry.addName(stone2, "Firecell Stone");
		  LanguageRegistry.addName(stone3, "Antiseptic Stone");
		  LanguageRegistry.addName(MonsterCompendium, "Monster Compendium"); 
		 
		  LanguageRegistry.addName(itemkirinBlade, "\u00a7eGS:Kirin Thundersword");
			LanguageRegistry.addName(itemhotMilk, "hot milk");
			LanguageRegistry.addName(itemkirinBuff, "\u00a7eKirin's Buff");
			LanguageRegistry.addName(itemfleshKirin, "Kirin's Mane");
			LanguageRegistry.addName(itemsparkKirin, "Kirin's Charm");
			LanguageRegistry.addName(itemmonsterSmoke, "Monster Smoke");
			LanguageRegistry.addName(itemwarHammer, "\u00a7eWar Hammer");
			LanguageRegistry.addName(rawMeat, "Raw Meat");
			LanguageRegistry.addName(cookedMeat, "Cooked Meat");
			LanguageRegistry.addName(craftedpopoMeat, "Buffed Popo Meat");
		    LanguageRegistry.addName(itembruteBone, "Brute Bone HC");
		    LanguageRegistry.addName(popoLeather, "Popo Leather");
		    LanguageRegistry.addName(kirinHelm, "Kirin's Crest (\u00a7eBasic)");
		    LanguageRegistry.addName(kirincape, "Kirin's Cape (\u00a7eBasic)");
		    LanguageRegistry.addName(kirinshorts, "Kirin's Short (\u00a7eBasic)");
		    LanguageRegistry.addName(kirinboots, "Kirin's Boots (\u00a7eBasic)");
		    LanguageRegistry.addName(itemRockB, "Erupe's Carve");
		    LanguageRegistry.addName(itembleededHorn, "Bleeded Erupe Horn");
		    LanguageRegistry.addName(portalstaff, "Wyvernia Teleporter");
		    LanguageRegistry.addName(itemArmorSphere, "Armor Sphere");
		    
		    LanguageRegistry.addName(itemMachaliteIngot, "Machalite Ingot");
		   
		    LanguageRegistry.addName(agitoGreatSword, "Agito Great Sword(\u00a7ePre-release)");
		    
		    LanguageRegistry.addName(cephadromeHide, "Cephadrome Hide");
		    LanguageRegistry.addName(burnedIngot, "Burned Ingot");
		    LanguageRegistry.addName(sparkedDust, "Sparked Dust");
		  
		  //Food
		  FishFood1 = new ItemSushifish(24330,5,1F,true).setUnlocalizedName("Sushifish");
		  FishFood2 = new ItemGluttonTuna(24331,6,1F,false).setUnlocalizedName("Glutton Tuna");
		  FishFood3 = new ItemGastronomeTuna(24332,7,1F,false).setUnlocalizedName("Gastronome Tuna");
		  
		  LanguageRegistry.addName(FishFood1, "Sushifish");	  
		  LanguageRegistry.addName(FishFood2, "Glutton Tuna");	  
		  LanguageRegistry.addName(FishFood3, "Gastronome Tuna");
		  
    }

}
