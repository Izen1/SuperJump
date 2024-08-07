package net.ledestudio.example.plugin.items;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.Vector;

import java.util.Objects;

public class ShoesController implements ShoesInterface{
    @Override
    public ItemStack getItem() {
        ItemStack item = new ItemStack(Material.LEATHER_BOOTS);
        ItemMeta meta = item.getItemMeta();
        meta.setUnbreakable(true);

        MiniMessage mm = MiniMessage.miniMessage();
        Component name = mm.deserialize("<gradient:#de330c:#000000>Super-Jump</gradient>");
        meta.displayName(name);

        item.setItemMeta(meta);
        return item;
    }

    @Override
    public boolean hasItem(Player player) {
        return player.getInventory().getBoots() != null && player.getInventory().getBoots().equals(getItem());
    }

    @Override
    public void ability(Player player) {
        player.setVelocity(new Vector(0, 2, 0));
    }
}
