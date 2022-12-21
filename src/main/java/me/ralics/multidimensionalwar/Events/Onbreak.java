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
        double randDouble = Math.random();
        if (Teams.getTeam(e.getPlayer(), TeamManager.End) == true){
            if (randDouble <= 0.025 ){
                ArrayList<ItemStack> ores = new ArrayList<ItemStack>();
                ores.add(new ItemStack(Material.IRON_INGOT));
                ores.add(new ItemStack(Material.DIAMOND));
                ores.add(new ItemStack(Material.COAL));
                Player p = e.getPlayer();
                for (int i = 0; i < ores.size(); i++)
                {
                    // generating the index using Math.random()
                    int index = (int)(Math.random() * ores.size());

                    p.getInventory().addItem(ores.get(index));

                }
            }


        }
    }
}
