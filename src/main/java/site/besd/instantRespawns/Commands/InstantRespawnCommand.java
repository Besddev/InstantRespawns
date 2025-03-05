package site.besd.instantRespawns.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class InstantRespawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage(ChatColor.RED + "Usage: /instantrespawn < toggle / reload / disable / enable >");
            return true;
        }

        Player player = (Player) sender;
        if (args[0].equalsIgnoreCase("toggle")) {

        }
        if (args[0].equalsIgnoreCase("reload")) {

        }
        if (args[0].equalsIgnoreCase("disable")) {

        }
        if (args[0].equalsIgnoreCase("enable")) {

        }

        return true;
    }
}
