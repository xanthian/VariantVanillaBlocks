package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CartographyTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class CartographyTables {

    public static final CartographyTableBlock ACACIA_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock BIRCH_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock CRIMSON_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS));
    public static final CartographyTableBlock JUNGLE_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock MANGROVE_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock OAK_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock SPRUCE_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.CARTOGRAPHY_TABLE));
    public static final CartographyTableBlock WARPED_CARTOGRAPHY_TABLE = new CartographyTableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS));
    public static Map<Identifier, Block> MOD_CARTOGRAPHY_TABLES = Maps.newHashMap();

    public static void registerVanillaTables() {
        registerCartographyTableBlock("acacia_cartography_table", ACACIA_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("birch_cartography_table", BIRCH_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("crimson_cartography_table", CRIMSON_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("jungle_cartography_table", JUNGLE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("mangrove_cartography_table", MANGROVE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("oak_cartography_table", OAK_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("spruce_cartography_table", SPRUCE_CARTOGRAPHY_TABLE);
        registerCartographyTableBlock("warped_cartography_table", WARPED_CARTOGRAPHY_TABLE);
    }

    private static void registerCartographyTableBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_CARTOGRAPHY_TABLES.put(identifier, block);
    }
}