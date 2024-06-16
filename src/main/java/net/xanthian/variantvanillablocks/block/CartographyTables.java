package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CartographyTableBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class CartographyTables {

    public static final CartographyTableBlock ACACIA_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock BAMBOO_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock BIRCH_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock CHERRY_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock CRIMSON_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    // Vanilla Cartography Table is Dark Oak
    public static final CartographyTableBlock JUNGLE_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock MANGROVE_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock OAK_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock SPRUCE_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock WARPED_CARTOGRAPHY_TABLE = new CartographyTableBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static Map<Identifier, Block> MOD_CARTOGRAPHY_TABLES = Maps.newHashMap();

    public static void registerVanillaTables() {
        registerCartographyTableBlock("acacia_cartography_table", ACACIA_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("bamboo_cartography_table", BAMBOO_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("birch_cartography_table", BIRCH_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("cherry_cartography_table", CHERRY_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("crimson_cartography_table", CRIMSON_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("jungle_cartography_table", JUNGLE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("mangrove_cartography_table", MANGROVE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("oak_cartography_table", OAK_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("spruce_cartography_table", SPRUCE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("warped_cartography_table", WARPED_CARTOGRAPHY_TABLE);
    }

    private static void registerCartographyTableBlock(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        MOD_CARTOGRAPHY_TABLES.put(identifier, block);
    }
}