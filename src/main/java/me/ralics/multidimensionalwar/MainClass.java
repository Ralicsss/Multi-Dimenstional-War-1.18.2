package me.ralics.multidimensionalwar;

import me.ralics.multidimensionalwar.Commands.runevent;
import me.ralics.multidimensionalwar.Events.*;
import me.ralics.multidimensionalwar.Functions.ReloadScoreboard;
import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Scoreboard;

public final class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("runevent").setExecutor(new runevent());

        Bukkit.getServer().getPluginManager().registerEvents(new Onbreak(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Onchat(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Ondamage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Ondeath(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Onjoin(), this);

        BukkitTask task = new ReloadScoreboard().runTaskTimer(this, 0L, 600L);

        ScoreBoardManager.o.setDisplaySlot(DisplaySlot.SIDEBAR);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
