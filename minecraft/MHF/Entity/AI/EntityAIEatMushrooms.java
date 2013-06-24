package MHF.Entity.AI;

import MHF.Block.MainBlock;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityAIEatMushrooms extends EntityAIBase{
	
	private EntityLiving theEntity;
    private World theWorld;
    
    /** A decrementing tick used for the Mosswine's head offset and animation. */
    int eatMushroomTick = 0;

	@Override
	public boolean shouldExecute() {
		if (this.theEntity.getRNG().nextInt(this.theEntity.isChild() ? 50 : 1000) != 0)
        {
            return false;
        }
        else
        {
		int i = MathHelper.floor_double(this.theEntity.posX);
        int j = MathHelper.floor_double(this.theEntity.posY);
        int k = MathHelper.floor_double(this.theEntity.posZ);
        return this.theWorld.getBlockId(i, j, k) == MainBlock.Mush2.blockID && this.theWorld.getBlockId(i, j, k) == 2202 ? true : this.theWorld.getBlockId(i, j - 1, k) == MainBlock.Mush2.blockID;
        }
	}

	/**
	 * Execute a one shot task or start executing a continuous task
	 */
	public void startExecuting()
	{
		this.eatMushroomTick = 40;
		this.theWorld.setEntityState(this.theEntity, (byte)10);
		this.theEntity.getNavigator().clearPathEntity();
	}
	
	/**
     * Resets the task
     */
    public void resetTask()
    {
        this.eatMushroomTick = 0;
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return this.eatMushroomTick > 0;
    }

    public int getEatGrassTick()
    {
        return this.eatMushroomTick;
    }
	
    /**
     * Updates the task
     */
    public void updateTask()
    {
        this.eatMushroomTick = Math.max(0, this.eatMushroomTick - 1);

        if (this.eatMushroomTick == 4)
        {
            int i = MathHelper.floor_double(this.theEntity.posX);
            int j = MathHelper.floor_double(this.theEntity.posY);
            int k = MathHelper.floor_double(this.theEntity.posZ);

            if (this.theWorld.getBlockId(i, j, k) == MainBlock.Mush2.blockID)
            {
                this.theWorld.destroyBlock(i, j, k, false);
                this.theEntity.eatGrassBonus();
            }
        }
    }
    
}