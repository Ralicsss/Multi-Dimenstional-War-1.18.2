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
                ItemStack netherite = new ItemStack(Material.NETHERITE_INGOT, 2);
                ItemStack goldenapple = new ItemStack(Material.GOLDEN_APPLE, 16);
                ItemStack elytra = new ItemStack(Material.ELYTRA);
                elytra.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                elytra.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
                crown.addUnsafeEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 5);
                crown.addUnsafeEnchantment(Enchantment.DURABILITY, 10);
                if (args[1].equalsIgnoreCase("overworld")){
                    String playernamoverworld = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playernamoverworld);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_GREEN + "The Overworld's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    target.getInventory().addItem(netherite);
                    target.getInventory().addItem(goldenapple);
                    target.getInventory().addItem(elytra);
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + playernamoverworld +" Has been Crowned the Leader of the Overworld!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    target.setHealth(20.0);
                }
                if (args[1].equalsIgnoreCase("nether")){
                    String playernamnether = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playernamnether);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_RED + "The Nether's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    target.getInventory().addItem(netherite);
                    target.getInventory().addItem(goldenapple);
                    target.getInventory().addItem(elytra);
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    Bukkit.broadcastMessage(ChatColor.GREEN + playernamnether +" Has been Crowned the Leader of the Nether!");
                    Bukkit.broadcastMessage(ChatColor.GOLD + "-------------------------------------------");
                    target.setHealth(20.0);
                }
                if (args[1].equalsIgnoreCase("end")){
                    String playernamend = args[0];
                    Player target = Bukkit.getServer().getPlayerExact(playernamend);
                    ItemMeta itemname = crown.getItemMeta();
                    itemname.setDisplayName(ChatColor.DARK_PURPLE + "The End's crown");
                    crown.setItemMeta(itemname);
                    target.getInventory().addItem(crown);
                    target.getInventory().addItem(netherite);
                    target.getInventory().addItem(goldenapple);
                    target.getInventory().addItem(elytra);
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
