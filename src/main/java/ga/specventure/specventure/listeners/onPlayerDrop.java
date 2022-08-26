package ga.specventure.specventure.listeners;


import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

public class onPlayerDrop implements Listener {
    @EventHandler
    public void PlayerDrop(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.ADVENTURE) {
            e.setCancelled(true);
            p.sendMessage("§l§4You can't drop items because of the Specventure plugin!");
        }
    }
}
