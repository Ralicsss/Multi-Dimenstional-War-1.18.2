public class PunishHelper{
    private static HashMap<ItemStack, Punishments> punishments = new HashMap<>();
    private static Inventory punishGUI;
    private static HashMap<Player, Player> currentlyNoting = new HashMap<>();
    private static HashMap<Player, Integer> mutedPlayers = new HashMap<>();

    private boolean registerPunishGUI(){
        punishGUI = Bukkit.getNewInventory(null, 27, ChatColor.RED + "Select a Punishment");
        String basicColor = ChatColor.DARK_RED + "" + ChatColor.BOLD;
        Material mat = Material.PAPER;
        ItemStack hackedClient = createItem(basicColor + "Hacked Client", mat, 4);
        ItemStack xray = createItem(basicColor + "Xray", mat, 5);
        ItemStack spamming = createItem(basicColor + "Spamming", mat, 6);
        ItemStack discrimination = createItem(basicColor + "Discrimination", mat, 7);
        ItemStack griefing = createItem(basicColor + "Griefing", mat, 8);
        ItemStack swearing = createItem(basicColor + "Swearing", mat, 9);
        ItemStack hackusating = createItem(basicColor + "Hackusating", mat, 10);
        punishments.put(hackusating, Punishments.HACKUSATING);
        punishments.put(hackedClient, Punishment.HACKED_CLIENT);
        punishments.put(xray, Punishments.XRAY);
        punishments.put(griefing, Punishments.GRIEFING);
        punishments.put(spamming, Punishments.SPAM);
        punishments.put(swearing, Punishments.SWEARING);
        punishments.put(discrimination, Punishments.DISCRIMINATION);
        //int distance = 27 / punishments.keySet().size;
        int number = 0;
        for (ItemStack item : punishments.keySet()){
            //number = number + distance;
             //better option
            inventory.setItem(item, number);
            number++;
        }
        return true;
    }

    public static Inventory getPunishGUI(){
        return punishGUI.copy();
    }

    private ItemStack createItem(String itemName, Material material, List<String> lore, int customModelData){
        ItemStack result = new ItemStack(material);
        ItemMeta meta = result.getItemMeta();
        meta.setDisplayName(itemName);
        meta.setCustomModelData(customModelData);
        meta.setLore(lore);
        result.setItemMeta(meta);
        return result;
    }

    private void registerCommands(){
        Vars.PLUGIN.getCommand("punish").setExectuor(new PunishCommand);
        Vars.PLUGIN.getCommand("punish").setTabCompleter(new PunishCommand);
    }

    private void registerEvents(){
        Bukkit.getPluginManager().registerEvents(Vars.PLUGIN, new PunishListener);
    }

    public static void registerAll(){
        registerEvents();
        registerCommands();
        registerPunishGUI();        
    }

    public static void adding(Player player, Player noted){
        currentlyNoting.put(player, noted);
    }

    public static boolean isNoting(Player player){
        return currentlyNoting.keySet().contains(player);
    }

    public static void addPunishment(ItemStack item, Player target){
        Punishments punishmentToAdd = punisments.get(item);
        PunishFile.addPunishmentToPlayer(target, punishmentToAdd);
    }

    public static ItemStack createSkull(Player owner){
        ItemStack skull = new ItemStack(Material.PLAYER_HEAD;)
        SkullMeta skullMeta = (SkullMeta) skull.getItemMeta();
        skullMeta.setOwner(player);
        skull.setItemMeta(skullMeta;)
        skull.setDisplayName(ChatColor.GOLD + owner.getName());
        return skull;
    }

    public static ItemStack createItem(Material material, String name, int customModelData){
        ItemStack result = new ItemStack(material);
        ItemMeta meta = result.getItemMeta();
        meta.setCustomModelData(customModelData);
        result.setItemMeta(meta);
        result.setDisplayName(name);
        return result;
    }

    public static boolean isMuted(Player player){
        return mutedPlayers.keySet().contains(player);
    }

    public static void mutePlayer(Player player, int timeInSeconds){
        mutedPlayers.put(player,timeInSeconds);
        int timeRemaining = timeInSeconds;
        BukkitRunnable muteRunnable = new BukkitRunnable(
            @Override
            public void run(){
                timeRemaining--;
                mutedPlayers.put(player, timeRemaining);
                if (timeRemaining <= 0){
                    mutedPlayers.remove(player, timeRemaining);
                    this.cancel;
                }
            });
    }
}