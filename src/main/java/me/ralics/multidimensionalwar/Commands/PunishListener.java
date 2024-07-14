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
        }
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

    private boolean registerPunishGUI(){
        String basicColor = ChatColor.DARK_RED + "" + ChatColor.BOLD;
        Material mat = Material.PAPER;
        ItemStack hackedClient = createItem(basicColor + "Hacked Client", mat, 4);
        ItemStack xray = createItem(basicColor + "Xray", mat, 5);
        ItemStack spamming = createItem(basicColor + "Spamming", mat, 6);
        ItemStack discrimination = createItem(basicColor + "Discrimination", mat, 7);
        ItemStack griefing = createItem(basicColor + "Griefing", mat, 8);
        ItemStack swearing = createItem(basicColor + "Swearing", mat, 9);
        ItemStack hackusating = createItem(basicColor + "Hackusating", mat, 10);
        punishments.put(hackusating, Punishment.HACKUSATING);
        punishments.put(hackedClient, Punishment.HACKED_CLIENT);
        punishments.put(xray, Punishments.XRAY)
        punishments.put(spamming, Punishments.SPAM);
        punishments.put(swearing, Punishments.SWEARING);
        punishments.put(discrimination, Punishments.DISCRIMINATION);
        return true;
    }

    private ItemStack createItem(String itemName, Material material, List<String> lore, int customModelData){
        ItemStack result = new ItemStack(material);
        ItemMeta meta = result.getItemMeta();
        result.setDisplayName(itemName);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        result.setItemMeta(meta);
        return result;
    }
}