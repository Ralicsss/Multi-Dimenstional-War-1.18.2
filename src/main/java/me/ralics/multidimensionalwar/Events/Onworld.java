package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

public class Onworld implements Listener {
    public static void onworld(PlayerPortalEvent e){
        e.setCancelled(true);

    }
}
