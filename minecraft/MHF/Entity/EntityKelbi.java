package MHF.Entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.world.World;

public class EntityKelbi extends EntityCreature{

	public EntityKelbi(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/models/kelbi.png";
		this.moveSpeed = 0.28F;
		this.isImmuneToFire = false;
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 0.26F));
		this.tasks.addTask(2, new EntityAIEatGrass(this));
		this.tasks.addTask(3, new EntityAIPanic(this, 0.38F));
	}

	public EntityAgeable createChild(EntityAgeable var1) {
		return null;
	}
	
	public String getTexture()
    {
  return "/mods/monsterhunter/textures/models/kelbi.png";
    }
	
	public int getMaxHealth() {
		return 10;
	}
}
