package net.xanthian.variantvanillablocks.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.item.ModItems;

import java.util.function.Supplier;

public class Beehives {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);
    public static final RegistryObject<Block> ACACIA_BEEHIVE = registerBlock("acacia_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_PLANKS)));
    public static final RegistryObject<Block> BAMBOO_BEEHIVE = registerBlock("bamboo_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_PLANKS)));
    public static final RegistryObject<Block> BIRCH_BEEHIVE = registerBlock("birch_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_PLANKS)));
    public static final RegistryObject<Block> CHERRY_BEEHIVE = registerBlock("cherry_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS)));
    public static final RegistryObject<Block> CRIMSON_BEEHIVE = registerBlock("crimson_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_PLANKS)));
    public static final RegistryObject<Block> DARK_OAK_BEEHIVE = registerBlock("dark_oak_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_PLANKS)));
    public static final RegistryObject<Block> JUNGLE_BEEHIVE = registerBlock("jungle_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_PLANKS)));
    public static final RegistryObject<Block> MANGROVE_BEEHIVE = registerBlock("mangrove_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_PLANKS)));
    public static final RegistryObject<Block> SPRUCE_BEEHIVE = registerBlock("spruce_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_PLANKS)));
    public static final RegistryObject<Block> WARPED_BEEHIVE = registerBlock("warped_beehive",
            () -> new BeehiveBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_PLANKS)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}