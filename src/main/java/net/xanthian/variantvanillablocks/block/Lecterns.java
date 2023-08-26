package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Lecterns {

    public static Map<Identifier, Block> MOD_LECTERNS = Maps.newHashMap();

    public static final LecternBlock ACACIA_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock BAMBOO_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock BIRCH_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock CHERRY_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock CRIMSON_LECTERN = new LecternBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD));
    public static final LecternBlock DARK_OAK_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock JUNGLE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock MANGROVE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    // Vanilla Lectern block is made from Oak
    public static final LecternBlock SPRUCE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock WARPED_LECTERN = new LecternBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(2.5f).sounds(BlockSoundGroup.WOOD));

    public static void registerVanillaLecterns() {
        registerLecternBlock("acacia_lectern", ACACIA_LECTERN);
        registerLecternBlock("bamboo_lectern", BAMBOO_LECTERN);
        registerLecternBlock("birch_lectern", BIRCH_LECTERN);
        registerLecternBlock("cherry_lectern", CHERRY_LECTERN);
        registerLecternBlock("crimson_lectern", CRIMSON_LECTERN);
        registerLecternBlock("dark_oak_lectern", DARK_OAK_LECTERN);
        registerLecternBlock("jungle_lectern", JUNGLE_LECTERN);
        registerLecternBlock("mangrove_lectern", MANGROVE_LECTERN);
        registerLecternBlock("spruce_lectern", SPRUCE_LECTERN);
        registerLecternBlock("warped_lectern", WARPED_LECTERN);
    }

    private static void registerLecternBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_LECTERNS.put(identifier, block);
    }
}