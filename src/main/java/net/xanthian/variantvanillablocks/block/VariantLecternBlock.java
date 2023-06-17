package net.xanthian.variantvanillablocks.block;

import net.minecraft.block.Blocks;
import net.minecraft.block.LecternBlock;

public class VariantLecternBlock extends LecternBlock {

    public VariantLecternBlock() {
        super(Settings.copy(Blocks.LECTERN));
    }

}