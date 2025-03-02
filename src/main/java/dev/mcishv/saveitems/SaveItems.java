package dev.mcishv.saveitems;

import dev.mcishv.saveitems.events.PlayerDeathListener;
import dev.mcishv.saveitems.events.PlayerRespawnListener;
import org.bukkit.plugin.java.JavaPlugin;

public class SaveItems extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(this), this);
        getServer().getPluginManager().registerEvents(new PlayerRespawnListener(this), this);
        getLogger().info("SaveItems enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SaveItems disabled!");
    }
}
