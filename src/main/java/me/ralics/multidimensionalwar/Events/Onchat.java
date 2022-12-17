package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;

public class Onchat {
    public static void OnchatEvent(PlayerChatEvent e){
        Player p = e.getPlayer();

        if (TeamManager.OverWorld.hasEntry(p.getName())){
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "Overworld " + p.getName() + " " + e.getMessage());
        }
        if (TeamManager.End.hasEntry(p.getName())){
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "End " + p.getName() + " " + e.getMessage());
        }
        if (TeamManager.Nether.hasEntry(p.getName())){
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.DARK_RED + "Nether " + p.getName() + " " + e.getMessage());
        }


    }
}
