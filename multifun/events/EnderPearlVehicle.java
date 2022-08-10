package me.capitainecat0.multifun.events;

import org.bukkit.Material;
import org.bukkit.entity.EnderPearl;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.spigotmc.event.entity.EntityDismountEvent;

public class EnderPearlVehicle implements Listener {
    @EventHandler
    public void onInteract(PlayerInteractEvent event){
        Player player = event.getPlayer();
        ItemStack current = event.getItem();
        if(current == null)return;
        if(current.getType() == Material.ENDER_PEARL){
            event.setCancelled(true);
            player.updateInventory();
            if(player.getVehicle() != null){
                if(player.getVehicle().getType() == EntityType.ENDER_PEARL){
                    player.getVehicle().remove();
                }
            }
            EnderPearl pearl = player.launchProjectile(EnderPearl.class);
            pearl.setPassenger(player);
            pearl.setVelocity(pearl.getVelocity().multiply(2));
        }
    }
    @EventHandler
    public void onDismount(EntityDismountEvent event){
        if(event.getDismounted() instanceof EnderPearl && event.getEntity() instanceof Player){
            event.getDismounted().remove();
        }
    }
}
