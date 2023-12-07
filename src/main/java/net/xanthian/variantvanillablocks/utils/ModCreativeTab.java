package net.xanthian.variantvanillablocks.utils;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.*;

public class ModCreativeTab {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder
            .create(new Identifier(Initialise.MOD_ID, "variantvanillablocks"))
            .icon(() -> new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE))
            .appendItems(entries -> {

                entries.add(new ItemStack(Barrels.ACACIA_BARREL));
                entries.add(new ItemStack(Beehives.ACACIA_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.ACACIA_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.ACACIA_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.ACACIA_CHEST));
                entries.add(new ItemStack(Composters.ACACIA_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.ACACIA_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.ACACIA_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.ACACIA_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.ACACIA_LECTERN));
                entries.add(new ItemStack(SmithingTables.ACACIA_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.ACACIA_SMOKER));


                entries.add(new ItemStack(Barrels.BIRCH_BARREL));
                entries.add(new ItemStack(Beehives.BIRCH_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.BIRCH_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.BIRCH_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.BIRCH_CHEST));
                entries.add(new ItemStack(Composters.BIRCH_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.BIRCH_CRAFTING_TABLE));
                entries.add(new ItemStack(Blocks.FLETCHING_TABLE)); // Birch
                entries.add(new ItemStack(Grindstones.BIRCH_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.BIRCH_LECTERN));
                entries.add(new ItemStack(SmithingTables.BIRCH_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.BIRCH_SMOKER));

                entries.add(new ItemStack(Barrels.CRIMSON_BARREL));
                entries.add(new ItemStack(Beehives.CRIMSON_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.CRIMSON_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.CRIMSON_CHEST));
                entries.add(new ItemStack(Composters.CRIMSON_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.CRIMSON_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.CRIMSON_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.CRIMSON_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.CRIMSON_LECTERN));
                entries.add(new ItemStack(SmithingTables.CRIMSON_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.CRIMSON_SMOKER));

                entries.add(new ItemStack(Barrels.DARK_OAK_BARREL));
                entries.add(new ItemStack(Beehives.DARK_OAK_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.DARK_OAK_BOOKSHELF));
                entries.add(new ItemStack(Blocks.CARTOGRAPHY_TABLE)); // Dark Oak
                entries.add(new ItemStack(Chests.DARK_OAK_CHEST));
                entries.add(new ItemStack(Composters.DARK_OAK_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.DARK_OAK_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.DARK_OAK_FLETCHING_TABLE));
                entries.add(new ItemStack(Blocks.GRINDSTONE)); // Dark Oak
                entries.add(new ItemStack(Lecterns.DARK_OAK_LECTERN));
                entries.add(new ItemStack(SmithingTables.DARK_OAK_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.DARK_OAK_SMOKER));

                entries.add(new ItemStack(Barrels.JUNGLE_BARREL));
                entries.add(new ItemStack(Beehives.JUNGLE_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.JUNGLE_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.JUNGLE_CHEST));
                entries.add(new ItemStack(Composters.JUNGLE_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.JUNGLE_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.JUNGLE_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.JUNGLE_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.JUNGLE_LECTERN));
                entries.add(new ItemStack(SmithingTables.JUNGLE_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.JUNGLE_SMOKER));

                entries.add(new ItemStack(Barrels.MANGROVE_BARREL));
                entries.add(new ItemStack(Beehives.MANGROVE_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.MANGROVE_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.MANGROVE_CHEST));
                entries.add(new ItemStack(Composters.MANGROVE_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.MANGROVE_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.MANGROVE_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.MANGROVE_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.MANGROVE_LECTERN));
                entries.add(new ItemStack(Blocks.SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.MANGROVE_SMOKER));

                entries.add(new ItemStack(Barrels.OAK_BARREL));
                entries.add(new ItemStack(Blocks.BEEHIVE)); // Oak
                entries.add(new ItemStack(Blocks.BOOKSHELF)); // Oak
                entries.add(new ItemStack(CartographyTables.OAK_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Blocks.CHEST));
                entries.add(new ItemStack(Composters.OAK_COMPOSTER));
                entries.add(new ItemStack(Blocks.CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.OAK_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.OAK_GRINDSTONE));
                entries.add(new ItemStack(Blocks.LECTERN)); // Oak
                entries.add(new ItemStack(SmithingTables.OAK_SMITHING_TABLE));
                entries.add(new ItemStack(Blocks.SMOKER));

                entries.add(new ItemStack(Blocks.BARREL)); // Spruce
                entries.add(new ItemStack(Beehives.SPRUCE_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.SPRUCE_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.SPRUCE_CHEST));
                entries.add(new ItemStack(Blocks.COMPOSTER)); // Spruce
                entries.add(new ItemStack(CraftingTables.SPRUCE_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.SPRUCE_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.SPRUCE_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.SPRUCE_LECTERN));
                entries.add(new ItemStack(SmithingTables.SPRUCE_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.SPRUCE_SMOKER));

                entries.add(new ItemStack(Barrels.WARPED_BARREL));
                entries.add(new ItemStack(Beehives.WARPED_BEEHIVE));
                entries.add(new ItemStack(Bookshelves.WARPED_BOOKSHELF));
                entries.add(new ItemStack(CartographyTables.WARPED_CARTOGRAPHY_TABLE));
                entries.add(new ItemStack(Chests.WARPED_CHEST));
                entries.add(new ItemStack(Composters.WARPED_COMPOSTER));
                entries.add(new ItemStack(CraftingTables.WARPED_CRAFTING_TABLE));
                entries.add(new ItemStack(FletchingTables.WARPED_FLETCHING_TABLE));
                entries.add(new ItemStack(Grindstones.WARPED_GRINDSTONE));
                entries.add(new ItemStack(Lecterns.WARPED_LECTERN));
                entries.add(new ItemStack(SmithingTables.WARPED_SMITHING_TABLE));
                entries.add(new ItemStack(Smokers.WARPED_SMOKER));
            })
            .build();

    public static void registerItemGroup() {
    }
}