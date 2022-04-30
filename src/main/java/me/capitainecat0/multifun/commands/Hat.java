package me.capitainecat0.multifun.commands;

import me.capitainecat0.multifun.MultiFun;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Objects;

public class Hat implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!sender.hasPermission("multifun.hat") || !sender.hasPermission("multifun.*")){
            sender.sendMessage(MultiFun.colored("&cVous n'avez pas la permission d'utiliser la commande &e/hat&c!"));
        }else{
            if(sender instanceof ConsoleCommandSender){
                sender.sendMessage(MultiFun.colored("&cLa commande &e/hat &cest réservée aux joueurs!"));
            }else{
                ItemStack helmet = Objects.requireNonNull(((Player)sender).getEquipment()).getHelmet();
                ItemStack block = ((Player)sender).getEquipment().getItemInMainHand();
                ((Player)sender).getEquipment().setHelmet(block);
                ((Player)sender).getEquipment().setItemInMainHand(helmet);
                sender.sendMessage(MultiFun.colored("&aVous avez placé l'item : &e"+block.getType()+" &asur votre tête!"));
            }
        }
        return false;
    }
}
