package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Bookshelves {

    public static final Block ACACIA_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block BIRCH_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block DARK_OAK_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block JUNGLE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block MANGROVE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block SPRUCE_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block WARPED_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static final Block CRIMSON_BOOKSHELF = new Block(FabricBlockSettings.copy(Blocks.BOOKSHELF));
    public static Map<Identifier, Block> MOD_BOOKSHELVES = Maps.newHashMap();

    public static void registerVanillaBookShelves() {
        registerBookshelfBlock("acacia_bookshelf", ACACIA_BOOKSHELF);
        registerBookshelfBlock("birch_bookshelf", BIRCH_BOOKSHELF);
        registerBookshelfBlock("dark_oak_bookshelf", DARK_OAK_BOOKSHELF);
        registerBookshelfBlock("jungle_bookshelf", JUNGLE_BOOKSHELF);
        registerBookshelfBlock("mangrove_bookshelf", MANGROVE_BOOKSHELF);
        registerBookshelfBlock("spruce_bookshelf", SPRUCE_BOOKSHELF);
        registerBookshelfBlock("crimson_bookshelf", CRIMSON_BOOKSHELF);
        registerBookshelfBlock("warped_bookshelf", WARPED_BOOKSHELF);
    }

    private static void registerBookshelfBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_BOOKSHELVES.put(identifier, block);
    }
}