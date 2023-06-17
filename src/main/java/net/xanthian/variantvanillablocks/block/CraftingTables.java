package net.xanthian.variantvanillablocks.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

public class CraftingTables {

    // Vanilla
    public static final VariantCraftingTableBlock ACACIA_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock BAMBOO_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock BIRCH_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock CHERRY_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock DARK_OAK_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock JUNGLE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock MANGROVE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    // Vanilla Crafting Table is made from Oak
    public static final VariantCraftingTableBlock SPRUCE_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock WARPED_CRAFTING_TABLE = new VariantCraftingTableBlock();
    public static final VariantCraftingTableBlock CRIMSON_CRAFTING_TABLE = new VariantCraftingTableBlock();

    public static void registerVanillaTables() {
        registerCraftingTableBlock("acacia_crafting_table", ACACIA_CRAFTING_TABLE,true);
        registerCraftingTableBlock("bamboo_crafting_table", BAMBOO_CRAFTING_TABLE,true);
        registerCraftingTableBlock("birch_crafting_table", BIRCH_CRAFTING_TABLE,true);
        registerCraftingTableBlock("cherry_crafting_table", CHERRY_CRAFTING_TABLE,true);
        registerCraftingTableBlock("dark_oak_crafting_table", DARK_OAK_CRAFTING_TABLE,true);
        registerCraftingTableBlock("jungle_crafting_table", JUNGLE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("mangrove_crafting_table", MANGROVE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("spruce_crafting_table", SPRUCE_CRAFTING_TABLE,true);
        registerCraftingTableBlock("crimson_crafting_table", CRIMSON_CRAFTING_TABLE, false);
        registerCraftingTableBlock("warped_crafting_table", WARPED_CRAFTING_TABLE, false);
    }

    private static void registerCraftingTableBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
    }
}