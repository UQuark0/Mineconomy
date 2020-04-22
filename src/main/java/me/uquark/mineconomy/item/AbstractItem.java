package me.uquark.mineconomy.item;

import me.uquark.mineconomy.Mineconomy;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public abstract class AbstractItem extends Item {
    public final Identifier id;

    public AbstractItem(String name, Settings settings) {
        super(settings);
        id = new Identifier(Mineconomy.modid, name);
    }

    public void register() {
        Registry.register(Registry.ITEM, id, this);
    }
}
