package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;

import net.xanthian.variantvanillablocks.block.*;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    /**
     Copy from {@link VanillaBlockLootTableGenerator}
     **/

    @Override
    public void generate() {

        addDrop(Barrels.ACACIA_BARREL, this::nameableContainerDrops);
        addDrop(Barrels.BAMBOO_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.BIRCH_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.CHERRY_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.CRIMSON_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.DARK_OAK_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.JUNGLE_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.MANGROVE_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.OAK_BARREL,this::nameableContainerDrops);
        addDrop(Barrels.WARPED_BARREL,this::nameableContainerDrops);

        addDrop(Beehives.ACACIA_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.BAMBOO_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.BIRCH_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.CHERRY_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.CRIMSON_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.DARK_OAK_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.JUNGLE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.MANGROVE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.SPRUCE_BEEHIVE, BlockLootTableGenerator::beehiveDrops);
        addDrop(Beehives.WARPED_BEEHIVE, BlockLootTableGenerator::beehiveDrops);

        addDrop(Bookshelves.ACACIA_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.BAMBOO_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.BIRCH_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.CHERRY_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.DARK_OAK_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.JUNGLE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.MANGROVE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.SPRUCE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.CRIMSON_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.WARPED_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        addDrop(Bookshelves.MANGROVE_BOOKSHELF, (Block block) -> this.drops(block, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));

        addDrop(CartographyTables.ACACIA_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.BIRCH_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.CHERRY_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.OAK_CARTOGRAPHY_TABLE);
        addDrop(CartographyTables.WARPED_CARTOGRAPHY_TABLE);

        addDropWithSilkTouch(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF);
        addDropWithSilkTouch(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF);

        addDrop(Composters.ACACIA_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.ACACIA_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.BAMBOO_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.BAMBOO_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.BIRCH_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.BIRCH_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.CHERRY_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.CHERRY_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.CRIMSON_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.CRIMSON_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.DARK_OAK_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.DARK_OAK_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.JUNGLE_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.JUNGLE_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.MANGROVE_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.MANGROVE_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.OAK_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.OAK_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));
        addDrop(Composters.WARPED_COMPOSTER, (Block block) -> LootTable.builder().pool(LootPool.builder().with(this.applyExplosionDecay(block, ItemEntry.builder(Composters.WARPED_COMPOSTER)))).pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL)).conditionally(BlockStatePropertyLootCondition.builder(block).properties(StatePredicate.Builder.create().exactMatch(ComposterBlock.LEVEL, 8)))));

        addDrop(CraftingTables.ACACIA_CRAFTING_TABLE);
        addDrop(CraftingTables.BAMBOO_CRAFTING_TABLE);
        addDrop(CraftingTables.BIRCH_CRAFTING_TABLE);
        addDrop(CraftingTables.CHERRY_CRAFTING_TABLE);
        addDrop(CraftingTables.DARK_OAK_CRAFTING_TABLE);
        addDrop(CraftingTables.JUNGLE_CRAFTING_TABLE);
        addDrop(CraftingTables.MANGROVE_CRAFTING_TABLE);
        addDrop(CraftingTables.SPRUCE_CRAFTING_TABLE);
        addDrop(CraftingTables.CRIMSON_CRAFTING_TABLE);
        addDrop(CraftingTables.WARPED_CRAFTING_TABLE);
        addDrop(CraftingTables.MANGROVE_CRAFTING_TABLE);

        addDrop(FletchingTables.ACACIA_FLETCHING_TABLE);
        addDrop(FletchingTables.BAMBOO_FLETCHING_TABLE);
        addDrop(FletchingTables.CHERRY_FLETCHING_TABLE);
        addDrop(FletchingTables.CRIMSON_FLETCHING_TABLE);
        addDrop(FletchingTables.DARK_OAK_FLETCHING_TABLE);
        addDrop(FletchingTables.JUNGLE_FLETCHING_TABLE);
        addDrop(FletchingTables.MANGROVE_FLETCHING_TABLE);
        addDrop(FletchingTables.OAK_FLETCHING_TABLE);
        addDrop(FletchingTables.SPRUCE_FLETCHING_TABLE);
        addDrop(FletchingTables.WARPED_FLETCHING_TABLE);

        addDrop(Grindstones.ACACIA_GRINDSTONE);
        addDrop(Grindstones.BAMBOO_GRINDSTONE);
        addDrop(Grindstones.BIRCH_GRINDSTONE);
        addDrop(Grindstones.CHERRY_GRINDSTONE);
        addDrop(Grindstones.CRIMSON_GRINDSTONE);
        addDrop(Grindstones.JUNGLE_GRINDSTONE);
        addDrop(Grindstones.MANGROVE_GRINDSTONE);
        addDrop(Grindstones.OAK_GRINDSTONE);
        addDrop(Grindstones.SPRUCE_GRINDSTONE);
        addDrop(Grindstones.WARPED_GRINDSTONE);

        addDrop(Lecterns.ACACIA_LECTERN);
        addDrop(Lecterns.BAMBOO_LECTERN);
        addDrop(Lecterns.BIRCH_LECTERN);
        addDrop(Lecterns.CHERRY_LECTERN);
        addDrop(Lecterns.CRIMSON_LECTERN);
        addDrop(Lecterns.DARK_OAK_LECTERN);
        addDrop(Lecterns.JUNGLE_LECTERN);
        addDrop(Lecterns.MANGROVE_LECTERN);
        addDrop(Lecterns.SPRUCE_LECTERN);
        addDrop(Lecterns.WARPED_LECTERN);

        addDrop(SmithingTables.ACACIA_SMITHING_TABLE);
        addDrop(SmithingTables.BAMBOO_SMITHING_TABLE);
        addDrop(SmithingTables.BIRCH_SMITHING_TABLE);
        addDrop(SmithingTables.CHERRY_SMITHING_TABLE);
        addDrop(SmithingTables.CRIMSON_SMITHING_TABLE);
        addDrop(SmithingTables.DARK_OAK_SMITHING_TABLE);
        addDrop(SmithingTables.JUNGLE_SMITHING_TABLE);
        addDrop(SmithingTables.OAK_SMITHING_TABLE);
        addDrop(SmithingTables.SPRUCE_SMITHING_TABLE);
        addDrop(SmithingTables.WARPED_SMITHING_TABLE);

        addDrop(Smokers.ACACIA_SMOKER, this::nameableContainerDrops);
        addDrop(Smokers.BAMBOO_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.BIRCH_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.CHERRY_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.CRIMSON_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.DARK_OAK_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.JUNGLE_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.MANGROVE_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.SPRUCE_SMOKER,this::nameableContainerDrops);
        addDrop(Smokers.WARPED_SMOKER,this::nameableContainerDrops);

    }
}