package net.archangelthegod.infinity_muffin.item;

import net.archangelthegod.infinity_muffin.InfinityMuffin;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfinityMuffin.MOD_ID);

    public static final RegistryObject<CreativeModeTab> INFINITY_MUFFIN_TAB = CREATIVE_MODE_TABS.register("infinity_muffin_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.THE_MUFFIN.get()))
                    .title(Component.translatable("creativetab.infinity_muffin_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.THE_MUFFIN.get());
                        pOutput.accept(ModItems.RAW_MUFFIN_BATTER_BUCKET.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
