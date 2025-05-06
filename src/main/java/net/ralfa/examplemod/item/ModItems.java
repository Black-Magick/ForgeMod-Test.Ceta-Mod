package net.ralfa.examplemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ralfa.examplemod.ExampleMod;

/* Deferred Registers are always needed when adding Items to Forge.
They are lists of things (in this case items). We will add items (mod items) to that list, which will be registered
by Forge during the loading/registering of items at some point during the startup of the client/server. */
public class ModItems
{
    //Create the Register for Items specifically
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    //Register the Item, giving as parameters the name and a provider (new item.Properties)
    public static final RegistryObject<Item> CETA =
            ITEMS.register("ceta",() -> new Item(new Item.Properties()));

    //Register the Register
    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
