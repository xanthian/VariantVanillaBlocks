package net.xanthian.variantvanillablocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.*;
import net.minecraft.screen.SmithingScreenHandler;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(SmithingScreenHandler.class)
public class SmithingTableScreenHandlerMixin {

    @WrapOperation(method = "canUse", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean variantvanillablocks$customSmithingTableScreenHandler(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.getBlock() instanceof SmithingTableBlock;
    }
}