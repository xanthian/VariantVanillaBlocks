package net.xanthian.variantvanillablocks.utils;

import net.minecraft.data.client.Model;
import net.minecraft.data.client.TextureKey;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModel {

    public static final Model CHEST;
    public static final Model COMPOSTER;
    public static final Model GRINDSTONE;
    public static final Model LECTERN;

    public static Identifier getBlockId(String id) {
        return new Identifier("variantvanillablocks", "block/" + id);
    }

    public static Model createModel(String parent, TextureKey... requiredTextures) {
        return new Model(Optional.of(getBlockId(parent)), Optional.empty(), requiredTextures);
    }

    static {
        CHEST = createModel("variantchest", ModTextureKey.CHEST);
        COMPOSTER = createModel("variantcomposter", TextureKey.TOP, TextureKey.BOTTOM, TextureKey.SIDE, TextureKey.INSIDE, TextureKey.PARTICLE);
        GRINDSTONE = createModel("variantgrindstone", ModTextureKey.PIVOT, TextureKey.SIDE, ModTextureKey.ROUND, ModTextureKey.LEG,  TextureKey.PARTICLE);
        LECTERN = createModel("variantlectern", ModTextureKey.BASE, TextureKey.BOTTOM, ModTextureKey.SIDES, TextureKey.FRONT, TextureKey.TOP, TextureKey.PARTICLE);
    }
}