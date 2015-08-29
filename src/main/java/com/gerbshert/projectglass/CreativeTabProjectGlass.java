package com.gerbshert.projectglass;

import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Gabriel on 8/28/2015.
 */
public class CreativeTabProjectGlass extends CreativeTabs {

    public CreativeTabProjectGlass() {

        super(Strings.MOD_ID);
    }

    @Override
    public Item getTabIconItem() {

        return Items.glass_bottle;
    }
}