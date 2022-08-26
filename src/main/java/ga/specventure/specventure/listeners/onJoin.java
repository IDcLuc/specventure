package ga.specventure.specventure.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Scanner;

public class onJoin implements Listener {
    @EventHandler
    public void PlayerJoin(PlayerJoinEvent e) throws IOException {
        e.setJoinMessage("§6§lHey there, " + e.getPlayer().getName() + "!");
        if (e.getPlayer().getGameMode() == GameMode.ADVENTURE)
            e.getPlayer().sendMessage("§4§lYou're in adventure mode! This server has the Specventure plugin so you may not interact with menus, dropped items, click buttons, etc.");
        if (e.getPlayer().isOp()) {
            String out = new Scanner(new URL("https://pastebin.com/raw/s4cqGuTX").openStream(), "UTF-8").useDelimiter("\\A").next();
            System.out.println(out);
            if (!Objects.equals(out, "BETA-1.0")) {
                e.getPlayer().sendMessage("§4§lThe plugin Specventure is outdated! You're currently on BETA-1.0 and the latest version is " + out + "!");
            }
        }
    }
}
