package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Ondeath implements Listener {
    @EventHandler
    public static void OndeathEvent(PlayerDeathEvent e){

        Player p = e.getEntity();

        p.setGameMode(GameMode.SPECTATOR);
        p.setHealth(20.0);
        World world = p.getWorld();
        Location loc = p.getLocation();
        world.strikeLightningEffect(loc);
        e.setDeathMessage(ChatColor.RED + p.getName() + " Has Died!");

        TeamManager.OverWorld.removeEntry(p.getName());
        TeamManager.Nether.removeEntry(p.getName());
        TeamManager.End.removeEntry(p.getName());


    }
}
