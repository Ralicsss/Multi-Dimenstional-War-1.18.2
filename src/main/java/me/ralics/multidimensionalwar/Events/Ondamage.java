package me.ralics.multidimensionalwar.Events;

import me.ralics.multidimensionalwar.Scoreboard.EventManager;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageEvent;

public class Ondamage {
    public static void OndamageEvent(EntityDamageEvent e){

        Entity p = e.getEntity();

        if (p instanceof Player){
            if (EventManager.pvp == false){
                e.setCancelled(true);
            }
        }
    }
}
