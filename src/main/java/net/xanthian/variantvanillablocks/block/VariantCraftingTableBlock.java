package net.xanthian.variantvanillablocks.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;

public class VariantCraftingTableBlock extends CraftingTableBlock {

    public VariantCraftingTableBlock() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}