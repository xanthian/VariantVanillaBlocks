package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.GrindstoneBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.variantvanillablocks.Initialise;

import java.util.Map;

public class Grindstones {

    public static final GrindstoneBlock ACACIA_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock BIRCH_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock CRIMSON_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock JUNGLE_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock MANGROVE_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock OAK_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock SPRUCE_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static final GrindstoneBlock WARPED_GRINDSTONE = new GrindstoneBlock(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    public static Map<Identifier, Block> MOD_GRINDSTONES = Maps.newHashMap();

    public static void registerVanillaGrindstones() {
        registerGrindstoneBlock("acacia_grindstone", ACACIA_GRINDSTONE);
        registerGrindstoneBlock("birch_grindstone", BIRCH_GRINDSTONE);
        registerGrindstoneBlock("crimson_grindstone", CRIMSON_GRINDSTONE);
        registerGrindstoneBlock("jungle_grindstone", JUNGLE_GRINDSTONE);
        registerGrindstoneBlock("mangrove_grindstone", MANGROVE_GRINDSTONE);
        registerGrindstoneBlock("oak_grindstone", OAK_GRINDSTONE);
        registerGrindstoneBlock("spruce_grindstone", SPRUCE_GRINDSTONE);
        registerGrindstoneBlock("warped_grindstone", WARPED_GRINDSTONE);
    }

    private static void registerGrindstoneBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Initialise.ITEM_GROUP)));
        MOD_GRINDSTONES.put(identifier, block);

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block);
    }

    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}