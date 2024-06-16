package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.minecraft.block.*;
import net.minecraft.item.Item;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Barrels {

    public static final BarrelBlock ACACIA_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock BAMBOO_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock BIRCH_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock CHERRY_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock CRIMSON_BARREL = new BarrelBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
    public static final BarrelBlock DARK_OAK_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock JUNGLE_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock MANGROVE_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    public static final BarrelBlock OAK_BARREL = new BarrelBlock(AbstractBlock.Settings.copy(Blocks.BARREL));
    // Vanilla Barrel block is made from Spruce
    public static final BarrelBlock WARPED_BARREL = new BarrelBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.WOOD));
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
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        MOD_BARRELS.put(identifier, block);
    }
}