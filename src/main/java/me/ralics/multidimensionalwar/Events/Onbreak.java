package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class Onbreak implements Listener {
    @EventHandler
    public static void Onbreak(BlockBreakEvent e){
        if (EventManager.started == false){
            e.setCancelled(true);
        }

            }




}
