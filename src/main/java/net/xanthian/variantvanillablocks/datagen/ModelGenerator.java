package net.xanthian.variantvanillablocks.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.WallMountLocation;
import net.minecraft.data.client.*;
import net.minecraft.registry.Registries;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.block.custom.VariantChests;
import net.xanthian.variantvanillablocks.utils.ModModel;
import net.xanthian.variantvanillablocks.utils.ModTextureKey;
import net.xanthian.variantvanillablocks.utils.ModTextureMap;

public class ModelGenerator extends FabricModelProvider {

    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    public static Identifier getMCBlockId(String id) {
        return new Identifier(id);
    }

    public static Identifier getId(Block block) {
        Identifier identifier = Registries.BLOCK.getId(block);
        return identifier.withPrefixedPath("chest/");
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        // Barrels
        for (Block block : Barrels.MOD_BARRELS.values()) {
            createBarrel(blockStateModelGenerator, block);
        }

        // Beehives
        for (Block block : Beehives.MOD_BEEHIVES.values()) {
            blockStateModelGenerator.registerBeehive(block, TextureMap::sideFrontEnd);
        }

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

        // Chests
        blockStateModelGenerator.registerBuiltin(VariantChests.ACACIA.getId().withPrefixedPath("block/"), Blocks.ACACIA_PLANKS).includeWithoutItem(Chests.ACACIA_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BAMBOO.getId().withPrefixedPath("block/"), Blocks.BAMBOO_PLANKS).includeWithoutItem(Chests.BAMBOO_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.BIRCH.getId().withPrefixedPath("block/"), Blocks.BIRCH_PLANKS).includeWithoutItem(Chests.BIRCH_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.CHERRY.getId().withPrefixedPath("block/"), Blocks.CHERRY_PLANKS).includeWithoutItem(Chests.CHERRY_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.CRIMSON.getId().withPrefixedPath("block/"), Blocks.CRIMSON_PLANKS).includeWithoutItem(Chests.CRIMSON_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.DARK_OAK.getId().withPrefixedPath("block/"), Blocks.DARK_OAK_PLANKS).includeWithoutItem(Chests.DARK_OAK_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.JUNGLE.getId().withPrefixedPath("block/"), Blocks.JUNGLE_PLANKS).includeWithoutItem(Chests.JUNGLE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.MANGROVE.getId().withPrefixedPath("block/"), Blocks.MANGROVE_PLANKS).includeWithoutItem(Chests.MANGROVE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.SPRUCE.getId().withPrefixedPath("block/"), Blocks.SPRUCE_PLANKS).includeWithoutItem(Chests.SPRUCE_CHEST);
        blockStateModelGenerator.registerBuiltin(VariantChests.WARPED.getId().withPrefixedPath("block/"), Blocks.WARPED_PLANKS).includeWithoutItem(Chests.WARPED_CHEST);

        // Chiseled Bookshelves
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.ACACIA_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.BAMBOO_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.BIRCH_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.CHERRY_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.CRIMSON_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.DARK_OAK_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.JUNGLE_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.MANGROVE_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.SPRUCE_CHISELED_BOOKSHELF);
        //createChiseledBookshelf(blockStateModelGenerator, ChiseledBookshelves.WARPED_CHISELED_BOOKSHELF);

        // Composters
        for (Block block : Composters.MOD_COMPOSTERS.values()) {
            createComposter(blockStateModelGenerator, block);
        }

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
        createGrindstone(blockStateModelGenerator, Grindstones.ACACIA_GRINDSTONE, Blocks.ACACIA_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.BAMBOO_GRINDSTONE, Blocks.BAMBOO_MOSAIC);
        createGrindstone(blockStateModelGenerator, Grindstones.BIRCH_GRINDSTONE, Blocks.BIRCH_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.CHERRY_GRINDSTONE, Blocks.CHERRY_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.CRIMSON_GRINDSTONE, Blocks.CRIMSON_STEM);
        createGrindstone(blockStateModelGenerator, Grindstones.JUNGLE_GRINDSTONE, Blocks.JUNGLE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.MANGROVE_GRINDSTONE, Blocks.MANGROVE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.OAK_GRINDSTONE, Blocks.OAK_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.SPRUCE_GRINDSTONE, Blocks.SPRUCE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.WARPED_GRINDSTONE, Blocks.WARPED_STEM);

