package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class FletchingTables {

    public static final FletchingTableBlock ACACIA_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock BAMBOO_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    // Vanilla Fletching Table is made from Birch
    public static final FletchingTableBlock CHERRY_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock CRIMSON_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD));
    public static final FletchingTableBlock DARK_OAK_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock JUNGLE_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock MANGROVE_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock OAK_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock SPRUCE_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE));
    public static final FletchingTableBlock WARPED_FLETCHING_TABLE = new FletchingTableBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD));
    public static Map<Identifier, Block> MOD_FLETCHING_TABLES = Maps.newHashMap();

    public static void registerVanillaTables() {
        registerFletchingTableBlock("acacia_fletching_table", ACACIA_FLETCHING_TABLE);
        registerFletchingTableBlock("bamboo_fletching_table", BAMBOO_FLETCHING_TABLE);
        registerFletchingTableBlock("cherry_fletching_table", CHERRY_FLETCHING_TABLE);
        registerFletchingTableBlock("crimson_fletching_table", CRIMSON_FLETCHING_TABLE);
        registerFletchingTableBlock("dark_oak_fletching_table", DARK_OAK_FLETCHING_TABLE);
        registerFletchingTableBlock("jungle_fletching_table", JUNGLE_FLETCHING_TABLE);
        registerFletchingTableBlock("mangrove_fletching_table", MANGROVE_FLETCHING_TABLE);
        registerFletchingTableBlock("oak_fletching_table", OAK_FLETCHING_TABLE);
        registerFletchingTableBlock("spruce_fletching_table", SPRUCE_FLETCHING_TABLE);
        registerFletchingTableBlock("warped_fletching_table", WARPED_FLETCHING_TABLE);
    }

    private static void registerFletchingTableBlock(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        MOD_FLETCHING_TABLES.put(identifier, block);
    }
}