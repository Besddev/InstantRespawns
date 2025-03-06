package site.besd.instantRespawns;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import site.besd.instantRespawns.Commands.InstantRespawnCommand;

import java.io.File;

public final class InstantRespawns extends JavaPlugin {

    // Use this if u want save shit to different files
    /*
    private File file;
    private FileConfiguration conf;
    private final String fileName = "players.yml";
    private Plugin plugin;*/

    @Override
    public void onEnable() {
        // this for saving for diff file
        /*file = new File(plugin.getDataFolder(), fileName);
        conf = YamlConfiguration.loadConfiguration(file);*/

        // Commands
        getCommand("ir").setExecutor(new InstantRespawnCommand(this));
        // Listeners

    }

    @Override
    public void onLoad() {
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
