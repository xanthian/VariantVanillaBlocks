package net.xanthian.variantvanillablocks.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.block.Chests;
import net.xanthian.variantvanillablocks.block.custom.VariantChests;

public class EntityInitialise {

    public static BlockEntityType<VariantChestBlockEntity> ACACIA_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> BIRCH_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> SPRUCE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> CRIMSON_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> DARK_OAK_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> JUNGLE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> MANGROVE_CHEST;
    public static BlockEntityType<VariantChestBlockEntity> WARPED_CHEST;

    public static void registerBlockEntities() {
        ACACIA_CHEST = register(VariantChests.ACACIA, Chests.ACACIA_CHEST);
        BIRCH_CHEST = register(VariantChests.BIRCH, Chests.BIRCH_CHEST);
        CRIMSON_CHEST = register(VariantChests.CRIMSON, Chests.CRIMSON_CHEST);
        DARK_OAK_CHEST = register(VariantChests.DARK_OAK, Chests.DARK_OAK_CHEST);
        JUNGLE_CHEST = register(VariantChests.JUNGLE, Chests.JUNGLE_CHEST);
        MANGROVE_CHEST = register(VariantChests.MANGROVE, Chests.MANGROVE_CHEST);
        SPRUCE_CHEST = register(VariantChests.SPRUCE, Chests.SPRUCE_CHEST);
        WARPED_CHEST = register(VariantChests.WARPED, Chests.WARPED_CHEST);
    }

    private static BlockEntityType<VariantChestBlockEntity> register(VariantChests type, Block... block) {
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, type.getId(),
                FabricBlockEntityTypeBuilder.create((pos, state) -> new VariantChestBlockEntity(type, pos, state),
                        block).build(null));
    }
}