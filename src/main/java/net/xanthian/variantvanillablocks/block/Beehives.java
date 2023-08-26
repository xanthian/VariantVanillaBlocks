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

public class Beehives {

    public static Map<Identifier, Block> MOD_BEEHIVES = Maps.newHashMap();

    public static final BeehiveBlock ACACIA_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock BAMBOO_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock BIRCH_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock CHERRY_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock CRIMSON_BEEHIVE = new BeehiveBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_CRIMSON).instrument(Instrument.BASS).strength(0.6F).sounds(BlockSoundGroup.WOOD));
    public static final BeehiveBlock DARK_OAK_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock JUNGLE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock MANGROVE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    // Vanilla Beehive is made from Oak
    public static final BeehiveBlock SPRUCE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock WARPED_BEEHIVE = new BeehiveBlock(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASS).strength(0.6F).sounds(BlockSoundGroup.WOOD));


    public static void registerVanillaHives() {
        registerBeehiveBlock("acacia_beehive", ACACIA_BEEHIVE);
        registerBeehiveBlock("bamboo_beehive", BAMBOO_BEEHIVE);
        registerBeehiveBlock("cherry_beehive", CHERRY_BEEHIVE);
        registerBeehiveBlock("crimson_beehive", CRIMSON_BEEHIVE);
        registerBeehiveBlock("dark_oak_beehive", DARK_OAK_BEEHIVE);
        registerBeehiveBlock("jungle_beehive", JUNGLE_BEEHIVE);
        registerBeehiveBlock("mangrove_beehive", MANGROVE_BEEHIVE);
        registerBeehiveBlock("birch_beehive", BIRCH_BEEHIVE);
        registerBeehiveBlock("spruce_beehive", SPRUCE_BEEHIVE);
        registerBeehiveBlock("warped_beehive", WARPED_BEEHIVE);
    }

    private static void registerBeehiveBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_BEEHIVES.put(identifier, block);
    }
}