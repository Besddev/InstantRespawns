package site.besd.instantRespawns.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import site.besd.instantRespawns.InstantRespawns;

public class DeathListener implements Listener {

    private InstantRespawns plugin;


    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        Player player = event.getEntity();

        if (plugin.getConfig().get("instantRespawns." + player.getUniqueId().toString()) == "true" ){

        }

    }
}
