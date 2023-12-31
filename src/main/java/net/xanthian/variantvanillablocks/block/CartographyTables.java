package net.xanthian.variantvanillablocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CartographyTableBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.function.Supplier;

public class CartographyTables {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);
    public static final RegistryObject<Block> ACACIA_CARTOGRAPHY_TABLE = register("acacia_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)), 300);
    public static final RegistryObject<Block> BAMBOO_CARTOGRAPHY_TABLE = register("bamboo_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)), 300);
    public static final RegistryObject<Block> BIRCH_CARTOGRAPHY_TABLE = register("birch_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)), 300);
    public static final RegistryObject<Block> CHERRY_CARTOGRAPHY_TABLE = register("cherry_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)), 300);
    public static final RegistryObject<Block> CRIMSON_CARTOGRAPHY_TABLE = register("crimson_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)), 0);
    public static final RegistryObject<Block> JUNGLE_CARTOGRAPHY_TABLE = register("jungle_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)), 300);
    public static final RegistryObject<Block> MANGROVE_CARTOGRAPHY_TABLE = register("mangrove_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)), 300);
    public static final RegistryObject<Block> OAK_CARTOGRAPHY_TABLE = register("oak_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)), 300);
    public static final RegistryObject<Block> SPRUCE_CARTOGRAPHY_TABLE = register("spruce_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)), 300);
    public static final RegistryObject<Block> WARPED_CARTOGRAPHY_TABLE = register("warped_cartography_table",
            () -> new CartographyTableBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)), 0);

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block, int burnTime) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerItem(name, toReturn, burnTime);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerItem(String name, RegistryObject<T> block, int burnTime) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()) {
            @Override
            public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
                return burnTime;
            }
        });
    }
}