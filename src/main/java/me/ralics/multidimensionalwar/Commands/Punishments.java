public class Punishments{

    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;
    public static Punishment HACKUSATING;

    private Punishments INSTANCE;

    private Punishments(){
        INSTANCE = this;
    }

    public static Punishments getInstance(){
        if (INSTANCE == null){
            return new Punishments();
        }
        return INSTANCE;
    }
}