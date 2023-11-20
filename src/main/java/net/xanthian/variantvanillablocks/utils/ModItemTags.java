package net.xanthian.variantvanillablocks.utils;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;

public class ModItemTags {

    public static final TagKey<Item> BARRELS = register("barrels");
    public static final TagKey<Item> BEEHIVES = register("beehives");
    public static final TagKey<Item> BOOKSHELVES = register("bookshelves");
    public static final TagKey<Item> CARTOGRAPHY_TABLES = register("cartography_tables");
    public static final TagKey<Item> CHESTS = register("chests");
    public static final TagKey<Item> CHISELED_BOOKSHELVES = register("chiseled_bookshelves");
    public static final TagKey<Item> COMPOSTERS = register("composters");
    public static final TagKey<Item> CRAFTING_TABLES = register("crafting_tables");
    public static final TagKey<Item> FLETCHING_TABLES = register("fletching_tables");
    public static final TagKey<Item> GRINDSTONES = register("grindstones");
    public static final TagKey<Item> LECTERNS = register("lecterns");
    public static final TagKey<Item> SMITHING_TABLES = register("smithing_tables");
    public static final TagKey<Item> SMOKERS = register("smokers");
    public static final TagKey<Item> BAMBOO_LOGS = register("bamboo_logs");

    private static TagKey<Item> register(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Initialise.MOD_ID, name));
    }
}