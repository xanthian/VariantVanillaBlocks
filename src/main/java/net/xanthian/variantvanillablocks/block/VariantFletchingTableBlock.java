package net.xanthian.variantvanillablocks.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;

public class VariantFletchingTableBlock extends FletchingTableBlock {

    public VariantFletchingTableBlock() {
        super(Settings.copy(Blocks.FLETCHING_TABLE));
    }
}