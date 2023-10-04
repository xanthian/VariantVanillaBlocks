package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.ComposterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Map;
import java.util.function.Supplier;

public class Composters {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static Map<ResourceLocation, Supplier> MOD_COMPOSTERS = Maps.newHashMap();

    public static final RegistryObject<Block> ACACIA_COMPOSTER = register("acacia_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)),300);
    public static final RegistryObject<Block> BAMBOO_COMPOSTER = register("bamboo_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)),300);
    public static final RegistryObject<Block> BIRCH_COMPOSTER = register("birch_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)),300);
    public static final RegistryObject<Block> CHERRY_COMPOSTER = register("cherry_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)),300);
    public static final RegistryObject<Block> CRIMSON_COMPOSTER = register("crimson_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)),0);
    public static final RegistryObject<Block> DARK_OAK_COMPOSTER = register("dark_oak_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)),300);
    public static final RegistryObject<Block> JUNGLE_COMPOSTER = register("jungle_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)),300);
    public static final RegistryObject<Block> MANGROVE_COMPOSTER = register("mangrove_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)),300);
    public static final RegistryObject<Block> OAK_COMPOSTER = register("oak_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)),300);

    public static final RegistryObject<Block> WARPED_COMPOSTER = register("warped_composter",
            () -> new ComposterBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)),0);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerItem(String name, RegistryObject<T> block, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()){
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }
}