package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
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
    private static final TagKey<Item> C_BOOKSHELF = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bookshelves"));
    private static final TagKey<Item> C_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:chests"));
    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Item> C_WORKBENCH = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:workbench"));
    private static final TagKey<Item> C_WOODEN_BARRELS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_barrels"));
    private static final TagKey<Item> C_WOODEN_CHESTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_chests"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for (Block barrel : Barrels.MOD_BARRELS.values()) {
            getOrCreateTagBuilder(BARRELS)
                    .add(barrel.asItem());
        }

        for (Block beehive : Beehives.MOD_BEEHIVES.values()) {
            getOrCreateTagBuilder(BEEHIVES)
                    .add(beehive.asItem());
        }

        for (Block bookshelf : Bookshelves.MOD_BOOKSHELVES.values()) {
            getOrCreateTagBuilder(BOOKSHELVES)
                    .add(bookshelf.asItem());
        }

        for (Block cartTable : CartographyTables.MOD_CARTOGRAPHY_TABLES.values()) {
            getOrCreateTagBuilder(CARTOGRAPHY_TABLES)
                    .add(cartTable.asItem());
        }

        for (Block chest : Chests.MOD_CHESTS.values()) {
            getOrCreateTagBuilder(CHESTS)
                    .add(chest.asItem());
        }

        for (Block cBookshelf : ChiseledBookshelves.MOD_CHISELED_BOOKSHELVES.values()) {
            getOrCreateTagBuilder(CHISELED_BOOKSHELVES)
                    .add(cBookshelf.asItem());
        }

        for (Block composter : Composters.MOD_COMPOSTERS.values()) {
            getOrCreateTagBuilder(COMPOSTERS)
                    .add(composter.asItem());
        }

        for (Block craftTable : CraftingTables.MOD_CRAFTING_TABLES.values()) {
            getOrCreateTagBuilder(CRAFTING_TABLES)
                    .add(craftTable.asItem());
        }

        for (Block fletchTable : FletchingTables.MOD_FLETCHING_TABLES.values()) {
            getOrCreateTagBuilder(FLETCHING_TABLES)
                    .add(fletchTable.asItem());
        }

        for (Block grindstone : Grindstones.MOD_GRINDSTONES.values()) {
            getOrCreateTagBuilder(GRINDSTONES)
                    .add(grindstone.asItem());
        }

        for (Block lectern : Lecterns.MOD_LECTERNS.values()) {
            getOrCreateTagBuilder(LECTERNS)
                    .add(lectern.asItem());
        }

        for (Block smithTable : SmithingTables.MOD_SMITHING_TABLES.values()) {
            getOrCreateTagBuilder(SMITHING_TABLES)
                    .add(smithTable.asItem());
        }

        for (Block smoker : Smokers.MOD_SMOKERS.values()) {
            getOrCreateTagBuilder(SMOKERS)
                    .add(smoker.asItem());
        }

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