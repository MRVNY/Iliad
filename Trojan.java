public class Trojan extends Soldier{    
    public Trojan(int x,int y,int l,int p){
        super(x,y,l,p);
    }

    public Trojan(int x,int y){
        this(x,y,10,1);
    }

    //70% move randomly, 30% move to the closest Greek
    public void move(Object o){
        BattleField bf = (BattleField)o;

        if(Math.random()<0.7){randommove();}
            else{
            double dist = 2*SIZE,tmp;
            Soldier togo = null;
            for(Soldier t: bf.getG()){
                tmp = Math.sqrt(Math.pow((t.getX()-x),2)+Math.pow((t.getY()-y),2));
                if(tmp<dist){
                    dist = tmp;
                    togo = t;
                }
            }
            if(togo.getX()>x) x++;
            else if(togo.getX()<x) x--;

            if(togo.getY()>y) y++;
            else if(togo.getY()<y) y--;
        }
    }

    public String toString(){return "T";}
}