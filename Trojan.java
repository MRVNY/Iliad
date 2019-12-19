public class Trojan extends Soldier{    
    public Trojan(int x,int y){
        super(x,y,10,1);
    }

    public Trojan(int x,int y,int l,int p){
        super(x,y,l,p);
    }

    public String toString(){
        return "T";
    }

    public void move(BattleField bf){
        if(Math.random()<0.7){randommove();}
            else{
            double dist = 2*SIZE,tmp;
            Soldier togo=null;
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
}