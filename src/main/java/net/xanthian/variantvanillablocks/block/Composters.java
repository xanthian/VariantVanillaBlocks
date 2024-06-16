package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.block.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Composters {

    public static final ComposterBlock ACACIA_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock BAMBOO_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock BIRCH_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock CHERRY_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock CRIMSON_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_CRIMSON).instrument(NoteBlockInstrument.BASS).strength(0.6F).sounds(BlockSoundGroup.WOOD));
    public static final ComposterBlock DARK_OAK_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock JUNGLE_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock MANGROVE_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock OAK_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.copy(Blocks.COMPOSTER));
    // Vanilla Composter is made from Spruce
    public static final ComposterBlock WARPED_COMPOSTER = new ComposterBlock(AbstractBlock.Settings.create().mapColor(MapColor.DARK_AQUA).instrument(NoteBlockInstrument.BASS).strength(0.6F).sounds(BlockSoundGroup.WOOD));
    public static Map<Identifier, Block> MOD_COMPOSTERS = Maps.newHashMap();

    public static void registerVanillaComposters() {
        registerComposterBlock("acacia_composter", ACACIA_COMPOSTER);
        registerComposterBlock("bamboo_composter", BAMBOO_COMPOSTER);
        registerComposterBlock("birch_composter", BIRCH_COMPOSTER);
        registerComposterBlock("cherry_composter", CHERRY_COMPOSTER);
        registerComposterBlock("crimson_composter", CRIMSON_COMPOSTER);
        registerComposterBlock("dark_oak_composter", DARK_OAK_COMPOSTER);
        registerComposterBlock("jungle_composter", JUNGLE_COMPOSTER);
        registerComposterBlock("mangrove_composter", MANGROVE_COMPOSTER);
        registerComposterBlock("oak_composter", OAK_COMPOSTER);
        registerComposterBlock("warped_composter", WARPED_COMPOSTER);
    }

    private static void registerComposterBlock(String name, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
        MOD_COMPOSTERS.put(identifier, block);
    }
}