package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantvanillablocks.utils.ModItemTags.*;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> C_BOOKSHELF = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bookshelves"));
    public static final TagKey<Item> C_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:chests"));
    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Item> C_WORKBENCH = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:workbench"));
    private static final TagKey<Item> C_WOODEN_BARRELS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_barrels"));
    public static final TagKey<Item> C_WOODEN_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_chests"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(BARRELS)
                    .add(Barrels.ACACIA_BARREL.asItem())
                    .add(Barrels.BAMBOO_BARREL.asItem())
                    .add(Barrels.BIRCH_BARREL.asItem())
                    .add(Barrels.CHERRY_BARREL.asItem())
                    .add(Barrels.CRIMSON_BARREL.asItem())
                    .add(Barrels.DARK_OAK_BARREL.asItem())
                    .add(Barrels.JUNGLE_BARREL.asItem())
                    .add(Barrels.MANGROVE_BARREL.asItem())
                    .add(Barrels.OAK_BARREL.asItem())
                    .add(Barrels.WARPED_BARREL.asItem());

            getOrCreateTagBuilder(BEEHIVES)
                    .add(Beehives.ACACIA_BEEHIVE.asItem())
                    .add(Beehives.BAMBOO_BEEHIVE.asItem())
                    .add(Beehives.BIRCH_BEEHIVE.asItem())
                    .add(Beehives.CHERRY_BEEHIVE.asItem())
                    .add(Beehives.CRIMSON_BEEHIVE.asItem())
                    .add(Beehives.DARK_OAK_BEEHIVE.asItem())
                    .add(Beehives.JUNGLE_BEEHIVE.asItem())
                    .add(Beehives.MANGROVE_BEEHIVE.asItem())
                    .add(Beehives.SPRUCE_BEEHIVE.asItem())
                    .add(Beehives.WARPED_BEEHIVE.asItem());

            getOrCreateTagBuilder(BOOKSHELVES)
                    .add(Bookshelves.ACACIA_BOOKSHELF.asItem())
                    .add(Bookshelves.BAMBOO_BOOKSHELF.asItem())
                    .add(Bookshelves.BIRCH_BOOKSHELF.asItem())
                    .add(Bookshelves.CHERRY_BOOKSHELF.asItem())
                    .add(Bookshelves.CRIMSON_BOOKSHELF.asItem())
                    .add(Bookshelves.DARK_OAK_BOOKSHELF.asItem())
                    .add(Bookshelves.JUNGLE_BOOKSHELF.asItem())
                    .add(Bookshelves.MANGROVE_BOOKSHELF.asItem())
                    .add(Bookshelves.SPRUCE_BOOKSHELF.asItem())
                    .add(Bookshelves.WARPED_BOOKSHELF.asItem());

            getOrCreateTagBuilder(CARTOGRAPHY_TABLES)
                    .add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.OAK_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.WARPED_CARTOGRAPHY_TABLE.asItem());
            
            getOrCreateTagBuilder(CHESTS)
                    .add(Chests.ACACIA_CHEST.asItem())
                    .add(Chests.BAMBOO_CHEST.asItem())
                    .add(Chests.BIRCH_CHEST.asItem())
                    .add(Chests.CHERRY_CHEST.asItem())
                    .add(Chests.CRIMSON_CHEST.asItem())
                    .add(Chests.DARK_OAK_CHEST.asItem())
                    .add(Chests.JUNGLE_CHEST.asItem())
                    .add(Chests.MANGROVE_CHEST.asItem())
                    .add(Chests.SPRUCE_CHEST.asItem())
                    .add(Chests.WARPED_CHEST.asItem());

            getOrCreateTagBuilder(CHISELED_BOOKSHELVES)
                    .add(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF.asItem());

            getOrCreateTagBuilder(COMPOSTERS)
                    .add(Composters.ACACIA_COMPOSTER.asItem())
                    .add(Composters.BAMBOO_COMPOSTER.asItem())
                    .add(Composters.BIRCH_COMPOSTER.asItem())
                    .add(Composters.CHERRY_COMPOSTER.asItem())
                    .add(Composters.CRIMSON_COMPOSTER.asItem())
                    .add(Composters.DARK_OAK_COMPOSTER.asItem())
                    .add(Composters.JUNGLE_COMPOSTER.asItem())
                    .add(Composters.MANGROVE_COMPOSTER.asItem())
                    .add(Composters.OAK_COMPOSTER.asItem())
                    .add(Composters.WARPED_COMPOSTER.asItem());

            getOrCreateTagBuilder(CRAFTING_TABLES)
                    .add(CraftingTables.ACACIA_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.BAMBOO_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.BIRCH_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.CHERRY_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.DARK_OAK_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.JUNGLE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.MANGROVE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.SPRUCE_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.WARPED_CRAFTING_TABLE.asItem());

            getOrCreateTagBuilder(FLETCHING_TABLES)
                    .add(FletchingTables.ACACIA_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.BAMBOO_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.CHERRY_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.CRIMSON_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.DARK_OAK_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.JUNGLE_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.MANGROVE_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.OAK_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.SPRUCE_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.WARPED_FLETCHING_TABLE.asItem());

            getOrCreateTagBuilder(GRINDSTONES)
                    .add(Grindstones.ACACIA_GRINDSTONE.asItem())
                    .add(Grindstones.BAMBOO_GRINDSTONE.asItem())
                    .add(Grindstones.BIRCH_GRINDSTONE.asItem())
                    .add(Grindstones.CHERRY_GRINDSTONE.asItem())
                    .add(Grindstones.CRIMSON_GRINDSTONE.asItem())
                    .add(Grindstones.JUNGLE_GRINDSTONE.asItem())
                    .add(Grindstones.MANGROVE_GRINDSTONE.asItem())
                    .add(Grindstones.OAK_GRINDSTONE.asItem())
                    .add(Grindstones.SPRUCE_GRINDSTONE.asItem())
                    .add(Grindstones.WARPED_GRINDSTONE.asItem());

            getOrCreateTagBuilder(LECTERNS)
                    .add(Lecterns.ACACIA_LECTERN.asItem())
                    .add(Lecterns.BAMBOO_LECTERN.asItem())
                    .add(Lecterns.BIRCH_LECTERN.asItem())
                    .add(Lecterns.CHERRY_LECTERN.asItem())
                    .add(Lecterns.CRIMSON_LECTERN.asItem())
                    .add(Lecterns.DARK_OAK_LECTERN.asItem())
                    .add(Lecterns.JUNGLE_LECTERN.asItem())
                    .add(Lecterns.MANGROVE_LECTERN.asItem())
                    .add(Lecterns.SPRUCE_LECTERN.asItem())
                    .add(Lecterns.WARPED_LECTERN.asItem());

            getOrCreateTagBuilder(SMITHING_TABLES)
                    .add(SmithingTables.ACACIA_SMITHING_TABLE.asItem())
                    .add(SmithingTables.BAMBOO_SMITHING_TABLE.asItem())
                    .add(SmithingTables.BIRCH_SMITHING_TABLE.asItem())
                    .add(SmithingTables.CHERRY_SMITHING_TABLE.asItem())
                    .add(SmithingTables.CRIMSON_SMITHING_TABLE.asItem())
                    .add(SmithingTables.DARK_OAK_SMITHING_TABLE.asItem())
                    .add(SmithingTables.JUNGLE_SMITHING_TABLE.asItem())
                    .add(SmithingTables.OAK_SMITHING_TABLE.asItem())
                    .add(SmithingTables.SPRUCE_SMITHING_TABLE.asItem())
                    .add(SmithingTables.WARPED_SMITHING_TABLE.asItem());

            getOrCreateTagBuilder(SMOKERS)
                    .add(Smokers.ACACIA_SMOKER.asItem())
                    .add(Smokers.BAMBOO_SMOKER.asItem())
                    .add(Smokers.BIRCH_SMOKER.asItem())
                    .add(Smokers.CHERRY_SMOKER.asItem())
                    .add(Smokers.CRIMSON_SMOKER.asItem())
                    .add(Smokers.DARK_OAK_SMOKER.asItem())
                    .add(Smokers.JUNGLE_SMOKER.asItem())
                    .add(Smokers.MANGROVE_SMOKER.asItem())
                    .add(Smokers.SPRUCE_SMOKER.asItem())
                    .add(Smokers.WARPED_SMOKER.asItem());

            getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                    .add(Barrels.CRIMSON_BARREL.asItem())
                    .add(Barrels.WARPED_BARREL.asItem())
                    .add(Beehives.CRIMSON_BEEHIVE.asItem())
                    .add(Beehives.WARPED_BEEHIVE.asItem())
                    .add(Bookshelves.CRIMSON_BOOKSHELF.asItem())
                    .add(Bookshelves.WARPED_BOOKSHELF.asItem())
                    .add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.WARPED_CARTOGRAPHY_TABLE.asItem())
                    .add(Chests.CRIMSON_CHEST.asItem())
                    .add(Chests.WARPED_CHEST.asItem())
                    .add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF.asItem())
                    .add(Composters.CRIMSON_COMPOSTER.asItem())
                    .add(Composters.WARPED_COMPOSTER.asItem())
                    .add(CraftingTables.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.WARPED_CRAFTING_TABLE.asItem())
                    .add(FletchingTables.CRIMSON_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.WARPED_FLETCHING_TABLE.asItem())
                    .add(Lecterns.CRIMSON_LECTERN.asItem())
                    .add(Lecterns.WARPED_LECTERN.asItem())
                    .add(SmithingTables.CRIMSON_SMITHING_TABLE.asItem())
                    .add(SmithingTables.WARPED_SMITHING_TABLE.asItem())
                    .add(Smokers.CRIMSON_SMOKER.asItem())
                    .add(Smokers.WARPED_SMOKER.asItem());
                    

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

            getOrCreateTagBuilder(BAMBOO_LOGS)
                    .add(Items.BAMBOO_BLOCK)
                    .add(Items.STRIPPED_BAMBOO_BLOCK);
        }
    }