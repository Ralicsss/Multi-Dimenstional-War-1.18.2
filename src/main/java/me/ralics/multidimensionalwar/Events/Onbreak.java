package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.event.block.BlockBreakEvent;

public class Onbreak {
    public static void Onbreak(BlockBreakEvent e){
        if (EventManager.started == false){
            e.setCancelled(true);
        }
    }
}
