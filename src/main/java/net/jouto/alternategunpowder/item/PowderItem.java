package net.jouto.alternategunpowder.item;

import net.jouto.alternategunpowder.AlternateGunpowder;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PowderItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, AlternateGunpowder.MOD_ID);

    public static final RegistryObject<Item> BLACK_POWDER = ITEMS.register("black_powder",
            () -> new Item(new Item.Properties()));
    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
