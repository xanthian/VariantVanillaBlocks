package net.xanthian.variantvanillablocks.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.Chests;
import net.xanthian.variantvanillablocks.block.custom.VariantChests;

@Mod.EventBusSubscriber(modid = Initialise.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class EntityInitialise {

    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Initialise.MOD_ID);


    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> ACACIA_CHEST =
            BLOCK_ENTITIES.register("acacia_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                            pos, state, VariantChests.ACACIA),
                                    Chests.ACACIA_CHEST.get())
                            .build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> BAMBOO_CHEST =
            BLOCK_ENTITIES.register("bamboo_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.BAMBOO),
                            Chests.BAMBOO_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> BIRCH_CHEST =
            BLOCK_ENTITIES.register("birch_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.BIRCH),
                            Chests.BIRCH_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> CHERRY_CHEST =
            BLOCK_ENTITIES.register("cherry_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.CHERRY),
                            Chests.CHERRY_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> CRIMSON_CHEST =
            BLOCK_ENTITIES.register("crimson_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.CRIMSON),
                            Chests.CRIMSON_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> DARK_OAK_CHEST =
            BLOCK_ENTITIES.register("dark_oak_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.DARK_OAK),
                            Chests.DARK_OAK_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> JUNGLE_CHEST =
            BLOCK_ENTITIES.register("jungle_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.JUNGLE),
                            Chests.JUNGLE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> MANGROVE_CHEST =
            BLOCK_ENTITIES.register("mangrove_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.MANGROVE),
                            Chests.MANGROVE_CHEST.get()).build(null));
    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> OAK_CHEST =
            BLOCK_ENTITIES.register("oak_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.OAK),
                            Chests.OAK_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> SPRUCE_CHEST =
            BLOCK_ENTITIES.register("spruce_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.SPRUCE),
                            Chests.SPRUCE_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<VariantChestBlockEntity>> WARPED_CHEST =
            BLOCK_ENTITIES.register("warped_chest", () ->
                    BlockEntityType.Builder.of((pos, state) -> new VariantChestBlockEntity(
                                    pos, state, VariantChests.WARPED),
                            Chests.WARPED_CHEST.get()).build(null));

    public static void registerBlockEntities() {
        BLOCK_ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}