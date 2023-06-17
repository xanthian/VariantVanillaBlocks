package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
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
    private static final TagKey<Block> CARTOGRAPHYTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"cartographytables"));
    private static final TagKey<Block> CHISELEDBOOKSHELVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"chiseledbookshelves"));
    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"composters"));
    private static final TagKey<Block> CRAFTINGTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"craftingtables"));
    private static final TagKey<Block> FLETCHINGTABLES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"fletchingtables"));
    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"grindstones"));
    private static final TagKey<Block> LECTERNS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"lecterns"));

    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> MINEABLE_PICKAXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> BEE_HOME = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:point_of_interest_type/bee_home"));
    private static final TagKey<Block> MC_BEEHIVES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:beehives"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Block> WORKBENCH = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:workbench"));
    private static final TagKey<Block> GUARDED_PIGLIN = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:guarded_by_piglins"));


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

        getOrCreateTagBuilder(CARTOGRAPHYTABLES)
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

        getOrCreateTagBuilder(CHISELEDBOOKSHELVES)
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

        getOrCreateTagBuilder(CRAFTINGTABLES)
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

        getOrCreateTagBuilder(FLETCHINGTABLES)
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

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(BARRELS)
                .addTag(BEEHIVES)
                .addTag(CARTOGRAPHYTABLES)
                .addTag(CHISELEDBOOKSHELVES)
                .addTag(COMPOSTERS)
                .addTag(CRAFTINGTABLES)
                .addTag(FLETCHINGTABLES)
                .addTag(LECTERNS);

        getOrCreateTagBuilder(MINEABLE_PICKAXE)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(BARRELS)
                .addTag(CARTOGRAPHYTABLES)
                .addTag(COMPOSTERS)
                .addTag(FLETCHINGTABLES)
                .addTag(LECTERNS)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(WORKBENCH)
                .addTag(CRAFTINGTABLES);

        getOrCreateTagBuilder(BEE_HOME)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(MC_BEEHIVES)
                .addTag(BEEHIVES);

        getOrCreateTagBuilder(GUARDED_PIGLIN)
                .addTag(BARRELS);
    }
}