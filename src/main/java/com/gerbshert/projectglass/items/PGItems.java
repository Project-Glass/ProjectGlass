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

    }

    public static void renderItems() {
        //Glow Crystals
        RenderMe(crystalBlack, "crystalBlack");
        RenderMe(crystalBlue, "crystalBlue");
        RenderMe(crystalGreen, "crystalGreen");
        RenderMe(crystalRed, "crystalRed");
        RenderMe(crystalWhite, "crystalWhite");
        //Mallets
        RenderMe(malletPadded, "malletPadded");
        RenderMe(malletTough, "malletTough");
    }

    public static void RenderMe(Item myItem, String myName) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(myItem, 0, new ModelResourceLocation(Strings.MOD_ID + ":" + myName, "inventory"));
    }
}