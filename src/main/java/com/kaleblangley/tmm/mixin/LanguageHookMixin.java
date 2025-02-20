package com.kaleblangley.tmm.mixin;

import com.kaleblangley.tmm.TranslateMyMessage;
import net.minecraft.client.Minecraft;
import net.minecraftforge.server.LanguageHook;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = LanguageHook.class, remap = false)
public abstract class LanguageHookMixin {
    @ModifyConstant(method = "loadForgeAndMCLangs", constant = @Constant(stringValue = "assets/forge/lang/en_us.json"))
    private static String loadForgeBetterLangs(String constant) {
        return String.format("assets/forge/lang/%s.json", Minecraft.getInstance().options.languageCode);
    }
}
