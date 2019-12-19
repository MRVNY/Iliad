import java.util.ArrayList;

public class BattleField{
    private Achilles achi =  new Achilles();
    public static final int SIZE = 39;
    
    public ArrayList<Soldier> greeks,trojans;
    private static int year = 0;

    public BattleField(){
        greeks = new ArrayList<Soldier>();
        trojans = new ArrayList<Soldier>();
        greeks.add(achi);
        greeks.add(new Patroclus());
        trojans.add(new Hector());

        for(int j=0;j<SIZE;j++){
            for(int i=0;i<(int)(0.25*SIZE);i++){
                trojans.add(new Trojan(i,j));
            }
            for(int i=(int)(0.75*SIZE);i<SIZE;i++){
                greeks.add(new Greek(i,j));
            }
        }
        year = 1;
    }

    public int getYear(){
        return year;
    }

    public void timepass(){
        year++;
    }

    public void achimove(String s){
        achi.move(s);
    }

    public ArrayList<Soldier> getXY(int x,int y){
        ArrayList<Soldier> xy = new ArrayList<Soldier>();
        
        for(Soldier s: greeks){
            if(s.getX()==x && s.getY()==y) xy.add(s);
        }
        for(Soldier s: trojans){
            if(s.getX()==x && s.getY()==y) xy.add(s);
        }

        return xy;
    }

    public void update(){
        //move
        for(Soldier s: greeks){
            if(!(s instanceof Achilles)){
                s.move(this);
            }
        }
        for(Soldier s: trojans) s.move(this);

        //fight
        double powerG,powerT,nbG,nbT;
        int hurt;
        for(int j=0;j<SIZE;j++){
            for(int i=0;i<SIZE;i++){
                ArrayList<Soldier> onXY = getXY(i,j);
                if(onXY.size()>0){
                    powerG = powerT = nbG = nbT = 0;
                    for(Soldier s: onXY){
                        if(s instanceof Greek){
                            powerG += s.getPower();
                            nbG++;
                        }
                        if(s instanceof Trojan){
                            powerT += s.getPower();
                            nbT++;
                        }
                    }
                    if(powerG>powerT && powerT!=0){
                        hurt = (int)((powerG-powerT)/nbT);
                        for(Soldier s: onXY)
                            if(s instanceof Trojan) s.hurt(hurt);
                    }
                    if(powerT>powerG && powerG!=0){
                        hurt = (int)((powerT-powerG)/nbG);
                        for(Soldier s: onXY)
                            if(s instanceof Greek) s.hurt(hurt);
                    }
                }
            }
        }

        //die
        for(int i=0;i<greeks.size();i++)
            if(greeks.get(i).getLife() < 1) greeks.remove(i);
        for(int i=0;i<trojans.size();i++)
            if(trojans.get(i).getLife() < 1) trojans.remove(i);
    }

    public String[][] makeTab(){
        String[][] tab = new String[SIZE][SIZE];
        int x,y;

        for(Soldier g: greeks){
            x = g.getX(); y = g.getY();
            if(tab[x][y]==null) tab[x][y] = g.toString();
            else if(tab[x][y]=="T" || tab[x][y]=="TTT") tab[x][y] = "%%%";
            else if(tab[x][y]=="G") tab[x][y] = "GGG";
        }
        for(Soldier t: trojans){
            x = t.getX(); y = t.getY();
            if(t.toString()=="H"&&tab[x][y]!="A") tab[x][y] = "H";
            else if(tab[x][y]==null) tab[x][y] = t.toString();
            else if(tab[x][y]=="G" || tab[x][y]=="GGG") tab[x][y] = "%%%";
            else if(tab[x][y]=="T") tab[x][y] = "TTT";
        }
        return tab;
    }
    
    public String toString(){
        String s = "";
        String[][] tab = makeTab();

        for(int j=0;j<SIZE;j++){
            for(int i=0;i<SIZE;i++){
                if(tab[i][j]==null) s += "   ";
                else if(tab[i][j].length()==3) s += tab[i][j];
                else s += " "+tab[i][j]+" ";
            }
            s += "\n";
        }
        return s;
    }
}