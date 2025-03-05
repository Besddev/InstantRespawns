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

import java.util.ArrayList;
import java.util.List;

public class InstantRespawnCommand implements CommandExecutor, TabCompleter {
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
