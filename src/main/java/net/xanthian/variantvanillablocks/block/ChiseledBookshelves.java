package net.xanthian.variantvanillablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

public class ChiseledBookshelves {

    // Vanilla
    public static final ChiseledBookshelfBlock ACACIA_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock BAMBOO_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock BIRCH_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock CHERRY_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock CRIMSON_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(1.5f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock DARK_OAK_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock JUNGLE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock MANGROVE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    // Vanilla Chiseled Bookshelf block is made from Oak
    public static final ChiseledBookshelfBlock SPRUCE_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.copy(Blocks.CHISELED_BOOKSHELF));
    public static final ChiseledBookshelfBlock WARPED_CHISELED_BOOKSHELF = new ChiseledBookshelfBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(1.5f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));

    public static void registerVanillaChiseledBookshelves() {
        registerChiseledBookshelfBlock("acacia_chiseled_bookshelf", ACACIA_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("bamboo_chiseled_bookshelf", BAMBOO_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("birch_chiseled_bookshelf", BIRCH_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("cherry_chiseled_bookshelf", CHERRY_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("crimson_chiseled_bookshelf", CRIMSON_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("dark_oak_chiseled_bookshelf", DARK_OAK_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("jungle_chiseled_bookshelf", JUNGLE_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("mangrove_chiseled_bookshelf", MANGROVE_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("spruce_chiseled_bookshelf", SPRUCE_CHISELED_BOOKSHELF);
        registerChiseledBookshelfBlock("warped_chiseled_bookshelf", WARPED_CHISELED_BOOKSHELF);
    }

    private static void registerChiseledBookshelfBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}