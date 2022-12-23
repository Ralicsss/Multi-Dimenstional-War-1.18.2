package me.ralics.multidimensionalwar;

import me.ralics.multidimensionalwar.Commands.KingCommand;
import me.ralics.multidimensionalwar.Commands.SetTeamCommand;
import me.ralics.multidimensionalwar.Commands.runevent;
import me.ralics.multidimensionalwar.Events.*;
import me.ralics.multidimensionalwar.Functions.Particle;
import me.ralics.multidimensionalwar.Functions.ReloadScoreboard;
import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import me.ralics.multidimensionalwar.Scoreboard.ScoreBoardManager;
import me.ralics.multidimensionalwar.Scoreboard.TeamManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Scoreboard;

public final class MainClass extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic


        getCommand("runevent").setExecutor(new runevent());
        getCommand("crownleader").setExecutor(new KingCommand());
        getCommand("setteam").setExecutor(new SetTeamCommand());

        TeamManager.Nether.setPrefix(ChatColor.DARK_RED + "Nether ");
        TeamManager.End.setPrefix(ChatColor.DARK_PURPLE + "End ");
        TeamManager.OverWorld.setPrefix(ChatColor.DARK_GREEN + "Overworld ");

        Bukkit.getServer().getPluginManager().registerEvents(new Onbreak(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Onchat(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Ondamage(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Ondeath(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Onjoin(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new Onmove(), this);

        BukkitTask task = new ReloadScoreboard().runTaskTimer(this, 0L, 600L);
        BukkitTask task2 = new Particle().runTaskTimer(this, 0L, 30L);

        ScoreBoardManager.o.setDisplaySlot(DisplaySlot.SIDEBAR);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
