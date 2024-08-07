package net.ledestudio.example.plugin.commands;

import net.kyori.adventure.text.Component;
import net.ledestudio.example.plugin.items.ShoesController;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class TestCommand extends BukkitCommand {

    private ShoesController shoesController;
    public TestCommand(@NotNull String name, ShoesController shoesController) {
        super(name);
        this.shoesController = shoesController;
    }

    @Override
    public boolean execute(@NotNull CommandSender sender, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player player)) return false;
        if (args.length == 0) {
            player.sendMessage(Component.text("잘못된 사용법"));
            return false;
        }
        if (args.length == 1) {
            switch (args[0]) {
                case "get" -> {
                    player.getInventory().addItem(shoesController.getItem());
                }
                case "jump" -> {
                    shoesController.ability(player);
                }
            }
        }
        return false;
    }
}
