package MHF.Entity;

import java.util.ArrayList;

import MHF.Item.MainItem;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class EntityBug extends EntityLiving{

	public EntityBug(World par1World) {
		super(par1World);
		this.texture = "/monsterhunter/mobs/fish.png";
		this.moveSpeed = 0.20F;
	}
	
	public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();

        if (itemstack != null && itemstack.itemID == MainItem.bugnet0.itemID)
        {
            if (--itemstack.stackSize <= 0)
            {
                par1EntityPlayer.inventory.setInventorySlotContents(par1EntityPlayer.inventory.currentItem, new ItemStack(Item.bucketMilk));
            }
            else if (!par1EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Item.bucketMilk)))
            {
                par1EntityPlayer.dropPlayerItem(new ItemStack(Item.bucketMilk.itemID, 1, 0));
            }

            return true;
        }
        else
        {
            return super.interact(par1EntityPlayer);
        }
    }

	@Override
	public int getMaxHealth() {
		return 1;
	}

	protected String getLivingSound()
    {
        return null;
    }
 
    protected String getHurtSound()
    {
        return null;
    }
    
    protected String getDeathSound()
    {
        return null;
    }
 }
