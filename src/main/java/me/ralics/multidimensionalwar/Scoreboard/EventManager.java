package me.ralics.multidimensionalwar.Scoreboard;

import me.ralics.multidimensionalwar.MainClass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Score;

public class EventManager {
    public static boolean started = false;
    public static boolean pvp = false;

    public static MainClass plugin;

    public static boolean portals = false;
    public static int overworldalive = 0;
    public static int netheralive = 0;
    public static int endalive = 0;

    public static Score s1 = ScoreBoardManager.o.getScore(ChatColor.YELLOW + "dsc.gg/civ");
    public static Score s2 = ScoreBoardManager.o.getScore(ChatColor.DARK_AQUA + "");
    public static Score s3 = ScoreBoardManager.o.getScore(ChatColor.DARK_PURPLE + "End: " + endalive);
    public static Score s4 = ScoreBoardManager.o.getScore(ChatColor.DARK_RED + "Nether: " + netheralive);
    public static Score s5 = ScoreBoardManager.o.getScore(ChatColor.DARK_GREEN + "Overworld: " + overworldalive);
    public static Score s6 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Remaining Players: ");
    public static Score s7 = ScoreBoardManager.o.getScore(ChatColor.ITALIC + "");

    public static Score s8 = ScoreBoardManager.o.getScore(ChatColor.DARK_BLUE + "");

    public static Score event1 = ScoreBoardManager.o.getScore("event1");
    public static Score event2 = ScoreBoardManager.o.getScore("event2");
    public static Score event3 = ScoreBoardManager.o.getScore("event3");
    public static Score event4 = ScoreBoardManager.o.getScore("event4");







