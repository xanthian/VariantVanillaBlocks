package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Composters {

    public static final ComposterBlock ACACIA_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock BIRCH_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock CRIMSON_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(0.6f));
    public static final ComposterBlock DARK_OAK_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock JUNGLE_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock MANGROVE_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    public static final ComposterBlock OAK_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.COMPOSTER));
    // Vanilla Composter is made from Spruce
    public static final ComposterBlock WARPED_COMPOSTER = new ComposterBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).strength(0.6f));
    public static Map<Identifier, Block> MOD_COMPOSTERS = Maps.newHashMap();

    public static void registerVanillaComposters() {
        registerComposterBlock("acacia_composter", ACACIA_COMPOSTER);
        registerComposterBlock("birch_composter", BIRCH_COMPOSTER);
        registerComposterBlock("crimson_composter", CRIMSON_COMPOSTER);
        registerComposterBlock("dark_oak_composter", DARK_OAK_COMPOSTER);
        registerComposterBlock("jungle_composter", JUNGLE_COMPOSTER);
        registerComposterBlock("mangrove_composter", MANGROVE_COMPOSTER);
        registerComposterBlock("oak_composter", OAK_COMPOSTER);
        registerComposterBlock("warped_composter", WARPED_COMPOSTER);
    }

    private static void registerComposterBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_COMPOSTERS.put(identifier, block);
    }
}