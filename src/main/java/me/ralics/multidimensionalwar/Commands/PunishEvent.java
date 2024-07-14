public class PunishCommand{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)){
            sender.sendMessage("You must be a player to use this command!")
            return true;
        }

        if (args.length == 0){
            return invalidCommandArgs(player);
        }

        Player target = Bukkit.getPlayer(args[0])
        if (target == null){return incorrectPlayer(player);}
        
        openGUI(player, target);
    }

    private void openGUI(Player player, Player target){
        Inventory inventory = Bukkit.createNewInventory(null, 27)
        ItemStack skull = createSkull(target);
        inventory.setItem(skull, 5);
        
        ItemStack punishPlayer = createItem(Material.BARRIER, ChatColor.DARK_RED + "Punish Player", 1);
        ItemStack history = createItem(Material.PAPER, ChatColor.CYAN + "View History", 2);
        ItemStack notes = createItem(Material.QUILL, ChatColor.YELLOW + "Add Note", 3);

        inventory.setItem(history, 3 + 9);
        inventory.setItem(punishPlayer, 5 + 9);
        inventory.setItem(notes, 8 + 9);

        player.openInventory(inventory);
    }

    private ItemStack createSkull(Player owner){
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD;)
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(player);
        skull.setItemMeta(skullMeta;)
        skull.setDisplayName(ChatColor.GOLD + owner.getName());
        return skull;
    }

    private ItemStack createItem(Material material, String name, int customModelData){
        ItemStack result = new ItemStack(material);
        ItemMeta meta = result.getItemMeta();
        meta.setCustomModelData(customModelData);
        result.setItemMeta(meta);
        result.setDisplayName(name);
        return result;
    }
}