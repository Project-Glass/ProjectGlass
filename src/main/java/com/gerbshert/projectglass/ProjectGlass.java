package com.gerbshert.projectglass;

import com.gerbshert.projectglass.blocks.PGBlocks;
import com.gerbshert.projectglass.items.PGItems;
import com.gerbshert.projectglass.lib.Strings;
import com.gerbshert.projectglass.misc.Config;
import com.gerbshert.projectglass.proxy.CommonProxy;
import com.gerbshert.projectglass.world.generation.PGOreGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import java.io.File;

/**
 * @author GerbShert
 */

@Mod(modid = Strings.MOD_ID, name = Strings.MOD_NAME, version = Strings.VERSION_NUMBER)
public class ProjectGlass {
    @SidedProxy(clientSide = Strings.CLIENT_PROXY_CLASS, serverSide = Strings.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.Instance(Strings.MOD_ID)
    public static ProjectGlass instance;

    public static CreativeTabs tabProjectGlass = new CreativeTabProjectGlass();
    public static PGOreGen pgOreGen = new PGOreGen();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Config.initConfiguration(new Configuration(new File(event.getModConfigurationDirectory().toString() + "/ProjectGlass/ProjectGlass.cfg")));

        PGBlocks.registerBlocks();
        PGItems.registerItems();
        GameRegistry.registerWorldGenerator(pgOreGen, 0);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        if (event.getSide() == Side.CLIENT) {
            PGBlocks.renderBlocks();
            PGItems.renderItems();
        } else {
            System.out.println("You are running 'Project Glass' on a server!  :3\nThanks so much for supporting this mod!");
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}
