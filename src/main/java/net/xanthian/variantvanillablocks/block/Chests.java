package net.xanthian.variantvanillablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Chests {

    public static final Block ACACIA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ACACIA);
    public static final Block BAMBOO_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BAMBOO);
    public static final Block BIRCH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BIRCH);
    public static final Block CHERRY_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.CHERRY);
    public static final Block CRIMSON_CHEST = new VariantChestBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.CRIMSON);
    public static final Block DARK_OAK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.DARK_OAK);
    public static final Block JUNGLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.JUNGLE);
    public static final Block MANGROVE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.MANGROVE);
    public static final Block SPRUCE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.SPRUCE);
    public static final Block WARPED_CHEST = new VariantChestBlock(FabricBlockSettings.create().mapColor(MapColor.CYAN).instrument(Instrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD), VariantChests.WARPED);

    public static void registerVanillaChests() {
        registerChestBlock(VariantChests.ACACIA.getId(), ACACIA_CHEST);
        registerChestBlock(VariantChests.BAMBOO.getId(), BAMBOO_CHEST);
        registerChestBlock(VariantChests.BIRCH.getId(), BIRCH_CHEST);
        registerChestBlock(VariantChests.CHERRY.getId(), CHERRY_CHEST);
        registerChestBlock(VariantChests.CRIMSON.getId(), CRIMSON_CHEST);
        registerChestBlock(VariantChests.DARK_OAK.getId(), DARK_OAK_CHEST);
        registerChestBlock(VariantChests.JUNGLE.getId(), JUNGLE_CHEST);
        registerChestBlock(VariantChests.MANGROVE.getId(), MANGROVE_CHEST);
        registerChestBlock(VariantChests.SPRUCE.getId(), SPRUCE_CHEST);
        registerChestBlock(VariantChests.WARPED.getId(), WARPED_CHEST);
    }

    private static void registerChestBlock(Identifier Id, Block block) {
        Identifier identifier = new Identifier(Id.toString());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}