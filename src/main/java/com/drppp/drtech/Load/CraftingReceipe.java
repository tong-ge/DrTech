package com.drppp.drtech.Load;

import com.drppp.drtech.Blocks.BlocksInit;
import com.drppp.drtech.Items.MetaItems.MyMetaItems;
import com.drppp.drtech.MetaTileEntities.MetaTileEntities;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.blocks.MetaBlocks;
import gregtech.common.items.MetaItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CraftingReceipe {
    public static void load()
    {
        ModHandler.addShapedRecipe("log_factory", MetaTileEntities.LOG_FACTORY.getStackForm(),
                "WMW", "EFE", "WMW",
                'W', MetaItems.FIELD_GENERATOR_MV,
                'E', new UnificationEntry(OrePrefix.plate, Materials.Aluminium),
                'F', new ItemStack(BlocksInit.COMMON_CASING,1,8),
                'M', MetaItems.CONVEYOR_MODULE_LV);
        ModHandler.addShapedRecipe("yot_tank", MetaTileEntities.YOUT_TANK.getStackForm(),
                "WAW", "EFE", "MBM",
                'W', new UnificationEntry(OrePrefix.screw,Materials.TungstenSteel),
                'E', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.EV),
                'F', new ItemStack(BlocksInit.COMMON_CASING,1,9),
                'M', MetaItems.FIELD_GENERATOR_LV,
                'A', new UnificationEntry(OrePrefix.plate,Materials.Polytetrafluoroethylene),
                'B',  new UnificationEntry(OrePrefix.rotor,Materials.StainlessSteel)
        );
        ModHandler.addShapedRecipe("tfft_tank", MetaTileEntities.TFFT.getStackForm(),
                "WAW", "EFE", "MBM",
                'W', new UnificationEntry(OrePrefix.screw,Materials.TungstenSteel),
                'E', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.EV),
                'F', new ItemStack(BlocksInit.COMMON_CASING,1,10),
                'M', MetaItems.FIELD_GENERATOR_LV,
                'A', new UnificationEntry(OrePrefix.plate,Materials.Polytetrafluoroethylene),
                'B',  new UnificationEntry(OrePrefix.rotor,Materials.StainlessSteel)
        );
        ModHandler.addShapedRecipe("mob_killer", MetaTileEntities.MOB_KILLER.getStackForm(),
                "WAW", "AFA", "SSS",
                'W',  MetaItems.ROBOT_ARM_HV,
                'A', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.HV),
                'F', new ItemStack(MetaBlocks.MACHINE,1,988),
                'S', Items.DIAMOND_SWORD
        );
        ModHandler.addShapedRecipe("advanced_process_array", MetaTileEntities.ADVANCED_PROCESS_ARRAY.getStackForm(),
                "WWW", "WSW", "WWW",
                'W',  MetaBlocks.TRANSPARENT_CASING,
                'S', new ItemStack(MetaBlocks.MACHINE,1,1031)
        );
        ModHandler.addShapedRecipe("trans_tower", MetaTileEntities.TRANS_TOWER.getStackForm(),
                "WAW", "DSD", "WAW",
                'W', new UnificationEntry(OrePrefix.plateDouble,Materials.Copper),
                'D', new UnificationEntry(OrePrefix.plateDouble,Materials.Silver),
                'S', new ItemStack(MetaBlocks.MACHINE,1,986),
                'A', new UnificationEntry(OrePrefix.circuit, MarkerMaterials.Tier.LV)
        );
        ModHandler.addShapedRecipe("connector_1", new ItemStack(BlocksInit.BLOCK_CONNECTOR1),
                "WAW", "WSW", "WAW",
                'W',  new UnificationEntry(OrePrefix.plate,Materials.Lead),
                'S', new ItemStack(MetaBlocks.MACHINE,1,986),
                'A', new UnificationEntry(OrePrefix.plate,Materials.Polyethylene)
        );
        ModHandler.addShapedRecipe("connector_2", new ItemStack(BlocksInit.BLOCK_CONNECTOR2),
                "WAW", "WSW", "WAW",
                'W',  new UnificationEntry(OrePrefix.plate,Materials.Aluminium),
                'S', new ItemStack(MetaBlocks.MACHINE,1,987),
                'A', new UnificationEntry(OrePrefix.plate,Materials.Polyethylene)
        );
        ModHandler.addShapedRecipe("connector_3", new ItemStack(BlocksInit.BLOCK_CONNECTOR3),
                "WAW", "WSW", "WAW",
                'W',  new UnificationEntry(OrePrefix.plate,Materials.Electrum),
                'S', new ItemStack(MetaBlocks.MACHINE,1,988),
                'A', new UnificationEntry(OrePrefix.plate,Materials.Polyethylene)
        );
        ModHandler.addShapedRecipe("golden_sea", new ItemStack(BlocksInit.BLOCK_GOLDEN_SEA),
                "WWW", "WSW", "WWW",
                'W', Blocks.GOLD_BLOCK,
                'S', new UnificationEntry(OrePrefix.plate,Materials.Gold)
        );
    }
}
