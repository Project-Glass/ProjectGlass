package com.gerbshert.projectglass;

import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * @author GerbShert
 */
public class CreativeTabProjectGlass extends CreativeTabs {

    public CreativeTabProjectGlass() {
        super(Strings.MOD_ID);
        setBackgroundImageName("tabProjectGlass.png");
    }

    @Override
    public Item getTabIconItem() {

        return Items.glass_bottle;
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }
}