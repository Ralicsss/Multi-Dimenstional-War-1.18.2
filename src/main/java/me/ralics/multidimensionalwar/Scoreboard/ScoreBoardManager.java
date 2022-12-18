package me.ralics.multidimensionalwar.Scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;

public class ScoreBoardManager {

    public static ScoreboardManager manager = Bukkit.getScoreboardManager();
    public static Scoreboard scoreboard = manager.getNewScoreboard();
    public static Objective o = scoreboard.registerNewObjective("MCevents", "MCevents", ChatColor.YELLOW + "MCevents");


}
