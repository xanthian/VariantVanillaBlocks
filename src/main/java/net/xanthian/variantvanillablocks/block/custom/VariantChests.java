package net.xanthian.variantvanillablocks.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.entity.EntityInitialise;
import net.xanthian.variantvanillablocks.entity.VariantChestBlockEntity;

import java.util.Locale;

public enum VariantChests {

    ACACIA,
    BAMBOO,
    BIRCH,
    CHERRY,
    CRIMSON,
    DARK_OAK,
    JUNGLE,
    MANGROVE,
    SPRUCE,
    WARPED,
    ;

    public BlockEntityType<? extends VariantChestBlockEntity> getBlockEntityType() {
        return switch (this) {
            case ACACIA -> EntityInitialise.ACACIA_CHEST;
            case BAMBOO -> EntityInitialise.BAMBOO_CHEST;
            case BIRCH -> EntityInitialise.BIRCH_CHEST;
            case CHERRY -> EntityInitialise.CHERRY_CHEST;
            case CRIMSON -> EntityInitialise.CRIMSON_CHEST;
            case DARK_OAK -> EntityInitialise.DARK_OAK_CHEST;
            case JUNGLE -> EntityInitialise.JUNGLE_CHEST;
            case MANGROVE -> EntityInitialise.MANGROVE_CHEST;
            case SPRUCE -> EntityInitialise.SPRUCE_CHEST;
            case WARPED -> EntityInitialise.WARPED_CHEST;
        };
    }

    public VariantChestBlockEntity getBlockEntity(BlockPos pos, BlockState state) {
        return new VariantChestBlockEntity(this, pos, state);
    }

    public Identifier getId() {
        return new Identifier(Initialise.MOD_ID, this.name().toLowerCase(Locale.ROOT) + "_chest");
    }
}