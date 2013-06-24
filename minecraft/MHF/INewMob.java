package MHF;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.passive.IAnimals;

public interface INewMob extends IAnimals
{
    /** Entity selector for IMob types. */
    IEntitySelector mobSelector = new FilterNewMobs();
    
}
