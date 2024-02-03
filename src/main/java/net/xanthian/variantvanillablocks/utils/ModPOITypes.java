package net.xanthian.variantvanillablocks.utils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        // Fisherman - Barrel
        RegistryEntry<PointOfInterestType> fishermanEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FISHERMAN).get();
        PointOfInterestType fishermanPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FISHERMAN);
        List<BlockState> fishermanBlockStates = new ArrayList<>(fishermanPoiType.blockStates);
        for (Block block : Barrels.MOD_BARRELS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, fishermanEntry);
            }
            fishermanBlockStates.addAll(blockStates);
        }
        fishermanPoiType.blockStates = ImmutableSet.copyOf(fishermanBlockStates);

        // Cartographer - Cartography Tables
        RegistryEntry<PointOfInterestType> cartographerEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.CARTOGRAPHER).get();
        PointOfInterestType cartographerPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.CARTOGRAPHER);
        List<BlockState> cartographerBlockStates = new ArrayList<>(cartographerPoiType.blockStates);
        for (Block block : CartographyTables.MOD_CARTOGRAPHY_TABLES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, cartographerEntry);
            }
            cartographerBlockStates.addAll(blockStates);
        }
        cartographerPoiType.blockStates = ImmutableSet.copyOf(cartographerBlockStates);

        // Fletcher - Fletching Table
        RegistryEntry<PointOfInterestType> fletcherEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FLETCHER).get();
        PointOfInterestType fletcherPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FLETCHER);
        List<BlockState> fletcherBlockStates = new ArrayList<>(fletcherPoiType.blockStates);
        for (Block block : FletchingTables.MOD_FLETCHING_TABLES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, fletcherEntry);
            }

            fletcherBlockStates.addAll(blockStates);
        }
        fletcherPoiType.blockStates = ImmutableSet.copyOf(fletcherBlockStates);

        // Librarian - Lectern
        RegistryEntry<PointOfInterestType> clericEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.LIBRARIAN).get();
        PointOfInterestType clericPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.LIBRARIAN);
        List<BlockState> clericBlockStates = new ArrayList<>(clericPoiType.blockStates);
        for (Block block : Lecterns.MOD_LECTERNS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, clericEntry);
            }
            clericBlockStates.addAll(blockStates);
        }
        clericPoiType.blockStates = ImmutableSet.copyOf(clericBlockStates);

        // Bee - BeeHive
        RegistryEntry<PointOfInterestType> beeEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.BEEHIVE).get();
        PointOfInterestType beePoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.BEEHIVE);
        List<BlockState> beeBlockStates = new ArrayList<>(beePoiType.blockStates);
        for (Block block : Beehives.MOD_BEEHIVES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, beeEntry);
            }
            beeBlockStates.addAll(blockStates);
        }
        beePoiType.blockStates = ImmutableSet.copyOf(beeBlockStates);

        // Weaponsmith - Grindstone
        RegistryEntry<PointOfInterestType> weaponsmithEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.WEAPONSMITH).get();
        PointOfInterestType weaponsmithPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.WEAPONSMITH);
        List<BlockState> weaponsmithBlockStates = new ArrayList<>(weaponsmithPoiType.blockStates);
        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, weaponsmithEntry);
            }
            weaponsmithBlockStates.addAll(blockStates);
        }
        weaponsmithPoiType.blockStates = ImmutableSet.copyOf(weaponsmithBlockStates);

        // Farmer - Composter
        RegistryEntry<PointOfInterestType> farmerEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.FARMER).get();
        PointOfInterestType farmerPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.FARMER);
        List<BlockState> farmerBlockStates = new ArrayList<>(farmerPoiType.blockStates);
        for (Block block : Composters.MOD_COMPOSTERS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, farmerEntry);
            }
            farmerBlockStates.addAll(blockStates);
        }
        farmerPoiType.blockStates = ImmutableSet.copyOf(farmerBlockStates);

        // Armorsmith - Smithing Table
        RegistryEntry<PointOfInterestType> toolsmithEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.TOOLSMITH).get();
        PointOfInterestType toolsmithPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.TOOLSMITH);
        List<BlockState> toolsmithBlockStates = new ArrayList<>(toolsmithPoiType.blockStates);
        for (Block block : SmithingTables.MOD_SMITHING_TABLES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, toolsmithEntry);
            }
            toolsmithBlockStates.addAll(blockStates);
        }
        toolsmithPoiType.blockStates = ImmutableSet.copyOf(toolsmithBlockStates);

        // Butcher - Smoker
        RegistryEntry<PointOfInterestType> butcherEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.BUTCHER).get();
        PointOfInterestType butcherPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.BUTCHER);
        List<BlockState> butcherBlockStates = new ArrayList<>(butcherPoiType.blockStates);
        for (Block block : Smokers.MOD_SMOKERS.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, butcherEntry);
            }
            butcherBlockStates.addAll(blockStates);
        }
        butcherPoiType.blockStates = ImmutableSet.copyOf(butcherBlockStates);
    }
}