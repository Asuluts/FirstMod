package net.jakey.firstmodj1.item;

import net.jakey.firstmodj1.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);
    public static final RegistryObject<Item> RAWTUNGSTEN = ITEMS.register("rawtungsten",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
       ITEMS.register(eventBus);
    }
}
