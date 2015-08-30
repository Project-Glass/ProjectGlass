package com.gerbshert.projectglass.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;

/**
 * Created by Gabriel on 8/30/2015.
 */
public class MalletTough extends PGBaseItem{
    public MalletTough(String name){
        super(name);
    }
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List tooltip, boolean advanced) {
        tooltip.add(EnumChatFormatting.DARK_GRAY + "Lot#:354");
    }
}
