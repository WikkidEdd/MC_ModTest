
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.myfirstmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.myfirstmod.item.ItemHandleItem;
import net.mcreator.myfirstmod.item.ItemDiamondQuartzItem;
import net.mcreator.myfirstmod.MyFirstModMod;

public class MyFirstModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MyFirstModMod.MODID);
	public static final RegistryObject<Item> ITEM_DIAMOND_QUARTZ = REGISTRY.register("item_diamond_quartz", () -> new ItemDiamondQuartzItem());
	public static final RegistryObject<Item> DEVINE_CRAFTING_TABLE = block(MyFirstModModBlocks.DEVINE_CRAFTING_TABLE, CreativeModeTab.TAB_MISC);
	public static final RegistryObject<Item> ITEM_HANDLE = REGISTRY.register("item_handle", () -> new ItemHandleItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
