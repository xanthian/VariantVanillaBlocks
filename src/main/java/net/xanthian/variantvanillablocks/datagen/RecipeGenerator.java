package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.utils.ModItemTags;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataGenerator output) {
        super(output);
    }

    public static void offerBarrelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible barrel, ItemConvertible plank, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(barrel)
                .input('P', plank).input('S', slab)
                .pattern("PSP").pattern("P P").pattern("PSP")
                .criterion("has_planks", conditionsFromItem(plank)).criterion("has_wood_slab", conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(barrel)));
    }

    public static void offerBeehiveRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible beehive, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(beehive)
                .input('H', Items.HONEYCOMB).input('P', plank)
                .pattern("PPP").pattern("HHH").pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(beehive)));
    }

    public static void offerBookshelfRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible bookshelf, ItemConvertible planks) {
        ShapedRecipeJsonBuilder.create(bookshelf)
                .input('#', planks)
                .input('X', Items.BOOK)
                .pattern("###").pattern("XXX").pattern("###")
                .criterion("has_book", conditionsFromItem(Items.BOOK)).offerTo(exporter);
    }

    public static void offerCartographyTableRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible cartographyTable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(cartographyTable)
                .input('@', Items.PAPER).input('#', plank)
                .pattern("@@").pattern("##").pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(cartographyTable)));
    }

    public static void offerChestRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible chest, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(chest, 1)
                .input('P', plank)
                .pattern("PPP").pattern("P P").pattern("PPP")
                .criterion("has_planks", conditionsFromItem(plank))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chest)));
    }

    public static void offerCraftingTableRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible craftingTable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(craftingTable)
                .input('#', plank)
                .pattern("##").pattern("##")
                .criterion("has_planks", conditionsFromItem(plank))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(craftingTable)));
    }

    public static void offerCustomChestBoatRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible chestboat, ItemConvertible boat, TagKey<Item> chest) {
        ShapelessRecipeJsonBuilder.create(chestboat)
                .input(chest).input(boat).group("chest_boat")
                .criterion("has_boat", conditionsFromTag(ItemTags.BOATS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(chestboat)));
    }

    public static void offerComposterRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible composter, ItemConvertible slab) {
        ShapedRecipeJsonBuilder.create(composter)
                .input('#', slab)
                .pattern("# #").pattern("# #").pattern("###")
                .criterion(FabricRecipeProvider.hasItem(slab), FabricRecipeProvider.conditionsFromItem(slab))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(composter)));
    }

    public static void offerFletchingTableRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible fletchingtable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(fletchingtable)
                .input('@', Items.FLINT).input('#', plank)
                .pattern("@@").pattern("##").pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(fletchingtable)));
    }

    public static void offerGrindstoneRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible grindstone, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(grindstone)
                .input('I', Items.STICK).input('-', Blocks.STONE_SLAB).input('#', plank)
                .pattern("I-I").pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(grindstone)));
    }

    public static void offerLecternRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible lectern, ItemConvertible slab, ItemConvertible bookshelf) {
        ShapedRecipeJsonBuilder.create(lectern)
                .input('B', bookshelf).input('S', slab)
                .pattern("SSS").pattern(" B ").pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(lectern)));
    }

    public static void offerSmithingTableRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible smithingtable, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(smithingtable)
                .input('#', plank).input('@', Items.IRON_INGOT)
                .pattern("@@").pattern("##").pattern("##")
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(smithingtable)));
    }

    public static void offerSmokerRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible smoker, TagKey<Item> log) {
        ShapedRecipeJsonBuilder.create(smoker)
                .input('#', log).input('X', Blocks.FURNACE)
                .pattern(" # ").pattern("#X#").pattern(" # ")
                .criterion("has_furnace", conditionsFromItem(Blocks.FURNACE))
                .offerTo(exporter);
    }

    public static void offerUncraftingRecipe(Consumer<RecipeJsonProvider> exporter, TagKey<Item> input, ItemConvertible output) {
        ShapelessRecipeJsonBuilder.create(output, 1)
                .input(input)
                .criterion("has_variant_item", InventoryChangedCriterion.Conditions.items(output))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(output)));
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {

        // Barrels
        offerBarrelRecipe(exporter, Barrels.ACACIA_BARREL, Blocks.ACACIA_PLANKS, Blocks.ACACIA_SLAB);
        offerBarrelRecipe(exporter, Barrels.BIRCH_BARREL, Blocks.BIRCH_PLANKS, Blocks.BIRCH_SLAB);
        offerBarrelRecipe(exporter, Barrels.CRIMSON_BARREL, Blocks.CRIMSON_PLANKS, Blocks.CRIMSON_SLAB);
        offerBarrelRecipe(exporter, Barrels.DARK_OAK_BARREL, Blocks.DARK_OAK_PLANKS, Blocks.DARK_OAK_SLAB);
        offerBarrelRecipe(exporter, Barrels.JUNGLE_BARREL, Blocks.JUNGLE_PLANKS, Blocks.JUNGLE_SLAB);
        offerBarrelRecipe(exporter, Barrels.MANGROVE_BARREL, Blocks.MANGROVE_PLANKS, Blocks.MANGROVE_SLAB);
        offerBarrelRecipe(exporter, Barrels.OAK_BARREL, Blocks.OAK_PLANKS, Blocks.OAK_SLAB);
        offerBarrelRecipe(exporter, Barrels.WARPED_BARREL, Blocks.WARPED_PLANKS, Blocks.WARPED_SLAB);

        // Beehives
        offerBeehiveRecipe(exporter, Beehives.ACACIA_BEEHIVE, Blocks.ACACIA_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.BIRCH_BEEHIVE, Blocks.BIRCH_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.CRIMSON_BEEHIVE, Blocks.CRIMSON_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.DARK_OAK_BEEHIVE, Blocks.DARK_OAK_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.JUNGLE_BEEHIVE, Blocks.JUNGLE_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.MANGROVE_BEEHIVE, Blocks.MANGROVE_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.SPRUCE_BEEHIVE, Blocks.SPRUCE_PLANKS);
        offerBeehiveRecipe(exporter, Beehives.WARPED_BEEHIVE, Blocks.WARPED_PLANKS);

        // Bookshelves
        offerBookshelfRecipe(exporter, Bookshelves.ACACIA_BOOKSHELF, Items.ACACIA_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.BIRCH_BOOKSHELF, Items.BIRCH_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.DARK_OAK_BOOKSHELF, Items.DARK_OAK_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.JUNGLE_BOOKSHELF, Items.JUNGLE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.MANGROVE_BOOKSHELF, Items.MANGROVE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.SPRUCE_BOOKSHELF, Items.SPRUCE_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.CRIMSON_BOOKSHELF, Items.CRIMSON_PLANKS);
        offerBookshelfRecipe(exporter, Bookshelves.WARPED_BOOKSHELF, Items.WARPED_PLANKS);

        // Cartography Tables
        offerCartographyTableRecipe(exporter, CartographyTables.ACACIA_CARTOGRAPHY_TABLE, Blocks.ACACIA_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.BIRCH_CARTOGRAPHY_TABLE, Blocks.BIRCH_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, Blocks.CRIMSON_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, Blocks.JUNGLE_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, Blocks.MANGROVE_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.OAK_CARTOGRAPHY_TABLE, Blocks.OAK_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, Blocks.SPRUCE_PLANKS);
        offerCartographyTableRecipe(exporter, CartographyTables.WARPED_CARTOGRAPHY_TABLE, Blocks.WARPED_PLANKS);

        // Chests + Chest Boats
        offerChestRecipe(exporter, Chests.ACACIA_CHEST, Items.ACACIA_PLANKS);
        offerChestRecipe(exporter, Chests.BIRCH_CHEST, Items.BIRCH_PLANKS);
        offerChestRecipe(exporter, Chests.CRIMSON_CHEST, Items.CRIMSON_PLANKS);
        offerChestRecipe(exporter, Chests.DARK_OAK_CHEST, Items.DARK_OAK_PLANKS);
        offerChestRecipe(exporter, Chests.JUNGLE_CHEST, Items.JUNGLE_PLANKS);
        offerChestRecipe(exporter, Chests.MANGROVE_CHEST, Items.MANGROVE_PLANKS);
        offerChestRecipe(exporter, Chests.SPRUCE_CHEST, Items.SPRUCE_PLANKS);
        offerChestRecipe(exporter, Chests.WARPED_CHEST, Items.WARPED_PLANKS);

        offerCustomChestBoatRecipe(exporter, Items.ACACIA_CHEST_BOAT, Items.ACACIA_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.BIRCH_CHEST_BOAT, Items.BIRCH_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.DARK_OAK_CHEST_BOAT, Items.DARK_OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.JUNGLE_CHEST_BOAT, Items.JUNGLE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.MANGROVE_CHEST_BOAT, Items.MANGROVE_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.OAK_CHEST_BOAT, Items.OAK_BOAT, ModItemTags.CHESTS);
        offerCustomChestBoatRecipe(exporter, Items.SPRUCE_CHEST_BOAT, Items.SPRUCE_BOAT, ModItemTags.CHESTS);

        // Composter
        offerComposterRecipe(exporter, Composters.ACACIA_COMPOSTER, Blocks.ACACIA_SLAB);
        offerComposterRecipe(exporter, Composters.BIRCH_COMPOSTER, Blocks.BIRCH_SLAB);
        offerComposterRecipe(exporter, Composters.CRIMSON_COMPOSTER, Blocks.CRIMSON_SLAB);
        offerComposterRecipe(exporter, Composters.DARK_OAK_COMPOSTER, Blocks.DARK_OAK_SLAB);
        offerComposterRecipe(exporter, Composters.JUNGLE_COMPOSTER, Blocks.JUNGLE_SLAB);
        offerComposterRecipe(exporter, Composters.MANGROVE_COMPOSTER, Blocks.MANGROVE_SLAB);
        offerComposterRecipe(exporter, Composters.OAK_COMPOSTER, Blocks.OAK_SLAB);
        offerComposterRecipe(exporter, Composters.WARPED_COMPOSTER, Blocks.WARPED_SLAB);

        // Crafting Table
        offerCraftingTableRecipe(exporter, CraftingTables.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offerCraftingTableRecipe(exporter, CraftingTables.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

        // Fletching Table
        offerFletchingTableRecipe(exporter, FletchingTables.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS);
        offerFletchingTableRecipe(exporter, FletchingTables.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS);

        // Grindstones
        offerGrindstoneRecipe(exporter, Grindstones.ACACIA_GRINDSTONE, Blocks.ACACIA_PLANKS);
        offerGrindstoneRecipe(exporter, Grindstones.BIRCH_GRINDSTONE, Blocks.BIRCH_PLANKS);
        ShapedRecipeJsonBuilder.create(Grindstones.CRIMSON_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CRIMSON_GRINDSTONE)));
        offerGrindstoneRecipe(exporter, Grindstones.JUNGLE_GRINDSTONE, Blocks.JUNGLE_PLANKS);
        offerGrindstoneRecipe(exporter, Grindstones.MANGROVE_GRINDSTONE, Blocks.MANGROVE_PLANKS);
        offerGrindstoneRecipe(exporter, Grindstones.OAK_GRINDSTONE, Blocks.OAK_PLANKS);
        offerGrindstoneRecipe(exporter, Grindstones.SPRUCE_GRINDSTONE, Blocks.SPRUCE_PLANKS);
        ShapedRecipeJsonBuilder.create(Grindstones.WARPED_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.WARPED_GRINDSTONE)));

        // Lecterns
        offerLecternRecipe(exporter, Lecterns.ACACIA_LECTERN, Blocks.ACACIA_SLAB, Bookshelves.ACACIA_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.BIRCH_LECTERN, Blocks.BIRCH_SLAB, Bookshelves.BIRCH_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.CRIMSON_LECTERN, Blocks.CRIMSON_SLAB, Bookshelves.CRIMSON_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.DARK_OAK_LECTERN, Blocks.DARK_OAK_SLAB, Bookshelves.DARK_OAK_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.JUNGLE_LECTERN, Blocks.JUNGLE_SLAB, Bookshelves.JUNGLE_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.MANGROVE_LECTERN, Blocks.MANGROVE_SLAB, Bookshelves.MANGROVE_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.SPRUCE_LECTERN, Blocks.SPRUCE_SLAB, Bookshelves.SPRUCE_BOOKSHELF);
        offerLecternRecipe(exporter, Lecterns.WARPED_LECTERN, Blocks.WARPED_SLAB, Bookshelves.WARPED_BOOKSHELF);

        // Smithing Table
        offerSmithingTableRecipe(exporter, SmithingTables.ACACIA_SMITHING_TABLE, Blocks.ACACIA_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.BIRCH_SMITHING_TABLE, Blocks.BIRCH_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.CRIMSON_SMITHING_TABLE, Blocks.CRIMSON_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.DARK_OAK_SMITHING_TABLE, Blocks.DARK_OAK_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.JUNGLE_SMITHING_TABLE, Blocks.JUNGLE_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.OAK_SMITHING_TABLE, Blocks.OAK_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.SPRUCE_SMITHING_TABLE, Blocks.SPRUCE_PLANKS);
        offerSmithingTableRecipe(exporter, SmithingTables.WARPED_SMITHING_TABLE, Blocks.WARPED_PLANKS);

        // Smokers
        offerSmokerRecipe(exporter, Smokers.ACACIA_SMOKER, ItemTags.ACACIA_LOGS);
        offerSmokerRecipe(exporter, Smokers.BIRCH_SMOKER, ItemTags.BIRCH_LOGS);
        offerSmokerRecipe(exporter, Smokers.CRIMSON_SMOKER, ItemTags.CRIMSON_STEMS);
        offerSmokerRecipe(exporter, Smokers.DARK_OAK_SMOKER, ItemTags.DARK_OAK_LOGS);
        offerSmokerRecipe(exporter, Smokers.JUNGLE_SMOKER, ItemTags.JUNGLE_LOGS);
        offerSmokerRecipe(exporter, Smokers.MANGROVE_SMOKER, ItemTags.MANGROVE_LOGS);
        offerSmokerRecipe(exporter, Smokers.SPRUCE_SMOKER, ItemTags.SPRUCE_LOGS);
        offerSmokerRecipe(exporter, Smokers.WARPED_SMOKER, ItemTags.WARPED_STEMS);

        // Chest Minecart
        ShapelessRecipeJsonBuilder.create(Items.CHEST_MINECART, 1)
                .input(ModItemTags.CHESTS).input(Items.MINECART)
                .criterion("has_minecart", conditionsFromItem(Items.MINECART))
                .offerTo(exporter, new Identifier("variantchests", "chest_minecart"));
        // Hopper
        ShapedRecipeJsonBuilder.create(Items.HOPPER, 1)
                .input('I', Items.IRON_INGOT).input('C', ModItemTags.CHESTS)
                .pattern("I I").pattern("ICI").pattern(" I ")
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, new Identifier("variantchests", "hopper"));

        // Shulker Box
        ShapedRecipeJsonBuilder.create(Items.SHULKER_BOX, 1)
                .input('-', Items.SHULKER_SHELL).input('#', ModItemTags.CHESTS)
                .pattern(" - ").pattern(" # ").pattern(" - ")
                .criterion("has_shulker_shell", conditionsFromItem(Items.SHULKER_SHELL))
                .offerTo(exporter, new Identifier("variantchests", "shulker_box"));


        // Uncrafting
        offerUncraftingRecipe(exporter, ModItemTags.BARRELS, Blocks.BARREL);
        offerUncraftingRecipe(exporter, ModItemTags.BEEHIVES, Blocks.BEEHIVE);
        offerUncraftingRecipe(exporter, ModItemTags.BOOKSHELVES, Blocks.BOOKSHELF);
        offerUncraftingRecipe(exporter, ModItemTags.CARTOGRAPHY_TABLES, Blocks.CARTOGRAPHY_TABLE);
        offerUncraftingRecipe(exporter, ModItemTags.CHESTS, Blocks.CHEST);
        offerUncraftingRecipe(exporter, ModItemTags.COMPOSTERS, Blocks.COMPOSTER);
        offerUncraftingRecipe(exporter, ModItemTags.CRAFTING_TABLES, Blocks.CRAFTING_TABLE);
        offerUncraftingRecipe(exporter, ModItemTags.FLETCHING_TABLES, Blocks.FLETCHING_TABLE);
        offerUncraftingRecipe(exporter, ModItemTags.GRINDSTONES, Blocks.GRINDSTONE);
        offerUncraftingRecipe(exporter, ModItemTags.LECTERNS, Blocks.LECTERN);
        offerUncraftingRecipe(exporter, ModItemTags.SMITHING_TABLES, Blocks.SMITHING_TABLE);
        offerUncraftingRecipe(exporter, ModItemTags.SMOKERS, Blocks.SMOKER);
    }
}