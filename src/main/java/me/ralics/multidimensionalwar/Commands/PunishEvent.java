public class PunishCommand extends TabExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player player)){
            sender.sendMessage("You must be a player to use this command!");
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
        Inventory inventory = Bukkit.createNewInventory(null, 27, ChatColor.GRAY + "Punishment GUI")
        ItemStack skull = PunishHelper.createSkull(target);
        inventory.setItem(skull, 5);
        
        ItemStack punishPlayer = PunishHelper.createItem(Material.BARRIER, ChatColor.DARK_RED + "Punish Player", 1);
        ItemStack history = PunishHelper.createItem(Material.PAPER, ChatColor.CYAN + "View History", 2);
        ItemStack notes = PunishHelper.createItem(Material.QUILL, ChatColor.YELLOW + "Add Note", 3);

        inventory.setItem(history, 3 + 9);
        inventory.setItem(punishPlayer, 5 + 9);
        inventory.setItem(notes, 8 + 9);

        player.openInventory(inventory);
    }
}