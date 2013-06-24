package MHF.Entity.AI;

import MHF.Entity.EntityVillageDefender;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;

public class FUCLookAtTradePlayer extends EntityAIWatchClosest
{
    private final EntityVillageDefender theMerchant;

    public FUCLookAtTradePlayer(EntityVillageDefender par1EntityVillageDefender)
    {
        super(par1EntityVillageDefender, EntityPlayer.class, 8.0F);
        this.theMerchant = par1EntityVillageDefender;
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.theMerchant.isTrading())
        {
            this.closestEntity = this.theMerchant.getCustomer();
            return true;
        }
        else
        {
            return false;
        }
    }
}
