package me.ralics.multidimensionalwar.Functions;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.scheduler.BukkitRunnable;

public class Particle extends BukkitRunnable {
    @Override
    public void run(){
        if (EventManager.netheralive == 12131123){
            if (EventManager.portals == true) {

                World overworld = Bukkit.getWorld("world");
                World nether = Bukkit.getWorld("world_nether");
                World end = Bukkit.getWorld("world_the_end");
                org.bukkit.Particle.DustOptions pepe = new org.bukkit.Particle.DustOptions(Color.RED, 10);
                Location overworldloc = new Location(overworld, 91, 75, 183.5);
                org.bukkit.Particle.DustTransition overworldparticcle = new org.bukkit.Particle.DustTransition(Color.RED, Color.fromRGB(100, 10, 10), 10.0F);
                overworld.spawnParticle(org.bukkit.Particle.REDSTONE, overworldloc, 200, 0, 6, 3.5, pepe);
        }
        }
    }
}
