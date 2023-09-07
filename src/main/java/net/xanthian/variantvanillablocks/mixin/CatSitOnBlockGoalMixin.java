package net.xanthian.variantvanillablocks.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.ai.goal.CatSitOnBlockGoal;

import net.xanthian.variantvanillablocks.block.VariantChestBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(CatSitOnBlockGoal.class)
public class CatSitOnBlockGoalMixin {

    @WrapOperation(method = "isTargetPos", at = @At(value = "INVOKE", ordinal = 1, target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean variantvanillablocks$customChest(BlockState state, Block block, Operation<Boolean> original) {
        return original.call(state, block) || state.getBlock() instanceof VariantChestBlock;
    }
}
