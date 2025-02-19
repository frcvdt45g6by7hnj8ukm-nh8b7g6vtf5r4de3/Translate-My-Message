package com.kaleblangley.tmm;

import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.ImmediateWindowHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

@Mod(TranslateMyMessage.MODID)
public class TranslateMyMessage {
    public static final String MODID = "translate_my_message";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public TranslateMyMessage(){
        Options options = Minecraft.getInstance().options;
        Locale locales = Locale.getDefault();
        String language = String.format("%s_%s", locales.getLanguage(), locales.getCountry().toLowerCase());

        options.languageCode = language;
        options.save();
    }
}
