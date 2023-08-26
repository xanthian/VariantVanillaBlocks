package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Barrels {

    public static Map<Identifier, Block> MOD_BARRELS = Maps.newHashMap();

    public static final BarrelBlock ACACIA_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock BAMBOO_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock BIRCH_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock CHERRY_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock CRIMSON_BARREL = new BarrelBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static final BarrelBlock DARK_OAK_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock JUNGLE_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock MANGROVE_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final BarrelBlock OAK_BARREL = new BarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    // Vanilla Barrel block is made from Spruce
    public static final BarrelBlock WARPED_BARREL = new BarrelBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));

    public static void registerVanillaBarrels() {
        registerBarrelBlock("acacia_barrel", ACACIA_BARREL);
        registerBarrelBlock("bamboo_barrel", BAMBOO_BARREL);
        registerBarrelBlock("birch_barrel", BIRCH_BARREL);
        registerBarrelBlock("cherry_barrel", CHERRY_BARREL);
        registerBarrelBlock("crimson_barrel", CRIMSON_BARREL);
        registerBarrelBlock("dark_oak_barrel", DARK_OAK_BARREL);
        registerBarrelBlock("jungle_barrel", JUNGLE_BARREL);
        registerBarrelBlock("mangrove_barrel", MANGROVE_BARREL);
        registerBarrelBlock("oak_barrel", OAK_BARREL);
        registerBarrelBlock("warped_barrel", WARPED_BARREL);
    }

    private static void registerBarrelBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_BARRELS.put(identifier, block);
    }
}