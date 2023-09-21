package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.utils.ModItemTags;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Barrels
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.ACACIA_BARREL, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.BAMBOO_BARREL, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.BIRCH_BARREL, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.CHERRY_BARREL, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.CRIMSON_BARREL, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.DARK_OAK_BARREL, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.JUNGLE_BARREL, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.MANGROVE_BARREL, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.OAK_BARREL, Blocks.OAK_PLANKS, Blocks.OAK_SLAB);
        RecipeGenerator.offerBarrelRecipe(exporter, Barrels.WARPED_BARREL, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);

        // Beehives
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.ACACIA_BEEHIVE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.BAMBOO_BEEHIVE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.BIRCH_BEEHIVE, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.CHERRY_BEEHIVE, Blocks.CHERRY_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.CRIMSON_BEEHIVE, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.DARK_OAK_BEEHIVE, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.JUNGLE_BEEHIVE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.MANGROVE_BEEHIVE, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.SPRUCE_BEEHIVE, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerBeehiveRecipe(exporter, Beehives.WARPED_BEEHIVE, Blocks.WARPED_PLANKS);

        // Bookshelves
        offerBookshelfRecipe(exporter, Bookshelves.ACACIA_BOOKSHELF, Items.ACACIA_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.BAMBOO_BOOKSHELF, Items.BAMBOO_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.BIRCH_BOOKSHELF, Items.BIRCH_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.CHERRY_BOOKSHELF, Items.CHERRY_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.DARK_OAK_BOOKSHELF, Items.DARK_OAK_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.JUNGLE_BOOKSHELF, Items.JUNGLE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.MANGROVE_BOOKSHELF, Items.MANGROVE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.SPRUCE_BOOKSHELF, Items.SPRUCE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.CRIMSON_BOOKSHELF, Items.CRIMSON_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.WARPED_BOOKSHELF, Items.WARPED_PLANKS);

        // Cartography Tables
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.ACACIA_CARTOGRAPHY_TABLE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.BIRCH_CARTOGRAPHY_TABLE, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.CHERRY_CARTOGRAPHY_TABLE, Blocks.CHERRY_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.OAK_CARTOGRAPHY_TABLE, Blocks.OAK_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerCartographyTableRecipe(exporter, CartographyTables.WARPED_CARTOGRAPHY_TABLE, Blocks.WARPED_PLANKS);

        // Chests + Chest Boats
        offerChestRecipe(exporter, Chests.ACACIA_CHEST, Items.ACACIA_PLANKS);
        offerChestRecipe(exporter, Chests.BAMBOO_CHEST, Items.BAMBOO_PLANKS);
        offerChestRecipe(exporter, Chests.BIRCH_CHEST, Items.BIRCH_PLANKS);
        offerChestRecipe(exporter, Chests.CHERRY_CHEST, Items.CHERRY_PLANKS);
        offerChestRecipe(exporter, Chests.CRIMSON_CHEST, Items.CRIMSON_PLANKS);
        offerChestRecipe(exporter, Chests.DARK_OAK_CHEST, Items.DARK_OAK_PLANKS);
        offerChestRecipe(exporter, Chests.JUNGLE_CHEST, Items.JUNGLE_PLANKS);
        offerChestRecipe(exporter, Chests.MANGROVE_CHEST, Items.MANGROVE_PLANKS);
        offerChestRecipe(exporter, Chests.SPRUCE_CHEST, Items.SPRUCE_PLANKS);
        offerChestRecipe(exporter, Chests.WARPED_CHEST, Items.WARPED_PLANKS);

        offerCustomChestBoatRecipe(exporter,Items.ACACIA_CHEST_BOAT, Items.ACACIA_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.BAMBOO_CHEST_RAFT, Items.BAMBOO_RAFT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.BIRCH_CHEST_BOAT, Items.BIRCH_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.CHERRY_CHEST_BOAT, Items.CHERRY_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.JUNGLE_CHEST_BOAT, Items.JUNGLE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.MANGROVE_CHEST_BOAT, Items.MANGROVE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.OAK_CHEST_BOAT, Items.OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter,Items.SPRUCE_CHEST_BOAT, Items.SPRUCE_BOAT, ModItemTags.CHESTS);

        // Chiseled Bookshelf
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF, Blocks.BAMBOO_PLANKS, Blocks.BAMBOO_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF, Blocks.CHERRY_PLANKS, Blocks.CHERRY_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF, Blocks.SPRUCE_PLANKS, Blocks.SPRUCE_SLAB);
        RecipeGenerator.offerChiseledBookshelfRecipe(exporter, ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);

        // Composter
        RecipeGenerator.offerComposterRecipe(exporter, Composters.ACACIA_COMPOSTER, Blocks.ACACIA_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.BAMBOO_COMPOSTER, Blocks.BAMBOO_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.BIRCH_COMPOSTER, Blocks.BIRCH_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.CHERRY_COMPOSTER, Blocks.CHERRY_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.CRIMSON_COMPOSTER, Blocks.CRIMSON_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.DARK_OAK_COMPOSTER, Blocks.DARK_OAK_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.JUNGLE_COMPOSTER, Blocks.JUNGLE_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.MANGROVE_COMPOSTER, Blocks.MANGROVE_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.OAK_COMPOSTER, Blocks.OAK_SLAB);
        RecipeGenerator.offerComposterRecipe(exporter, Composters.WARPED_COMPOSTER, Blocks.WARPED_SLAB);

        // Crafting Table
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

        // Fletching Table
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.BAMBOO_FLETCHING_TABLE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.CHERRY_FLETCHING_TABLE, Blocks.CHERRY_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerFletchingTableRecipe(exporter, FletchingTables.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS);

        // Grindstones
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.ACACIA_GRINDSTONE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.BAMBOO_GRINDSTONE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.BIRCH_GRINDSTONE, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.CHERRY_GRINDSTONE, Blocks.CHERRY_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.CRIMSON_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CRIMSON_GRINDSTONE)));
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.JUNGLE_GRINDSTONE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.MANGROVE_GRINDSTONE, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.OAK_GRINDSTONE, Blocks.OAK_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.SPRUCE_GRINDSTONE, Blocks.SPRUCE_PLANKS);
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.WARPED_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.WARPED_GRINDSTONE)));

        // Lecterns
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.ACACIA_LECTERN, Blocks.ACACIA_SLAB, Bookshelves.ACACIA_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.BAMBOO_LECTERN, Blocks.BAMBOO_SLAB, Bookshelves.BAMBOO_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.BIRCH_LECTERN, Blocks.BIRCH_SLAB, Bookshelves.BIRCH_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.CHERRY_LECTERN, Blocks.CHERRY_SLAB, Bookshelves.CHERRY_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.CRIMSON_LECTERN, Blocks.CRIMSON_SLAB, Bookshelves.CRIMSON_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.DARK_OAK_LECTERN, Blocks.DARK_OAK_SLAB, Bookshelves.DARK_OAK_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.JUNGLE_LECTERN, Blocks.JUNGLE_SLAB, Bookshelves.JUNGLE_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.MANGROVE_LECTERN, Blocks.MANGROVE_SLAB, Bookshelves.MANGROVE_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.SPRUCE_LECTERN, Blocks.SPRUCE_SLAB, Bookshelves.SPRUCE_BOOKSHELF);
        RecipeGenerator.offerLecternRecipe(exporter, Lecterns.WARPED_LECTERN, Blocks.WARPED_SLAB, Bookshelves.WARPED_BOOKSHELF);

        // Smithing Table
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.ACACIA_SMITHING_TABLE, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.BAMBOO_SMITHING_TABLE, Blocks.BAMBOO_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.BIRCH_SMITHING_TABLE, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.CHERRY_SMITHING_TABLE, Blocks.CHERRY_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.CRIMSON_SMITHING_TABLE, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.DARK_OAK_SMITHING_TABLE, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.JUNGLE_SMITHING_TABLE, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.OAK_SMITHING_TABLE, Blocks.OAK_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.SPRUCE_SMITHING_TABLE, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerSmithingTableRecipe(exporter, SmithingTables.WARPED_SMITHING_TABLE, Blocks.WARPED_PLANKS);

        // Smokers
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.ACACIA_SMOKER, ItemTags.ACACIA_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.BAMBOO_SMOKER, ModItemTags.BAMBOO_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.BIRCH_SMOKER, ItemTags.BIRCH_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.CHERRY_SMOKER, ItemTags.CHERRY_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.CRIMSON_SMOKER, ItemTags.CRIMSON_STEMS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.DARK_OAK_SMOKER, ItemTags.DARK_OAK_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.JUNGLE_SMOKER, ItemTags.JUNGLE_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.MANGROVE_SMOKER, ItemTags.MANGROVE_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.SPRUCE_SMOKER, ItemTags.SPRUCE_LOGS);
        RecipeGenerator.offerSmokerRecipe(exporter, Smokers.WARPED_SMOKER, ItemTags.WARPED_STEMS);

        // Chest Minecart
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CHEST_MINECART, 1)
                .input(ModItemTags.CHESTS).input(Items.MINECART)
                .criterion("has_minecart", VanillaRecipeProvider.conditionsFromItem(Items.MINECART))
                .offerTo(exporter, new Identifier("variantchests", "chest_minecart"));
        // Hopper
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.HOPPER, 1)
                .input('I', Items.IRON_INGOT).input('C', ModItemTags.CHESTS)
                .pattern("I I").pattern("ICI").pattern(" I ")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("variantchests", "hopper"));

        // Shulker Box
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.SHULKER_BOX, 1)
                .input('-', Items.SHULKER_SHELL).input('#', ModItemTags.CHESTS)
                .pattern(" - ").pattern(" # ").pattern(" - ")
                .criterion("has_shulker_shell", VanillaRecipeProvider.conditionsFromItem(Items.SHULKER_SHELL))
                .offerTo(exporter, new Identifier("variantchests", "shulker_box"));


        // Uncrafting
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.BARRELS, Blocks.BARREL);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.MISC, ModItemTags.BEEHIVES, Blocks.BEEHIVE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItemTags.BOOKSHELVES, Blocks.BOOKSHELF);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.MISC, ModItemTags.CARTOGRAPHY_TABLES, Blocks.CARTOGRAPHY_TABLE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.MISC, ModItemTags.CHESTS, Blocks.CHEST);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModItemTags.CHISELED_BOOKSHELVES, Blocks.CHISELED_BOOKSHELF);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.COMPOSTERS, Blocks.COMPOSTER);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.MISC, ModItemTags.CRAFTING_TABLES, Blocks.CRAFTING_TABLE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.FLETCHING_TABLES, Blocks.FLETCHING_TABLE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.GRINDSTONES, Blocks.GRINDSTONE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.REDSTONE, ModItemTags.LECTERNS, Blocks.LECTERN);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.SMITHING_TABLES, Blocks.SMITHING_TABLE);
        RecipeGenerator.offerUncraftingRecipe(exporter, RecipeCategory.DECORATIONS, ModItemTags.SMOKERS, Blocks.SMOKER);
    }

    public static void offerBarrelRecipe(RecipeExporter exporter, ItemConvertible barrel, ItemConvertible plank, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, barrel, 1)
                .input('P', plank).input('S', slab)
                .pattern("PSP").pattern("P P").pattern("PSP")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromItem(plank)).criterion("has_wood_slab", VanillaRecipeProvider.conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(barrel)));
    }

    public static void offerBeehiveRecipe(RecipeExporter exporter, ItemConvertible beehive, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, beehive)
                .input('H', Items.HONEYCOMB).input('P', plank)
                .pattern("PPP").pattern("HHH").pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(beehive)));
    }

    public static void offerBookshelfRecipe(RecipeExporter exporter, ItemConvertible bookshelf, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, bookshelf)
                .input('#', planks)
                .input('X', Items.BOOK)
                .pattern("###").pattern("XXX").pattern("###")
                .criterion("has_book", VanillaRecipeProvider.conditionsFromItem(Items.BOOK)).offerTo(exporter);
    }

    public static void offerCartographyTableRecipe(RecipeExporter exporter, ItemConvertible cartographytable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, cartographytable)
                .input('@', Items.PAPER).input('#', plank)
                .pattern("@@").pattern("##").pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(cartographytable)));
    }

    public static void offerChestRecipe(RecipeExporter exporter, ItemConvertible chest, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, chest, 1)
                .input('P', plank)
                .pattern("PPP").pattern("P P").pattern("PPP")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromItem(plank))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chest)));
    }

    public static void offerCustomChestBoatRecipe(RecipeExporter exporter, ItemConvertible chestboat, ItemConvertible boat, TagKey<Item> chest) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, chestboat)
                .input(chest).input(boat).group("chest_boat")
                .criterion("has_boat", RecipeProvider.conditionsFromTag(ItemTags.BOATS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chestboat)));
    }

    public static void offerChiseledBookshelfRecipe(RecipeExporter exporter, ItemConvertible bookshelf, ItemConvertible plank, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, bookshelf)
                .input('#', plank).input('X', slab)
                .pattern("###").pattern("XXX").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(bookshelf)));
    }

    public static void offerComposterRecipe(RecipeExporter exporter, ItemConvertible composter, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, composter)
                .input('#', slab)
                .pattern("# #").pattern("# #").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(slab), FabricRecipeProvider.conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(composter)));
    }

    public static void offerFletchingTableRecipe(RecipeExporter exporter, ItemConvertible fletchingtable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, fletchingtable)
                .input('@', Items.FLINT).input('#', plank)
                .pattern("@@").pattern("##").pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(fletchingtable)));
    }

    public static void offerGrindstoneRecipe(RecipeExporter exporter, ItemConvertible grindstone, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, grindstone)
                .input('I', Items.STICK).input('-', Blocks.STONE_SLAB).input('#', plank)
                .pattern("I-I").pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(grindstone)));
    }

    public static void offerLecternRecipe(RecipeExporter exporter, ItemConvertible lectern, ItemConvertible slab, ItemConvertible bookshelf) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, lectern)
                .input('B', bookshelf).input('S', slab)
                .pattern("SSS").pattern(" B ").pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(lectern)));
    }

    public static void offerSmithingTableRecipe(RecipeExporter exporter, ItemConvertible smithingtable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, smithingtable)
                .input('#', plank).input('@', Items.IRON_INGOT)
                .pattern("@@").pattern("##").pattern("##")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(smithingtable)));
    }

    public static void offerSmokerRecipe(RecipeExporter exporter, ItemConvertible smoker, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, smoker)
                .input('#', log).input('X', Blocks.FURNACE)
                .pattern(" # ").pattern("#X#").pattern(" # ")
                .criterion("has_furnace", VanillaRecipeProvider.conditionsFromItem(Blocks.FURNACE))
                .offerTo(exporter);
    }
    
    public static void offerUncraftingRecipe(RecipeExporter exporter, RecipeCategory category, TagKey<Item> input, ItemConvertible output) {
        ShapelessRecipeJsonBuilder.create(category, output, 1)
                .input(input)
                .criterion("has_variant_item", InventoryChangedCriterion.Conditions.items(output))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }
}