package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.data.client.*;

import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.utils.ModTextureMap;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    /**
     * Copy from {@link BlockStateModelGenerator#register()}
     **/

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // Barrels
        createBarrel(blockStateModelGenerator, Barrels.ACACIA_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.BAMBOO_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.BIRCH_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.CHERRY_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.CRIMSON_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.DARK_OAK_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.JUNGLE_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.MANGROVE_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.OAK_BARREL);
        createBarrel(blockStateModelGenerator, Barrels.WARPED_BARREL);

        // Beehives
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

        // Bookshelves
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS, ModTextureMap::endside);
        blockStateModelGenerator.registerCubeWithCustomTextures(Bookshelves.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS, ModTextureMap::endside);

        // Cartography Tables
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

        // Composters
        createComposter(blockStateModelGenerator, Composters.ACACIA_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.BAMBOO_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.BIRCH_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.CHERRY_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.CRIMSON_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.DARK_OAK_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.JUNGLE_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.MANGROVE_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.OAK_COMPOSTER);
        createComposter(blockStateModelGenerator, Composters.WARPED_COMPOSTER);

        // Crafting Tables
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

        // Fletching Tables
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

        // Grindstones
        createGrindstone(blockStateModelGenerator, Grindstones.ACACIA_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.BAMBOO_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.BIRCH_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.CHERRY_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.CRIMSON_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.JUNGLE_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.MANGROVE_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.OAK_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.SPRUCE_GRINDSTONE);
        createGrindstone(blockStateModelGenerator, Grindstones.WARPED_GRINDSTONE);

        // Lecterns
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

        // Smithing Tables
        createSmithingTable(blockStateModelGenerator, SmithingTables.ACACIA_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.BAMBOO_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.BIRCH_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.CHERRY_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.CRIMSON_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.DARK_OAK_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.JUNGLE_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.OAK_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.SPRUCE_SMITHING_TABLE);
        createSmithingTable(blockStateModelGenerator, SmithingTables.WARPED_SMITHING_TABLE);

        // Smokers
        blockStateModelGenerator.registerCooker(Smokers.ACACIA_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.BAMBOO_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.BIRCH_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.CHERRY_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.CRIMSON_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.DARK_OAK_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.JUNGLE_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.MANGROVE_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.SPRUCE_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
        blockStateModelGenerator.registerCooker(Smokers.WARPED_SMOKER,TexturedModel.ORIENTABLE_WITH_BOTTOM);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    }

    public void createBarrel(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = TextureMap.getSubId(block, "_top_open");
        Identifier modelLocation = new Identifier(identifier.getNamespace(), "block/");
        (new TextureMap()).put(TextureKey.PARTICLE, modelLocation).put(TextureKey.TOP, modelLocation).put(TextureKey.BOTTOM, modelLocation).put(TextureKey.SIDE, modelLocation);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateModelGenerator.createUpDefaultFacingVariantMap())
                .coordinate(BlockStateVariantMap.create(Properties.OPEN).register(false, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.upload(block, blockStateModelGenerator.modelCollector))).register(true, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.get(block).textures(textureMap -> textureMap
                                .put(TextureKey.TOP, identifier)).upload(block, "_open", blockStateModelGenerator.modelCollector)))));
    }

    public final void createComposter(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        blockStateModelGenerator.blockStateCollector.accept(MultipartBlockStateSupplier.create(block).with(BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getId(block))).with(When.create().set(Properties.LEVEL_8, 1), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents1"))).with(When.create().set(Properties.LEVEL_8, 2), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents2"))).with(When.create().set(Properties.LEVEL_8, 3), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents3"))).with(When.create().set(Properties.LEVEL_8, 4), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents4"))).with(When.create().set(Properties.LEVEL_8, 5), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents5"))).with(When.create().set(Properties.LEVEL_8, 6), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents6"))).with(When.create().set(Properties.LEVEL_8, 7), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents7"))).with(When.create().set(Properties.LEVEL_8, 8), BlockStateVariant.create()
                .put(VariantSettings.MODEL, TextureMap.getSubId(Blocks.COMPOSTER, "_contents_ready"))));
    }

    public final void createGrindstone(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create()
                .put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(BlockStateVariantMap.create(Properties.WALL_MOUNT_LOCATION, Properties.HORIZONTAL_FACING).register(WallMountLocation.FLOOR, Direction.NORTH, BlockStateVariant.create()).register(WallMountLocation.FLOOR, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(WallMountLocation.FLOOR, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(WallMountLocation.FLOOR, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(WallMountLocation.WALL, Direction.NORTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)).register(WallMountLocation.WALL, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(WallMountLocation.WALL, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(WallMountLocation.WALL, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(WallMountLocation.CEILING, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180)).register(WallMountLocation.CEILING, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(WallMountLocation.CEILING, Direction.NORTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(WallMountLocation.CEILING, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270))));
    }

    public final void createSmithingTable(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TextureMap textureMap = new TextureMap().put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_front"))
                .put(TextureKey.DOWN, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.UP, TextureMap.getSubId(Blocks.SMITHING_TABLE, "_top"))
                .put(TextureKey.NORTH, TextureMap.getSubId(block, "_front"))
                .put(TextureKey.SOUTH, TextureMap.getSubId(block, "_front"))
                .put(TextureKey.EAST, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.WEST, TextureMap.getSubId(block, "_side"));
        blockStateModelGenerator.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(block, Models.CUBE.upload(block, textureMap, blockStateModelGenerator.modelCollector)));
    }
}