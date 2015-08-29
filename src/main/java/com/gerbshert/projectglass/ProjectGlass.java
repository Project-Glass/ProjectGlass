package com.gerbshert.projectglass;

import com.gerbshert.projectglass.lib.Strings;
import com.gerbshert.projectglass.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;

/**
 * Created by Gabriel on 8/28/2015.
 */

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.VERSION_NUMBER)
public class ProjectGlass {
    @SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance(Strings.MOD_ID)
    public static ProjectGlass instance;

    public static CreativeTabs tabProjectGlass = new CreativeTabProjectGlass();
}
