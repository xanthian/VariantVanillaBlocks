package net.xanthian.variantvanillablocks.block;

import com.google.common.collect.Maps;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
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

public class Bookshelves {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static Map<ResourceLocation, Supplier> MOD_BOOKSHELVES = Maps.newHashMap();

    public static final RegistryObject<Block> ACACIA_BOOKSHELF = register("acacia_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), 300);
    public static final RegistryObject<Block> BAMBOO_BOOKSHELF = register("bamboo_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)), 300);
    public static final RegistryObject<Block> BIRCH_BOOKSHELF = register("birch_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), 300);
    public static final RegistryObject<Block> CHERRY_BOOKSHELF = register("cherry_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)), 300);
    public static final RegistryObject<Block> CRIMSON_BOOKSHELF = register("crimson_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), 0);
    public static final RegistryObject<Block> DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)), 300);
    public static final RegistryObject<Block> JUNGLE_BOOKSHELF = register("jungle_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), 300);
    public static final RegistryObject<Block> MANGROVE_BOOKSHELF = register("mangrove_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), 300);

    public static final RegistryObject<Block> SPRUCE_BOOKSHELF = register("spruce_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), 300);
    public static final RegistryObject<Block> WARPED_BOOKSHELF = register("warped_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), 0);

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