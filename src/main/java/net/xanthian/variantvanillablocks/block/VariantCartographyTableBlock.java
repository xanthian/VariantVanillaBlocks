package net.xanthian.variantvanillablocks.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.CartographyTableBlock;

public class VariantCartographyTableBlock extends CartographyTableBlock {

    public VariantCartographyTableBlock() {
        super(Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    }
}