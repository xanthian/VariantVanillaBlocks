package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.variantvanillablocks.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> BARRELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"barrels"));
    private static final TagKey<Item> BEEHIVES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"beehives"));
    private static final TagKey<Item> CARTOGRAPHYTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"cartographytables"));
    private static final TagKey<Item> CHISELEDBOOKSHELVES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"chiseledbookshelves"));
    private static final TagKey<Item> COMPOSTERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"composters"));
    private static final TagKey<Item> CRAFTINGTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"craftingtables"));
    private static final TagKey<Item> FLETCHINGTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"fletchingtables"));
    private static final TagKey<Item> LECTERNS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"lecterns"));
    private static final TagKey<Item> GRINDSTONES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"grindstones"));

    private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
    private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Item> WORKBENCH = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:workbench"));


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

            getOrCreateTagBuilder(CARTOGRAPHYTABLES)
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

            getOrCreateTagBuilder(CHISELEDBOOKSHELVES)
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

            getOrCreateTagBuilder(CRAFTINGTABLES)
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

            getOrCreateTagBuilder(FLETCHINGTABLES)
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

            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Barrels.CRIMSON_BARREL.asItem())
                    .add(Barrels.WARPED_BARREL.asItem())
                    .add(Beehives.CRIMSON_BEEHIVE.asItem())
                    .add(Beehives.WARPED_BEEHIVE.asItem())
                    .add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE.asItem())
                    .add(CartographyTables.WARPED_CARTOGRAPHY_TABLE.asItem())
                    .add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF.asItem())
                    .add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF.asItem())
                    .add(Composters.CRIMSON_COMPOSTER.asItem())
                    .add(Composters.WARPED_COMPOSTER.asItem())
                    .add(CraftingTables.CRIMSON_CRAFTING_TABLE.asItem())
                    .add(CraftingTables.WARPED_CRAFTING_TABLE.asItem())
                    .add(FletchingTables.CRIMSON_FLETCHING_TABLE.asItem())
                    .add(FletchingTables.WARPED_FLETCHING_TABLE.asItem())
                    .add(Lecterns.CRIMSON_LECTERN.asItem())
                    .add(Lecterns.WARPED_LECTERN.asItem());

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(BARRELS)
                    .addTag(CARTOGRAPHYTABLES)
                    .addTag(COMPOSTERS)
                    .addTag(CRAFTINGTABLES)
                    .addTag(FLETCHINGTABLES)
                    .addTag(LECTERNS)
                    .addTag(GRINDSTONES);

            getOrCreateTagBuilder(WORKBENCH)
                    .addTag(CRAFTINGTABLES);
        }
    }