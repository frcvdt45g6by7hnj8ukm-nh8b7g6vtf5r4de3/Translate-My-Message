package com.kaleblangley.tmm.mixin;

import com.kaleblangley.tmm.TranslateMyMessage;
import net.minecraftforge.fml.loading.ImmediateWindowHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ImmediateWindowHandler.class, remap = false)
public class ImmediateWindowHandlerMixin {
    @Inject(method = "updateProgress", at = @At(value = "HEAD"))
    private static void labelMessage(String message, CallbackInfo ci){
        TranslateMyMessage.LOGGER.info(message);
    }
}
