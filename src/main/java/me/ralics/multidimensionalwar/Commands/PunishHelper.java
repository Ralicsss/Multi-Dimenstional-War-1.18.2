public class PunishHelper{
    private static HashMap<ItemStack, Punishments> punishments = new HashMap<>();
    public static Inventory punishGUI;
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
        punishments.put(hackusating, Punishment.HACKUSATING);
        punishments.put(hackedClient, Punishment.HACKED_CLIENT);
        punishments.put(xray, Punishments.XRAY)
        punishments.put(spamming, Punishments.SPAM);
        punishments.put(swearing, Punishments.SWEARING);
        punishments.put(discrimination, Punishments.DISCRIMINATION);
        int distance = 27 / punishments.keySet().size;
        int number = 0;
        for (ItemStack item : punishments.keySet()){
            number = number + distance;
            //number++; better option
            inventory.setItem(item, number);
        }
        return true;
    }
}