package com.gerbshert.projectglass.misc;

import net.minecraftforge.common.config.Configuration;

/**
 * @author MrComputerGhost
 */
public class Config {

    public static boolean useAlternateTextures;

    public static void initConfiguration(Configuration config) {
        config.load();
        useAlternateTextures = config.getBoolean("useAlternateTextures", "misc", true, "Whether or not to use original GlowGlass-based textures");
        config.save();
    }

}
