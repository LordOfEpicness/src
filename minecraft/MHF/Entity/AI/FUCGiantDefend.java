package MHF.Entity.AI;

import MHF.Entity.EntityGiant;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAITarget;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.village.Village;

public class FUCGiantDefend extends EntityAITarget
{
    EntityGiant villagedefender;

    /**
     * The aggressor of the iron golem's village which is now the golem's attack target.
     */
    EntityLiving villageAgressorTarget;

    public FUCGiantDefend(EntityGiant par1EntityGiant)
    {
        super(par1EntityGiant, 16.0F, false, true);
        this.villagedefender = par1EntityGiant;
        this.setMutexBits(1);
    }

    

	/**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        Village village = this.villagedefender.getVillage();

        if (village == null)
        {
            return false;
        }
        else
        {
            this.villageAgressorTarget = village.findNearestVillageAggressor(this.villagedefender);

            if (!this.isSuitableTarget(this.villageAgressorTarget, false))
            {
                if (this.taskOwner.getRNG().nextInt(20) == 0)
                {
                    this.villageAgressorTarget = village.func_82685_c(this.villagedefender);
                    return this.isSuitableTarget(this.villageAgressorTarget, false);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.villagedefender.setAttackTarget(this.villageAgressorTarget);
        super.startExecuting();
    }
}

