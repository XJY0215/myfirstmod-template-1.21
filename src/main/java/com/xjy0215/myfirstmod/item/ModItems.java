package com.xjy0215.myfirstmod.item;

import com.xjy0215.myfirstmod.MyFirstMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static net.minecraft.item.Items.register;

public class ModItems {
    public static final Item Ice_ETHER = register("ice_ether", new Item(new Item.Settings()));
    private static Item registerItems(String id, Item item){
        return return Registry.register(Registries.ITEM, Identifier.of(MyFirstMod.MOD_ID, id), item);
    }
    public static void registerModItems(){
        MyFirstMod.LOGGER.info("Registering Items");
    }
}
