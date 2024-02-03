package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
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
import net.xanthian.variantvanillablocks.block.custom.VariantBarrelBlock;

import java.util.Map;

public class Barrels {

    public static final Block ACACIA_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block BAMBOO_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block BIRCH_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block CHERRY_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block CRIMSON_BARREL = new VariantBarrelBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block DARK_OAK_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block JUNGLE_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block MANGROVE_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block OAK_BARREL = new VariantBarrelBlock(FabricBlockSettings.copy(Blocks.BARREL));
    public static final Block WARPED_BARREL = new VariantBarrelBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static Map<Identifier, Block> MOD_BARRELS = Maps.newHashMap();

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

    private static void registerBarrelBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_BARRELS.put(identifier, block);
    }
}