package com.gerbshert.projectglass.items;

import com.gerbshert.projectglass.lib.Strings;
import com.gerbshert.projectglass.misc.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GerbShert
 */
public class PGItems {

    public static List<Item> items = new ArrayList<Item>();

    //Glow Crystals
    public static Item crystalBlack;
    public static Item crystalBlue;
    public static Item crystalGreen;
    public static Item crystalRed;
    public static Item crystalWhite;
    //Mallets
    public static Item malletPadded;
    public static Item malletTough;


    public static void registerItems() {
        //Glow Crystals
        crystalBlack = new PGBaseItem("crystalBlack");
        crystalBlue = new PGBaseItem("crystalBlue");
        crystalGreen = new PGBaseItem("crystalGreen");
        crystalRed = new PGBaseItem("crystalRed");
        crystalWhite = new PGBaseItem("crystalWhite");
        //Mallets
        malletPadded = new PGBaseItem("malletPadded");
        malletTough = new MalletTough("malletTough");

        for (Item item : items) {
            GameRegistry.registerItem(item, item.getUnlocalizedName());
        }
    }

    public static void renderItems() {
        for (Item item : items) {
            RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
            renderItem.getItemModelMesher().register(item, 0, new ModelResourceLocation(Strings.MOD_ID + ":" + item.getUnlocalizedName() + (Config.useAlternateTextures ? "" : "_alt"), "inventory"));
        }
    }

}
