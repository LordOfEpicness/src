package MHF.World;

import MHF.MonsterHunterFrontier;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.util.Vec3Pool;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorldProviderWyvernia extends WorldProvider
{
public void registerWorldChunkManager()
{
/** tells Minecraft to use our new WorldChunkManager **/
this.worldChunkMgr = new WorldChunkManagerWyvernia(worldObj.getSeed(), terrainType);
this.hasNoSky = false;
}

@Override
/** Dimension Name **/
public String getDimensionName()
{
return "Wyvernia";
}

/** Get Provider for dimension **/
public static WorldProvider getProviderForDimension(int id)
{
return DimensionManager.createProviderFor(MonsterHunterFrontier.DimID);
}

/** Welcome message **/
public String getWelcomeMessage()
{
return "Entering the Tutorial Dimension";
}

/** What chunk provider to use **/
public IChunkProvider createChunkGenerator()
{
return new ChunkProviderWyvernia(worldObj, worldObj.getSeed(), true);
}

/** Can player re-spawn here **/
public boolean canRespawnHere()
{
return false;
}

/** Set user message **/
// not sure if this works any more ?
protected synchronized String setUserMessage(String par1Str)
{
return "Building Wyvernia Dimension";
}

/** Determines the dimension the player will be respawned in **/
public int getRespawnDimension(EntityPlayerMP player)
{
return 0;
}

/** Dimension Movement speed **/
public double getMovementFactor()
{
return 10.0;
}
}