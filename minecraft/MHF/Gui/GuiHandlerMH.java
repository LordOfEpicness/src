package MHF.Gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import MHF.TileEntity.*;

public class GuiHandlerMH implements IGuiHandler{

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
		if(tileEntity instanceof TileEntityBBQSpit){
            return new ContainerBBQ(player.inventory, (TileEntityBBQSpit) tileEntity);
		}
		return null;
		}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        if(tileEntity instanceof TileEntityBBQSpit){
                
        }
		return null;
	}

	public static void registerGui(Class guiContainer,
			Class container) 
	{

		
		
	}

   
	
	

}
