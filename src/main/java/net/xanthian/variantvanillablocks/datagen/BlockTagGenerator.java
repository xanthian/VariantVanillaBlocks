package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantvanillablocks.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> BARRELS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"barrels"));
    private static final TagKey<Block> BEEHIVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"beehives"));
    private static final TagKey<Block> BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"bookshelves"));
    private static final TagKey<Block> CARTOGRAPHY_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"cartography_tables"));
    private static final TagKey<Block> CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"chests"));
    private static final TagKey<Block> CHISELED_BOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"chiseled_bookshelves"));
    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"composters"));
    private static final TagKey<Block> CRAFTING_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"crafting_tables"));
    private static final TagKey<Block> FLETCHING_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"fletching_tables"));
    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"grindstones"));
    private static final TagKey<Block> LECTERNS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"lecterns"));
    private static final TagKey<Block> SMITHING_TABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"smithing_tables"));
    private static final TagKey<Block> SMOKERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"smokers"));

    private static final TagKey<Block> BEE_HOME = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:point_of_interest_type/bee_home"));

    private static final TagKey<Block> C_BOOKSHELF = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:bookshelves"));
    private static final TagKey<Block> C_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:chests"));
    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Block> C_WORKBENCH = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:workbench"));
    private static final TagKey<Block> C_WOODEN_BARRELS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:wooden_barrels"));
    private static final TagKey<Block> C_WOODEN_CHESTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:wooden_chests"));


    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(BARRELS)
                .add(Barrels.ACACIA_BARREL)
                .add(Barrels.BAMBOO_BARREL)
                .add(Barrels.BIRCH_BARREL)
                .add(Barrels.CHERRY_BARREL)
                .add(Barrels.CRIMSON_BARREL)
                .add(Barrels.DARK_OAK_BARREL)
                .add(Barrels.JUNGLE_BARREL)
                .add(Barrels.MANGROVE_BARREL)
                .add(Barrels.OAK_BARREL)
                .add(Barrels.WARPED_BARREL);

        getOrCreateTagBuilder(BEEHIVES)
                .add(Beehives.ACACIA_BEEHIVE)
                .add(Beehives.BAMBOO_BEEHIVE)
                .add(Beehives.BIRCH_BEEHIVE)
                .add(Beehives.CHERRY_BEEHIVE)
                .add(Beehives.CRIMSON_BEEHIVE)
                .add(Beehives.DARK_OAK_BEEHIVE)
                .add(Beehives.JUNGLE_BEEHIVE)
                .add(Beehives.MANGROVE_BEEHIVE)
                .add(Beehives.SPRUCE_BEEHIVE)
                .add(Beehives.WARPED_BEEHIVE);

        getOrCreateTagBuilder(BOOKSHELVES)
                .add(Bookshelves.ACACIA_BOOKSHELF)
                .add(Bookshelves.BAMBOO_BOOKSHELF)
                .add(Bookshelves.BIRCH_BOOKSHELF)
                .add(Bookshelves.CHERRY_BOOKSHELF)
                .add(Bookshelves.CRIMSON_BOOKSHELF)
                .add(Bookshelves.DARK_OAK_BOOKSHELF)
                .add(Bookshelves.JUNGLE_BOOKSHELF)
                .add(Bookshelves.MANGROVE_BOOKSHELF)
                .add(Bookshelves.SPRUCE_BOOKSHELF)
                .add(Bookshelves.WARPED_BOOKSHELF);

        getOrCreateTagBuilder(CARTOGRAPHY_TABLES)
                .add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE)
                .add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE)
                .add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE)
                .add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE)
                .add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE)
                .add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.OAK_CARTOGRAPHY_TABLE)
                .add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE)
                .add(CartographyTables.WARPED_CARTOGRAPHY_TABLE);

        getOrCreateTagBuilder(CHESTS)
                .add(Chests.ACACIA_CHEST)
                .add(Chests.BAMBOO_CHEST)
                .add(Chests.BIRCH_CHEST)
                .add(Chests.CHERRY_CHEST)
                .add(Chests.CRIMSON_CHEST)
                .add(Chests.DARK_OAK_CHEST)
                .add(Chests.JUNGLE_CHEST)
                .add(Chests.MANGROVE_CHEST)
                .add(Chests.SPRUCE_CHEST)
                .add(Chests.WARPED_CHEST);

        getOrCreateTagBuilder(CHISELED_BOOKSHELVES)
                .add(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF)
                .add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF);

        getOrCreateTagBuilder(COMPOSTERS)
                .add(Composters.ACACIA_COMPOSTER)
                .add(Composters.BAMBOO_COMPOSTER)
                .add(Composters.BIRCH_COMPOSTER)
                .add(Composters.CHERRY_COMPOSTER)
                .add(Composters.CRIMSON_COMPOSTER)
                .add(Composters.DARK_OAK_COMPOSTER)
                .add(Composters.JUNGLE_COMPOSTER)
                .add(Composters.MANGROVE_COMPOSTER)
                .add(Composters.OAK_COMPOSTER)
                .add(Composters.WARPED_COMPOSTER);

        getOrCreateTagBuilder(CRAFTING_TABLES)
                .add(CraftingTables.ACACIA_CRAFTING_TABLE)
                .add(CraftingTables.BAMBOO_CRAFTING_TABLE)
                .add(CraftingTables.BIRCH_CRAFTING_TABLE)
                .add(CraftingTables.CHERRY_CRAFTING_TABLE)
                .add(CraftingTables.CRIMSON_CRAFTING_TABLE)
                .add(CraftingTables.DARK_OAK_CRAFTING_TABLE)
                .add(CraftingTables.JUNGLE_CRAFTING_TABLE)
                .add(CraftingTables.MANGROVE_CRAFTING_TABLE)
                .add(CraftingTables.SPRUCE_CRAFTING_TABLE)
                .add(CraftingTables.WARPED_CRAFTING_TABLE);

        getOrCreateTagBuilder(FLETCHING_TABLES)
                .add(FletchingTables.ACACIA_FLETCHING_TABLE)
                .add(FletchingTables.BAMBOO_FLETCHING_TABLE)
                .add(FletchingTables.CHERRY_FLETCHING_TABLE)
                .add(FletchingTables.CRIMSON_FLETCHING_TABLE)
                .add(FletchingTables.DARK_OAK_FLETCHING_TABLE)
                .add(FletchingTables.JUNGLE_FLETCHING_TABLE)
                .add(FletchingTables.MANGROVE_FLETCHING_TABLE)
                .add(FletchingTables.OAK_FLETCHING_TABLE)
                .add(FletchingTables.SPRUCE_FLETCHING_TABLE)
                .add(FletchingTables.WARPED_FLETCHING_TABLE);

        getOrCreateTagBuilder(GRINDSTONES)
                .add(Grindstones.ACACIA_GRINDSTONE)
                .add(Grindstones.BAMBOO_GRINDSTONE)
                .add(Grindstones.BIRCH_GRINDSTONE)
                .add(Grindstones.CHERRY_GRINDSTONE)
                .add(Grindstones.CRIMSON_GRINDSTONE)
                .add(Grindstones.JUNGLE_GRINDSTONE)
                .add(Grindstones.MANGROVE_GRINDSTONE)
                .add(Grindstones.OAK_GRINDSTONE)
                .add(Grindstones.SPRUCE_GRINDSTONE)
                .add(Grindstones.WARPED_GRINDSTONE);

        getOrCreateTagBuilder(LECTERNS)
                .add(Lecterns.ACACIA_LECTERN)
                .add(Lecterns.BAMBOO_LECTERN)
                .add(Lecterns.BIRCH_LECTERN)
                .add(Lecterns.CHERRY_LECTERN)
                .add(Lecterns.CRIMSON_LECTERN)
                .add(Lecterns.DARK_OAK_LECTERN)
                .add(Lecterns.JUNGLE_LECTERN)
                .add(Lecterns.MANGROVE_LECTERN)
                .add(Lecterns.SPRUCE_LECTERN)
                .add(Lecterns.WARPED_LECTERN);

        getOrCreateTagBuilder(SMITHING_TABLES)
                .add(SmithingTables.ACACIA_SMITHING_TABLE)
                .add(SmithingTables.BAMBOO_SMITHING_TABLE)
                .add(SmithingTables.BIRCH_SMITHING_TABLE)
                .add(SmithingTables.CHERRY_SMITHING_TABLE)
                .add(SmithingTables.CRIMSON_SMITHING_TABLE)
                .add(SmithingTables.DARK_OAK_SMITHING_TABLE)
                .add(SmithingTables.JUNGLE_SMITHING_TABLE)
                .add(SmithingTables.OAK_SMITHING_TABLE)
                .add(SmithingTables.SPRUCE_SMITHING_TABLE)
                .add(SmithingTables.WARPED_SMITHING_TABLE);

        getOrCreateTagBuilder(SMOKERS)
                .add(Smokers.ACACIA_SMOKER)
                .add(Smokers.BAMBOO_SMOKER)
                .add(Smokers.BIRCH_SMOKER)
                .add(Smokers.CHERRY_SMOKER)
                .add(Smokers.CRIMSON_SMOKER)
                .add(Smokers.DARK_OAK_SMOKER)
                .add(Smokers.JUNGLE_SMOKER)
                .add(Smokers.MANGROVE_SMOKER)
                .add(Smokers.SPRUCE_SMOKER)
                .add(Smokers.WARPED_SMOKER);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(BARRELS)
                .addTag(BEEHIVES)
                .addTag(CARTOGRAPHY_TABLES)
                .addTag(CHESTS)
                .addTag(CHISELED_BOOKSHELVES)
                .addTag(COMPOSTERS)
                .addTag(CRAFTING_TABLES)
                .addTag(FLETCHING_TABLES)
                .addTag(LECTERNS)
                .addTag(SMITHING_TABLES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(GRINDSTONES)
                .addTag(SMOKERS);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(BARRELS)
                .addTag(CARTOGRAPHY_TABLES)
                .addTag(COMPOSTERS)
                .addTag(FLETCHING_TABLES)
                .addTag(GRINDSTONES)
                .addTag(LECTERNS)
                .addTag(SMITHING_TABLES)
                .addTag(SMOKERS);

        getOrCreateTagBuilder(C_WORKBENCH)
                .addTag(CRAFTING_TABLES);

        getOrCreateTagBuilder(C_BOOKSHELF)
                .addTag(BOOKSHELVES);

        getOrCreateTagBuilder(C_WOODEN_BARRELS)
                .addTag(BARRELS);

        getOrCreateTagBuilder(C_CHESTS)
                .addTag(CHESTS);

        getOrCreateTagBuilder(C_WOODEN_CHESTS)
                .addTag(CHESTS);

        getOrCreateTagBuilder(BEE_HOME)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(BlockTags.BEEHIVES)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
                .addTag(BARRELS)
                .addTag(CHESTS);

        getOrCreateTagBuilder(BlockTags.ENCHANTMENT_POWER_PROVIDER)
                .addTag(BOOKSHELVES);


    }
}