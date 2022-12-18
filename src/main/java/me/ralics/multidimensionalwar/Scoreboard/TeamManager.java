package me.ralics.multidimensionalwar.Scoreboard;

import org.bukkit.scoreboard.Team;

public class TeamManager {
    public static Team OverWorld = ScoreBoardManager.manager.getNewScoreboard().registerNewTeam("OverWorld");
    public static Team Nether = ScoreBoardManager.manager.getNewScoreboard().registerNewTeam("Nether");
    public static Team End = ScoreBoardManager.manager.getNewScoreboard().registerNewTeam("End");
}
