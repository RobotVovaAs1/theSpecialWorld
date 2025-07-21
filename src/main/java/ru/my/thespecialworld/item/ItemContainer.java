package ru.my.thespecialworld.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import ru.my.thespecialworld.TheSpecialWorld;

import java.util.function.Supplier;

public class ItemContainer {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TheSpecialWorld.MODID);

    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerItem("test_item", Item::new, new Item.Properties().fireResistant().stacksTo(16));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
