package com.xjy0215.myfirstmod.item;

import com.xjy0215.myfirstmod.MyFirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final RegistryKey<ItemGroup> MY_FIRST_MOD_GROUP = register("my_first_mod_group");
    private static RegistryKey<ItemGroup> register(String id) {
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MyFirstMod.MOD_ID, id));
    }
    public static void registerModItemGroups()
    {
       Registry.register(Registries.ITEM_GROUP, MY_FIRST_MOD_GROUP,
                        ItemGroup.create(ItemGroup.Row.TOP, 7).build()).
                displayName(Text.translatable("ItemGroup.myfirstmod.my_first_mod_group"))
                        .icon()
        MyFirstMod.LOGGER.info("Registering Item Groups");
    }
}
