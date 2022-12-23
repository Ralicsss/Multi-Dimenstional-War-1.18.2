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

                    EventManager.eventWallDrop1();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Walls have dropped around");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "All of the worlds");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Beware of dangerous structures...");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("3")) {

                    EventManager.eventHunger();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Every player has been given");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Hunger effect!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                        player.addPotionEffect(new PotionEffect(PotionEffectType.HUNGER, 10, 0));
                    }
                }
                if (args[0].equalsIgnoreCase("4")) {

                    EventManager.eventWallDrop2();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Even More walls have dropped");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Around the world!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Good Luck!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("5")) {

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
                if (args[0].equalsIgnoreCase("6")) {

                    EventManager.eventStructureCoordinates();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Structure coordinates will now be");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Revealed for every world!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Overworld: coord");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Nether: coord");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The End: coord");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");


                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("7")) {

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
                if (args[0].equalsIgnoreCase("8")) {

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
                if (args[0].equalsIgnoreCase("9")) {

                    EventManager.eventDisaster();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Disaster Event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "No clue");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");


                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("10")) {

                    EventManager.TreasureIslandCoords();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The TreasureIsland event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Coordinates for a dangerous and filled with");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Loot island will now be revealed!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Overworld: Coords");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Nether: Coords");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The End: Coords");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("11")) {

                    EventManager.eventPortals();
                    EventManager.ReloadScoreBoard();
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Portal Event!");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "The Portals at every worlds' treasure");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Island will now open for people to");
                    Bukkit.broadcastMessage(ChatColor.GREEN + "Enter, Good Luck!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "--------------------------------------------");

                    for (Player player : Bukkit.getOnlinePlayers()){
                        player.setScoreboard(ScoreBoardManager.scoreboard);
                        player.playSound(player, Sound.ENTITY_ENDER_DRAGON_GROWL, 1, 1);
                    }
                }
                if (args[0].equalsIgnoreCase("12")) {
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
