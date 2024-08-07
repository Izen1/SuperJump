package net.ledestudio.example.plugin.items;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ShoesInterface {
    ItemStack getItem();
    boolean hasItem(Player player);
    void ability(Player player);
}
