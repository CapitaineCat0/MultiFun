package me.capitainecat0.multifun.events;

import me.capitainecat0.multifun.MultiFun;
import me.capitainecat0.multifun.commands.Lightning;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;

import java.util.Objects;

public class ItemsEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_AIR && event.getItem() != null) {
            if (Objects.equals(event.getItem().getItemMeta(), Lightning.lightning.getItemMeta())) {
                Player player = event.getPlayer();
                player.getWorld().strikeLightning((Location) player.getTargetBlock(null, 50));
            }
        }
    }

    @EventHandler
    public static void onDrop(PlayerDropItemEvent event){
        if (Objects.equals(event.getItemDrop().getItemStack().getItemMeta(), Lightning.lightning.getItemMeta())) {
            event.setCancelled(true);
            Player player = event.getPlayer();
            player.sendMessage(MultiFun.colored("&cVous ne pouvez pas droper cet item!"));
        }
    }
}
