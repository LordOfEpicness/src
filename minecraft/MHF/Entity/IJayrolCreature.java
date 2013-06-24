package MHF.Entity;

import net.minecraft.entity.Entity;

public abstract interface IJayrolCreature 
{
	public abstract boolean forceUpdates();

	  public abstract void selectType();

	  public abstract String getName();

	  public abstract void setName(String paramString);

	  public abstract boolean getIsTamed();

	  public abstract void setTamed(boolean paramBoolean);

	  public abstract boolean getIsAdult();

	  public abstract void setAdult(boolean paramBoolean);

	  public abstract boolean checkSpawningBiome();

	  public abstract boolean func_70601_bi();

	  public abstract void performAnimation(int paramInt);

	  public abstract boolean renderName();

	  public abstract int nameYOffset();

	  public abstract double roperYOffset();

	  public abstract Entity getRoper();

	  public abstract boolean updateMount();

	  public abstract void makeEntityJump();

	  public abstract void makeEntityDive();

	  public abstract float getSizeFactor();

	  public abstract float getAdjustedYOffset();

	  public abstract String getOwnerName();

	  public abstract void setOwner(String paramString);

	  public abstract void setArmorType(byte paramByte);

	  public abstract int getType();

	  public abstract void dismountEntity();

}
