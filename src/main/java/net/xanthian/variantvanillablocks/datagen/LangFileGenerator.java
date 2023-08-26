package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(Initialise.ITEM_GROUP, "Variant Vanilla Blocks");

        translationBuilder.add(Barrels.ACACIA_BARREL, "Acacia Barrel");
        translationBuilder.add(Barrels.BAMBOO_BARREL, "Bamboo Barrel");
        translationBuilder.add(Barrels.BIRCH_BARREL, "Birch Barrel");
        translationBuilder.add(Barrels.CHERRY_BARREL, "Cherry Barrel");
        translationBuilder.add(Barrels.CRIMSON_BARREL, "Crimson Barrel");
        translationBuilder.add(Barrels.DARK_OAK_BARREL, "Dark Oak Barrel");
        translationBuilder.add(Barrels.JUNGLE_BARREL, "Jungle Barrel");
        translationBuilder.add(Barrels.MANGROVE_BARREL, "Mangrove Barrel");
        translationBuilder.add(Barrels.OAK_BARREL, "Oak Barrel");
        //translationBuilder.add(Blocks.BARREL, "Spruce Barrel");
        translationBuilder.add(Barrels.WARPED_BARREL, "Warped Barrel");
        
        translationBuilder.add(Beehives.ACACIA_BEEHIVE, "Acacia Beehive");
        translationBuilder.add(Beehives.BAMBOO_BEEHIVE, "Bamboo Beehive");
        translationBuilder.add(Beehives.BIRCH_BEEHIVE, "Birch Beehive");
        translationBuilder.add(Beehives.CHERRY_BEEHIVE, "Cherry Beehive");
        translationBuilder.add(Beehives.CRIMSON_BEEHIVE, "Crimson Beehive");
        translationBuilder.add(Beehives.DARK_OAK_BEEHIVE, "Dark Oak Beehive");
        translationBuilder.add(Beehives.JUNGLE_BEEHIVE, "Jungle Beehive");
        translationBuilder.add(Beehives.MANGROVE_BEEHIVE, "Mangrove Beehive");
        //translationBuilder.add(Blocks.BEEHIVE, "Oak Beehive");
        translationBuilder.add(Beehives.SPRUCE_BEEHIVE, "Spruce Beehive");
        translationBuilder.add(Beehives.WARPED_BEEHIVE, "Warped Beehive");

        translationBuilder.add(Bookshelves.ACACIA_BOOKSHELF, "Acacia Bookshelf");
        translationBuilder.add(Bookshelves.BAMBOO_BOOKSHELF, "Bamboo Bookshelf");
        translationBuilder.add(Bookshelves.BIRCH_BOOKSHELF, "Birch Bookshelf");
        translationBuilder.add(Bookshelves.CHERRY_BOOKSHELF, "Cherry Bookshelf");
        translationBuilder.add(Bookshelves.CRIMSON_BOOKSHELF, "Crimson Bookshelf");
        translationBuilder.add(Bookshelves.DARK_OAK_BOOKSHELF, "Dark Oak Bookshelf");
        translationBuilder.add(Bookshelves.JUNGLE_BOOKSHELF, "Jungle Bookshelf");
        translationBuilder.add(Bookshelves.MANGROVE_BOOKSHELF, "Mangrove Bookshelf");
        //translationBuilder.add(Blocks.BOOKSHELF, "Oak Bookshelf");
        translationBuilder.add(Bookshelves.SPRUCE_BOOKSHELF, "Spruce Bookshelf");
        translationBuilder.add(Bookshelves.WARPED_BOOKSHELF, "Warped Bookshelf");
        
        translationBuilder.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, "Acacia Cartography Table");
        translationBuilder.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, "Bamboo Cartography Table");
        translationBuilder.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, "Birch Cartography Table");
        translationBuilder.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, "Cherry Cartography Table");
        translationBuilder.add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, "Crimson Cartography Table");
        //translationBuilder.add(Blocks.CARTOGRAPHY_TABLE, "Dark Oak Cartography Table");
        translationBuilder.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, "Jungle Cartography Table");
        translationBuilder.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, "Mangrove Cartography Table");
        translationBuilder.add(CartographyTables.OAK_CARTOGRAPHY_TABLE, "Oak Cartography Table");
        translationBuilder.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, "Spruce Cartography Table");
        translationBuilder.add(CartographyTables.WARPED_CARTOGRAPHY_TABLE, "Warped Cartography Table");

        translationBuilder.add(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF, "Acacia Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF, "Bamboo Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF, "Birch Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF, "Cherry Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF, "Crimson Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF, "Dark Oak Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF, "Jungle Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF, "Mangrove Chiseled Bookshelf");
        //translationBuilder.add(Items.CHISELED_BOOKSHELF, "Oak Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF, "Spruce Chiseled Bookshelf");
        translationBuilder.add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF, "Warped Chiseled Bookshelf");

        translationBuilder.add(Composters.ACACIA_COMPOSTER, "Acacia Composter");
        translationBuilder.add(Composters.BAMBOO_COMPOSTER, "Bamboo Composter");
        translationBuilder.add(Composters.BIRCH_COMPOSTER, "Birch Composter");
        translationBuilder.add(Composters.CHERRY_COMPOSTER, "Cherry Composter");
        translationBuilder.add(Composters.CRIMSON_COMPOSTER, "Crimson Composter");
        translationBuilder.add(Composters.DARK_OAK_COMPOSTER, "Dark Oak Composter");
        translationBuilder.add(Composters.JUNGLE_COMPOSTER, "Jungle Composter");
        translationBuilder.add(Composters.MANGROVE_COMPOSTER, "Mangrove Composter");
        translationBuilder.add(Composters.OAK_COMPOSTER, "Oak Composter");
        //translationBuilder.add(Blocks.COMPOSTER, "Spruce Composter");
        translationBuilder.add(Composters.WARPED_COMPOSTER, "Warped Composter");

        translationBuilder.add(CraftingTables.ACACIA_CRAFTING_TABLE, "Acacia Crafting Table");
        translationBuilder.add(CraftingTables.BAMBOO_CRAFTING_TABLE, "Bamboo Crafting Table");
        translationBuilder.add(CraftingTables.BIRCH_CRAFTING_TABLE, "Birch Crafting Table");
        translationBuilder.add(CraftingTables.CHERRY_CRAFTING_TABLE, "Cherry Crafting Table");
        translationBuilder.add(CraftingTables.CRIMSON_CRAFTING_TABLE, "Crimson Crafting Table");
        translationBuilder.add(CraftingTables.DARK_OAK_CRAFTING_TABLE, "Dark Oak Crafting Table");
        translationBuilder.add(CraftingTables.JUNGLE_CRAFTING_TABLE, "Jungle Crafting Table");
        translationBuilder.add(CraftingTables.MANGROVE_CRAFTING_TABLE, "Mangrove Crafting Table");
        //translationBuilder.add(Blocks.CRAFTING_TABLE, "Oak Crafting Table");
        translationBuilder.add(CraftingTables.SPRUCE_CRAFTING_TABLE, "Spruce Crafting Table");
        translationBuilder.add(CraftingTables.WARPED_CRAFTING_TABLE, "Warped Crafting Table");

        translationBuilder.add(FletchingTables.ACACIA_FLETCHING_TABLE, "Acacia Fletching Table");
        translationBuilder.add(FletchingTables.BAMBOO_FLETCHING_TABLE, "Bamboo Fletching Table");
        //translationBuilder.add(Blocks.FLETCHING_TABLE, "Birch Fletching Table");
        translationBuilder.add(FletchingTables.CHERRY_FLETCHING_TABLE, "Cherry Fletching Table");
        translationBuilder.add(FletchingTables.CRIMSON_FLETCHING_TABLE, "Crimson Fletching Table");
        translationBuilder.add(FletchingTables.DARK_OAK_FLETCHING_TABLE, "Dark Oak Fletching Table");
        translationBuilder.add(FletchingTables.JUNGLE_FLETCHING_TABLE, "Jungle Fletching Table");
        translationBuilder.add(FletchingTables.MANGROVE_FLETCHING_TABLE, "Mangrove Fletching Table");
        translationBuilder.add(FletchingTables.OAK_FLETCHING_TABLE, "Oak Fletching Table");
        translationBuilder.add(FletchingTables.SPRUCE_FLETCHING_TABLE, "Spruce Fletching Table");
        translationBuilder.add(FletchingTables.WARPED_FLETCHING_TABLE, "Warped Fletching Table");

        translationBuilder.add(Grindstones.ACACIA_GRINDSTONE, "Acacia Grindstone");
        translationBuilder.add(Grindstones.BAMBOO_GRINDSTONE, "Bamboo Grindstone");
        translationBuilder.add(Grindstones.BIRCH_GRINDSTONE, "Birch Grindstone");
        translationBuilder.add(Grindstones.CHERRY_GRINDSTONE, "Cherry Grindstone");
        translationBuilder.add(Grindstones.CRIMSON_GRINDSTONE, "Crimson Grindstone");
        //translationBuilder.add(Blocks.GRINDSTONE, "Dark Oak Grindstone");
        translationBuilder.add(Grindstones.JUNGLE_GRINDSTONE, "Jungle Grindstone");
        translationBuilder.add(Grindstones.MANGROVE_GRINDSTONE, "Mangrove Grindstone");
        translationBuilder.add(Grindstones.OAK_GRINDSTONE, "Oak Grindstone");
        translationBuilder.add(Grindstones.SPRUCE_GRINDSTONE, "Spruce Grindstone");
        translationBuilder.add(Grindstones.WARPED_GRINDSTONE, "Warped Grindstone");

        translationBuilder.add(Lecterns.ACACIA_LECTERN, "Acacia Lectern");
        translationBuilder.add(Lecterns.BAMBOO_LECTERN, "Bamboo Lectern");
        translationBuilder.add(Lecterns.BIRCH_LECTERN, "Birch Lectern");
        translationBuilder.add(Lecterns.CHERRY_LECTERN, "Cherry Lectern");
        translationBuilder.add(Lecterns.CRIMSON_LECTERN, "Crimson Lectern");
        translationBuilder.add(Lecterns.DARK_OAK_LECTERN, "Dark Oak Lectern");
        translationBuilder.add(Lecterns.JUNGLE_LECTERN, "Jungle Lectern");
        translationBuilder.add(Lecterns.MANGROVE_LECTERN, "Mangrove Lectern");
        //translationBuilder.add(Blocks.LECTERN, "Oak Lectern");
        translationBuilder.add(Lecterns.SPRUCE_LECTERN, "Spruce Lectern");
        translationBuilder.add(Lecterns.WARPED_LECTERN, "Warped Lectern");

        translationBuilder.add(SmithingTables.ACACIA_SMITHING_TABLE, "Acacia Smithing Table");
        translationBuilder.add(SmithingTables.BAMBOO_SMITHING_TABLE, "Bamboo Smithing Table");
        translationBuilder.add(SmithingTables.BIRCH_SMITHING_TABLE, "Birch Smithing Table");
        translationBuilder.add(SmithingTables.CHERRY_SMITHING_TABLE, "Cherry Smithing Table");
        translationBuilder.add(SmithingTables.CRIMSON_SMITHING_TABLE, "Crimson Smithing Table");
        translationBuilder.add(SmithingTables.DARK_OAK_SMITHING_TABLE, "Dark Oak Smithing Table");
        translationBuilder.add(SmithingTables.JUNGLE_SMITHING_TABLE, "Jungle Smithing Table");
        //translationBuilder.add(Blocks.SMITHING_TABLE, "Mangrove Smithing Table");
        translationBuilder.add(SmithingTables.OAK_SMITHING_TABLE, "Oak Smithing Table");
        translationBuilder.add(SmithingTables.SPRUCE_SMITHING_TABLE, "Spruce Smithing Table");
        translationBuilder.add(SmithingTables.WARPED_SMITHING_TABLE, "Warped Smithing Table");

        translationBuilder.add(Smokers.ACACIA_SMOKER, "Acacia Smoker");
        translationBuilder.add(Smokers.BAMBOO_SMOKER, "Bamboo Smoker");
        translationBuilder.add(Smokers.BIRCH_SMOKER, "Birch Smoker");
        translationBuilder.add(Smokers.CHERRY_SMOKER, "Cherry Smoker");
        translationBuilder.add(Smokers.CRIMSON_SMOKER, "Crimson Smoker");
        translationBuilder.add(Smokers.DARK_OAK_SMOKER, "Dark Oak Smoker");
        translationBuilder.add(Smokers.JUNGLE_SMOKER, "Jungle Smoker");
        translationBuilder.add(Smokers.MANGROVE_SMOKER, "Mangrove Smoker");
        translationBuilder.add(Smokers.SPRUCE_SMOKER, "Spruce Smoker");
        //translationBuilder.add(Blocks.SMOKER, "Spruce Smoker");
        translationBuilder.add(Smokers.WARPED_SMOKER, "Warped Smoker");
    }
}
