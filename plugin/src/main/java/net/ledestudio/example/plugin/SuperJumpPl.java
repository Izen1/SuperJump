package net.ledestudio.example.plugin;

import net.ledestudio.example.common.server.Server;
import net.ledestudio.example.plugin.commands.TestCommand;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class SuperJumpPl extends JavaPlugin {

    @Override
    public void onEnable() {
        try {
            new Server(1124).run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Bukkit.getCommandMap().register("", new TestCommand("test"));
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

}
