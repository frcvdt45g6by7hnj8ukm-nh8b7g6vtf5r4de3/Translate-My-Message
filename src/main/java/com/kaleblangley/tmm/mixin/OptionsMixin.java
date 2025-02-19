package com.kaleblangley.tmm.mixin;

import com.kaleblangley.tmm.TranslateMyMessage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.io.File;

@Mixin(Options.class)
public class OptionsMixin {
    @Inject(method = "<init>", at = @At("TAIL"))
    public void tail(Minecraft p_92138_, File p_92139_, CallbackInfo ci){
        TranslateMyMessage.LOGGER.info("Me Translate");
    }
}
