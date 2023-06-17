package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Beehives {

    public static Map<Identifier, Block> MOD_BEEHIVES = Maps.newHashMap();

    // Vanilla
    public static final VariantBeehiveBlock ACACIA_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock BAMBOO_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock CHERRY_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock DARK_OAK_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock JUNGLE_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock MANGROVE_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock BIRCH_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock SPRUCE_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock WARPED_BEEHIVE = new VariantBeehiveBlock();
    public static final VariantBeehiveBlock CRIMSON_BEEHIVE = new VariantBeehiveBlock();

    public static void registerVanillaHives() {
        registerBeehiveBlock("acacia_beehive", ACACIA_BEEHIVE,true);
        registerBeehiveBlock("bamboo_beehive", BAMBOO_BEEHIVE,true);
        registerBeehiveBlock("cherry_beehive", CHERRY_BEEHIVE,true);
        registerBeehiveBlock("dark_oak_beehive", DARK_OAK_BEEHIVE,true);
        registerBeehiveBlock("jungle_beehive", JUNGLE_BEEHIVE,true);
        registerBeehiveBlock("mangrove_beehive", MANGROVE_BEEHIVE,true);
        registerBeehiveBlock("birch_beehive", BIRCH_BEEHIVE,true);
        registerBeehiveBlock("spruce_beehive", SPRUCE_BEEHIVE,true);
        registerBeehiveBlock("crimson_beehive", CRIMSON_BEEHIVE, false);
        registerBeehiveBlock("warped_beehive", WARPED_BEEHIVE, false);
    }


    private static void registerBeehiveBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);
        MOD_BEEHIVES.put(identifier, block);
    }
}