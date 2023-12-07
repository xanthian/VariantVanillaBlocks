package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SmithingTableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class SmithingTables {

    public static final SmithingTableBlock ACACIA_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock BIRCH_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock CRIMSON_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS));
    public static final SmithingTableBlock DARK_OAK_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock JUNGLE_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock OAK_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock SPRUCE_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.SMITHING_TABLE));
    public static final SmithingTableBlock WARPED_SMITHING_TABLE = new SmithingTableBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS));
    public static Map<Identifier, Block> MOD_SMITHING_TABLES = Maps.newHashMap();

    public static void registerVanillaSmithingTables() {
        registerSmithingTableBlock("acacia_smithing_table", ACACIA_SMITHING_TABLE);
        registerSmithingTableBlock("birch_smithing_table", BIRCH_SMITHING_TABLE);
        registerSmithingTableBlock("crimson_smithing_table", CRIMSON_SMITHING_TABLE);
        registerSmithingTableBlock("dark_oak_smithing_table", DARK_OAK_SMITHING_TABLE);
        registerSmithingTableBlock("jungle_smithing_table", JUNGLE_SMITHING_TABLE);
        registerSmithingTableBlock("oak_smithing_table", OAK_SMITHING_TABLE);
        registerSmithingTableBlock("spruce_smithing_table", SPRUCE_SMITHING_TABLE);
        registerSmithingTableBlock("warped_smithing_table", WARPED_SMITHING_TABLE);
    }

    private static void registerSmithingTableBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_SMITHING_TABLES.put(identifier, block);
    }
}