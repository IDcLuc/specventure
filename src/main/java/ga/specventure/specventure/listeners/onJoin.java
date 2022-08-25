package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        e.setJoinMessage("§6§lHey there, " + e.getPlayer().getName() + "!");
        if (e.getPlayer().getGameMode() == GameMode.ADVENTURE)
            e.getPlayer().sendMessage("§4§lYou're in adventure mode! This server has the Specventure plugin so you may not interact with menus, dropped items, click buttons, etc.");
    }
}
