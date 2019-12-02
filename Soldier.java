public abstract class Soldier{

    public static final String RESET = "\033[0m";
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    private int life,power;

    public Soldier(int l,int p){
        life = l;
        power = p;
    }

    public int getPower(){
        return power;
    }

    public int getLife(){
        return life;
    }

    public abstract void attack();

    public void hurt(int h){
        life -= h;
    }

}