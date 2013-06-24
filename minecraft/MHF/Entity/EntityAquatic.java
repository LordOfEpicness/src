package MHF.Entity;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;

public abstract class EntityAquatic extends EntityWaterMob
{
	protected boolean divePending;
	protected boolean jumpPending;
	protected boolean isEntityJumping;
	private PathEntity pathEntity;
	private int outOfWater;
	private int maxHealth;
	private boolean diving;
	private int divingCount;
	private int mountCount;
	public EntityLiving roper;

	public EntityAquatic(World world) 
	{
		super(world);
		this.outOfWater = 0;
		setTamed(false);
		setTemper(50);
		selectType();
		
		}

	private void selectType()
	{
		setType(1);
		}
	protected void setPositionAndRotation()
	{
		this.dataWatcher.addObject(15, Integer.valueOf(50));
		this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
		this.dataWatcher.addObject(17, String.valueOf(""));
		this.dataWatcher.addObject(18, Byte.valueOf((byte)0));
		this.dataWatcher.addObject(19, Integer.valueOf(0));
		this.dataWatcher.addObject(20, Integer.valueOf(0));
		this.dataWatcher.addObject(21, String.valueOf(""));
			}
	
	public int getTemper()
		{
		return this.dataWatcher.getWatchableObjectInt(15);
		
		}
		
	

	private void setType(int i) {
		
		
	}

	private void setTemper(int i) {

		
	}

	private void setTamed(boolean b) {

		
	}
}
