package MHF.Item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.EnumMovingObjectType;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class FUCAgitoGreatSword extends ItemSword
{
	public EntityThrowable throwable;
    private int weaponDamage;
    private final EnumToolMaterial toolMaterial;

	public FUCAgitoGreatSword(int id, EnumToolMaterial material)
	{
        super(id, material);
        toolMaterial = material;
        maxStackSize = 1;
        setMaxDamage(material.getMaxUses());
        weaponDamage = 2 + material.getDamageVsEntity();
        this.setCreativeTab(CreativeTabs.tabCombat);
    }

    
    public float getStrVsBlock(ItemStack itemstack, Block block)
    {
        return block.blockID != Block.stone.blockID ? 1.5F : 5F;
    }
    
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
    	par3List.add("\u00a79Agito Great Sword!");
    	par3List.add("\u00a72450 Uses");
    	par3List.add("\u00a79The Mod Pre-Release !! Enjoy the Skin while it last");
    	
    }

    

    
    public boolean onBlockDestroyed(ItemStack itemstack, int i, int j, int k, int l, EntityLiving entityliving)
    {
        itemstack.damageItem(1, entityliving);
        return true;
    }

  
    public int getDamageVsEntity(Entity entity)
    {
    	
    	return weaponDamage;
    }

   
    public boolean isFull3D()
    {
        return true;
    }

    
    public EnumAction getItemUseAction(ItemStack itemstack)
    {
        return EnumAction.block;
    }

    
    public int getMaxItemUseDuration(ItemStack itemstack)
    {
        return 0x11940;
    }

    
    public boolean canHarvestBlock(Block block)
    {
    	return false;
    }

       public int getItemEnchantability()
    {
        return toolMaterial.getEnchantability();
    }
    
    public String getTextureFile()
    {
            return "/agitoGreatSword.png";
    }
    public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
             par1ItemStack.damageItem(1, par3EntityLiving);
             par2EntityLiving.motionX += 0.500000394506D;
             par2EntityLiving.motionY += 0.300005222222D;
             
   
             return true;
    }
    public void registerIcons(IconRegister par1IconRegister)
    {
            itemIcon = par1IconRegister.registerIcon("monsterhunter:agitoGreatSword");
    }
    
}

