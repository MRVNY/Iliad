public abstract class Soldier{
    protected static final int SIZE = BattleField.SIZE;
    private int life,power;
    protected int x,y;

    public Soldier(int xx,int yy,int l,int p){
        x = xx;
        y = yy;
        life = l;
        power = p;
    }

    public int getPower(){return power;}
    public int getLife(){return life;}
    public int getX(){return x;}
    public int getY(){return y;}
    public void hurt(int h){life -= h;}

    public abstract void move(Object o);

    //Move randomly 
    public void randommove(){
        int xx=x,yy=y;
        do{
            x=xx; y=yy;
            double ranx = Math.random();
            double rany = Math.random();

            if(ranx<1./3.) x++;
            else if(ranx<2./3.) x--;

            if(rany<1./3.) y++;
            else if(rany<2./3.) y--;
        }while(x<0||x>=SIZE||y<0||y>=SIZE);
    }
}