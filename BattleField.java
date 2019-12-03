import java.util.ArrayList;

public class BattleField{
    public final int SIZE = 50;

    public ArrayList<Soldier> greeks,trojans;
    private int year = 50;

    public BattleField(){
        greeks = new ArrayList<Soldier>();
        trojans = new ArrayList<Soldier>();
        greeks.add(new Achilles());
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

    public void update(){
        for(Soldier g: greeks){

        }
        for(Soldier t: trojans){

        }
    }

    public int getYear(){
        return year;
    }

    public void timepass(){
        year++;
    }

    public String toString(){
        String s = "";
        String[][] tab = new String[SIZE][SIZE];

        for(Soldier g: greeks){
            if(tab[g.getX()][g.getY()]==null) tab[g.getX()][g.getY()] = g.toString();
            else if(tab[g.getX()][g.getY()]==trojans.get(1).toString()) tab[g.getX()][g.getY()] = g.PURPLE_BOLD+"%%%"+g.RESET;
            else tab[g.getX()][g.getY()] = "%"+tab[g.getX()][g.getY()]+"%";
        }
        for(Soldier t: trojans){
            if(tab[t.getX()][t.getY()]==null) tab[t.getX()][t.getY()] = t.toString();
            else if(tab[t.getX()][t.getY()]==greeks.get(2).toString()) tab[t.getX()][t.getY()] = t.PURPLE_BOLD+"%%%"+t.RESET;
            else tab[t.getX()][t.getY()] = "%"+tab[t.getX()][t.getY()]+"%";
        }

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