package essentials.essentials;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Essentials extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Plugin is running.");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Plugin is shutting down.");


    }
}
