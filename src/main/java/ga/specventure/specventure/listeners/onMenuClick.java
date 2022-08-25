package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class onMenuClick implements Listener {
    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        if (e.getWhoClicked().getGameMode() == GameMode.ADVENTURE) {
            e.setCancelled(true);
            e.getWhoClicked().sendMessage("§4§lYou can't interact with menus because of the Specventure plugin!");
        }
    }
}
