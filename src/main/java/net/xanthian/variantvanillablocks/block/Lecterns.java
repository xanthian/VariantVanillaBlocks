package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.LecternBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Lecterns {

    public static final LecternBlock ACACIA_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock BIRCH_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock CRIMSON_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.CRIMSON_PLANKS));
    public static final LecternBlock DARK_OAK_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock JUNGLE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock MANGROVE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock SPRUCE_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.LECTERN));
    public static final LecternBlock WARPED_LECTERN = new LecternBlock(FabricBlockSettings.copy(Blocks.WARPED_PLANKS));
    public static Map<Identifier, Block> MOD_LECTERNS = Maps.newHashMap();

    public static void registerVanillaLecterns() {
        registerLecternBlock("acacia_lectern", ACACIA_LECTERN);
        registerLecternBlock("birch_lectern", BIRCH_LECTERN);
        registerLecternBlock("crimson_lectern", CRIMSON_LECTERN);
        registerLecternBlock("dark_oak_lectern", DARK_OAK_LECTERN);
        registerLecternBlock("jungle_lectern", JUNGLE_LECTERN);
        registerLecternBlock("mangrove_lectern", MANGROVE_LECTERN);
        registerLecternBlock("spruce_lectern", SPRUCE_LECTERN);
        registerLecternBlock("warped_lectern", WARPED_LECTERN);
    }

    private static void registerLecternBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_LECTERNS.put(identifier, block);
    }
}