package com.gerbshert.projectglass.world.generation;

import com.gerbshert.projectglass.blocks.PGBlocks;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * @author GerbShert
 */
public class PGOreGen implements IWorldGenerator {
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.getDimensionId()) {
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateEnd(World world, Random random, int x, int z) {

    }

    private void generateSurface(World world, Random random, int x, int z) {
        this.addOreSpawn(PGBlocks.oreCrystalBlack, world, random, x, z, 16, 16, 8 + random.nextInt(3), 5, 5, 16);
        this.addOreSpawn(PGBlocks.oreCrystalBlue, world, random, x, z, 16, 16, 8 + random.nextInt(3), 5, 5, 16);
        this.addOreSpawn(PGBlocks.oreCrystalGreen, world, random, x, z, 16, 16, 8 + random.nextInt(3), 5, 5, 16);
        this.addOreSpawn(PGBlocks.oreCrystalRed, world, random, x, z, 16, 16, 8 + random.nextInt(3), 5, 5, 16);
        this.addOreSpawn(PGBlocks.oreCrystalWhite, world, random, x, z, 16, 16, 8 + random.nextInt(3), 5, 5, 16);
    }

    private void generateNether(World world, Random random, int x, int z) {
    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            BlockPos blockPos = new BlockPos(posX, posY, posZ);
            (new WorldGenMinable(block.getDefaultState(), maxVeinSize)).generate(world, random, blockPos);
        }
    }
}