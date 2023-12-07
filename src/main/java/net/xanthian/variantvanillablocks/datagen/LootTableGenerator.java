package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.block.ComposterBlock;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.StatePredicate;
import net.xanthian.variantvanillablocks.block.*;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataGenerator dataOutput) {
        super(dataOutput);
    }

    @Override
    protected void generateBlockLootTables() {

        for (Block block : Barrels.MOD_BARRELS.values()) {
            addDrop(block, BlockLootTableGenerator::nameableContainerDrops);
        }

        for (Block block : Beehives.MOD_BEEHIVES.values()) {
            addDrop(block, BlockLootTableGenerator::beehiveDrops);
        }

        for (Block block : Bookshelves.MOD_BOOKSHELVES.values()) {
            addDrop(block, (Block bookshelf) -> drops(bookshelf, Items.BOOK, ConstantLootNumberProvider.create(3.0f)));
        }

        for (Block block : CartographyTables.MOD_CARTOGRAPHY_TABLES.values()) {
            addDrop(block);
        }

        for (Block block : Chests.MOD_CHESTS.values()) {
            addDrop(block, BlockLootTableGenerator::nameableContainerDrops);
        }

        for (Block block : Composters.MOD_COMPOSTERS.values()) {
            addDrop(block, composter ->
                    LootTable.builder().pool(LootPool.builder().with(applyExplosionDecay(composter, ItemEntry.builder(block))))
                            .pool(LootPool.builder().with(ItemEntry.builder(Items.BONE_MEAL))
                                    .conditionally(BlockStatePropertyLootCondition.builder(composter).properties(StatePredicate.Builder.create()
                                            .exactMatch(ComposterBlock.LEVEL, 8)))));
        }

        for (Block block : CraftingTables.MOD_CRAFTING_TABLES.values()) {
            addDrop(block);
        }

        for (Block block : FletchingTables.MOD_FLETCHING_TABLES.values()) {
            addDrop(block);
        }

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            addDrop(block);
        }

        for (Block block : Lecterns.MOD_LECTERNS.values()) {
            addDrop(block);
        }

        for (Block block : SmithingTables.MOD_SMITHING_TABLES.values()) {
            addDrop(block);
        }

        for (Block block : Smokers.MOD_SMOKERS.values()) {
            addDrop(block, BlockLootTableGenerator::nameableContainerDrops);
        }
    }
}