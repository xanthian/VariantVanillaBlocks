package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.SmokerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Smokers {

    public static Map<Identifier, Block> MOD_SMOKERS = Maps.newHashMap();

    public static final SmokerBlock ACACIA_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock BAMBOO_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock BIRCH_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock CHERRY_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock CRIMSON_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock DARK_OAK_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock JUNGLE_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock MANGROVE_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    // Vanilla Smoker block is made from Oak
    public static final SmokerBlock SPRUCE_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));
    public static final SmokerBlock WARPED_SMOKER = new SmokerBlock(FabricBlockSettings.copy(Blocks.SMOKER));

    public static void registerVanillaSmokers() {
        registerSmokerBlock("acacia_smoker", ACACIA_SMOKER);
        registerSmokerBlock("bamboo_smoker", BAMBOO_SMOKER);
        registerSmokerBlock("birch_smoker", BIRCH_SMOKER);
        registerSmokerBlock("cherry_smoker", CHERRY_SMOKER);
        registerSmokerBlock("crimson_smoker", CRIMSON_SMOKER);
        registerSmokerBlock("dark_oak_smoker", DARK_OAK_SMOKER);
        registerSmokerBlock("jungle_smoker", JUNGLE_SMOKER);
        registerSmokerBlock("mangrove_smoker", MANGROVE_SMOKER);
        registerSmokerBlock("spruce_smoker", SPRUCE_SMOKER);
        registerSmokerBlock("warped_smoker", WARPED_SMOKER);
    }

    private static void registerSmokerBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_SMOKERS.put(identifier, block);
    }
}