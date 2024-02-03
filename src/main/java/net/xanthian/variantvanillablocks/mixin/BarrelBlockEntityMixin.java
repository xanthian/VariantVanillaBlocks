package net.xanthian.variantvanillablocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.LootableContainerBlockEntity;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.xanthian.variantvanillablocks.block.custom.VariantBarrelBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BarrelBlockEntity.class)
public abstract class BarrelBlockEntityMixin extends LootableContainerBlockEntity {

    protected BarrelBlockEntityMixin(BlockEntityType<?> blockEntityType, BlockPos blockPos, BlockState blockState) {
        super(blockEntityType, blockPos, blockState);
    }

    @Inject(method = "getContainerName", at = @At(value = "RETURN"), cancellable = true)
    public void getContainerName(CallbackInfoReturnable<Text> cir) {
        if (this.getCachedState().getBlock() instanceof VariantBarrelBlock) {
            Text text = Text.translatable(this.getCachedState().getBlock().getTranslationKey());
            cir.setReturnValue(text);
        } else {
            MutableText text2 = cir.getReturnValue().copy();
            cir.setReturnValue(text2);
        }
    }
}
