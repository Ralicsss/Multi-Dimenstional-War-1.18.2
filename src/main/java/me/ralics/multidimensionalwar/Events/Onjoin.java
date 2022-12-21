package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Team;

public class Onjoin implements Listener {
    @EventHandler
    public static void OnjoinEvent(PlayerJoinEvent e){


        Player p = e.getPlayer();

            if (TeamManager.End.hasEntry(p.getName()) || TeamManager.Nether.hasEntry(p.getName()) || TeamManager.OverWorld.hasEntry(p.getName())){
                p.sendMessage("You are on a team");
            } else {
                p.sendMessage("you are not on a team");
                if(Bukkit.getOnlinePlayers().size() % 3 == 0){
                    TeamManager.OverWorld.addEntry(p.getName());
                    Location loc = new Location(Bukkit.getWorld("world"), 90, 64, 80, 0, 0);
                    p.teleport(loc);
                } else if (Bukkit.getOnlinePlayers().size()%3 ==1){
                    TeamManager.Nether.addEntry(p.getName());
                    Location loca = new Location(Bukkit.getWorld("world_nether"), 185, 96, 166, 0, 0);
                    p.teleport(loca);
                } else if (Bukkit.getOnlinePlayers().size()%3 == 2){
                    TeamManager.End.addEntry(p.getName());
                    Location locat = new Location(Bukkit.getWorld("world_the_end"), -2975, 58, -1160, 0, 0);
                    p.teleport(locat);
                }
            }
    }
}
