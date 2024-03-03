package net.jotave.simplemod.item;

import net.jotave.simplemod.SimpleMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // DeferredRegister, definimos o tipo de registro que vamos criar.
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SimpleMod.MODID);

    // Adicionamos um novo item ao registro de itens.
    public static final RegistryObject<Item> TYPESCRIPT_ITEM =
            ITEMS.register("typescript_item", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
