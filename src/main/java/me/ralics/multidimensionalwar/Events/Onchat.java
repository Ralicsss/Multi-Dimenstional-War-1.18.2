package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Color;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class Onchat  implements Listener {
    @EventHandler
    public static void OnchatEvent(PlayerChatEvent e){
        Player p = e.getPlayer();

        if (TeamManager.OverWorld.hasEntry(p.getName())){
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.DARK_GREEN + "Overworld " + p.getName() + " " + ChatColor.WHITE + e.getMessage());


        }
        if (TeamManager.End.hasEntry(p.getName())){
            e.setCancelled(true);

            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "End " + p.getName() + " " + ChatColor.WHITE + e.getMessage());


        }
        if (TeamManager.Nether.hasEntry(p.getName())) {
            e.setCancelled(true);

            Bukkit.broadcastMessage(ChatColor.DARK_RED + "Nether " + p.getName() + " " + ChatColor.WHITE + e.getMessage());


        }
        if (TeamManager.Admin.hasEntry(p.getName())) {
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.RED +""+ ChatColor.BOLD + "Admin " + ChatColor.RESET +""+ ChatColor.WHITE + p.getName() +" " + ChatColor.WHITE + e.getMessage());
        }
        if (TeamManager.Staff.hasEntry(p.getName())) {
            e.setCancelled(true);
            Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE +""+ ChatColor.BOLD + "Staff " + ChatColor.RESET +""+ ChatColor.WHITE + p.getName() +" " + ChatColor.WHITE + e.getMessage());

        }


    }
}
