package net.xanthian.variantvanillablocks;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.xanthian.variantvanillablocks.renderer.EntityRenderInitialise;

@Environment(EnvType.CLIENT)
public class ClientInitialise implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRenderInitialise.register();
    }
}