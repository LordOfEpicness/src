package MHF.World;

import net.minecraft.util.ChunkCoordinates;

public class PortalPositionWyvernia extends ChunkCoordinates
{
public long field_85087_d;
final TeleporterWyvernia field_85088_e;
public PortalPositionWyvernia(TeleporterWyvernia teleporterWyvernia, int par2, int par3, int par4, long par5)
{
super(par2, par3, par4);
this.field_85088_e = teleporterWyvernia;
this.field_85087_d = par5;
}
}