package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.custom.VariantChestBlock;
import net.xanthian.variantvanillablocks.block.custom.VariantChests;

import java.util.Map;

public class Chests {

    public static final Block ACACIA_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.ACACIA);
    public static final Block BIRCH_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.BIRCH);
    public static final Block CRIMSON_CHEST = new VariantChestBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS), VariantChests.CRIMSON);
    public static final Block DARK_OAK_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.DARK_OAK);
    public static final Block JUNGLE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.JUNGLE);
    public static final Block MANGROVE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.MANGROVE);
    public static final Block SPRUCE_CHEST = new VariantChestBlock(FabricBlockSettings.copyOf(Blocks.CHEST), VariantChests.SPRUCE);
    public static final Block WARPED_CHEST = new VariantChestBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS), VariantChests.WARPED);
    public static Map<Identifier, Block> MOD_CHESTS = Maps.newHashMap();

    public static void registerVanillaChests() {
        registerChestBlock("acacia_chest", ACACIA_CHEST);
        registerChestBlock("birch_chest", BIRCH_CHEST);
        registerChestBlock("crimson_chest", CRIMSON_CHEST);
        registerChestBlock("dark_oak_chest", DARK_OAK_CHEST);
        registerChestBlock("jungle_chest", JUNGLE_CHEST);
        registerChestBlock("mangrove_chest", MANGROVE_CHEST);
        registerChestBlock("spruce_chest", SPRUCE_CHEST);
        registerChestBlock("warped_chest", WARPED_CHEST);
    }

    private static void registerChestBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_CHESTS.put(identifier, block);
    }
}