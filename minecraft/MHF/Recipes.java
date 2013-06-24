package MHF;

import MHF.Block.MainBlock;
import MHF.Item.MainItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipes {
	
	public static void init()
	{
		GameRegistry.addRecipe(new ItemStack(MainItem.itemkirinBlade, 1), new Object[] { " M ", "ZXZ", " Y ", 'Z', MainItem.itemfleshKirin, Character.valueOf('X'), MainItem.itemsparkKirin, Character.valueOf('M'), Item.swordIron });
		GameRegistry.addRecipe(new ItemStack(MainItem.itemwarHammer, 1), new Object[] { " M ", "ZXZ", " Y ", 'Z', Item.ingotIron, Character.valueOf('X'), MainItem.itembruteBone, Character.valueOf('M'), MainItem.itemMachaliteIngot });
		GameRegistry.addRecipe(new ItemStack(MainItem.craftedpopoMeat, 1), new Object[] { " M ", "ZXZ", " Y ", 'Z', MainItem.itemkirinBuff, 'X', Item.bread, 'M', MainItem.cookedMeat });
		GameRegistry.addRecipe(new ItemStack(MainItem.itemmonsterSmoke, 2), new Object[] { " # ", " # ", "#A#", Character.valueOf('#'), MainItem.itemMachaliteIngot, Character.valueOf('A'), MainItem.itemRockB});
		
		GameRegistry.addRecipe(new ItemStack(MainItem.kirinHelm, 1), new Object[] { "XXX", "XAX", " # ", Character.valueOf('X'), MainItem.itemfleshKirin, Character.valueOf('A'), MainItem.itemsparkKirin, Character.valueOf('#'), MainItem.itemArmorSphere });
		GameRegistry.addRecipe(new ItemStack(MainItem.kirincape, 1), new Object[] { "XAX", "XXX", "#X#", Character.valueOf('X'), MainItem.itemfleshKirin, Character.valueOf('A'), MainItem.itemsparkKirin, Character.valueOf('#'), MainItem.itemArmorSphere });
		GameRegistry.addRecipe(new ItemStack(MainItem.kirinshorts, 1), new Object[] { " A ", "XXX", "X X", Character.valueOf('X'), MainItem.itemfleshKirin, Character.valueOf('A'), MainItem.itemsparkKirin });
		GameRegistry.addRecipe(new ItemStack(MainItem.kirinboots, 1), new Object[] { "   ", "A A", "X X", Character.valueOf('X'), MainItem.itemfleshKirin, Character.valueOf('A'), MainItem.itemMachaliteIngot});
		GameRegistry.addRecipe(new ItemStack(MainItem.agitoGreatSword, 1), new Object[] { "XXX", "A A", "X X", Character.valueOf('X'),MainItem. itemMachaliteIngot, Character.valueOf('A'), MainItem.itembruteBone});
		GameRegistry.addRecipe(new ItemStack(MainBlock.blockDesign, 1), new Object[] { "XXX", "X X", "XXX", Character.valueOf('X'), MainItem.sparkedDust});
		// S2 - B
		GameRegistry.addSmelting(MainItem.rawMeat.itemID, new ItemStack(MainItem.cookedMeat, 1), 0.5F);
		GameRegistry.addSmelting(MainBlock.ArmorSphere.blockID, new ItemStack(MainItem.itemArmorSphere, 2), 0.5F);
		GameRegistry.addSmelting(MainBlock.MachaliteOre.blockID, new ItemStack(MainItem.itemMachaliteIngot, 2), 0.5F);	
		GameRegistry.addSmelting(Item.ingotIron.itemID, new ItemStack(MainItem.burnedIngot, 1), 0.0F);
		GameRegistry.addSmelting(MainItem.burnedIngot.itemID, new ItemStack(MainItem.sparkedDust, 2), 0.5F);
		
		  GameRegistry.addSmelting(MainBlock.oreStone0.blockID, new ItemStack(MainItem.ignot1), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone3.blockID, new ItemStack(MainItem.ignot2), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone4.blockID, new ItemStack(MainItem.ignot3), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone5.blockID, new ItemStack(MainItem.ignot4), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone6.blockID, new ItemStack(MainItem.ignot5), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone7.blockID, new ItemStack(MainItem.ignot6), 5);
		  GameRegistry.addSmelting(MainBlock.oreStone9.blockID, new ItemStack(MainItem.ignot7), 5);
		
	}

}
