package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Functions.Border;
import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

public class Onmove implements Listener {
    @EventHandler
    public static void Onmoveevent(PlayerMoveEvent e){
        if (EventManager.portals == true){
            Player player = e.getPlayer();
            World overworld = Bukkit.getWorld("world");
            Border tonetherfromoverworld = new Border(new Vector(90,67,188), new Vector(89, 83, 177));
            if(tonetherfromoverworld.contains(player.getLocation())) {
                

                Location tonetherfromoverworldd = new Location(overworld, 1, 1, 1);
                player.teleport(tonetherfromoverworldd);
            }

        }

    }
}
