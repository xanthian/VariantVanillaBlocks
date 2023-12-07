package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Beehives {

    public static final BeehiveBlock ACACIA_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock BIRCH_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock CRIMSON_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS).strength(0.6F));
    public static final BeehiveBlock DARK_OAK_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock JUNGLE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock MANGROVE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    // Vanilla Beehive is made from Oak
    public static final BeehiveBlock SPRUCE_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.BEEHIVE));
    public static final BeehiveBlock WARPED_BEEHIVE = new BeehiveBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS).strength(0.6F));
    public static Map<Identifier, Block> MOD_BEEHIVES = Maps.newHashMap();

    public static void registerVanillaHives() {
        registerBeehiveBlock("acacia_beehive", ACACIA_BEEHIVE);
        registerBeehiveBlock("crimson_beehive", CRIMSON_BEEHIVE);
        registerBeehiveBlock("dark_oak_beehive", DARK_OAK_BEEHIVE);
        registerBeehiveBlock("jungle_beehive", JUNGLE_BEEHIVE);
        registerBeehiveBlock("mangrove_beehive", MANGROVE_BEEHIVE);
        registerBeehiveBlock("birch_beehive", BIRCH_BEEHIVE);
        registerBeehiveBlock("spruce_beehive", SPRUCE_BEEHIVE);
        registerBeehiveBlock("warped_beehive", WARPED_BEEHIVE);
    }

    private static void registerBeehiveBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_BEEHIVES.put(identifier, block);
    }
}