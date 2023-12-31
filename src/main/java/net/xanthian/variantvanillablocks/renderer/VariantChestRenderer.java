package net.xanthian.variantvanillablocks.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BrightnessCombiner;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.entity.LidBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.xanthian.variantvanillablocks.Initialise;
import net.xanthian.variantvanillablocks.block.custom.VariantChestBlock;
import net.xanthian.variantvanillablocks.block.custom.VariantChests;
import net.xanthian.variantvanillablocks.entity.VariantChestBlockEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

@OnlyIn(Dist.CLIENT)
public class VariantChestRenderer<T extends VariantChestBlockEntity & LidBlockEntity> extends ChestRenderer<T> {

    public static Material[] single = new Material[VariantChests.values().length];
    public static Material[] left = new Material[VariantChests.values().length];
    public static Material[] right = new Material[VariantChests.values().length];

    static {
        for (VariantChests type : VariantChests.values()) {
            int ordinal = type.ordinal();
            String name = type.name().toLowerCase(Locale.ROOT);
            single[ordinal] = getChestID(name + "_chest");
            left[ordinal] = getChestID(name + "_chest_left");
            right[ordinal] = getChestID(name + "_chest_right");
        }
    }

    private final ModelPart lid;
    private final ModelPart bottom;
    private final ModelPart lock;
    private final ModelPart doubleLeftLid;
    private final ModelPart doubleLeftBottom;
    private final ModelPart doubleLeftLock;
    private final ModelPart doubleRightLid;
    private final ModelPart doubleRightBottom;
    private final ModelPart doubleRightLock;

    public VariantChestRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
        ModelPart modelPart = context.bakeLayer(ModelLayers.CHEST);
        this.lid = modelPart.getChild("lid");
        this.bottom = modelPart.getChild("bottom");
        this.lock = modelPart.getChild("lock");
        ModelPart modelPart2 = context.bakeLayer(ModelLayers.DOUBLE_CHEST_LEFT);
        this.doubleLeftLid = modelPart2.getChild("lid");
        this.doubleLeftBottom = modelPart2.getChild("bottom");
        this.doubleLeftLock = modelPart2.getChild("lock");
        ModelPart modelPart3 = context.bakeLayer(ModelLayers.DOUBLE_CHEST_RIGHT);
        this.doubleRightLid = modelPart3.getChild("lid");
        this.doubleRightBottom = modelPart3.getChild("bottom");
        this.doubleRightLock = modelPart3.getChild("lock");
    }

    public static Material getChestID(String path) {
        return new Material(Sheets.CHEST_SHEET, new ResourceLocation(Initialise.MOD_ID, "entity/chest/" + path)) {
        };
    }

    public static Material chooseMaterial(ChestType type, Material left, Material right, Material single) {
        return switch (type) {
            case LEFT -> left;
            case RIGHT -> right;
            default -> single;
        };
    }

    private Material getChestTexture(VariantChestBlockEntity tile, ChestType type) {
        return chooseMaterial(type, left[tile.getChestType().ordinal()], right[tile.getChestType().ordinal()], single[tile.getChestType().ordinal()]);
    }

    public void render(T pBlockEntity, float pPartialTick, @NotNull PoseStack pPoseStack, @NotNull MultiBufferSource pBuffer, int pPackedLight, int pPackedOverlay) {
        Level level = pBlockEntity.getLevel();

        BlockState blockState = level != null ? pBlockEntity.getBlockState() : Blocks.CHEST.defaultBlockState().setValue(ChestBlock.FACING, Direction.SOUTH);
        ChestType chestType = blockState.hasProperty(ChestBlock.TYPE) ? blockState.getValue(ChestBlock.TYPE) : ChestType.SINGLE;
        Block block = blockState.getBlock();

        if (block instanceof VariantChestBlock) {
            boolean bl2 = chestType != ChestType.SINGLE;
            pPoseStack.pushPose();

            float f = blockState.getValue(ChestBlock.FACING).toYRot();
            pPoseStack.translate(0.5F, 0.5F, 0.5F);
            pPoseStack.mulPose(Axis.YP.rotationDegrees(-f));
            pPoseStack.translate(-0.5F, -0.5F, -0.5F);

            DoubleBlockCombiner.NeighborCombineResult<? extends ChestBlockEntity> neighborcombineresult;

            if (level == null) {
                neighborcombineresult = DoubleBlockCombiner.Combiner::acceptNone;
            } else {
                neighborcombineresult = ((VariantChestBlock) block).combine(blockState, level, pBlockEntity.getBlockPos(), true);
            }

            float g = neighborcombineresult.apply(ChestBlock.opennessCombiner(pBlockEntity)).get(pPartialTick);
            g = 1.0F - g;
            g = 1.0F - g * g * g;
            int i = neighborcombineresult.apply(new BrightnessCombiner<>()).applyAsInt(pPackedLight);
            Material material = getChestTexture(pBlockEntity, chestType);
            VertexConsumer vertexconsumer = material.buffer(pBuffer, RenderType::entityCutout);
            if (bl2) {
                if (chestType == ChestType.LEFT) {
                    this.render(pPoseStack, vertexconsumer, this.doubleLeftLid, this.doubleLeftLock, this.doubleLeftBottom, g, i, pPackedOverlay);
                } else {
                    this.render(pPoseStack, vertexconsumer, this.doubleRightLid, this.doubleRightLock, this.doubleRightBottom, g, i, pPackedOverlay);
                }
            } else {
                this.render(pPoseStack, vertexconsumer, this.lid, this.lock, this.bottom, g, i, pPackedOverlay);
            }
            pPoseStack.popPose();
        }
    }

    private void render(PoseStack pPoseStack, VertexConsumer pConsumer, ModelPart pLidPart, ModelPart pLockPart, ModelPart pBottomPart, float pLidAngle, int pPackedLight, int pPackedOverlay) {
        pLidPart.xRot = -(pLidAngle * ((float) Math.PI / 2F));
        pLockPart.xRot = pLidPart.xRot;
        pLidPart.render(pPoseStack, pConsumer, pPackedLight, pPackedOverlay);
        pLockPart.render(pPoseStack, pConsumer, pPackedLight, pPackedOverlay);
        pBottomPart.render(pPoseStack, pConsumer, pPackedLight, pPackedOverlay);
    }
}