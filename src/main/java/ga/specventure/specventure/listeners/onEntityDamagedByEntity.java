package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class onEntityDamagedByEntity implements Listener {
    @EventHandler
    public void EntityDamagedByEntity(EntityDamageByEntityEvent e) {
        Player p = (Player) e.getDamager();
        if (p.getGameMode() == GameMode.ADVENTURE) {
            e.setCancelled(true);
            p.sendMessage("§4§lYou can't attack other entities due to the Specventure plugin!");
        }
    }
}
