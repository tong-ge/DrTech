package com.drppp.drtech.Blocks;

import com.drppp.drtech.Blocks.Crops.CropsInit;
import com.drppp.drtech.Blocks.MetaBlocks.*;
import com.drppp.drtech.Blocks.Pipe.BlockMyLaserPipe;
import com.drppp.drtech.DrTechMain;
import com.drppp.drtech.Tags;
import com.drppp.drtech.Tile.TileEntityConnector;
import com.drppp.drtech.Tile.TileEntityGoldenSea;
import com.drppp.drtech.Tile.TileEntityGravitationalAnomaly;
import com.drppp.drtech.Tile.TileEntityHomoEye;
import com.drppp.drtech.Utils.Datas;
import com.sun.jna.platform.win32.WinNT;
import gregtech.common.pipelike.laser.LaserPipeType;
import net.minecraft.block.Block;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.Vec3d;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.lwjgl.util.vector.Vector3f;

import java.util.Random;

public class BlocksInit {
    public static final BlockGravitationalAnomaly BLOCK_GRAVITATIONAL_ANOMALY = new BlockGravitationalAnomaly();
    public static final BlockHomoEye BLOCK_HOMO_EYE = new BlockHomoEye();
    public static final BlockConnector BLOCK_CONNECTOR1 = new BlockConnector(1);
    public static final BlockConnector BLOCK_CONNECTOR2 = new BlockConnector(2);
    public static final BlockConnector BLOCK_CONNECTOR3 = new BlockConnector(3);
    public static final BlockGoldenSea BLOCK_GOLDEN_SEA = new BlockGoldenSea();
    public static final MetaGlasses TRANSPARENT_CASING = new MetaGlasses("glasses_casing");
    public static final MetaGlasses1 TRANSPARENT_CASING1 = new MetaGlasses1("glasses_casing1");
    public static final MetaCasing COMMON_CASING = new MetaCasing();
    public static final BlockYotTankPart YOT_TANK = new BlockYotTankPart();
    public static final BlockFTTFPart TFFT_TANK = new BlockFTTFPart();
    public static final BlockMyLaserPipe MY_LASER_PIPE = new BlockMyLaserPipe(LaserPipeType.values()[0]);

    public  static void init(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().register(BLOCK_GRAVITATIONAL_ANOMALY);
        GameRegistry.registerTileEntity(TileEntityGravitationalAnomaly.class, new ResourceLocation(Tags.MODID, "gravitational_anomaly"));
        event.getRegistry().register(BLOCK_HOMO_EYE);
        GameRegistry.registerTileEntity(TileEntityHomoEye.class, new ResourceLocation(Tags.MODID, "homo_eye"));
        event.getRegistry().register(BLOCK_CONNECTOR1);
        event.getRegistry().register(BLOCK_CONNECTOR2);
        event.getRegistry().register(BLOCK_CONNECTOR3);
        GameRegistry.registerTileEntity(TileEntityConnector.class, new ResourceLocation(Tags.MODID, "connetor"));
        event.getRegistry().register(BLOCK_GOLDEN_SEA);
        GameRegistry.registerTileEntity(TileEntityGoldenSea.class, new ResourceLocation(Tags.MODID, "gold_coin"));
        event.getRegistry().register(TRANSPARENT_CASING);
        event.getRegistry().register(TRANSPARENT_CASING1);
        event.getRegistry().register(COMMON_CASING);
        event.getRegistry().register(YOT_TANK);
        event.getRegistry().register(TFFT_TANK);

        MY_LASER_PIPE.setRegistryName("my_laser_pipe_normal");
        MY_LASER_PIPE.setTranslationKey("my_laser_pipe_normal");
        MY_LASER_PIPE.setCreativeTab(DrTechMain.Mytab);
        event.getRegistry().register(MY_LASER_PIPE);
        Datas.init();
    }

    public static Vector3f randomSpherePoint(double x0, double y0, double z0, Vec3d radius, Random rand) {
        double u = rand.nextDouble();
        double v = rand.nextDouble();
        double theta = 6.283185307179586 * u;
        double phi = Math.acos(2.0 * v - 1.0);
        double x = x0 + radius.x * Math.sin(phi) * Math.cos(theta);
        double y = y0 + radius.y * Math.sin(phi) * Math.sin(theta);
        double z = z0 + radius.z * Math.cos(phi);
        return new Vector3f((float)x, (float)y, (float)z);
    }

}
