package me.capitainecat0.multifun.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

import java.util.Objects;

public class TNTEvent implements Listener {
    @EventHandler
    public void tntExplode(EntityExplodeEvent event){
        if(event.getEntityType().equals(EntityType.PRIMED_TNT)){
            event.setCancelled(true);
            Objects.requireNonNull(Bukkit.getWorld("world")).spawnEntity(event.getLocation(), EntityType.PRIMED_TNT);
            Objects.requireNonNull(Bukkit.getWorld("world")).spawnEntity(event.getLocation(), EntityType.PRIMED_TNT);
            Objects.requireNonNull(Bukkit.getWorld("world")).createExplosion(event.getLocation(),15F);
        }
    }
}
