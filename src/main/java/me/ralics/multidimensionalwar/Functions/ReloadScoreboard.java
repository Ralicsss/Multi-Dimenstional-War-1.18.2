package me.ralics.multidimensionalwar.Functions;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.scheduler.BukkitRunnable;

public class ReloadScoreboard extends BukkitRunnable {

    @Override
    public void run(){
        EventManager.ReloadScoreBoard();
    }
}
