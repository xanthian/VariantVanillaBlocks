package net.xanthian.variantvanillablocks;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.utils.ModPOITypes;
import net.xanthian.variantvanillablocks.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantvanillablocks";

    public static final RegistryKey<ItemGroup> ITEM_GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MOD_ID, "variantvanillablocks"));

    @Override
    public void onInitialize() {

        // Custom Item Group
        Registry.register(Registries.ITEM_GROUP, ITEM_GROUP, FabricItemGroup.builder()
                .displayName(Text.translatable("variantvanillablocks.group.variantvanillablocks"))
                .icon(() -> new ItemStack(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE))
                .entries((context, entries) -> {

                    entries.add(Barrels.ACACIA_BARREL);
                    entries.add(Beehives.ACACIA_BEEHIVE);
                    entries.add(Bookshelves.ACACIA_BOOKSHELF);
                    entries.add(CartographyTables.ACACIA_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF);
                    entries.add(Composters.ACACIA_COMPOSTER);
                    entries.add(CraftingTables.ACACIA_CRAFTING_TABLE);
                    entries.add(FletchingTables.ACACIA_FLETCHING_TABLE);
                    entries.add(Grindstones.ACACIA_GRINDSTONE);
                    entries.add(Lecterns.ACACIA_LECTERN);
                    entries.add(SmithingTables.ACACIA_SMITHING_TABLE);
                    entries.add(Smokers.ACACIA_SMOKER);

                    entries.add(Barrels.BAMBOO_BARREL);
                    entries.add(Beehives.BAMBOO_BEEHIVE);
                    entries.add(Bookshelves.BAMBOO_BOOKSHELF);
                    entries.add(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF);
                    entries.add(Composters.BAMBOO_COMPOSTER);
                    entries.add(CraftingTables.BAMBOO_CRAFTING_TABLE);
                    entries.add(FletchingTables.BAMBOO_FLETCHING_TABLE);
                    entries.add(Grindstones.BAMBOO_GRINDSTONE);
                    entries.add(Lecterns.BAMBOO_LECTERN);
                    entries.add(SmithingTables.BAMBOO_SMITHING_TABLE);
                    entries.add(Smokers.BAMBOO_SMOKER);

                    entries.add(Barrels.BIRCH_BARREL);
                    entries.add(Beehives.BIRCH_BEEHIVE);
                    entries.add(Bookshelves.BIRCH_BOOKSHELF);
                    entries.add(CartographyTables.BIRCH_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF);
                    entries.add(Composters.BIRCH_COMPOSTER);
                    entries.add(CraftingTables.BIRCH_CRAFTING_TABLE);
                    entries.add(Blocks.FLETCHING_TABLE); // Birch
                    entries.add(Grindstones.BIRCH_GRINDSTONE);
                    entries.add(Lecterns.BIRCH_LECTERN);
                    entries.add(SmithingTables.BIRCH_SMITHING_TABLE);
                    entries.add(Smokers.BIRCH_SMOKER);

                    entries.add(Barrels.CHERRY_BARREL);
                    entries.add(Beehives.CHERRY_BEEHIVE);
                    entries.add(Bookshelves.CHERRY_BOOKSHELF);
                    entries.add(CartographyTables.CHERRY_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF);
                    entries.add(Composters.CHERRY_COMPOSTER);
                    entries.add(CraftingTables.CHERRY_CRAFTING_TABLE);
                    entries.add(FletchingTables.CHERRY_FLETCHING_TABLE);
                    entries.add(Grindstones.CHERRY_GRINDSTONE);
                    entries.add(Lecterns.CHERRY_LECTERN);
                    entries.add(SmithingTables.CHERRY_SMITHING_TABLE);
                    entries.add(Smokers.CHERRY_SMOKER);

                    entries.add(Barrels.CRIMSON_BARREL);
                    entries.add(Beehives.CRIMSON_BEEHIVE);
                    entries.add(Bookshelves.CRIMSON_BOOKSHELF);
                    entries.add(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF);
                    entries.add(Composters.CRIMSON_COMPOSTER);
                    entries.add(CraftingTables.CRIMSON_CRAFTING_TABLE);
                    entries.add(FletchingTables.CRIMSON_FLETCHING_TABLE);
                    entries.add(Grindstones.CRIMSON_GRINDSTONE);
                    entries.add(Lecterns.CRIMSON_LECTERN);
                    entries.add(SmithingTables.CRIMSON_SMITHING_TABLE);
                    entries.add(Smokers.CRIMSON_SMOKER);

                    entries.add(Barrels.DARK_OAK_BARREL);
                    entries.add(Beehives.DARK_OAK_BEEHIVE);
                    entries.add(Bookshelves.DARK_OAK_BOOKSHELF);
                    entries.add(Blocks.CARTOGRAPHY_TABLE); // Dark Oak
                    entries.add(ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF);
                    entries.add(Composters.DARK_OAK_COMPOSTER);
                    entries.add(CraftingTables.DARK_OAK_CRAFTING_TABLE);
                    entries.add(FletchingTables.DARK_OAK_FLETCHING_TABLE);
                    entries.add(Blocks.GRINDSTONE); // Dark Oak
                    entries.add(Lecterns.DARK_OAK_LECTERN);
                    entries.add(SmithingTables.DARK_OAK_SMITHING_TABLE);
                    entries.add(Smokers.DARK_OAK_SMOKER);

                    entries.add(Barrels.JUNGLE_BARREL);
                    entries.add(Beehives.JUNGLE_BEEHIVE);
                    entries.add(Bookshelves.JUNGLE_BOOKSHELF);
                    entries.add(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF);
                    entries.add(Composters.JUNGLE_COMPOSTER);
                    entries.add(CraftingTables.JUNGLE_CRAFTING_TABLE);
                    entries.add(FletchingTables.JUNGLE_FLETCHING_TABLE);
                    entries.add(Grindstones.JUNGLE_GRINDSTONE);
                    entries.add(Lecterns.JUNGLE_LECTERN);
                    entries.add(SmithingTables.JUNGLE_SMITHING_TABLE);
                    entries.add(Smokers.JUNGLE_SMOKER);

                    entries.add(Barrels.MANGROVE_BARREL);
                    entries.add(Beehives.MANGROVE_BEEHIVE);
                    entries.add(Bookshelves.MANGROVE_BOOKSHELF);
                    entries.add(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF);
                    entries.add(Composters.MANGROVE_COMPOSTER);
                    entries.add(CraftingTables.MANGROVE_CRAFTING_TABLE);
                    entries.add(FletchingTables.MANGROVE_FLETCHING_TABLE);
                    entries.add(Grindstones.MANGROVE_GRINDSTONE);
                    entries.add(Lecterns.MANGROVE_LECTERN);
                    entries.add(Blocks.SMITHING_TABLE);
                    entries.add(Smokers.MANGROVE_SMOKER);

                    entries.add(Barrels.OAK_BARREL);
                    entries.add(Blocks.BEEHIVE); // Oak
                    entries.add(Blocks.BOOKSHELF); // Oak
                    entries.add(CartographyTables.OAK_CARTOGRAPHY_TABLE);
                    entries.add(Blocks.CHISELED_BOOKSHELF); // Oak
                    entries.add(Composters.OAK_COMPOSTER);
                    entries.add(Blocks.CRAFTING_TABLE);
                    entries.add(FletchingTables.OAK_FLETCHING_TABLE);
                    entries.add(Grindstones.OAK_GRINDSTONE);
                    entries.add(Blocks.LECTERN); // Oak
                    entries.add(SmithingTables.OAK_SMITHING_TABLE);
                    entries.add(Blocks.SMOKER);

                    entries.add(Blocks.BARREL); // Spruce
                    entries.add(Beehives.SPRUCE_BEEHIVE);
                    entries.add(Bookshelves.SPRUCE_BOOKSHELF);
                    entries.add(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF);
                    entries.add(Blocks.COMPOSTER); // Spruce
                    entries.add(CraftingTables.SPRUCE_CRAFTING_TABLE);
                    entries.add(FletchingTables.SPRUCE_FLETCHING_TABLE);
                    entries.add(Grindstones.SPRUCE_GRINDSTONE);
                    entries.add(Lecterns.SPRUCE_LECTERN);
                    entries.add(SmithingTables.SPRUCE_SMITHING_TABLE);
                    entries.add(Smokers.SPRUCE_SMOKER);

                    entries.add(Barrels.WARPED_BARREL);
                    entries.add(Beehives.WARPED_BEEHIVE);
                    entries.add(Bookshelves.WARPED_BOOKSHELF);
                    entries.add(CartographyTables.WARPED_CARTOGRAPHY_TABLE);
                    entries.add(ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF);
                    entries.add(Composters.WARPED_COMPOSTER);
                    entries.add(CraftingTables.WARPED_CRAFTING_TABLE);
                    entries.add(FletchingTables.WARPED_FLETCHING_TABLE);
                    entries.add(Grindstones.WARPED_GRINDSTONE);
                    entries.add(Lecterns.WARPED_LECTERN);
                    entries.add(SmithingTables.WARPED_SMITHING_TABLE);
                    entries.add(Smokers.WARPED_SMOKER);

                })
                .build());

        // Block Registration
        Barrels.registerVanillaBarrels();
        Beehives.registerVanillaHives();
        Bookshelves.registerVanillaBookShelves();
        CartographyTables.registerVanillaTables();
        ChiseledBookshelves.registerVanillaChiseledBookshelves();
        Composters.registerVanillaComposters();
        CraftingTables.registerVanillaTables();
        FletchingTables.registerVanillaTables();
        Grindstones.registerVanillaGrindstones();
        Lecterns.registerVanillaLecterns();
        SmithingTables.registerVanillaSmithingTables();
        Smokers.registerVanillaSmokers();

        // Fuel & Flammable Block registration
        ModRegistries.registerFuelandFlammable();

        // POI Registration
        ModPOITypes.init();

    }
}