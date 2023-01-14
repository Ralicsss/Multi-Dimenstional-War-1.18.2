package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.weather.LightningStrikeEvent;

public class Ondamage implements Listener {
    @EventHandler
    public static void OndamageEvent(EntityDamageByEntityEvent e){

        Entity p = e.getEntity();


        if (p instanceof Player){

            if (EventManager.pvp == false){
                if (e.getEntity() instanceof  Player && e.getDamager() instanceof Player){
                    e.setCancelled(true);
                }

            }
        }
    }
}
