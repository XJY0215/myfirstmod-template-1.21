package com.xjy0215.myfirstmod.item;

import com.xjy0215.myfirstmod.MyFirstMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item ICE_ETHER = register("ice_ether", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),
                Identifier.of(MyFirstMod.MOD_ID, id)), item);
        //return Registry.register(Registries.ITEM, Identifier.of(MyFirstMod.MOD_ID, id), item);
    }

    private static void addItemToItemsGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(ICE_ETHER);
    }

    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemsGroup);
        MyFirstMod.LOGGER.info("Registering Items");
    }
}
