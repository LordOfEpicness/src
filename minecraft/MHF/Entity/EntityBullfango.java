package MHF.Entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIEatGrass;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class EntityBullfango extends EntityMob{

	public EntityBullfango(World par1World) {
		super(par1World);
		this.texture = "/mods/monsterhunter/textures/models/bullfango.png";
		this.moveSpeed = 0.28F;
		this.isImmuneToFire = false;
		this.getNavigator().setAvoidsWater(true);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIWander(this, 0.26F));
		this.tasks.addTask(2, new EntityAIEatGrass(this));
		this.tasks.addTask(3, new EntityAIAttackOnCollide(this, moveSpeed, true));
		this.tasks.addTask(4, new EntityAIPanic(this, 0.38F));
	}
	
	public int getAttackStrength(Entity par1Entity)
    {
     return 5;
    }
	
	public String getTexture()
    {
  return "/mods/monsterhunter/textures/models/bullfango.png";
    }
	
	public int getMaxHealth() {
		return 17;
	}
}
