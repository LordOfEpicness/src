package MHF;




import java.io.File;
import java.lang.reflect.Method;
import java.util.Random;
import MHF.Block.*;
import MHF.Item.*;
import MHF.Entity.*;
import MHF.Events.*;
import MHF.FrontierBiomes.*;
import MHF.CreativeTabs.*;
import MHF.Model.*;
import MHF.Renderer.*;
import MHF.World.WorldProviderWyvernia;
import MHF.World.gen.MainOreGen;
import MHF.Entity.EntityBlueSmokeGrenade;
import MHF.Entity.EntityCephadrome;
import MHF.Entity.EntityCephalos;
import MHF.Entity.EntityErupe;
import MHF.Entity.EntityGiant;
import MHF.Entity.EntityKirin;
import MHF.Entity.EntityMosswine;
import MHF.Entity.EntityPopo;
import MHF.Entity.EntityVillageDefender;
import MHF.Entity.EntityWarriorFinale;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBlaze;
import net.minecraft.client.model.ModelCow;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderBlaze;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemEgg;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHills;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Property;
import net.minecraftforge.event.ForgeSubscribe;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = "MHF", name = "MonsterHunterFrontier", version = "Beta 0.8.6 ")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)



public class MonsterHunterFrontier 
{
	@SidedProxy(clientSide = "MHF.Core.FUCClientProxy", serverSide = "MHF.Proxy")
	public static Proxy proxy;
	static int MoCEntityID = 7256;
	
	
	
	static public Configuration config;
	static public double BOMB_MUDDLE_RANGE;
	static int startEntityId = 300;
	
	//BG
	public static int DimID = 3;
	public static EnumToolMaterial LIGHT = EnumHelper.addToolMaterial("LIGHT", 3, 750, 1.0F, 31, 9); 
	public static EnumToolMaterial Hamma = EnumHelper.addToolMaterial("Hamma", 3, 750, 1.0F, 20, 9);
	public static EnumToolMaterial Agito = EnumHelper.addToolMaterial("Agito", 3, 450, 1.0F, 26, 9);
	public static EnumArmorMaterial armorKirin = EnumHelper.addArmorMaterial("KIRIN", 46, new int[]{4, 7 , 9, 4}, 8);
	public static boolean explosionsDestroyBlocks = true;
	     public static CreativeTabs tabMonsterHunterBlocks = new TabMonsterHunterBlocks(CreativeTabs.getNextID(),"MonsterHunterBlocks");
	public static CreativeTabs tabMonsterHunterItems = new TabMonsterHunterItems(CreativeTabs.getNextID(),"MonsterHunterItems");
	public static CreativeTabs tabMonsterHunterDrops = new TabMonsterHunterDrops(CreativeTabs.getNextID(),"MonsterHunterDrops");
	public static CreativeTabs tabMonsterHunterFoods = new TabMonsterHunterFoods(CreativeTabs.getNextID(),"MonsterHunterFoods");
   
    
    // BG - C
	
    
    


    @Mod.Instance("MonsterHunterFrontier")
    public static MonsterHunterFrontier instance;
    
    
   
   
	// Reg..
	
    @PreInit
	public void preInit(FMLPreInitializationEvent event) {
		    MainBlock.init();
            MainItem.init();
	        Recipes.init();
	   	    Config.init(event);
	   	    proxy.registerSounds();
    }
	
	@Init
	public void load(FMLInitializationEvent event)
	{
	    AddNames();
	    RegisterEntities();
	    RegisterEntityEgg();
	    EntityRegistry.registerModEntity(EntityBlueSmokeGrenade.class, "Monster Smoke", 4020, this, 8, 1, true);
		DimensionManager.registerProviderType(DimID, WorldProviderWyvernia.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		GameRegistry.registerWorldGenerator(new MainOreGen());
		proxy.registerRenderers();
		proxy.registerServerTickHandler();
		proxy.loadSounds();
	 }
	

	

	private void RegisterEntityEgg() 
	{
		registerEntityEgg(EntityKirin.class, 0xcc9966, 0xffffcc);
		registerEntityEgg(EntityCephadrome.class, 0xffff33, 0xffffff);
		registerEntityEgg(EntityCephalos.class, 0x99ffff, 0xffffff);
		registerEntityEgg(EntityPopo.class, 0xff9999, 0xff9933);
		registerEntityEgg(EntityErupe.class, 0xff9999, 0xcc9966);
		registerEntityEgg(EntityWarriorFinale.class, 0xff9999, 0x99ffff);
		registerEntityEgg(EntityVillageDefender.class, 0x996633, 0x996633);
		
		
		
	}

	private void RegisterEntities() 
	{
		EntityRegistry.registerModEntity(EntityKirin.class, "Kirin", 201, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityCephadrome.class, "Cephadrome", 202, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityCephalos.class, "Cephalos", 203, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityPopo.class, "Popo", 204, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityErupe.class, "Erupe", 205, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityVillageDefender.class, "Village Defender", 206, this, 80, 3, true);
		EntityRegistry.registerModEntity(EntityWarriorFinale.class, "Enforcer", 207, this, 80, 3, true);
		
		
			}

	private void AddNames()
	{
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Kirin.name", "en_US", "Kirin");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Cephadrome.name", "en_US", "Cephadrome");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Cephalos.name", "en_US", "Cephalos");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Popo.name", "en_US", "Popo");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Erupe.name", "en_US", "Erupe");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.Village Defender.name", "en_US", "Village Defender");
		LanguageRegistry.instance().addStringLocalization("entity.MHF.WarriorFinale.name", "en_US", "Enforcer");
		
		
		
	}
	

	private void loadConfiguration(File file)
	    {
	        config = new Configuration(file);
	        config.load();

	        Property bombEffectRadius = config.get("general", "bombEffectRadius", 20.0);
	        bombEffectRadius.comment = "Radius of bounding box that affects entities";
	        BOMB_MUDDLE_RANGE = bombEffectRadius.getDouble(20.0); // odd that this needs a default value, and others don't
	    }


public static int getUniqueEntityId() 
{
 do 
 {
  startEntityId++;
 } 
 while (EntityList.getStringFromID(startEntityId) != null);

  return startEntityId;
}

public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
{
 int id = getUniqueEntityId();
 EntityList.IDtoClassMapping.put(id, entity);
 EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
}

	   
	 
}
	
		
	

		
	
