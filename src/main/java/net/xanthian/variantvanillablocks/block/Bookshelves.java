package net.xanthian.variantvanillablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

public class Bookshelves {

    public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block BAMBOO_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block CHERRY_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));

    public static void registerVanillaBookShelves() {
        registerBookshelfBlock("acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBookshelfBlock("bamboo_bookshelf", BAMBOO_BOOKSHELF);
        registerBookshelfBlock("birch_bookshelf", BIRCH_BOOKSHELF);
        registerBookshelfBlock("cherry_bookshelf", CHERRY_BOOKSHELF);
        registerBookshelfBlock("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBookshelfBlock("jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBookshelfBlock("mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBookshelfBlock("spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBookshelfBlock("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBookshelfBlock("warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBookshelfBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}