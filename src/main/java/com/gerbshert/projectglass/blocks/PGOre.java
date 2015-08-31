package com.gerbshert.projectglass.blocks;

import com.gerbshert.projectglass.ProjectGlass;
import com.gerbshert.projectglass.lib.Strings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author GerbShert
 */
public class PGOre extends Block {
    public PGOre(String name) {
        super(Material.ground);
        setCreativeTab(ProjectGlass.tabProjectGlass);
        setUnlocalizedName(name);

        PGBlocks.blocks.add(this);
    }
}
