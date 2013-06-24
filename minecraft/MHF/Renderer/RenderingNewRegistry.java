package MHF.Renderer;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import MHF.Item.ItemBlueSmoke;
import MHF.Item.MainItem;
import MHF.Model.*;
import MHF.Entity.*;
import MHF.Renderer.*;

public class RenderingNewRegistry 
{
	public static void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityKirin.class, new RenderKirin(new ModelKirin(), 1.0F, 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCephadrome.class, new RenderCephadrome(new ModelCephadrome(0.65F), 1.0F, 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCephalos.class, new RenderCephalos(new ModelCephalos(0.65F), 1.0F, 1.0F));
		RenderingRegistry.registerEntityRenderingHandler(EntityVillageDefender.class, new RenderBiped(new ModelBiped(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityWarriorFinale.class, new RenderBiped(new ModelBiped(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityErupe.class, new RenderErupe(new ModelErupe(), 0.5F, 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPopo.class, new RenderPopo(new ModelPopo(), 1.0F, 1.0F));
		
		//Items
		RenderingRegistry.registerEntityRenderingHandler(EntityBlueSmokeGrenade.class, new RenderSnowball(MainItem.itemmonsterSmoke));
		
		//Weapons
		MinecraftForgeClient.registerItemRenderer(MainItem.itemwarHammer.itemID, (IItemRenderer)new RenderFUCItemWarHammer());
		MinecraftForgeClient.registerItemRenderer(MainItem.agitoGreatSword.itemID, (IItemRenderer)new RenderFUCItemAgitoGreatSword());
		
	}

}
