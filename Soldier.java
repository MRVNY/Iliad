public abstract class Soldier{
    public final static int SIZE = 50;

    public final String RESET = "\033[0m";
    public final String RED_BOLD = "\033[1;31m";    // RED
    public final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public final String PURPLE_BOLD = "\033[1;35m"; // PURPLE

    private int life,power;
    private int x,y;

    public Soldier(int xx,int yy,int l,int p){
        x = xx;
        y = yy;
        life = l;
        power = p;
    }

    public int getPower(){
        return power;
    }

    public int getLife(){
        return life;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public abstract void attack();
    public abstract void move();

    public void hurt(int h){
        life -= h;
    }

}