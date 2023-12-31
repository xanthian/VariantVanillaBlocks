package net.xanthian.variantvanillablocks.utils;

import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.variantvanillablocks.block.*;

import java.util.HashSet;

public class ModPOITypes {

    public static DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, "minecraft");

    // Credit to cech12 & BrickFurnace mod

    public static RegistryObject<PoiType> FISHERMAN = POI_TYPES.register("fisherman", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.FISHERMAN).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Barrels.ACACIA_BARREL, Barrels.BAMBOO_BARREL, Barrels.CHERRY_BARREL,
                Barrels.CRIMSON_BARREL, Barrels.DARK_OAK_BARREL, Barrels.JUNGLE_BARREL,
                Barrels.MANGROVE_BARREL, Barrels.OAK_BARREL, Barrels.WARPED_BARREL
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> CARTOGRAPHER = POI_TYPES.register("cartographer", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.CARTOGRAPHER).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                CartographyTables.ACACIA_CARTOGRAPHY_TABLE, CartographyTables.BAMBOO_CARTOGRAPHY_TABLE, CartographyTables.CHERRY_CARTOGRAPHY_TABLE,
                CartographyTables.CRIMSON_CARTOGRAPHY_TABLE, CartographyTables.OAK_CARTOGRAPHY_TABLE, CartographyTables.JUNGLE_CARTOGRAPHY_TABLE,
                CartographyTables.MANGROVE_CARTOGRAPHY_TABLE, CartographyTables.SPRUCE_CARTOGRAPHY_TABLE, CartographyTables.WARPED_CARTOGRAPHY_TABLE
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> FARMER = POI_TYPES.register("farmer", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.FARMER).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Composters.ACACIA_COMPOSTER, Composters.BAMBOO_COMPOSTER, Composters.CHERRY_COMPOSTER,
                Composters.CRIMSON_COMPOSTER, Composters.OAK_COMPOSTER, Composters.JUNGLE_COMPOSTER,
                Composters.MANGROVE_COMPOSTER, Composters.DARK_OAK_COMPOSTER, Composters.WARPED_COMPOSTER
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> FLETCHER = POI_TYPES.register("fletcher", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.FLETCHER).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                FletchingTables.ACACIA_FLETCHING_TABLE, FletchingTables.BAMBOO_FLETCHING_TABLE, FletchingTables.CHERRY_FLETCHING_TABLE,
                FletchingTables.CRIMSON_FLETCHING_TABLE, FletchingTables.OAK_FLETCHING_TABLE, FletchingTables.JUNGLE_FLETCHING_TABLE,
                FletchingTables.MANGROVE_FLETCHING_TABLE, FletchingTables.SPRUCE_FLETCHING_TABLE, FletchingTables.WARPED_FLETCHING_TABLE
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> WEAPONSMITH = POI_TYPES.register("weaponsmith", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.WEAPONSMITH).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Grindstones.ACACIA_GRINDSTONE, Grindstones.BAMBOO_GRINDSTONE, Grindstones.CHERRY_GRINDSTONE,
                Grindstones.CRIMSON_GRINDSTONE, Grindstones.OAK_GRINDSTONE, Grindstones.JUNGLE_GRINDSTONE,
                Grindstones.MANGROVE_GRINDSTONE, Grindstones.SPRUCE_GRINDSTONE, Grindstones.WARPED_GRINDSTONE
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> LIBRARIAN = POI_TYPES.register("librarian", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.LIBRARIAN).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Lecterns.ACACIA_LECTERN, Lecterns.BAMBOO_LECTERN, Lecterns.CHERRY_LECTERN,
                Lecterns.CRIMSON_LECTERN, Lecterns.DARK_OAK_LECTERN, Lecterns.JUNGLE_LECTERN,
                Lecterns.MANGROVE_LECTERN, Lecterns.SPRUCE_LECTERN, Lecterns.WARPED_LECTERN
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> TOOLSMITH = POI_TYPES.register("toolsmith", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.TOOLSMITH).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                SmithingTables.ACACIA_SMITHING_TABLE, SmithingTables.BAMBOO_SMITHING_TABLE, SmithingTables.CHERRY_SMITHING_TABLE,
                SmithingTables.CRIMSON_SMITHING_TABLE, SmithingTables.OAK_SMITHING_TABLE, SmithingTables.JUNGLE_SMITHING_TABLE,
                SmithingTables.DARK_OAK_SMITHING_TABLE, SmithingTables.SPRUCE_SMITHING_TABLE, SmithingTables.WARPED_SMITHING_TABLE
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> BUTCHER = POI_TYPES.register("butcher", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.BUTCHER).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Smokers.ACACIA_SMOKER, Smokers.BAMBOO_SMOKER, Smokers.CHERRY_SMOKER,
                Smokers.CRIMSON_SMOKER, Smokers.DARK_OAK_SMOKER, Smokers.JUNGLE_SMOKER,
                Smokers.MANGROVE_SMOKER, Smokers.SPRUCE_SMOKER, Smokers.WARPED_SMOKER
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });

    public static RegistryObject<PoiType> BEEHIVE = POI_TYPES.register("beehive", () -> {
        HashSet<BlockState> states = new HashSet<>(ForgeRegistries.POI_TYPES.getDelegateOrThrow(PoiTypes.BEEHIVE).get().matchingStates());
        RegistryObject<Block>[] barrelRegistryObjects = new RegistryObject[]{
                Beehives.ACACIA_BEEHIVE, Beehives.BAMBOO_BEEHIVE, Beehives.CHERRY_BEEHIVE,
                Beehives.CRIMSON_BEEHIVE, Beehives.DARK_OAK_BEEHIVE, Beehives.JUNGLE_BEEHIVE,
                Beehives.MANGROVE_BEEHIVE, Beehives.SPRUCE_BEEHIVE, Beehives.WARPED_BEEHIVE
        };
        for (RegistryObject<Block> barrelRegistryObject : barrelRegistryObjects) {
            states.addAll(barrelRegistryObject.get().getStateDefinition().getPossibleStates());
        }
        return new PoiType(states, 1, 1);
    });
}