package me.capitainecat0.multifun.events;

import org.bukkit.Color;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

public class Particles implements Listener {
    @EventHandler
    public static void onMove(PlayerMoveEvent event){
        Player p = event.getPlayer();
        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.AQUA, 5.0F);
        p.spawnParticle(Particle.REDSTONE, p.getLocation(), 1, dustOptions);
    }
    @EventHandler
    public static void onChat(AsyncPlayerChatEvent event){
        Player p = event.getPlayer();
        Particle.DustOptions dustOptions = new Particle.DustOptions(Color.RED, 5.0F);
        p.spawnParticle(Particle.REDSTONE, p.getLocation(), 1, 0 , 10, 0, dustOptions);
    }
}
