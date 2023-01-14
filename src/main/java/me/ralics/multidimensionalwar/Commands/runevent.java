package me.ralics.multidimensionalwar.Commands;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.Permission;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import static java.awt.Color.red;

public class runevent implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.isOp()){
                if (args[0].equalsIgnoreCase("1")) {

                    EventManager.eventStart();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The event has started!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Grace has been turned off but,");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "PvP will still be off for now...");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Good Luck!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);

                    }
                }
                if (args[0].equalsIgnoreCase("2")) {

                    EventManager.eventHunger();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Every player has been given");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Hunger effect!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                        player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 12000, 1));
                    }
                }
                if (args[0].equalsIgnoreCase("3")) {

                    EventManager.eventPvp();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "PvP has been turned on!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Beware of betrayals...");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("4")) {

                    EventManager.eventStructureCoordinates();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Structure coordinates will now be");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Revealed for every world!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Overworld: -186, 149, -297");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Nether: 256 35 120");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The End: -140 131 -300");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");


                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("5")) {

                    EventManager.eventBuild();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Build event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Every world has to build a village");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "To gain very strong rewards!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "And maybe some dangerous ones...");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("6")) {

                    EventManager.eventElections();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Election Event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Every world has to choose");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Their leader!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("7")) {

                    EventManager.eventPortals();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Portal Event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Portal coordinates will now be revealed for every world!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Overworld end portal: 28, 70, -560");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Overworld nether portal: 544, 105, 221");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Nether end portal: -18, 33, 108");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Nether nether portal: --55, 87, 344");
                    //-55, 87, 344
                    Bukkit.broadcastMessage(ChatColor.GREEN + "End overworld portal: -12, 100, 228");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "End nether portal: -161, 108, -10");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Good luck!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("0")) {

                    EventManager.zero();
                    EventManager.ReloadScoreBoard();

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("resetevents")) {
                    EventManager.ReloadScoreBoard();

                    EventManager.started = false;
                    EventManager.pvp = false;
                    EventManager.portals = false;

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("resetteams")) {

                    EventManager.ReloadScoreBoard();

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                        TeamManager.End.removeEntry(player.getName());
                        TeamManager.OverWorld.removeEntry(player.getName());
                        TeamManager.Nether.removeEntry(player.getName());
                    }
                }





            }
        }


        return false;
    }
}
//**Minecraft Multi-Dimensional War**
//
//We will be hosting a Civilization event at (Time (in amount of days))
//
//This event will have 3 civilizations where you will have to be the last team standing!
//It will also require fabric 1.18.2
//
//**React with a :check: if you want to participate in the event.**
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//