package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.block.*;

import static net.xanthian.variantvanillablocks.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    private static final TagKey<Block> BARRELS = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "barrels"));
    private static final TagKey<Block> BEEHIVES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "beehives"));
    private static final TagKey<Block> BOOKSHELVES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "bookshelves"));
    private static final TagKey<Block> CARTOGRAPHY_TABLES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "cartography_tables"));
    private static final TagKey<Block> CHESTS = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "chests"));
    private static final TagKey<Block> COMPOSTERS = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "composters"));
    private static final TagKey<Block> CRAFTING_TABLES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "crafting_tables"));
    private static final TagKey<Block> FLETCHING_TABLES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "fletching_tables"));
    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "grindstones"));
    private static final TagKey<Block> LECTERNS = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "lecterns"));
    private static final TagKey<Block> SMITHING_TABLES = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "smithing_tables"));
    private static final TagKey<Block> SMOKERS = TagKey.of(Registry.BLOCK.getKey(), new Identifier(MOD_ID, "smokers"));
    private static final TagKey<Block> BEE_HOME = TagKey.of(Registry.BLOCK.getKey(), new Identifier("minecraft:point_of_interest_type/bee_home"));
    private static final TagKey<Block> C_BOOKSHELF = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:bookshelves"));
    private static final TagKey<Block> C_CHESTS = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:chests"));
    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Block> C_WORKBENCH = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:workbench"));
    private static final TagKey<Block> C_WOODEN_BARRELS = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:wooden_barrels"));
    private static final TagKey<Block> C_WOODEN_CHESTS = TagKey.of(Registry.BLOCK.getKey(), new Identifier("c:wooden_chests"));

    public BlockTagGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateTags() {

        for (Block block : Barrels.MOD_BARRELS.values()) {
            getOrCreateTagBuilder(BARRELS)
                    .add(block);
        }

        for (Block block : Beehives.MOD_BEEHIVES.values()) {
            getOrCreateTagBuilder(BEEHIVES)
                    .add(block);
        }

        for (Block block : Bookshelves.MOD_BOOKSHELVES.values()) {
            getOrCreateTagBuilder(BOOKSHELVES)
                    .add(block);
        }

        for (Block block : CartographyTables.MOD_CARTOGRAPHY_TABLES.values()) {
            getOrCreateTagBuilder(CARTOGRAPHY_TABLES)
                    .add(block);
        }

        for (Block block : Chests.MOD_CHESTS.values()) {
            getOrCreateTagBuilder(CHESTS)
                    .add(block);
        }

        for (Block block : Composters.MOD_COMPOSTERS.values()) {
            getOrCreateTagBuilder(COMPOSTERS)
                    .add(block);
        }

        for (Block block : CraftingTables.MOD_CRAFTING_TABLES.values()) {
            getOrCreateTagBuilder(CRAFTING_TABLES)
                    .add(block);
        }

        for (Block block : FletchingTables.MOD_FLETCHING_TABLES.values()) {
            getOrCreateTagBuilder(FLETCHING_TABLES)
                    .add(block);
        }

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            getOrCreateTagBuilder(GRINDSTONES)
                    .add(block);
        }

        for (Block block : Lecterns.MOD_LECTERNS.values()) {
            getOrCreateTagBuilder(LECTERNS)
                    .add(block);
        }

        for (Block block : SmithingTables.MOD_SMITHING_TABLES.values()) {
            getOrCreateTagBuilder(SMITHING_TABLES)
                    .add(block);
        }

        for (Block block : Smokers.MOD_SMOKERS.values()) {
            getOrCreateTagBuilder(SMOKERS)
                    .add(block);
        }

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(BARRELS)
                .addTag(BEEHIVES)
                .addTag(CARTOGRAPHY_TABLES)
                .addTag(CHESTS)
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
    }
}