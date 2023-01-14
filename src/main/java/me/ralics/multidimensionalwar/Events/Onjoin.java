package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
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

            if (TeamManager.End.hasEntry(p.getName()) || TeamManager.Nether.hasEntry(p.getName()) || TeamManager.OverWorld.hasEntry(p.getName()) || TeamManager.Admin.hasEntry(p.getName())  || TeamManager.Staff.hasEntry(p.getName())){
            } else {
                Bukkit.getScheduler().scheduleSyncDelayedTask(EventManager.plugin, new Runnable() {
                    @Override
                    public void run() {
                        if(Bukkit.getOnlinePlayers().size() % 3 == 0){
                            TeamManager.OverWorld.addEntry(p.getName());
                            Location loc = new Location(Bukkit.getWorld("world"), 541, 159, 303, 0, 0);
                            p.teleport(loc);
                            p.setPlayerListName(ChatColor.DARK_GREEN + "Overworld " + p.getName());
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user "+p.getName()+" parent set overworld");
                        } else if (Bukkit.getOnlinePlayers().size()%3 ==1){
                            TeamManager.Nether.addEntry(p.getName());
                            Location loca = new Location(Bukkit.getWorld("world_nether"), 135, 70, 242, 0, 0);
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user "+p.getName()+" parent set nether");
                            p.teleport(loca);
                            p.setPlayerListName(ChatColor.DARK_RED + "Nether " + p.getName());
                        } else if (Bukkit.getOnlinePlayers().size()%3 == 2){
                            TeamManager.End.addEntry(p.getName());
                            Location locat = new Location(Bukkit.getWorld("world_the_end"), 102, 49, -2, 0, 0);
                            p.teleport(locat);
                            p.setPlayerListName(ChatColor.DARK_PURPLE + "End " + p.getName());
                            Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"lp user "+p.getName()+" parent set end");
                        }
                    }
                },20L);
                Bukkit.getScheduler().scheduleSyncDelayedTask(EventManager.plugin, new Runnable() {
                    @Override
                    public void run() {
                        p.setGameMode(GameMode.SURVIVAL);
                    }
                },30L);
            }
    }
}
