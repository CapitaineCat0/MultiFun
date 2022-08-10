package me.capitainecat0.multifun.commands;

import me.capitainecat0.multifun.MultiFun;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LePe implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("multifun.lepe") || !sender.hasPermission("multifun.*")) {
            sender.sendMessage(MultiFun.colored("&cVous n'avez pas la permission d'utiliser la commande &e/LePe&c!"));
            return true;

        }else{
            if (sender instanceof ConsoleCommandSender){
                sender.sendMessage(MultiFun.colored("&cLa commande &e/LePe &cest réservée aux joueurs!"));
                return true;
            }else{
                ItemStack item =  new ItemStack(Material.DIAMOND_SWORD);
                ItemMeta meta = item.getItemMeta();
                item.setAmount(1);
                assert meta != null;
                meta.setDisplayName("§e§lLéPé");
                List<String> lore = Arrays.asList("§7", "§a 17 Attack Damage", "§a 3 Attack Speed","§a Knockback 3","§a Mending §c§k999","§a Durability §c§K999");
                meta.setLore(lore);
                meta.addEnchant(Enchantment.DURABILITY, 999999, true);
                meta.addEnchant(Enchantment.MENDING, 999999, true);
                meta.addEnchant(Enchantment.KNOCKBACK, 3, true);
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attack.damage", 17, AttributeModifier.Operation.ADD_NUMBER));
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier("generic.attack.speed", 3, AttributeModifier.Operation.ADD_NUMBER));
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
