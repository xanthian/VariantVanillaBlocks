package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class CartographyTables {

    public static Map<Identifier, Block> MOD_CARTOGRAPHY_TABLES = Maps.newHashMap();

    public static final VariantCartographyTableBlock ACACIA_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock BAMBOO_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock BIRCH_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock CHERRY_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock CRIMSON_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    // Vanilla Cartography Table is Dark Oak
    public static final VariantCartographyTableBlock JUNGLE_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock MANGROVE_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock OAK_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock SPRUCE_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();
    public static final VariantCartographyTableBlock WARPED_CARTOGRAPHY_TABLE = new VariantCartographyTableBlock();


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

    private static void registerCartographyTableBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_CARTOGRAPHY_TABLES.put(identifier, block);
    }
}