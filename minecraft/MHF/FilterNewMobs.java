package MHF;

import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;

final class FilterNewMobs implements IEntitySelector
{
    /**
     * Return whether the specified entity is applicable to this filter.
     */
    public boolean isEntityApplicable(Entity par1Entity)
    {
        return par1Entity instanceof INewMob;
    }
}