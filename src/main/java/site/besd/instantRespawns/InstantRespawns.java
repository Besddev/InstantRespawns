package site.besd.instantRespawns;

import org.bukkit.plugin.java.JavaPlugin;
import site.besd.instantRespawns.Commands.InstantRespawnCommand;

public final class InstantRespawns extends JavaPlugin {

    @Override
    public void onEnable() {
        // Commands
        getCommand("ir").setExecutor(new InstantRespawnCommand());
        // Listeners

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
