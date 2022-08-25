package ga.specventure.specventure.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;

public class onPickup implements Listener {
    @EventHandler
    public void arrowPickup(PlayerPickupArrowEvent e) {
        if (e.getPlayer().getGameMode() == GameMode.ADVENTURE) {
            e.setCancelled(true);

        }
    }

    @EventHandler
    public void itemPickup(EntityPickupItemEvent e) {
        if (e.getEntity() instanceof Player) {
            Player p = (Player) e.getEntity();
            if (p.getGameMode() == GameMode.ADVENTURE) {
                e.setCancelled(true);
            }
        }
    }
}
