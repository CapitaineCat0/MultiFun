package me.capitainecat0.multifun.commands;

import me.capitainecat0.multifun.MultiFun;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lightning implements CommandExecutor {
    public static ItemStack lightning;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.hasPermission("multifun.lightning") || !sender.hasPermission("multifun.*")){
            sender.sendMessage(MultiFun.colored("&cVous n'avez pas la permission d'utiliser la commande &e/lightning&c!"));
        }else if(sender instanceof ConsoleCommandSender){
             sender.sendMessage("La commande /lightning est réservée aux joueurs!");
        }else{
            ItemStack item =  new ItemStack(Material.STICK);
            ItemMeta meta = item.getItemMeta();
            List<String> lore = new ArrayList<>(Collections.singleton("Venant des cieux, ce bâton vous est donné" + "\nafin que vous désignez le / les" + "\njoueurs que les Dieux puniront"));
            item.setAmount(1);
            meta.setDisplayName("§e§lLightning-Stick");
            meta.setLore(lore);
            meta.addEnchant(Enchantment.LUCK, 1, false);
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            item.setItemMeta(meta);
            ((Player)sender).getInventory().addItem(item);
        }
        return false;
    }
}
