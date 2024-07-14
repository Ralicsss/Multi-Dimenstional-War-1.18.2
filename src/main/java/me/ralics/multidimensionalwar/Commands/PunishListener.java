public class PunishListener implements Listener{
    @EventHandler
    public boolean onClick(InventoryClickEvent event){
        if (!event.getClickedInventory().getName().contains("gui"){ //Change Later to all inventory names
            return;
        }

        event.setCancelled(true);

        ItemStack skull = event.getClickedInventory().getItem(5);
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        
        Player target = skullMeta.getOwner();
        Player clicker = (Player) event.getClicker();
        int clickedData = event.getClicked().getItemMeta().getCustomModelData();
        switch(clickedData){
            case 1:
                return openHistory(clicker, target);
            case 2:
                return openPunish(clicker, target);
            case 3:
                return addNote(clicker, target);
            case > 3:
                PunishHelper.addPunishment(target, event.getClickedItem());
                return true;
        }
    }

    @EventHandler
    public void chatMessage(AsyncChatMessageEvent event){
        Player player = event.getPlayer();
        if (!PunishHelper.addingNote(player){
            return;
        }

        event.setCancelled(true);
        Player target = PunishHelper.getNoted(player);
        String message = event.getMessage;

        PunishHelper.addNote(target, message);
        player.sendMessage(ChatColor.GREEN + "Successfully added note: " + message + " to player: " + target.getName();
    }

    private boolean openPunish(Player player, Ppayer target){
        Inventory gui = PunishHelper.getPunishGUI();
        player.openInventory(gui);
        returm true;
    }

    private boolean addNote(Player player, Player target){
        PunishHelper.adding(player);
        PunishHelper.noted(target);

        player.closeInventory();
        player.sendTitle(ChatColor.GREEN + "Please type your note in chat", "")
        return true;
    }

    private boolean openHistory(Player player, Player target){
        Inventory inventory = Bukkit.getNewInventory(null, 36, target.getName() + " 's offenses")
        List<String> previousOffenses = Helper.getOffenses(target);
        int noteNumber = 0;
        for(String offense : previousOffenses){
            noteNumber++;
            ItemStack note = new ItemStack(Material.PAPER);
            note.setDisplayName(ChatColor.CYAN + "Offense #"+noteNumber);
            note.setLore(List.of(offense));
            inventory.setItem(note, noteNumber -1);
        }
        player.openInventory(inventory);
        return true;
    }
}