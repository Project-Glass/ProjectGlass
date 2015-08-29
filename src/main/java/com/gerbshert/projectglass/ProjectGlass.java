package com.gerbshert.projectglass;

import com.gerbshert.projectglass.blocks.PGBlocks;
import com.gerbshert.projectglass.items.PGItems;
import com.gerbshert.projectglass.lib.Strings;
import com.gerbshert.projectglass.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

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

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        PGBlocks.RegisterBlocks();
        PGItems.RegisterItems();
        //GameRegistry.registerWorldGenerator(PGOreGen, 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            PGBlocks.RenderBlocks();
            PGItems.RenderItems();
        } else {
            System.out.println("You are running 'Project Glass' on a server! Thanks so much :3 for the support this mod!");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
