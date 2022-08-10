package me.capitainecat0.multifun.events;

import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class FuzeEvent implements Listener {
    @EventHandler
    public void onSneak(PlayerToggleSneakEvent event){
        if(!event.getPlayer().isSneaking()){
            event.getPlayer().spawnParticle(Particle.EXPLOSION_NORMAL, event.getPlayer().getLocation(), 40);
            event.getPlayer().addPotionEffect(new PotionEffect(PotionEffectType.LEVITATION, 9999, 10));
        }
        if(event.getPlayer().isSneaking()){
            event.getPlayer().removePotionEffect(PotionEffectType.LEVITATION);
        }
    }
}
