package com.kaleblangley.tmm.mixin;

import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModLoader;
import net.minecraftforge.forgespi.locating.IModFile;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = ModLoader.class, remap = false)
public class ModLoaderMixin {
    @Inject(method = "buildMods", at = @At("HEAD"))
    private void head(IModFile modFile, CallbackInfoReturnable<List<ModContainer>> cir){

    }
}
