package MHF.Events;

import net.minecraft.entity.EntityLiving;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

import java.util.List;

import MHF.Entity.EntityBlueSmokeGrenade;

public class FUCSmokeEvent
{
    @ForgeSubscribe
    public void onTeleport(EnderTeleportEvent event)
    {
        // restrict teleportation of non-owner entities in the effect field
        EntityLiving living = event.entityLiving;

        double range = MHF.MonsterHunterFrontier.BOMB_MUDDLE_RANGE;
        List bombs = living.worldObj.getEntitiesWithinAABB(EntityBlueSmokeGrenade.class,
                living.boundingBox.expand(range, range, range));

        for ( Object o : bombs ) {
            if ( o instanceof EntityBlueSmokeGrenade ) {
            	EntityBlueSmokeGrenade bomb = (EntityBlueSmokeGrenade) o;
                // cancel if the bomb is active, and the bomb was either dispensed or not thrown
                // by the entity that wants to teleport.
                if ( bomb.isEffectActive() && (bomb.getThrower() == null || bomb.getThrower() != living) ) {
                    event.setCanceled(true);
                    return;
                }
            }
        }
    }
}