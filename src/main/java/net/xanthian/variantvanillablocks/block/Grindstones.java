package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.minecraft.resources.ResourceLocation;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrindstoneBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.item.ModItems;

import java.util.Map;
import java.util.function.Supplier;

public class Grindstones {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static Map<ResourceLocation, Supplier> MOD_GRINDSTONES = Maps.newHashMap();

    public static final RegistryObject<Block> ACACIA_GRINDSTONE = registerBlock("acacia_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_GRINDSTONE = registerBlock("bamboo_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BIRCH_GRINDSTONE = registerBlock("birch_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> CHERRY_GRINDSTONE = registerBlock("cherry_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_GRINDSTONE = registerBlock("crimson_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));

    public static final RegistryObject<Block> JUNGLE_GRINDSTONE = registerBlock("jungle_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_GRINDSTONE = registerBlock("mangrove_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> OAK_GRINDSTONE = registerBlock("oak_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_GRINDSTONE = registerBlock("spruce_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> WARPED_GRINDSTONE = registerBlock("warped_grindstone",
            () -> new GrindstoneBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}