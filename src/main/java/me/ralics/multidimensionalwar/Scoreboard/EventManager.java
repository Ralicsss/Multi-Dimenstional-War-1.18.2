package me.ralics.multidimensionalwar.Scoreboard;

import me.ralics.multidimensionalwar.MainClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Score;

public class EventManager {
    public static boolean started = false;
    public static boolean pvp = false;
    public static MainClass plugin;

    public static int overworldalive = 0;
    public static int netheralive = 0;
    public static int endalive = 0;

    public static Score s1 = ScoreBoardManager.o.getScore(ChatColor.YELLOW + "youtube.com/@flashmc");
    public static Score s2 = ScoreBoardManager.o.getScore(ChatColor.DARK_AQUA + "");
    public static Score s3 = ScoreBoardManager.o.getScore(ChatColor.DARK_PURPLE + "End: " + endalive);
    public static Score s4 = ScoreBoardManager.o.getScore(ChatColor.DARK_RED + "Nether: " + netheralive);
    public static Score s5 = ScoreBoardManager.o.getScore(ChatColor.DARK_GREEN + "Overworld: " + overworldalive);
    public static Score s6 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Remaining Players: ");
    public static Score s7 = ScoreBoardManager.o.getScore(ChatColor.ITALIC + "");







    public static void eventStart(){
        Score eventstartscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Event: Started");
        Score eventstartscore1 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "");
        Score eventstartscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "The Event has");
        Score eventstartscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Begun.");
        Score eventstartscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Good Luck!");
        started = true;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        eventstartscore0.setScore(8);
        eventstartscore3.setScore(9);
        eventstartscore2.setScore(10);
        eventstartscore1.setScore(11);
        eventstartscore4.setScore(12);


    }
    public static void eventWallDrop1(){
        Score eventwalldrop1score0 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Event: Walls");
        Score eventwalldrop1score1 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "");
        Score eventwalldrop1score2 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Some Of The");
        Score eventwalldrop1score3 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Walls Have");
        Score eventwalldrop1score4 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Dropped!");



        eventwalldrop1score0.setScore(8);
        eventwalldrop1score1.setScore(9);
        eventwalldrop1score2.setScore(10);
        eventwalldrop1score3.setScore(11);
        eventwalldrop1score4.setScore(12);


        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventHunger(){
        Score eventhungerscore0 = ScoreBoardManager.o.getScore("Event: Hunger");
        Score eventhungerscore1 = ScoreBoardManager.o.getScore("");
        Score eventhungerscore2 = ScoreBoardManager.o.getScore("Everyone has");
        Score eventhungerscore3 = ScoreBoardManager.o.getScore("Gotten the");
        Score eventhungerscore4 = ScoreBoardManager.o.getScore("Hunger Effect");

        eventhungerscore0.setScore(8);
        eventhungerscore1.setScore(9);
        eventhungerscore2.setScore(10);
        eventhungerscore3.setScore(11);
        eventhungerscore4.setScore(12);


        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventWallDrop2(){
        Score eventwalldrop2score0 = ScoreBoardManager.o.getScore("Event: Walls");
        Score eventwalldrop2score1 = ScoreBoardManager.o.getScore("");
        Score eventwalldrop2score2 = ScoreBoardManager.o.getScore("Even More");
        Score eventwalldrop2score3 = ScoreBoardManager.o.getScore("Walls have");
        Score eventwalldrop2score4 = ScoreBoardManager.o.getScore("Dropped!");

        eventwalldrop2score0.setScore(8);
        eventwalldrop2score1.setScore(9);
        eventwalldrop2score2.setScore(10);
        eventwalldrop2score3.setScore(11);
        eventwalldrop2score4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventPvp(){

        Score eventpvpscore0 = ScoreBoardManager.o.getScore("Event: PvP");
        Score eventpvpscore1 = ScoreBoardManager.o.getScore("");
        Score eventpvpscore2 = ScoreBoardManager.o.getScore("PvP has been");
        Score eventpvpscore3 = ScoreBoardManager.o.getScore("Turned on");
        Score eventpvpscore4 = ScoreBoardManager.o.getScore("Be careful...");

        eventpvpscore0.setScore(8);
        eventpvpscore1.setScore(9);
        eventpvpscore2.setScore(10);
        eventpvpscore3.setScore(11);
        eventpvpscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);

        pvp = false;
    }
    public static void eventStructureCoordinates(){

        Score eventstructurecoordsscore0 = ScoreBoardManager.o.getScore("Event: Structures");
        Score eventstructurecoordsscore1 = ScoreBoardManager.o.getScore("");
        Score eventstructurecoordsscore2 = ScoreBoardManager.o.getScore("Structure Coordinates");
        Score eventstructurecoordsscore3 = ScoreBoardManager.o.getScore("Of all worlds");
        Score eventstructurecoordsscore4 = ScoreBoardManager.o.getScore("Have been revealed");

        eventstructurecoordsscore0.setScore(8);
        eventstructurecoordsscore1.setScore(9);
        eventstructurecoordsscore2.setScore(10);
        eventstructurecoordsscore3.setScore(11);
        eventstructurecoordsscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventBuild(){

        Score eventbuildscore0 = ScoreBoardManager.o.getScore("Event: Building");
        Score eventbuildscore1 = ScoreBoardManager.o.getScore("");
        Score eventbuildscore2 = ScoreBoardManager.o.getScore("Every world");
        Score eventbuildscore3 = ScoreBoardManager.o.getScore("Has to Build");
        Score eventbuildscore4 = ScoreBoardManager.o.getScore("Their own Town!");

        eventbuildscore0.setScore(8);
        eventbuildscore1.setScore(9);
        eventbuildscore2.setScore(10);
        eventbuildscore3.setScore(11);
        eventbuildscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventElections(){

        Score eventelectionsscore0 = ScoreBoardManager.o.getScore("Event: Elections");
        Score eventelectionsscore1 = ScoreBoardManager.o.getScore("");
        Score eventelectionsscore2 = ScoreBoardManager.o.getScore("Every World");
        Score eventelectionsscore3 = ScoreBoardManager.o.getScore("Has to choose");
        Score eventelectionsscore4 = ScoreBoardManager.o.getScore("Their Leader");

        eventelectionsscore0.setScore(8);
        eventelectionsscore1.setScore(9);
        eventelectionsscore2.setScore(10);
        eventelectionsscore3.setScore(11);
        eventelectionsscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventDisaster(){

        Score eventdisasterscore0 = ScoreBoardManager.o.getScore("");
        Score eventdisasterscore1 = ScoreBoardManager.o.getScore("");
        Score eventdisasterscore2 = ScoreBoardManager.o.getScore("");
        Score eventdisasterscore3 = ScoreBoardManager.o.getScore("");
        Score eventdisasterscore4 = ScoreBoardManager.o.getScore("");

        eventdisasterscore0.setScore(8);
        eventdisasterscore1.setScore(9);
        eventdisasterscore2.setScore(10);
        eventdisasterscore3.setScore(11);
        eventdisasterscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void TreasureIslandCoords(){

        Score eventtreasureislandscore0 = ScoreBoardManager.o.getScore("Event: Treasure Island");
        Score eventtreasureislandscore1 = ScoreBoardManager.o.getScore("");
        Score eventtreasureislandscore2 = ScoreBoardManager.o.getScore("The coordinates");
        Score eventtreasureislandscore3 = ScoreBoardManager.o.getScore("To a treasure island");
        Score eventtreasureislandscore4 = ScoreBoardManager.o.getScore("Have been revealed!");

        eventtreasureislandscore0.setScore(8);
        eventtreasureislandscore1.setScore(9);
        eventtreasureislandscore2.setScore(10);
        eventtreasureislandscore3.setScore(11);
        eventtreasureislandscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }
    public static void eventPortals(){

        Score eventportalsscore0 = ScoreBoardManager.o.getScore("Event: Portals");
        Score eventportalsscore1 = ScoreBoardManager.o.getScore("");
        Score eventportalsscore2 = ScoreBoardManager.o.getScore("Portals have");
        Score eventportalsscore3 = ScoreBoardManager.o.getScore("Opened to travel");
        Score eventportalsscore4 = ScoreBoardManager.o.getScore("To other worlds!");

        eventportalsscore0.setScore(8);
        eventportalsscore1.setScore(9);
        eventportalsscore2.setScore(10);
        eventportalsscore3.setScore(11);
        eventportalsscore4.setScore(12);

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
    }


    public static void ReloadScoreBoard(){

        int overworldalive = 0;
        for (
                OfflinePlayer offlinePlayersoverworld : TeamManager.OverWorld.getPlayers()) {
            if (offlinePlayersoverworld.getPlayer() != null && !offlinePlayersoverworld.getPlayer().isDead())
                overworldalive++;
            Bukkit.broadcastMessage("1");
        }

        int netheralive = 0;
        for (OfflinePlayer offlinePlayersnether : TeamManager.Nether.getPlayers()) {
            if (offlinePlayersnether.getPlayer() != null && !offlinePlayersnether.getPlayer().isDead())
                netheralive++;
            Bukkit.broadcastMessage("2");

        }
        int endalive = 0;
        for (OfflinePlayer offlineplayersEnd : TeamManager.End.getPlayers()) {
            if (offlineplayersEnd.getPlayer() != null && !offlineplayersEnd.getPlayer().isDead())
                endalive++;
            Bukkit.broadcastMessage("3");

        }
        Score s3 = ScoreBoardManager.o.getScore(ChatColor.DARK_PURPLE + "End: " + endalive);
        Score s4 = ScoreBoardManager.o.getScore(ChatColor.DARK_RED + "Nether: " + netheralive);
        Score s5 = ScoreBoardManager.o.getScore(ChatColor.DARK_GREEN + "Overworld: " + overworldalive);


        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);

        for (Player p : Bukkit.getOnlinePlayers()){
            p.setScoreboard(ScoreBoardManager.scoreboard);
        }



    }


}
