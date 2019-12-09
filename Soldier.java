public abstract class Soldier{
    public final static int SIZE = 50;

    public final String RESET = "\033[0m";
    public final String RED_BOLD = "\033[1;31m";    // RED
    public final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public final String PURPLE_BOLD = "\033[1;35m"; // PURPLE

    private int life,power,x,y;

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

    public void move(){
        do{
            double ranx = Math.random();
            double rany = Math.random();
            if(ranx<1/3) x++;
            else if(ranx<2/3) x--;
            if(rany<1/3) y++;
            else if(rany<2/3) y--;
        }while(x<0||x>SIZE||y<0||y>SIZE);
    }

    public void hurt(int h){
        life -= h;
    }

}