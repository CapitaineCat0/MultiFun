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

import java.util.Collections;

public class LeArc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("multifun.learc") || !sender.hasPermission("multifun.*")) {
            sender.sendMessage(MultiFun.colored("&cVous n'avez pas la permission d'utiliser la commande &e/LeArc&c!"));
            return true;

        }else{
            if (sender instanceof ConsoleCommandSender){
                sender.sendMessage(MultiFun.colored("&cLa commande &e/LePioche &cest réservée aux joueurs!"));
                return true;
            }else{
                ItemStack item =  new ItemStack(Material.BOW);
                ItemMeta meta = item.getItemMeta();
                item.setAmount(1);
                assert meta != null;
                meta.setDisplayName("§e§lLeArc");
                meta.setLore(Collections.singletonList("L'arc ultime réservée aux BG's"));
                meta.addEnchant(Enchantment.ARROW_DAMAGE, 10, true);
                meta.addEnchant(Enchantment.ARROW_INFINITE, 999999, true);
                meta.addEnchant(Enchantment.ARROW_FIRE, 999999, true);
                meta.addEnchant(Enchantment.DURABILITY, 999999, true);
                meta.addEnchant(Enchantment.MENDING, 999999, true);
                meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
                meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
                meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
                item.setItemMeta(meta);
                ((Player)sender).getInventory().addItem(item);
            }
        }
        return false;
    }
}
