package MHF;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundManager;
import net.minecraft.entity.Entity;
import net.minecraft.src.ModLoader;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

public class SoundHookContainerClass {

    @ForgeSubscribe
    public void soundOnHurt(SoundLoadEvent event)
    {
    	registerSound(event.manager, "MHF/Kirin/kirin1.ogg", "/resources/newsound/MHFSound/Kirin/kirin1.ogg");
    	    }
    private void registerSound(SoundManager manager, String name, String path)
    {
        try
        {
            URL filePath = SoundHookContainerClass.class.getResource(path);
            if (filePath != null) manager.soundPoolSounds.addSound(name, filePath);
            else throw new FileNotFoundException();
        } catch (Exception ex)
        {
            System.out.println(String.format("Warning: unable to load sound file %s", new Object[]{path}));
        }
    }

    private void registerStreaming(SoundManager manager, String name, String path)
    {
    }
}
