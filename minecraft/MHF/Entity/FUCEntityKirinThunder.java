package MHF.Entity;

import java.util.List;

import cpw.mods.fml.common.network.Player;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class FUCEntityKirinThunder extends EntityLightningBolt
{
	public int lightningState;
	public long boltVertex = 0L;
	public int boltLivingTime;

	public FUCEntityKirinThunder(World par1World, double par2, double par4,
			double par6, EntityPlayer entityplayer) {
		super(par1World, par2, par4, par6);
		
		this.setLocationAndAngles(par2, par4, par6, 0.0F, 0.0F);
		this.lightningState = 2;
		this.boltVertex = this.rand.nextLong();
        this.boltLivingTime = this.rand.nextInt(3) + 1;
        MinecraftForgeClient.preloadTexture("/textures/entity/entityLightning.png");
	}
	

			
	
	 public void onUpdate()
	    {
	        super.onUpdate();

	        if (this.lightningState == 2)
	        {
	            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "ambient.weather.thunder", 10000.0F, 0.8F + this.rand.nextFloat() * 0.2F);
	            this.worldObj.playSoundEffect(this.posX, this.posY, this.posZ, "random.explode", 2.0F, 0.5F + this.rand.nextFloat() * 0.2F);
	        }

	        --this.lightningState;

	        if (this.lightningState < 0)
	        {
	            if (this.boltLivingTime == 0)
	            {
	                this.setDead();
	            }
	            else if (this.lightningState < -this.rand.nextInt(10))
	            {
	                --this.boltLivingTime;
	                this.lightningState = 1;
	                this.boltVertex = this.rand.nextLong();

	                if (!this.worldObj.isRemote && this.worldObj.doChunksNearChunkExist(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 10))
	                {
	                    int i = MathHelper.floor_double(this.posX);
	                    int j = MathHelper.floor_double(this.posY);
	                    int k = MathHelper.floor_double(this.posZ);

	                    if (this.worldObj.getBlockId(i, j, k) == 0 && Block.fire.canPlaceBlockAt(this.worldObj, i, j, k))
	                    {
	                        this.worldObj.setBlock(i, j, k, Block.fire.blockID);
	                    }
	                }
	            }
	        }

	        if (this.lightningState >= 0)
	        {
	            if (this.worldObj.isRemote)
	            {
	                this.worldObj.lastLightningBolt = 2;
	            }
	            else
	            {
	                double d0 = 3.0D;
	                List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, AxisAlignedBB.getAABBPool().getAABB(this.posX - d0, this.posY - d0, this.posZ - d0, this.posX + d0, this.posY + 6.0D + d0, this.posZ + d0));

	                for (int l = 0; l < list.size(); ++l)
	                {
	                    Entity entity = (Entity)list.get(l);
	                    entity.onStruckByLightning(this);
	                }
	            }
	        }


	    }
}