        // Lecterns
        createLectern(blockStateModelGenerator, Lecterns.ACACIA_LECTERN, Blocks.ACACIA_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.BAMBOO_LECTERN, Blocks.BAMBOO_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.BIRCH_LECTERN, Blocks.BIRCH_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.CHERRY_LECTERN, Blocks.CHERRY_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.CRIMSON_LECTERN, Blocks.CRIMSON_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.DARK_OAK_LECTERN, Blocks.DARK_OAK_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.JUNGLE_LECTERN, Blocks.JUNGLE_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.MANGROVE_LECTERN, Blocks.MANGROVE_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.SPRUCE_LECTERN, Blocks.SPRUCE_PLANKS);
        createLectern(blockStateModelGenerator, Lecterns.WARPED_LECTERN, Blocks.WARPED_PLANKS);

        // Smithing Tables
        for (Block block : SmithingTables.MOD_SMITHING_TABLES.values()) {
            createSmithingTable(blockStateModelGenerator, block);
        }

        // Smokers
        for (Block block : Smokers.MOD_SMOKERS.values()) {
            blockStateModelGenerator.registerCooker(block, TexturedModel.ORIENTABLE_WITH_BOTTOM);
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        createChestItem(itemModelGenerator, Chests.ACACIA_CHEST);
        createChestItem(itemModelGenerator, Chests.BAMBOO_CHEST);
        createChestItem(itemModelGenerator, Chests.BIRCH_CHEST);
        createChestItem(itemModelGenerator, Chests.CHERRY_CHEST);
        createChestItem(itemModelGenerator, Chests.CRIMSON_CHEST);
        createChestItem(itemModelGenerator, Chests.DARK_OAK_CHEST);
        createChestItem(itemModelGenerator, Chests.JUNGLE_CHEST);
        createChestItem(itemModelGenerator, Chests.MANGROVE_CHEST);
        createChestItem(itemModelGenerator, Chests.SPRUCE_CHEST);
        createChestItem(itemModelGenerator, Chests.WARPED_CHEST);
    }

    public void createBarrel(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = TextureMap.getSubId(block, "_top_open");
        Identifier modelLocation = new Identifier(identifier.getNamespace(), "block/");
        (new TextureMap()).put(TextureKey.PARTICLE, modelLocation).put(TextureKey.TOP, modelLocation)
                .put(TextureKey.BOTTOM, modelLocation)
                .put(TextureKey.SIDE, modelLocation);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(blockStateModelGenerator.createUpDefaultFacingVariantMap())
                .coordinate(BlockStateVariantMap.create(Properties.OPEN).register(false, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.upload(block, blockStateModelGenerator.modelCollector))).register(true, BlockStateVariant.create()
                        .put(VariantSettings.MODEL, TexturedModel.CUBE_BOTTOM_TOP.get(block).textures(textureMap -> textureMap
                                .put(TextureKey.TOP, identifier)).upload(block, "_open", blockStateModelGenerator.modelCollector)))));
    }

    public final void createComposter(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        TextureMap textureMap = TextureMap.of(
                        TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.BOTTOM, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.INSIDE, TextureMap.getSubId(block, "_bottom"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_side"))
                .put(TextureKey.SIDE, TextureMap.getSubId(block, "_side"));
        ModModel.COMPOSTER.upload(block, textureMap, blockStateModelGenerator.modelCollector);
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

    public final void createGrindstone(BlockStateModelGenerator blockStateModelGenerator, Block block, Block log) {
        TextureMap textureMap = TextureMap.of(
                        ModTextureKey.PIVOT, TextureMap.getSubId(block, "_pivot"))
                .put(ModTextureKey.ROUND, getMCBlockId("minecraft:block/grindstone_round"))
                .put(TextureKey.SIDE, getMCBlockId("minecraft:block/grindstone_side"))
                .put(TextureKey.PARTICLE, getMCBlockId("minecraft:block/grindstone_side"))
                .put(ModTextureKey.LEG, TextureMap.getId(log));
        ModModel.GRINDSTONE.upload(block, textureMap, blockStateModelGenerator.modelCollector);
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

    public final void createLectern(BlockStateModelGenerator blockStateModelGenerator, Block block, Block plank) {
        TextureMap textureMap = TextureMap.of(
                        TextureKey.TOP, TextureMap.getSubId(block, "_top"))
                .put(TextureKey.BOTTOM, TextureMap.getId(plank))
                .put(ModTextureKey.BASE, TextureMap.getSubId(block, "_base"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_sides"))
                .put(TextureKey.FRONT, TextureMap.getSubId(block, "_front"))
                .put(ModTextureKey.SIDES, TextureMap.getSubId(block, "_sides"));
        ModModel.LECTERN.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create()
                .put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(BlockStateModelGenerator.createNorthDefaultHorizontalRotationStates()));
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

    public final void createChestItem(ItemModelGenerator itemModelGenerator, Block block) {
        TextureMap textureMap = new TextureMap().put(ModTextureKey.CHEST, getId(block));
        ModModel.CHEST.upload(ModelIds.getItemModelId(block.asItem()), textureMap, itemModelGenerator.writer);
    }
}