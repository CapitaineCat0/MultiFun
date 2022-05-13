package me.capitainecat0.multifun.events;

import me.capitainecat0.multifun.MultiFun;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class Chat implements Listener {
    @EventHandler
    public void OnChat(AsyncPlayerChatEvent event){

            String msg = event.getMessage();
            String prefix = "§b_Crispy_ §7>§f ";
            Player sender = event.getPlayer();
            if(msg.contains("tg") || msg.contains("TG")){
                sender.sendMessage(prefix+"v");
            }else if(msg.contains("ah") || msg.contains("Ah") || msg.contains("AH")){
                sender.sendMessage(prefix+"Beh!");
            }else if(msg.contains("mais")){
                sender.sendMessage(prefix+"zon");
            }else if(msg.contains("nan")){
                sender.sendMessage(prefix+"te");
            }else if(msg.contains("oui") || msg.contains("ui")){
                sender.sendMessage(prefix+"stiti");
            }else if(msg.contains("non")){
                sender.sendMessage(prefix+"bril");
            }else if(msg.contains("bruh")){
                sender.sendMessage(prefix+"ton");
            }else if(msg.contains("")){

            }
    }
}
