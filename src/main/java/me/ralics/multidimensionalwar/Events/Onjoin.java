package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scoreboard.Team;

public class Onjoin {

    public static void OnjoinEvent(PlayerJoinEvent e){
        Player p = e.getPlayer();
        for (Team t : ScoreBoardManager.scoreboard.getTeams()){
            if (t.hasEntry(p.getName())){
                p.sendMessage("You are on a team");
            } else if (!t.hasEntry(p.getName())) {
                p.sendMessage("you are not on a team");
                Bukkit.getScheduler().scheduleSyncDelayedTask(EventManager.plugin, new Runnable() {
                            @Override
                            public void run() {
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
                        },20L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(EventManager.plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                    }
                },40L);
                        
            }
        }


    }
}
