package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class CraftingTables {

    // Vanilla
    public static final CraftingTableBlock ACACIA_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock BIRCH_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock CRIMSON_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS));
    public static final CraftingTableBlock DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock JUNGLE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock MANGROVE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock SPRUCE_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.CRAFTING_TABLE));
    public static final CraftingTableBlock WARPED_CRAFTING_TABLE = new CraftingTableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS));
    public static Map<Identifier, Block> MOD_CRAFTING_TABLES = Maps.newHashMap();

    public static void registerVanillaTables() {
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE);
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE);
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE);
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE);
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE);
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE);
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE);
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE);
    }

    private static void registerCraftingTableBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_CRAFTING_TABLES.put(identifier, block);
    }
}