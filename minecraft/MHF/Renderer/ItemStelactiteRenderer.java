package MHF.Renderer;

import MHF.Model.ModelStelactite;
import MHF.TileEntity.TileEntityStelactite;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemStelactiteRenderer implements IItemRenderer {

	private ModelStelactite StelactiteModel;
	
	public ItemStelactiteRenderer() {
		StelactiteModel = new ModelStelactite();
		}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
	TileEntityRenderer.instance.renderTileEntityAt(new TileEntityStelactite(), 0.0D, 0.0D, 0.0D, 0.0F);
	}

}
