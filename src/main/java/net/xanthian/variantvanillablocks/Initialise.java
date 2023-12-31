package net.xanthian.variantvanillablocks;

import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.xanthian.variantvanillablocks.block.*;
import net.xanthian.variantvanillablocks.entity.EntityInitialise;
import net.xanthian.variantvanillablocks.item.ModItems;
import net.xanthian.variantvanillablocks.renderer.VariantChestRenderer;
import net.xanthian.variantvanillablocks.utils.ModCreativeModTabs;
import net.xanthian.variantvanillablocks.utils.ModPOITypes;


@Mod(Initialise.MOD_ID)
@Mod.EventBusSubscriber
public class Initialise {

    public static final String MOD_ID = "variantvanillablocks";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModPOITypes.POI_TYPES.register(modEventBus);

        ModCreativeModTabs.CREATIVE_MODE_TABS.register(modEventBus);

        Barrels.BLOCKS.register(modEventBus);
        Beehives.BLOCKS.register(modEventBus);
        Bookshelves.BLOCKS.register(modEventBus);
        CartographyTables.BLOCKS.register(modEventBus);
        Chests.BLOCKS.register(modEventBus);
        ChiseledBookshelves.BLOCKS.register(modEventBus);
        Composters.BLOCKS.register(modEventBus);
        CraftingTables.BLOCKS.register(modEventBus);
        FletchingTables.BLOCKS.register(modEventBus);
        Grindstones.BLOCKS.register(modEventBus);
        Lecterns.BLOCKS.register(modEventBus);
        SmithingTables.BLOCKS.register(modEventBus);
        Smokers.BLOCKS.register(modEventBus);

        ModItems.ITEMS.register(modEventBus);

        modEventBus.addListener(this::registerChestEntityRenders);
        EntityInitialise.registerBlockEntities();

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void registerChestEntityRenders(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(EntityInitialise.ACACIA_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BAMBOO_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.BIRCH_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CHERRY_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.CRIMSON_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.DARK_OAK_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.JUNGLE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.MANGROVE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.SPRUCE_CHEST.get(), VariantChestRenderer::new);
        event.registerBlockEntityRenderer(EntityInitialise.WARPED_CHEST.get(), VariantChestRenderer::new);
    }
}