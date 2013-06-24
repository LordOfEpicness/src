package MHF.Item;

import MHF.Entity.EntityBlueSmokeGrenade;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
public class ItemBlueSmoke extends Item
{
                 public ItemBlueSmoke(int i)
                 {
                                                 super(i);
                                                 this.maxStackSize = 10;
                                                 this.setCreativeTab(CreativeTabs.tabMisc);
                 }

                 public ItemStack onItemRightClick(ItemStack var1, World var2, EntityPlayer var3)
                 {
                                                 if (!var3.capabilities.isCreativeMode)
                                                 {
                                                                                 --var1.stackSize;
                                                 }
                                                 var2.playSoundAtEntity(var3, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));
                                                 if (!var2.isRemote)
                                                 {
                                                                                 var2.spawnEntityInWorld(new EntityBlueSmokeGrenade(var2, var3));
                                                 }
                                                 return var1;
                 }
                 public void registerIcons(IconRegister par1IconRegister)
                 {
                         itemIcon = par1IconRegister.registerIcon("monsterhunter:blueSmokeGrenade");
                 }
                 
             }