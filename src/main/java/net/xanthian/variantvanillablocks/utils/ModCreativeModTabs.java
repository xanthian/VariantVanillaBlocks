package net.xanthian.variantvanillablocks.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.*;

public class ModCreativeModTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Initialise.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VVB_TAB = CREATIVE_MODE_TABS.register("variantvanillablocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE.get()))
                    .title(Component.literal("Variant Vanilla Blocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(Barrels.ACACIA_BARREL.get());
                        pOutput.accept(Beehives.ACACIA_BEEHIVE.get());
                        pOutput.accept(Bookshelves.ACACIA_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.ACACIA_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.ACACIA_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.ACACIA_COMPOSTER.get());
                        pOutput.accept(CraftingTables.ACACIA_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.ACACIA_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.ACACIA_GRINDSTONE.get());
                        pOutput.accept(Lecterns.ACACIA_LECTERN.get());
                        pOutput.accept(SmithingTables.ACACIA_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.ACACIA_SMOKER.get());

                        pOutput.accept(Barrels.BAMBOO_BARREL.get());
                        pOutput.accept(Beehives.BAMBOO_BEEHIVE.get());
                        pOutput.accept(Bookshelves.BAMBOO_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.BAMBOO_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.BAMBOO_COMPOSTER.get());
                        pOutput.accept(CraftingTables.BAMBOO_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.BAMBOO_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.BAMBOO_GRINDSTONE.get());
                        pOutput.accept(Lecterns.BAMBOO_LECTERN.get());
                        pOutput.accept(SmithingTables.BAMBOO_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.BAMBOO_SMOKER.get());

                        pOutput.accept(Barrels.BIRCH_BARREL.get());
                        pOutput.accept(Beehives.BIRCH_BEEHIVE.get());
                        pOutput.accept(Bookshelves.BIRCH_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.BIRCH_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.BIRCH_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.BIRCH_COMPOSTER.get());
                        pOutput.accept(CraftingTables.BIRCH_CRAFTING_TABLE.get());
                        pOutput.accept(Blocks.FLETCHING_TABLE); // Birch
                        pOutput.accept(Grindstones.BIRCH_GRINDSTONE.get());
                        pOutput.accept(Lecterns.BIRCH_LECTERN.get());
                        pOutput.accept(SmithingTables.BIRCH_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.BIRCH_SMOKER.get());

                        pOutput.accept(Barrels.CHERRY_BARREL.get());
                        pOutput.accept(Beehives.CHERRY_BEEHIVE.get());
                        pOutput.accept(Bookshelves.CHERRY_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.CHERRY_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.CHERRY_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.CHERRY_COMPOSTER.get());
                        pOutput.accept(CraftingTables.CHERRY_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.CHERRY_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.CHERRY_GRINDSTONE.get());
                        pOutput.accept(Lecterns.CHERRY_LECTERN.get());
                        pOutput.accept(SmithingTables.CHERRY_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.CHERRY_SMOKER.get());

                        pOutput.accept(Barrels.CRIMSON_BARREL.get());
                        pOutput.accept(Beehives.CRIMSON_BEEHIVE.get());
                        pOutput.accept(Bookshelves.CRIMSON_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.CRIMSON_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.CRIMSON_COMPOSTER.get());
                        pOutput.accept(CraftingTables.CRIMSON_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.CRIMSON_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.CRIMSON_GRINDSTONE.get());
                        pOutput.accept(Lecterns.CRIMSON_LECTERN.get());
                        pOutput.accept(SmithingTables.CRIMSON_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.CRIMSON_SMOKER.get());

                        pOutput.accept(Barrels.DARK_OAK_BARREL.get());
                        pOutput.accept(Beehives.DARK_OAK_BEEHIVE.get());
                        pOutput.accept(Bookshelves.DARK_OAK_BOOKSHELF.get());
                        pOutput.accept(Blocks.CARTOGRAPHY_TABLE); // Dark Oak
                        pOutput.accept(Chests.DARK_OAK_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.DARK_OAK_COMPOSTER.get());
                        pOutput.accept(CraftingTables.DARK_OAK_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.DARK_OAK_FLETCHING_TABLE.get());
                        pOutput.accept(Blocks.GRINDSTONE); // Dark Oak
                        pOutput.accept(Lecterns.DARK_OAK_LECTERN.get());
                        pOutput.accept(SmithingTables.DARK_OAK_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.DARK_OAK_SMOKER.get());

                        pOutput.accept(Barrels.JUNGLE_BARREL.get());
                        pOutput.accept(Beehives.JUNGLE_BEEHIVE.get());
                        pOutput.accept(Bookshelves.JUNGLE_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.JUNGLE_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.JUNGLE_COMPOSTER.get());
                        pOutput.accept(CraftingTables.JUNGLE_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.JUNGLE_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.JUNGLE_GRINDSTONE.get());
                        pOutput.accept(Lecterns.JUNGLE_LECTERN.get());
                        pOutput.accept(SmithingTables.JUNGLE_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.JUNGLE_SMOKER.get());

                        pOutput.accept(Barrels.MANGROVE_BARREL.get());
                        pOutput.accept(Beehives.MANGROVE_BEEHIVE.get());
                        pOutput.accept(Bookshelves.MANGROVE_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.MANGROVE_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.MANGROVE_COMPOSTER.get());
                        pOutput.accept(CraftingTables.MANGROVE_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.MANGROVE_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.MANGROVE_GRINDSTONE.get());
                        pOutput.accept(Lecterns.MANGROVE_LECTERN.get());
                        pOutput.accept(Blocks.SMITHING_TABLE);
                        pOutput.accept(Smokers.MANGROVE_SMOKER.get());

                        pOutput.accept(Barrels.OAK_BARREL.get());
                        pOutput.accept(Blocks.BEEHIVE); // Oak
                        pOutput.accept(Blocks.BOOKSHELF); // Oak
                        pOutput.accept(CartographyTables.OAK_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Blocks.CHEST);
                        pOutput.accept(Blocks.CHISELED_BOOKSHELF); // Oak
                        pOutput.accept(Composters.OAK_COMPOSTER.get());
                        pOutput.accept(Blocks.CRAFTING_TABLE);
                        pOutput.accept(FletchingTables.OAK_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.OAK_GRINDSTONE.get());
                        pOutput.accept(Blocks.LECTERN); // Oak
                        pOutput.accept(SmithingTables.OAK_SMITHING_TABLE.get());
                        pOutput.accept(Blocks.SMOKER);

                        pOutput.accept(Blocks.BARREL); // Spruce
                        pOutput.accept(Beehives.SPRUCE_BEEHIVE.get());
                        pOutput.accept(Bookshelves.SPRUCE_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.SPRUCE_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Blocks.COMPOSTER); // Spruce
                        pOutput.accept(CraftingTables.SPRUCE_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.SPRUCE_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.SPRUCE_GRINDSTONE.get());
                        pOutput.accept(Lecterns.SPRUCE_LECTERN.get());
                        pOutput.accept(SmithingTables.SPRUCE_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.SPRUCE_SMOKER.get());

                        pOutput.accept(Barrels.WARPED_BARREL.get());
                        pOutput.accept(Beehives.WARPED_BEEHIVE.get());
                        pOutput.accept(Bookshelves.WARPED_BOOKSHELF.get());
                        pOutput.accept(CartographyTables.WARPED_CARTOGRAPHY_TABLE.get());
                        pOutput.accept(Chests.WARPED_CHEST.get());
                        pOutput.accept(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF.get());
                        pOutput.accept(Composters.WARPED_COMPOSTER.get());
                        pOutput.accept(CraftingTables.WARPED_CRAFTING_TABLE.get());
                        pOutput.accept(FletchingTables.WARPED_FLETCHING_TABLE.get());
                        pOutput.accept(Grindstones.WARPED_GRINDSTONE.get());
                        pOutput.accept(Lecterns.WARPED_LECTERN.get());
                        pOutput.accept(SmithingTables.WARPED_SMITHING_TABLE.get());
                        pOutput.accept(Smokers.WARPED_SMOKER.get());
                    })
                    .build());
}