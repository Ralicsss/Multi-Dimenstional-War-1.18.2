package me.ralics.multidimensionalwar.Functions;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

public class Teams {

    public static boolean getTeam(Player p, Team team) {
        if (team.hasEntry(p.getName()) == true) {

        }
        return true;
    }
}
