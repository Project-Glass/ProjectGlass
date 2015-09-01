package com.gerbshert.projectglass.items;

import com.gerbshert.projectglass.ProjectGlass;
import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author GerbShert
 */
public class PGBaseItem extends Item {
    public PGBaseItem(String name) {
        setCreativeTab(ProjectGlass.tabProjectGlass);
        setUnlocalizedName(Strings.MOD_ID + "." + name);
        GameRegistry.registerItem(this, name);
    }
}