package net.xanthian.variantvanillablocks.utils;

import net.minecraft.block.Block;
import net.minecraft.data.client.*;

public class ModTextureMap extends TextureMap {

    // Texture map used in datagen for the Cartography Table models
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
    // Texture map used in datagen for the Bookshelf models
    public static TextureMap endside(Block frontTopSideBlock, Block endBlock) {
        return (new ModTextureMap())
                .put(TextureKey.PARTICLE, getId(frontTopSideBlock))
                .put(TextureKey.DOWN, getId(endBlock))
                .put(TextureKey.UP, getId(endBlock))
                .put(TextureKey.NORTH, getId(frontTopSideBlock))
                .put(TextureKey.SOUTH, getId(frontTopSideBlock))
                .put(TextureKey.EAST, getId(frontTopSideBlock))
                .put(TextureKey.WEST, getId(frontTopSideBlock));
    }
}