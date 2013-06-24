package MHF.Item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

public enum EnumWyverniaToolMaterial {

	OLD(0, 100, 0),
    NORMAL(1, 225, 1),
    MEGA(2, 500, 2);

    private final int harvestLevel;
    private final int maxUses;
    private final int damageVsEntity;

    private EnumWyverniaToolMaterial(int par3, int par4, int par5)
    {
        this.harvestLevel = par3;
        this.maxUses = par4;
        this.damageVsEntity = par5;
    }
    
    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }
    
    /**
     * Damage versus entities.
     */
    public int getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }
    
}
