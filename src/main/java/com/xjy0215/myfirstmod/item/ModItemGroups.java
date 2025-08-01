package com.xjy0215.myfirstmod.item;

import com.xjy0215.myfirstmod.MyFirstMod;
import net.minecraft.block.Blocks;
//import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
//    public static final RegistryKey<ItemGroup> MY_FIRST_MOD_GROUP = register("my_first_mod_group");
//    private static RegistryKey<ItemGroup> register(String id) {
//        return RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MyFirstMod.MOD_ID, id));
//    }
//    public static void registerModItemGroups()
//    {
//       Registry.register(Registries.ITEM_GROUP,
//                       MY_FIRST_MOD_GROUP,
//               ItemGroup.create(ItemGroup.Row.TOP, 7)
//                       .displayName(Text.translatable("itemGroup.my_first_mod_group"))
//                       .icon(() -> new ItemStack(ModItems.ICE_ETHER))
//                       .entries((displayContext, entries) -> {
//                           entries.add(ModItems.ICE_ETHER);
//                       }).build());
//        MyFirstMod.LOGGER.info("Registering Item Groups");
//    }
    public static final ItemGroup MY_FIRST_MOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MyFirstMod.MOD_ID, "my_first_mod_group"),
            ItemGroup.create(null, -1)
                    .displayName(Text.translatable("ItemGroup.my_first_mod_group"))
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER))
                    .entries((displayContext, entries) -> {
                    entries.add(ModItems.ICE_ETHER);
                    entries.add(Blocks.BAMBOO);
                    entries.add(Items.DIAMOND);
                    }).build());
    public static void registerModItemGroups() {
        MyFirstMod.LOGGER.info("Registering Item Groups");
    }
}
