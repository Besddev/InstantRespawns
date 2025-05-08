package site.besd.instantRespawns.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.util.StringUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import site.besd.instantRespawns.InstantRespawns;

import java.util.ArrayList;
import java.util.List;

public class InstantRespawnCommand implements CommandExecutor, TabCompleter {

    private final InstantRespawns plugin;

    public InstantRespawnCommand(InstantRespawns plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Only players can execute this command.");
        }


        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /instantrespawn < toggle / reload / disable / enable >");
            return true;
        }

        Player player = (Player) sender;
        if (args[0].equalsIgnoreCase("toggle")) {
            plugin.getConfig().set("instantRespawns." + player.getUniqueId().toString(), true);
        }
        if (args[0].equalsIgnoreCase("reload")) {
            plugin.reloadConfig();
        }
        if (args[0].equalsIgnoreCase("disable")) {
            if (plugin.getConfig().getBoolean("Enabled")) {
               plugin.getConfig().set("Enabled", false);
               plugin.saveConfig();
               plugin.reloadConfig();

               player.sendMessage(ChatColor.GREEN + "InstantRespawns plugin has been disabled.");
            }

        }
        if (args[0].equalsIgnoreCase("enable")) {
            if (plugin.getConfig().getBoolean("Enabled")) {
                plugin.getConfig().set("Enabled", true);
                plugin.saveConfig();
                plugin.reloadConfig();
                player.sendMessage(ChatColor.GREEN + "InstantRespawns plugin has been enabled.");
            }
        }

        return true;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {

        final List<String> validArguments = new ArrayList<>();

        if (args.length == 1) {
            StringUtil.copyPartialMatches(args[0], List.of("reload", "toggle", "disable", "enable"), validArguments);
            return validArguments;
        }
        return List.of();
    }
}
