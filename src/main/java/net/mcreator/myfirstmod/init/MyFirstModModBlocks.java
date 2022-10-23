
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.myfirstmod.block.DevineCraftingTableBlock;
import net.mcreator.myfirstmod.MyFirstModMod;

public class MyFirstModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MyFirstModMod.MODID);
	public static final RegistryObject<Block> DEVINE_CRAFTING_TABLE = REGISTRY.register("devine_crafting_table",
			() -> new DevineCraftingTableBlock());
}
