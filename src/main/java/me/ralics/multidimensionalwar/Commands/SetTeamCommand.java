package me.ralics.multidimensionalwar.Commands;

import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetTeamCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.isOp()){
                if (args[1].equalsIgnoreCase("overworld")){
                    String playername = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    if (target != null) {
                        TeamManager.End.removeEntry(playername);
                        TeamManager.Nether.removeEntry(playername);
                        TeamManager.Admin.removeEntry(playername);
                        TeamManager.Staff.removeEntry(playername);
                        TeamManager.OverWorld.addEntry(playername);
                        World world = Bukkit.getWorld("world");
                        Location l = new Location(world, 90, 64, 80);
                        target.teleport(l);
                        p.sendMessage("Succesfully set " + playername + "'s team ");
                        p.setPlayerListName(ChatColor.DARK_GREEN + "Overworld " + p.getName());
                        
                    }
                }
                if (args[1].equalsIgnoreCase("nether")){
                    String playername = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    if (target != null) {
                        TeamManager.End.removeEntry(playername);
                        TeamManager.OverWorld.removeEntry(playername);
                        TeamManager.Admin.removeEntry(playername);
                        TeamManager.Staff.removeEntry(playername);
                        TeamManager.Nether.addEntry(playername);
                        World world = Bukkit.getWorld("world_nether");
                        Location l = new Location(world, 185, 96, 166);
                        target.teleport(l);
                        p.sendMessage("Succesfully set " + playername + "'s team ");
                        p.setPlayerListName(ChatColor.DARK_RED + "Nether " + p.getName());
                    }
                }
                if (args[1].equalsIgnoreCase("end")){
                    String playername = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    if (target != null) {
                        TeamManager.Nether.removeEntry(playername);
                        TeamManager.OverWorld.removeEntry(playername);
                        TeamManager.Admin.removeEntry(playername);
                        TeamManager.Staff.removeEntry(playername);
                        TeamManager.End.addEntry(playername);
                        World world = Bukkit.getWorld("world_the_end");
                        Location l = new Location(world, -2975, 58, -1160);
                        target.teleport(l);
                        p.sendMessage("Succesfully set " + playername + "'s team ");
                        p.setPlayerListName(ChatColor.DARK_PURPLE + "End " + p.getName());
                    }
                }
                if (args[1].equalsIgnoreCase("staff")){
                    String playername = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    if (target != null) {
                        p.setPlayerListName(ChatColor.LIGHT_PURPLE +""+ ChatColor.BOLD + "Staff " + ChatColor.RESET +""+ ChatColor.WHITE + p.getName());
                        TeamManager.Nether.removeEntry(playername);
                        TeamManager.OverWorld.removeEntry(playername);
                        TeamManager.End.removeEntry(playername);
                        TeamManager.Admin.removeEntry(playername);
                        TeamManager.Staff.addEntry(target.getName());
                        p.sendMessage("Succesfully set " + playername + "'s team ");
                    }
                }
                if (args[1].equalsIgnoreCase("admin")){
                    String playername = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    if (target != null) {
                        p.setPlayerListName(ChatColor.RED +""+ ChatColor.BOLD + "Admin " + ChatColor.RESET +""+ ChatColor.WHITE + p.getName());
                        TeamManager.Nether.removeEntry(playername);
                        TeamManager.OverWorld.removeEntry(playername);
                        TeamManager.End.removeEntry(playername);
                        TeamManager.Staff.removeEntry(playername);
                        TeamManager.Admin.addEntry(target.getName());
                        p.sendMessage("Succesfully set " + playername + "'s team ");
                    }
                }
            }
        }
        return false;
    }
}
