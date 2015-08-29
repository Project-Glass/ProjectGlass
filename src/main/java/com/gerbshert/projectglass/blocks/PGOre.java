package com.gerbshert.projectglass.blocks;

import com.gerbshert.projectglass.ProjectGlass;
import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Gabriel on 8/29/2015.
 */
public class PGOre extends Block {
    public PGOre(String name) {
        super(Material.ground);
        setCreativeTab(ProjectGlass.tabProjectGlass);
        setUnlocalizedName(Strings.MOD_ID + "_" + name);
        GameRegistry.registerBlock(this, name);
    }
}
