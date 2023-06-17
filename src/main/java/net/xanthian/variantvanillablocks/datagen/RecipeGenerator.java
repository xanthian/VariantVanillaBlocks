package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Barrels

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.ACACIA_BARREL,1)
                .input('P', Blocks.ACACIA_PLANKS)
                .input('S', Blocks.ACACIA_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.ACACIA_SLAB), FabricRecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.ACACIA_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.BAMBOO_BARREL, 1)
                .input('P', Blocks.BAMBOO_PLANKS)
                .input('S', Blocks.BAMBOO_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.BAMBOO_SLAB), FabricRecipeProvider.conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.BAMBOO_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.BIRCH_BARREL, 1)
                .input('P', Blocks.BIRCH_PLANKS)
                .input('S', Blocks.BIRCH_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.BIRCH_SLAB), FabricRecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.BIRCH_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.CHERRY_BARREL, 1)
                .input('P', Blocks.CHERRY_PLANKS)
                .input('S', Blocks.CHERRY_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.CHERRY_SLAB), FabricRecipeProvider.conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.CHERRY_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.CRIMSON_BARREL, 1)
                .input('P', Blocks.CRIMSON_PLANKS)
                .input('S', Blocks.CRIMSON_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.CRIMSON_SLAB), FabricRecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.CRIMSON_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.DARK_OAK_BARREL, 1)
                .input('P', Blocks.DARK_OAK_PLANKS)
                .input('S', Blocks.DARK_OAK_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.DARK_OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.DARK_OAK_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.JUNGLE_BARREL, 1)
                .input('P', Blocks.JUNGLE_PLANKS)
                .input('S', Blocks.JUNGLE_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.JUNGLE_SLAB), FabricRecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.JUNGLE_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.MANGROVE_BARREL, 1)
                .input('P', Blocks.MANGROVE_PLANKS)
                .input('S', Blocks.MANGROVE_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.MANGROVE_SLAB), FabricRecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.MANGROVE_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.OAK_BARREL, 1)
                .input('P', Blocks.OAK_PLANKS)
                .input('S', Blocks.OAK_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.OAK_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.OAK_BARREL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Barrels.WARPED_BARREL, 1)
                .input('P', Blocks.WARPED_PLANKS)
                .input('S', Blocks.WARPED_SLAB)
                .pattern("PSP")
                .pattern("P P")
                .pattern("PSP")
                .criterion(FabricRecipeProvider.hasItem(Items.WARPED_PLANKS), FabricRecipeProvider.conditionsFromItem(Items.WARPED_PLANKS))
                .criterion(FabricRecipeProvider.hasItem(Items.WARPED_SLAB), FabricRecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Barrels.WARPED_BARREL)));

        // Beehives

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.ACACIA_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.ACACIA_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.ACACIA_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.BAMBOO_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.BAMBOO_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.BAMBOO_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.BIRCH_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.BIRCH_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.BIRCH_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.CHERRY_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.CHERRY_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.CHERRY_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.CRIMSON_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.CRIMSON_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.CRIMSON_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.DARK_OAK_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.DARK_OAK_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.DARK_OAK_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.JUNGLE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.JUNGLE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.JUNGLE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.MANGROVE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.MANGROVE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.MANGROVE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.SPRUCE_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.SPRUCE_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.SPRUCE_BEEHIVE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Beehives.WARPED_BEEHIVE)
                .input('H', Items.HONEYCOMB)
                .input('P', Blocks.WARPED_PLANKS)
                .pattern("PPP")
                .pattern("HHH")
                .pattern("PPP")
                .criterion(FabricRecipeProvider.hasItem(Items.HONEYCOMB), FabricRecipeProvider.conditionsFromItem(Items.HONEYCOMB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Beehives.WARPED_BEEHIVE)));

        // Cartography Tables
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.ACACIA_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.ACACIA_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.BIRCH_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.BIRCH_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.BIRCH_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.CHERRY_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.CHERRY_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.OAK_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.OAK_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, CartographyTables.WARPED_CARTOGRAPHY_TABLE)
                .input('@', Items.PAPER)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.PAPER), FabricRecipeProvider.conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(CartographyTables.WARPED_CARTOGRAPHY_TABLE)));

        // Chiseled Bookshelf
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF)
                .input('#', Blocks.ACACIA_PLANKS)
                .input('X', Blocks.ACACIA_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF)
                .input('#', Blocks.BAMBOO_PLANKS)
                .input('X', Blocks.BAMBOO_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF)
                .input('#', Blocks.BIRCH_PLANKS)
                .input('X', Blocks.BIRCH_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF)
                .input('#', Blocks.CHERRY_PLANKS)
                .input('X', Blocks.CHERRY_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF)
                .input('#', Blocks.DARK_OAK_PLANKS)
                .input('X', Blocks.DARK_OAK_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF)
                .input('#', Blocks.JUNGLE_PLANKS)
                .input('X', Blocks.JUNGLE_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF)
                .input('#', Blocks.MANGROVE_PLANKS)
                .input('X', Blocks.MANGROVE_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF)
                .input('#', Blocks.SPRUCE_PLANKS)
                .input('X', Blocks.SPRUCE_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF)
                .input('#', Blocks.CRIMSON_PLANKS)
                .input('X', Blocks.CRIMSON_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF)
                .input('#', Blocks.WARPED_PLANKS)
                .input('X', Blocks.WARPED_SLAB)
                .pattern("###")
                .pattern("XXX")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF)));

        // Composter
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.ACACIA_COMPOSTER)
                .input('#', Blocks.ACACIA_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.ACACIA_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.ACACIA_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.ACACIA_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.BAMBOO_COMPOSTER)
                .input('#', Blocks.BAMBOO_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BAMBOO_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BAMBOO_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.BAMBOO_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.BIRCH_COMPOSTER)
                .input('#', Blocks.BIRCH_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BIRCH_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BIRCH_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.BIRCH_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.CHERRY_COMPOSTER)
                .input('#', Blocks.CHERRY_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.CHERRY_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.CHERRY_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.CHERRY_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.CRIMSON_COMPOSTER)
                .input('#', Blocks.CRIMSON_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.CRIMSON_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.CRIMSON_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.CRIMSON_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.DARK_OAK_COMPOSTER)
                .input('#', Blocks.DARK_OAK_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.DARK_OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.DARK_OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.DARK_OAK_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.JUNGLE_COMPOSTER)
                .input('#', Blocks.JUNGLE_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.JUNGLE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.JUNGLE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.JUNGLE_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.MANGROVE_COMPOSTER)
                .input('#', Blocks.MANGROVE_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.MANGROVE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.MANGROVE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.MANGROVE_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.OAK_COMPOSTER)
                .input('#', Blocks.OAK_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.OAK_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.OAK_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.OAK_COMPOSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Composters.WARPED_COMPOSTER)
                .input('#', Blocks.WARPED_SLAB)
                .pattern("# #")
                .pattern("# #")
                .pattern("###")
                .criterion(FabricRecipeProvider.hasItem(Blocks.WARPED_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.WARPED_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Composters.WARPED_COMPOSTER)));

        // Crafting Table
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BAMBOO_CRAFTING_TABLE, Items.BAMBOO_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CHERRY_CRAFTING_TABLE, Items.CHERRY_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offer2x2CompactingRecipe(exporter, RecipeCategory.MISC, CraftingTables.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);

        // Fletching Table
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.ACACIA_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.ACACIA_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.BAMBOO_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.BAMBOO_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.CHERRY_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.CHERRY_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.CRIMSON_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.CRIMSON_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.DARK_OAK_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.DARK_OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.DARK_OAK_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.JUNGLE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.JUNGLE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.MANGROVE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.MANGROVE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.OAK_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.OAK_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.SPRUCE_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.SPRUCE_FLETCHING_TABLE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, FletchingTables.WARPED_FLETCHING_TABLE)
                .input('@', Items.FLINT)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("@@")
                .pattern("##")
                .pattern("##")
                .criterion(FabricRecipeProvider.hasItem(Items.FLINT), FabricRecipeProvider.conditionsFromItem(Items.FLINT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(FletchingTables.WARPED_FLETCHING_TABLE)));

        // Lecterns
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.ACACIA_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.ACACIA_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.ACACIA_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.BAMBOO_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.BAMBOO_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.BAMBOO_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.BIRCH_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.BIRCH_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.BIRCH_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.CHERRY_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.CHERRY_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.CHERRY_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.CRIMSON_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.CRIMSON_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.CRIMSON_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.DARK_OAK_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.DARK_OAK_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.DARK_OAK_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.JUNGLE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.JUNGLE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.JUNGLE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.MANGROVE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.MANGROVE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.MANGROVE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.SPRUCE_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.SPRUCE_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.SPRUCE_LECTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Lecterns.WARPED_LECTERN)
                .input('B', Blocks.BOOKSHELF)
                .input('S', Blocks.WARPED_SLAB)
                .pattern("SSS")
                .pattern(" B ")
                .pattern(" S ")
                .criterion(FabricRecipeProvider.hasItem(Items.BOOK), FabricRecipeProvider.conditionsFromItem(Items.BOOK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Lecterns.WARPED_LECTERN)));

        // Grindstones
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.ACACIA_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.ACACIA_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.ACACIA_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.BAMBOO_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.BAMBOO_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.BAMBOO_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.BIRCH_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.BIRCH_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.BIRCH_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.CHERRY_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.CHERRY_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CHERRY_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.CRIMSON_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.CRIMSON_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.CRIMSON_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.JUNGLE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.JUNGLE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.JUNGLE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.MANGROVE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.MANGROVE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.MANGROVE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.OAK_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.OAK_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.OAK_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.SPRUCE_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.STONE_SLAB)
                .input('#', Blocks.SPRUCE_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.STONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.SPRUCE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Grindstones.WARPED_GRINDSTONE)
                .input('I', Items.STICK)
                .input('-', Blocks.BLACKSTONE_SLAB)
                .input('#', Blocks.WARPED_PLANKS)
                .pattern("I-I")
                .pattern("# #")
                .criterion(FabricRecipeProvider.hasItem(Blocks.BLACKSTONE_SLAB), FabricRecipeProvider.conditionsFromItem(Blocks.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Grindstones.WARPED_GRINDSTONE)));
    }
}