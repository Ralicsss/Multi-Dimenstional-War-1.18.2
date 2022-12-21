package me.ralics.multidimensionalwar.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentWrapper;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KingCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.isOp()){
                ItemStack crown = new ItemStack(Material.GOLDEN_HELMET);
                crown.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                crown.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                if (args[0].equalsIgnoreCase("overworld")){
                    String playernamoverworld = args[1];
                    Player target = Bukkit.getServer().getPlayerExact(playernamoverworld);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_GREEN + "The Overworld's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + playernamoverworld +" Has been Crowned the Leader of the Overworld!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    target.setHealth(20.0);
                }
                if (args[0].equalsIgnoreCase("nether")){
                    String playernamnether = args[1];
                    Player target = Bukkit.getServer().getPlayerExact(playernamnether);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_RED + "The Nether's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + playernamnether +" Has been Crowned the Leader of the Nether!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    target.setHealth(20.0);
                }
                if (args[0].equalsIgnoreCase("end")){
                    String playernamend = args[1];
                    Player target = Bukkit.getServer().getPlayerExact(playernamend);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_PURPLE + "The End's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + playernamend +" Has been Crowned the Leader of the End!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    target.setHealth(20.0);

                }
            }
        }
        return false;
    }
}
