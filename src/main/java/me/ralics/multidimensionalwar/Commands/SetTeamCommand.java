package me.ralics.multidimensionalwar.Commands;

import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
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
            sender.sendMessage("oui");
            Player p = (Player) sender;
            if (p.isOp()){
                p.sendMessage("oui");
                if (args[0].equalsIgnoreCase("overworld")){
                    p.sendMessage("oui");
                    String playername = args[1];
                    p.sendMessage("oui");
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    p.sendMessage("oui");
                    TeamManager.OverWorld.addEntry(playername);
                    p.sendMessage("oui");
                    World world = Bukkit.getWorld("world");
                    p.sendMessage("oui");
                    Location l = new Location(world, 90, 64, 80);
                    p.sendMessage("oui");
                    target.teleport(l);
                    p.sendMessage("oui");
                    p.sendMessage("Succesfully set " + playername + "'s team ");
                }
                if (args[0].equalsIgnoreCase("nether")){
                    p.sendMessage("oui");
                    String playername = args[1];
                    p.sendMessage("oui");
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    p.sendMessage("oui");
                    TeamManager.Nether.addEntry(playername);
                    p.sendMessage("oui");
                    World world = Bukkit.getWorld("world_nether");
                    p.sendMessage("oui");
                    Location l = new Location(world, 185, 96, 166);
                    p.sendMessage("oui");
                    target.teleport(l);
                    p.sendMessage("oui");
                    p.sendMessage("Succesfully set " + playername + "'s team ");
                }
                if (args[0].equalsIgnoreCase("end")){
                    p.sendMessage("oui");
                    String playername = args[1];
                    p.sendMessage("oui");
                    Player target = Bukkit.getServer().getPlayerExact(playername);
                    p.sendMessage("oui");
                    TeamManager.End.addEntry(playername);
                    p.sendMessage("oui");
                    World world = Bukkit.getWorld("world_the_end");
                    p.sendMessage("oui");
                    Location l = new Location(world, -2975, 58, -1160);
                    p.sendMessage("oui");
                    target.teleport(l);
                    p.sendMessage("oui");
                    p.sendMessage("Succesfully set " + playername + "'s team ");
                }
            }
        }
        return false;
    }
}
