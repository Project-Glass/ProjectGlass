package com.gerbshert.projectglass.blocks;

import com.gerbshert.projectglass.lib.Strings;
import com.gerbshert.projectglass.misc.Config;
import net.minecraft.block.Block;
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
public class PGBlocks {
    //Ore
    public static Block oreCrystalBlack;
    public static Block oreCrystalBlue;
    public static Block oreCrystalGreen;
    public static Block oreCrystalRed;
    public static Block oreCrystalWhite;


    public static void registerBlocks() {
        //Ore
        oreCrystalBlack = new PGOre("oreCrystalBlack");
        oreCrystalBlue = new PGOre("oreCrystalBlue");
        oreCrystalGreen = new PGOre("oreCrystalGreen");
        oreCrystalRed = new PGOre("oreCrystalRed");
        oreCrystalWhite = new PGOre("oreCrystalWhite");
    }

    public static void renderBlocks() {
        //Ore
        RenderMe(oreCrystalBlack, "oreCrystalBlack");
        RenderMe(oreCrystalBlue, "oreCrystalBlue");
        RenderMe(oreCrystalGreen, "oreCrystalGreen");
        RenderMe(oreCrystalRed, "oreCrystalRed");
        RenderMe(oreCrystalWhite, "oreCrystalWhite");

    }

    public static void RenderMe(Block myBlock, String myName) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(myBlock), 0, new ModelResourceLocation(Strings.MOD_ID + ":" + myName, "inventory"));
    }
}
