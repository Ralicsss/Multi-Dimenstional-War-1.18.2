public class Punishments{

    public static Punishment HACKUSATING;
    public static Punishment XRAY;
    public static Punishment SPAM;
    public static Punishment SWEARING;
    public static Punishment HACKED_CLIENT;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;

    private Punishments INSTANCE;

    private Punishments(){
        INSTANCE = this;

        Strike xrayStrike = new Strike(Strikes.BAN);
        xrayStrike.addPunishment(1, 15);
        xrayStrike.addPunishment(2, 30);
        xrayStrike.addPunishment(3, -1); //Permanent ban

        XRAY = new Punishment(xrayStrike);
        
        Strike spamStrike = new Strike(Strikes.MUTE);
        spamStrike.addPunishment(1, 10);
        spamStrike.addPunishment(2, 30);
        spamStrike.addPunishment(3, 60);
        spamStrike.addPunishment(4, -1);
    }

    public static Punishments getInstance(){
        if (INSTANCE == null){
            return new Punishments();
        }
        return INSTANCE;
    }
}