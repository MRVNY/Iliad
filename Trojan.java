public class Trojan extends Soldier{
    private static int cptt=0;
    
    public Trojan(int x,int y){
        super(x,y,10,1);
        cptt++;
    }

    public Trojan(int x,int y,int l,int p){
        super(x,y,l,p);
        cptt++;
    }

    public String toString(){
        return "T";
    }

    public void move(BattleField bf){
        if(Math.random()<0.7){randommove();}
            else{
            double dist = 2*SIZE,tmp;
            Soldier togo=null;
            for(Soldier t: bf.greeks){
                tmp = Math.sqrt(Math.pow((t.getX()-x),2)+Math.pow((t.getY()-y),2));
                if(tmp<dist){
                    dist = tmp;
                    togo = t;
                }
            }
            if(Math.abs(togo.getX()-x)>Math.abs(togo.getY()-y)){
                if(togo.getX()>x) x++;
                else if(togo.getX()<x) x--;
            }
            else{
                if(togo.getY()>y) y++;
                else if(togo.getY()<y) y--;
            }
        }
    }
}