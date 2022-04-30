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

import java.util.Collections;

public class LePorte implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("multifun.leporte") || !sender.hasPermission("multifun.*")) {
            sender.sendMessage(MultiFun.colored("&cVous n'avez pas la permission d'utiliser la commande &e/LePorte&c!"));
            return true;

            }else{
            if (sender instanceof ConsoleCommandSender){
                sender.sendMessage(MultiFun.colored("&cLa commande &e/LePorte &cest réservée aux joueurs!"));
                return true;
            }else{
                ItemStack item =  new ItemStack(Material.OAK_DOOR);
                ItemMeta meta = item.getItemMeta();
                item.setAmount(1);
                assert meta != null;
                meta.setDisplayName("§e§lLePorte");
                meta.setLore(Collections.singletonList("(La french touch de ce plugin ;])"));
                meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier("generic.attack.damage", 666.0D, AttributeModifier.Operation.ADD_NUMBER));
                meta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("generic.movement.speed", 0.5D, AttributeModifier.Operation.ADD_NUMBER));
                meta.addEnchant(Enchantment.LUCK, 1, false);
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
