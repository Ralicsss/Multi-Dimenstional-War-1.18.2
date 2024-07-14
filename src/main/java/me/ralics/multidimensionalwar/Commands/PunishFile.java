import java.io.File;
import java.io.IOException;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class PunishFile {
    public static File file = new File("plugins/punishPlugin/punishments.yml");
    public static FileConfiguration config = YamlConfiguration.loadConfiguration(file);
    
    public static void existCheck() {
        if (!file.exists()) {
            try {
                file.createNewFile();
                config.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void checkIfAllPunishmentsRegistered(Player player) {
        String playerUUID = player.getUniqueId().toString();
        if (config.getString("players." + playerUUID + ".punishments") == null) {
            config.set("players." + playerUUID + ".punishments", Punishments.all);
            for (String punishment : Punishments.all) {
                config.set("players." + playerUUID + ".punishments." + punishment, 0);
            }
            saveConfig();
        }
    }

    public static void addPunishmentToPlayer(Player player, Punishment punishment) {
        String playerUUID = player.getUniqueId().toString();
        int currentPunishmentsForViolation = config.getInt("players." + playerUUID + ".punishments." + punishment.name());
        config.set("players." + playerUUID + ".punishments." + punishment.name(), currentPunishmentsForViolation + 1);
        saveConfig();
    }

    public static void checkToPunish(Punishment punishment, Player player) {
        String playerUUID = player.getUniqueId().toString();
        int currentPunishmentsForViolation = config.getInt("players." + playerUUID + ".punishments." + punishment.name());
        Strike strike = punishment.getStrike(currentPunishmentsForViolation);
        
        if (strike == null) {
            return;
        }

        switch (strike.type) {
            case KICK:
                player.kickPlayer(strike.reason);
                break;
            case BAN:
                Bukkit.getBanList(BanList.Type.NAME).addBan(player.getName(), strike.reason, strike.time, null);
                player.kickPlayer(strike.reason);
                break;
            case MUTE:
                PunishHelper.mutePlayer(player, strike.time);
                break;
        }
    }

    private static void saveConfig() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}