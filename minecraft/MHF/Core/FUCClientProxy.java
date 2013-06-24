package MHF.Core;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import MHF.MonsterHunterFrontier;
import MHF.Proxy;
import MHF.SoundHookContainerClass;
import MHF.Entity.EntityKirin;
import MHF.Gui.GuiBBQ;
import MHF.Gui.GuiRegistry;
import MHF.Model.ModelKirin;
import MHF.Renderer.RenderKirin;
import MHF.Renderer.RenderingNewRegistry;
import MHF.TileEntity.TileEntityBBQSpit;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class FUCClientProxy extends Proxy 
{
	private Minecraft mc = Minecraft.getMinecraft();
	private static String soundZipPath = "/resources/";
	public void registerRenderers()
	{
		RenderingNewRegistry.init();		
		GuiRegistry.init();
	
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		TileEntity tileEntity = world.getBlockTileEntity(x, y, z);

		if (tileEntity != null)
        {
			switch(ID)
			{
				case 1: return new GuiBBQ(player.inventory, (TileEntityBBQSpit)tileEntity);
			}
        }
		return null;
	}
	public void loadSounds()
    {
		if (this.mc.sndManager == null)
        {
            return;
        }

        installSound("/newsound/MHFSound/Kirin/kirin1.ogg");
    }

    public void registerSounds()
    {
    	MinecraftForge.EVENT_BUS.register(new SoundHookContainerClass());
    	
    }
    private void installSound(String filename)
    {
        File soundFile = new File(this.mc.mcDataDir, "resources/" + filename);

        if (!soundFile.exists()) try
        {
            String srcPath = soundZipPath + filename;
            InputStream inStream = MonsterHunterFrontier.class.getResourceAsStream(srcPath);

            if (inStream == null)
            {
                throw new IOException();
            }

            if (!soundFile.getParentFile().exists())
            {
                soundFile.getParentFile().mkdirs();
            }

            BufferedInputStream fileIn = new BufferedInputStream(inStream);
            BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream(soundFile));

            byte[] buffer = new byte[1024];

            int n = 0;

            while (-1 != (n = fileIn.read(buffer)))
            {
                fileOut.write(buffer, 0, n);
            }

            fileIn.close();
            fileOut.close();
        } catch (IOException ex)
        {
        }
        if ((soundFile.canRead()) && (soundFile.isFile())) this.mc.installResource(filename, soundFile);
        else System.err.println("Could not load file: " + soundFile);
    }
	
}


