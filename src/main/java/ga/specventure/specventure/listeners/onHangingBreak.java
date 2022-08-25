package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

public class onHangingBreak implements Listener {
    @EventHandler
    public void HangingBreak(HangingBreakByEntityEvent e) {
        if(e.getRemover() instanceof Player) {
            Player p = (Player) e.getRemover();
            if (p.getGameMode() == GameMode.ADVENTURE) {
                e.setCancelled(true);
                p.sendMessage("§4§lYou aren't allowed to break " + e.getEntity().getName() + "s in Adventure mode due to the Specventure plugin!");
            }
        }
    }
}
