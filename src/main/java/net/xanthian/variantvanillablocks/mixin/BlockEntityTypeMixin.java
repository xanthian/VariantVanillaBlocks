package net.xanthian.variantvanillablocks.mixin;

import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.BeehiveBlock;
import net.minecraft.world.level.block.LecternBlock;
import net.minecraft.world.level.block.SmokerBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @SuppressWarnings("EqualsBetweenInconvertibleTypes")
    @Inject(method = "isValid", at = @At("HEAD"), cancellable = true)
    private void supports(BlockState state, CallbackInfoReturnable<Boolean> info) {
        //noinspection EqualsBetweenInconvertibleTypes
        if (BlockEntityType.LECTERN.equals(this) && state.getBlock() instanceof LecternBlock) {
            info.setReturnValue(true);
        }
        if (BlockEntityType.BEEHIVE.equals(this) && state.getBlock() instanceof BeehiveBlock) {
            info.setReturnValue(true);
        }
        if (BlockEntityType.BARREL.equals(this) && state.getBlock() instanceof BarrelBlock) {
            info.setReturnValue(true);
        }
        if (BlockEntityType.SMOKER.equals(this) && state.getBlock() instanceof SmokerBlock) {
            info.setReturnValue(true);
        }
    }
}