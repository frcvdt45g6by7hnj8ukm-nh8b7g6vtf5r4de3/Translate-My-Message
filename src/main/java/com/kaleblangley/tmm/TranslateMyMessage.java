package com.kaleblangley.tmm;

import net.minecraft.client.Minecraft;
import net.minecraft.client.Options;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

public class TranslateMyMessage {
    public static final String MODID = "translate_my_message";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
    private static final Locale LOCALE = Locale.getDefault();
    public static final String SYSTEM_LANGUAGE = LOCALE.toString().toLowerCase();
    public TranslateMyMessage(){
        Options options = Minecraft.getInstance().options;

        options.languageCode = SYSTEM_LANGUAGE;
        options.save();
    }
}
