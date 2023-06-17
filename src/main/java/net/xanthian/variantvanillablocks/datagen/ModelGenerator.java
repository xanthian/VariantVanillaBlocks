package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.TextureMap;

import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.utils.ModTextureMap;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    /**
     Copy from {@link BlockStateModelGenerator#register()}
     **/

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


        blockStateModelGenerator.registerBeehive(Beehives.ACACIA_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.BAMBOO_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.BIRCH_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.CHERRY_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.CRIMSON_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.DARK_OAK_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.JUNGLE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.MANGROVE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.SPRUCE_BEEHIVE, TextureMap::sideFrontEnd);
        blockStateModelGenerator.registerBeehive(Beehives.WARPED_BEEHIVE, TextureMap::sideFrontEnd);

        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.ACACIA_CARTOGRAPHY_TABLE, Blocks.ACACIA_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, Blocks.BAMBOO_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.BIRCH_CARTOGRAPHY_TABLE, Blocks.BIRCH_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.CHERRY_CARTOGRAPHY_TABLE, Blocks.CHERRY_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, Blocks.CRIMSON_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, Blocks.SPRUCE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.JUNGLE_CARTOGRAPHY_TABLE, Blocks.JUNGLE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, Blocks.MANGROVE_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.OAK_CARTOGRAPHY_TABLE, Blocks.OAK_PLANKS, ModTextureMap::threesides);
        blockStateModelGenerator.registerCubeWithCustomTextures(CartographyTables.WARPED_CARTOGRAPHY_TABLE, Blocks.WARPED_PLANKS, ModTextureMap::threesides);

        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontSideWithCustomBottom);
        blockStateModelGenerator.registerCubeWithCustomTextures(CraftingTables.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontSideWithCustomBottom);

        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.BAMBOO_FLETCHING_TABLE, Blocks.BAMBOO_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.CHERRY_FLETCHING_TABLE, Blocks.CHERRY_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS, TextureMap::frontTopSide);
        blockStateModelGenerator.registerCubeWithCustomTextures(FletchingTables.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS, TextureMap::frontTopSide);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.ACACIA_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.BAMBOO_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.BIRCH_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.CHERRY_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.CRIMSON_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.DARK_OAK_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.JUNGLE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.MANGROVE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.SPRUCE_LECTERN);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Lecterns.WARPED_LECTERN);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }}