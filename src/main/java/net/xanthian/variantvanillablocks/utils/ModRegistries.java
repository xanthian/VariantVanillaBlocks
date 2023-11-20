package net.xanthian.variantvanillablocks.utils;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.xanthian.variantvanillablocks.block.*;

public class ModRegistries {

    public static void registerFuelandFlammable() {
        registerFlammableBlocks();
        registerFuel();
    }

    private static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(Composters.ACACIA_COMPOSTER, 5, 20);
        registry.add(Composters.BAMBOO_COMPOSTER, 5, 20);
        registry.add(Composters.BIRCH_COMPOSTER, 5, 20);
        registry.add(Composters.CHERRY_COMPOSTER, 5, 20);
        registry.add(Composters.DARK_OAK_COMPOSTER, 5, 20);
        registry.add(Composters.JUNGLE_COMPOSTER, 5, 20);
        registry.add(Composters.MANGROVE_COMPOSTER, 5, 20);
        registry.add(Composters.OAK_COMPOSTER, 5, 20);

        registry.add(Beehives.ACACIA_BEEHIVE, 5, 20);
        registry.add(Beehives.BAMBOO_BEEHIVE, 5, 20);
        registry.add(Beehives.BIRCH_BEEHIVE, 5, 20);
        registry.add(Beehives.CHERRY_BEEHIVE, 5, 20);
        registry.add(Beehives.DARK_OAK_BEEHIVE, 5, 20);
        registry.add(Beehives.JUNGLE_BEEHIVE, 5, 20);
        registry.add(Beehives.MANGROVE_BEEHIVE, 5, 20);
        registry.add(Beehives.SPRUCE_BEEHIVE, 5, 20);

        registry.add(Bookshelves.ACACIA_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.BAMBOO_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.BIRCH_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.CHERRY_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.DARK_OAK_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.JUNGLE_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.MANGROVE_BOOKSHELF, 30, 20);
        registry.add(Bookshelves.SPRUCE_BOOKSHELF, 30, 20);

        registry.add(Lecterns.ACACIA_LECTERN, 30, 20);
        registry.add(Lecterns.BAMBOO_LECTERN, 30, 20);
        registry.add(Lecterns.BIRCH_LECTERN, 30, 20);
        registry.add(Lecterns.CHERRY_LECTERN, 30, 20);
        registry.add(Lecterns.DARK_OAK_LECTERN, 30, 20);
        registry.add(Lecterns.JUNGLE_LECTERN, 30, 20);
        registry.add(Lecterns.MANGROVE_LECTERN, 30, 20);
        registry.add(Lecterns.SPRUCE_LECTERN, 30, 20);
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Barrels.ACACIA_BARREL, 300);
        registry.add(Barrels.BAMBOO_BARREL, 300);
        registry.add(Barrels.BIRCH_BARREL, 300);
        registry.add(Barrels.CHERRY_BARREL, 300);
        registry.add(Barrels.DARK_OAK_BARREL, 300);
        registry.add(Barrels.JUNGLE_BARREL, 300);
        registry.add(Barrels.MANGROVE_BARREL, 300);
        registry.add(Barrels.OAK_BARREL, 300);

        registry.add(Bookshelves.ACACIA_BOOKSHELF, 300);
        registry.add(Bookshelves.BAMBOO_BOOKSHELF, 300);
        registry.add(Bookshelves.BIRCH_BOOKSHELF, 300);
        registry.add(Bookshelves.CHERRY_BOOKSHELF, 300);
        registry.add(Bookshelves.DARK_OAK_BOOKSHELF, 300);
        registry.add(Bookshelves.JUNGLE_BOOKSHELF, 300);
        registry.add(Bookshelves.MANGROVE_BOOKSHELF, 300);
        registry.add(Bookshelves.SPRUCE_BOOKSHELF, 300);

        registry.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.OAK_CARTOGRAPHY_TABLE, 300);
        registry.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, 300);

        registry.add(Chests.ACACIA_CHEST, 300);
        registry.add(Chests.BAMBOO_CHEST, 300);
        registry.add(Chests.BIRCH_CHEST, 300);
        registry.add(Chests.CHERRY_CHEST, 300);
        registry.add(Chests.DARK_OAK_CHEST, 300);
        registry.add(Chests.JUNGLE_CHEST, 300);
        registry.add(Chests.MANGROVE_CHEST, 300);
        registry.add(Chests.SPRUCE_CHEST, 300);

        registry.add(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF, 300);
        registry.add(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF, 300);

        registry.add(Composters.ACACIA_COMPOSTER, 300);
        registry.add(Composters.BAMBOO_COMPOSTER, 300);
        registry.add(Composters.BIRCH_COMPOSTER, 300);
        registry.add(Composters.CHERRY_COMPOSTER, 300);
        registry.add(Composters.DARK_OAK_COMPOSTER, 300);
        registry.add(Composters.JUNGLE_COMPOSTER, 300);
        registry.add(Composters.MANGROVE_COMPOSTER, 300);
        registry.add(Composters.OAK_COMPOSTER, 300);

        registry.add(CraftingTables.ACACIA_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.BAMBOO_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.BIRCH_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.CHERRY_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.DARK_OAK_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.JUNGLE_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.MANGROVE_CRAFTING_TABLE, 300);
        registry.add(CraftingTables.SPRUCE_CRAFTING_TABLE, 300);

        registry.add(FletchingTables.ACACIA_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.BAMBOO_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.CHERRY_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.DARK_OAK_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.JUNGLE_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.MANGROVE_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.OAK_FLETCHING_TABLE, 300);
        registry.add(FletchingTables.SPRUCE_FLETCHING_TABLE, 300);

        registry.add(Lecterns.ACACIA_LECTERN, 300);
        registry.add(Lecterns.BAMBOO_LECTERN, 300);
        registry.add(Lecterns.BIRCH_LECTERN, 300);
        registry.add(Lecterns.CHERRY_LECTERN, 300);
        registry.add(Lecterns.DARK_OAK_LECTERN, 300);
        registry.add(Lecterns.JUNGLE_LECTERN, 300);
        registry.add(Lecterns.MANGROVE_LECTERN, 300);
        registry.add(Lecterns.SPRUCE_LECTERN, 300);

        registry.add(SmithingTables.ACACIA_SMITHING_TABLE, 300);
        registry.add(SmithingTables.BAMBOO_SMITHING_TABLE, 300);
        registry.add(SmithingTables.BIRCH_SMITHING_TABLE, 300);
        registry.add(SmithingTables.CHERRY_SMITHING_TABLE, 300);
        registry.add(SmithingTables.DARK_OAK_SMITHING_TABLE, 300);
        registry.add(SmithingTables.JUNGLE_SMITHING_TABLE, 300);
        registry.add(SmithingTables.OAK_SMITHING_TABLE, 300);
        registry.add(SmithingTables.SPRUCE_SMITHING_TABLE, 300);
    }
}