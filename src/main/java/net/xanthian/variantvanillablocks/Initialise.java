package net.xanthian.variantvanillablocks;

import net.fabricmc.api.ModInitializer;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.entity.EntityInitialise;
import net.xanthian.variantvanillablocks.utils.ModCreativeTab;
import net.xanthian.variantvanillablocks.utils.ModPOITypes;
import net.xanthian.variantvanillablocks.utils.ModRegistries;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantvanillablocks";

    @Override
    public void onInitialize() {

        EntityInitialise.registerBlockEntities();

        Barrels.registerVanillaBarrels();
        Beehives.registerVanillaHives();
        Bookshelves.registerVanillaBookShelves();
        CartographyTables.registerVanillaTables();
        Chests.registerVanillaChests();
        ChiseledBookshelves.registerVanillaChiseledBookshelves();
        Composters.registerVanillaComposters();
        CraftingTables.registerVanillaTables();
        FletchingTables.registerVanillaTables();
        Grindstones.registerVanillaGrindstones();
        Lecterns.registerVanillaLecterns();
        SmithingTables.registerVanillaSmithingTables();
        Smokers.registerVanillaSmokers();

        ModCreativeTab.registerItemGroup();
        ModRegistries.registerFuelandFlammable();
        ModPOITypes.init();
    }
}