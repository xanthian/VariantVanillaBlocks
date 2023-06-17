package net.xanthian.variantvanillablocks.block;

import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Blocks;

public class VariantBeehiveBlock extends BeehiveBlock {

    public VariantBeehiveBlock() {
        super(Settings.copy(Blocks.BEEHIVE));
    }
}