package MHF;

import MHF.Core.ServerTickHandler;
import MHF.Gui.ContainerBBQ;
import MHF.TileEntity.TileEntityBBQSpit;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class Proxy implements IGuiHandler
{

   public void registerRenderers()
 {
	   
	
		
 }
   public void registerServerTickHandler()
   {
	   TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
   }
   
	
	public void addRecipes(){
		
	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{ 
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		
		if(tileEntity != null)
		{
			switch(ID)
			{
				case 1: return new ContainerBBQ(player.inventory, (TileEntityBBQSpit)tileEntity);
			}
		}
		return null;
    }
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
	 public void loadSounds()
	    {
	    }

	    public void registerSounds()
	    {
	    	
	    }


  }



