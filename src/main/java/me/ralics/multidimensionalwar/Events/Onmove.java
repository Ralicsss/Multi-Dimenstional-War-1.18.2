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
            World nether = Bukkit.getWorld("world_nether");
            World end = Bukkit.getWorld("world_nether");

            Border tonetherfromoverworld = new Border(new Vector(-544, 105, 221), new Vector(-539, 110, 221));
            Border tooverworldfromnether = new Border(new Vector(256, 54, 490), new Vector(252, 57, 490));
            Border toendfromoverworld = new Border(new Vector(28, 70, -560), new Vector(18, 70, -547));
            Border toendfromnether = new Border(new Vector(-18, 33, 108), new Vector(-28, 33, 122));
            Border tonetherfromend = new Border(new Vector(-161, 102, -6), new Vector(-161, 102, -6));
            Border tooverworldfromend = new Border(new Vector(-12, 100, 228), new Vector(-8, 96, 228));

            if (tooverworldfromnether.contains(player.getLocation())){
                Location ee = new Location(overworld, -542, 103, 213);
                player.teleport(ee);
            }
            if (toendfromoverworld.contains(player.getLocation())){
                Location ee = new Location(end, -10, 96, 219);
                player.teleport(ee);
            }
            if (toendfromnether.contains(player.getLocation())){
                Location ee = new Location(end, -152, 101, -8);
                player.teleport(ee);
            }
            if (tonetherfromend.contains(player.getLocation())){
                Location ee = new Location(nether, -152, 101, -8);
                player.teleport(ee);
            }
            if (tooverworldfromend.contains(player.getLocation())){
                Location eee = new Location(overworld, 30, 68, -549);
                player.teleport(eee);
            }


            if(tonetherfromoverworld.contains(player.getLocation())) {
                Location tonetherfromoverworldd = new Location(nether, 254, 53, 482);
                player.teleport(tonetherfromoverworldd);
            }

        }

    }
}
