package ga.specventure.specventure;

import ga.specventure.specventure.listeners.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Specventure extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Specventure loaded! This plugin will affect players in Adventure mode.");
        getServer().getPluginManager().registerEvents(new onJoin(), this);
        getServer().getPluginManager().registerEvents(new onHangingBreak(), this);
        getServer().getPluginManager().registerEvents(new onMenuClick(), this);
        getServer().getPluginManager().registerEvents(new onInteract(), this);
        getServer().getPluginManager().registerEvents(new onPickup(), this);
        getServer().getPluginManager().registerEvents(new onEntityDamagedByEntity(), this);
    }

    @Override
    public void onDisable() { System.out.println("Specventure disabled."); }
}
