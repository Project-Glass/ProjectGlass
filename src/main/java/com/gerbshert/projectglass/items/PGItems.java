package com.gerbshert.projectglass.items;

import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by Gabriel on 8/29/2015.
 */
public class PGItems {
    //Glow Crystals
    public static Item crystalBlack;
    public static Item crystalBlue;
    public static Item crystalGreen;
    public static Item crystalRed;
    public static Item crystalWhite;

    public static void RegisterItems() {
        //Glow Crystals
        crystalBlack = new PGBaseItem("crystalBlack");
        crystalBlue = new PGBaseItem("crystalBlue");
        crystalGreen = new PGBaseItem("crystalGreen");
        crystalRed = new PGBaseItem("crystalRed");
        crystalWhite = new PGBaseItem("crystalWhite");
    }

    public static void RenderItems() {
        //Glow Crystals
        RenderMe(crystalBlack, "crystalBlack");
        RenderMe(crystalBlue, "crystalBlue");
        RenderMe(crystalGreen, "crystalGreen");
        RenderMe(crystalRed, "crystalRed");
        RenderMe(crystalWhite, "crystalWhite");

    }

    public static void RenderMe(Item myItem, String myName) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(myItem, 0, new ModelResourceLocation(Strings.MOD_ID + ":" + myName, "inventory"));
    }
}
