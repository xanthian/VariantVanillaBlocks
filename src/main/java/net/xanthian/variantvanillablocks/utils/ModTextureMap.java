package net.xanthian.variantvanillablocks.utils;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;

public class ModTextureMap extends TextureMap {

    // Datagen for the Cartography table models
    public static TextureMap threesides(Block frontTopSideBlock, Block downBlock) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getSubId(frontTopSideBlock, "_side3"))
                .put(TextureKey.DOWN, getId(downBlock))
                .put(TextureKey.UP, getSubId(frontTopSideBlock, "_top"))
                .put(TextureKey.NORTH, getSubId(frontTopSideBlock, "_side3"))
                .put(TextureKey.SOUTH, getSubId(frontTopSideBlock, "_side1"))
                .put(TextureKey.EAST, getSubId(frontTopSideBlock, "_side3"))
                .put(TextureKey.WEST, getSubId(frontTopSideBlock, "_side2"));
    }
}