package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class onInteract implements Listener {
    @EventHandler
    public void PlayerInteraction(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if (p.getGameMode() == GameMode.ADVENTURE) {
            if (e.getAction().equals(Action.PHYSICAL)) {
                Material mat = Objects.requireNonNull(e.getClickedBlock()).getType();
                // cancel pressure plates
                if (mat == Material.STONE_PRESSURE_PLATE || mat == Material.POLISHED_BLACKSTONE_PRESSURE_PLATE || mat == Material.OAK_PRESSURE_PLATE || mat == Material.BIRCH_PRESSURE_PLATE || mat == Material.ACACIA_PRESSURE_PLATE || mat == Material.DARK_OAK_PRESSURE_PLATE || mat == Material.CRIMSON_PRESSURE_PLATE || mat == Material.JUNGLE_PRESSURE_PLATE || mat == Material.SPRUCE_PRESSURE_PLATE || mat == Material.WARPED_PRESSURE_PLATE || mat == Material.MANGROVE_PRESSURE_PLATE || mat == Material.HEAVY_WEIGHTED_PRESSURE_PLATE || mat == Material.LIGHT_WEIGHTED_PRESSURE_PLATE) {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Event.Result.DENY);
                }
            }
            if (e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                Material mat = Objects.requireNonNull(e.getClickedBlock()).getType();
                // cancel doors
                if (mat == Material.BIRCH_DOOR || mat == Material.ACACIA_DOOR || mat == Material.OAK_DOOR || mat == Material.DARK_OAK_DOOR || mat == Material.JUNGLE_DOOR || mat == Material.WARPED_DOOR || mat == Material.CRIMSON_DOOR || mat == Material.SPRUCE_DOOR || mat == Material.MANGROVE_DOOR) {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Event.Result.DENY);
                }
                // cancel buttons and levers
                if (mat == Material.BIRCH_BUTTON || mat == Material.ACACIA_BUTTON || mat == Material.OAK_BUTTON || mat == Material.DARK_OAK_BUTTON || mat == Material.JUNGLE_BUTTON || mat == Material.WARPED_BUTTON || mat == Material.CRIMSON_BUTTON || mat == Material.SPRUCE_BUTTON || mat == Material.MANGROVE_BUTTON || mat == Material.LEVER) {
                    e.setCancelled(true);
                    e.setUseInteractedBlock(Event.Result.DENY);
                    p.sendMessage("§4§lYou can't interact with buttons because of the Specventure plugin!");
                }
            }
        }
    }
}
