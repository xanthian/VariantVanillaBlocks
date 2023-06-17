package net.xanthian.variantvanillablocks.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;

import net.xanthian.variantvanillablocks.block.*;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @Inject(method = "supports", at = @At("HEAD"), cancellable = true)
    private void supports(BlockState state, CallbackInfoReturnable<Boolean> info) {
        //noinspection EqualsBetweenInconvertibleTypes
        if (BlockEntityType.LECTERN.equals(this) && state.getBlock() instanceof VariantLecternBlock) {
            info.setReturnValue(true);
        }
        if (BlockEntityType.BEEHIVE.equals(this) && state.getBlock() instanceof VariantBeehiveBlock) {
            info.setReturnValue(true);
        }
    }
}