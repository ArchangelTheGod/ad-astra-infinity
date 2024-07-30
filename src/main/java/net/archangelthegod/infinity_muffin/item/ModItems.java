package net.archangelthegod.infinity_muffin.item;

import net.archangelthegod.infinity_muffin.InfinityMuffin;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, InfinityMuffin.MOD_ID);

    // Muffin Item(s)
    //      The Muffin
    public static final RegistryObject<Item> THE_MUFFIN = ITEMS.register("the_muffin",
            () -> new Item(new Item.Properties()));
    //      Raw Muffin Batter Bucket
    public static  final RegistryObject<Item> RAW_MUFFIN_BATTER_BUCKET = ITEMS.register("raw_muffin_batter_bucket",
            () -> new Item(new Item.Properties()));
    //

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