    public static void eventStart(){
        Score eventstartscore1 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Phase: Started");
        Score eventstartscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "The Event has");
        Score eventstartscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Begun.");
        Score eventstartscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Good Luck!");
        started = true;

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());



        event1 = eventstartscore1;
        event2 = eventstartscore2;
        event3 = eventstartscore3;
        event4 = eventstartscore4;


        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);


    }
    public static void eventWallDrop1(){
        Score eventwalldrop1score0 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Phase: Walls");
        Score eventwalldrop1score2 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Some Of The");
        Score eventwalldrop1score3 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Walls Have");
        Score eventwalldrop1score4 = ScoreBoardManager.o.getScore(ChatColor.GREEN + "Dropped!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 =  eventwalldrop1score0;
        event2 = eventwalldrop1score2;
        event3 = eventwalldrop1score3;
        event4 = eventwalldrop1score4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventHunger(){
        Score eventhungerscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Hunger");
        Score eventhungerscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Everyone has");
        Score eventhungerscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Gotten the");
        Score eventhungerscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Hunger Effect");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventhungerscore0;
        event2 = eventhungerscore2;
        event3 = eventhungerscore3;
        event4 = eventhungerscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventWallDrop2(){
        Score eventwalldrop2score0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Walls");
        Score eventwalldrop2score2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Even More");
        Score eventwalldrop2score3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Walls have");
        Score eventwalldrop2score4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Dropped!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventwalldrop2score0;
        event2 = eventwalldrop2score2;
        event3 = eventwalldrop2score3;
        event4 = eventwalldrop2score4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventPvp(){

        Score eventpvpscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: PvP");
        Score eventpvpscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"PvP has been");
        Score eventpvpscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Turned on");
        Score eventpvpscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Be careful...");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventpvpscore0;
        event2 = eventpvpscore2;
        event3 = eventpvpscore3;
        event4 = eventpvpscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);

        pvp = true;
    }
    public static void eventStructureCoordinates(){

        Score eventstructurecoordsscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Structures");
        Score eventstructurecoordsscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Structure Coordinates");
        Score eventstructurecoordsscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Of all worlds");
        Score eventstructurecoordsscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Have been revealed");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventstructurecoordsscore0;
        event2 = eventstructurecoordsscore2;
        event3 = eventstructurecoordsscore3;
        event4 = eventstructurecoordsscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventBuild(){

        Score eventbuildscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Building");
        Score eventbuildscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Every world");
        Score eventbuildscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Has to Build");
        Score eventbuildscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Their own Town!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventbuildscore0;
        event2 = eventbuildscore2;
        event3 = eventbuildscore3;
        event4 = eventbuildscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventElections(){

        Score eventelectionsscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Elections");
        Score eventelectionsscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Every World");
        Score eventelectionsscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Has to choose");
        Score eventelectionsscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Their Leader!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventelectionsscore0;
        event2 = eventelectionsscore2;
        event3 = eventelectionsscore3;
        event4 = eventelectionsscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventDisaster(){

        Score eventdisasterscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"no");
        Score eventdisasterscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"");
        Score eventdisasterscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"");
        Score eventdisasterscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventdisasterscore0;
        event2 = eventdisasterscore2;
        event3 = eventdisasterscore3;
        event4 = eventdisasterscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void zero(){

        Score eventtreasureislandscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: ...");
        Score eventtreasureislandscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"The event will");
        Score eventtreasureislandscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Start soon!");
        Score eventtreasureislandscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Good Luck!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventtreasureislandscore0;
        event2 = eventtreasureislandscore2;
        event3 = eventtreasureislandscore3;
        event4 = eventtreasureislandscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void TreasureIslandCoords(){

        Score eventtreasureislandscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Treasure Hunt");
        Score eventtreasureislandscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"The coordinates");
        Score eventtreasureislandscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"To treasure");
        Score eventtreasureislandscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Has been revealed!");

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventtreasureislandscore0;
        event2 = eventtreasureislandscore2;
        event3 = eventtreasureislandscore3;
        event4 = eventtreasureislandscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }
    public static void eventPortals(){

        Score eventportalsscore0 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Phase: Portals");
        Score eventportalsscore2 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Portals have");
        Score eventportalsscore3 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"Opened to travel");
        Score eventportalsscore4 = ScoreBoardManager.o.getScore(ChatColor.GREEN +"To other worlds!");



        portals = true;

        ScoreBoardManager.scoreboard.resetScores(event1.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event2.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(event4.getEntry());

        event1 = eventportalsscore0;
        event2 = eventportalsscore2;
        event3 = eventportalsscore3;
        event4 = eventportalsscore4;

        s1.setScore(1);
        s2.setScore(2);
        s3.setScore(3);
        s4.setScore(4);
        s5.setScore(5);
        s6.setScore(6);
        s7.setScore(7);
        s8.setScore(11);
        event4.setScore(8);
        event3.setScore(9);
        event2.setScore(10);
        event1.setScore(12);
    }


    public static void ReloadScoreBoard(){

        ScoreBoardManager.scoreboard.resetScores(s3.getEntry());
        ScoreBoardManager.scoreboard.resetScores(s4.getEntry());
        ScoreBoardManager.scoreboard.resetScores(s5.getEntry());

        overworldalive = 0;
        for (
                OfflinePlayer offlinePlayersoverworld : TeamManager.OverWorld.getPlayers()) {
            if (offlinePlayersoverworld.getPlayer() != null && !offlinePlayersoverworld.getPlayer().isDead())
                overworldalive++;
        }

        netheralive = 0;
        for (OfflinePlayer offlinePlayersnether : TeamManager.Nether.getPlayers()) {
            if (offlinePlayersnether.getPlayer() != null && !offlinePlayersnether.getPlayer().isDead())
                netheralive++;

        }
        endalive = 0;
        for (OfflinePlayer offlineplayersEnd : TeamManager.End.getPlayers()) {
            if (offlineplayersEnd.getPlayer() != null && !offlineplayersEnd.getPlayer().isDead())
                endalive++;

        }

        Score s33 = ScoreBoardManager.o.getScore(ChatColor.DARK_PURPLE + "End: " + endalive);
        Score s43 = ScoreBoardManager.o.getScore(ChatColor.DARK_RED + "Nether: " + netheralive);
        Score s53 = ScoreBoardManager.o.getScore(ChatColor.DARK_GREEN + "Overworld: " + overworldalive);

        s3 = s33;
        s4 = s43;
        s5 = s53;




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
