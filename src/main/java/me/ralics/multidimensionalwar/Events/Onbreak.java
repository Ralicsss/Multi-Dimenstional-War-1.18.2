package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Functions.Teams;
import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class Onbreak implements Listener {
    @EventHandler
    public static void Onbreak(BlockBreakEvent e){
        if (EventManager.started == false){
            e.setCancelled(true);
        }

            }




}
