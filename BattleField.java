import java.util.ArrayList;

public class BattleField{
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String RESET = "\033[0m";

    public ArrayList<Soldier>[][] bf;
    private int year,size = 50;

    public BattleField(){
        bf = new ArrayList[size][size];
        for(int j=0;j<size;j++){
            for(int i=0;i<(int)(0.5*size);i++){
                bf[i][j] = new ArrayList<Soldier>();
                if(Math.random()<0.2) bf[i][j].add(new Trojan());
            }
            for(int i=(int)(0.5*size);i<size;i++){
                bf[i][j] = new ArrayList<Soldier>();
                if(Math.random()<0.2) bf[i][j].add(new Greek());
            }
        }
        Soldier a = new Achilles();
        Soldier p = new Patroclus();
        Soldier h = new Hector();

        bf[(int)(0.4*size)][(int)(0.5*size)].add(h);
        bf[(int)(0.6*size)][(int)(0.5*size)].add(a);
        bf[(int)(0.6*size+1)][(int)(0.5*size)].add(p);
        year = 1;
    }

    public void update(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(Soldier s: bf[i][j]){
                
                }
            }
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
        for(int j=0;j<size;j++){
            for(int i=0;i<size;i++){
                if(bf[i][j].size()==0) s += "   ";
                else if(bf[i][j].size()==1) s += " "+bf[i][j].get(0)+" ";
                else if(bf[i][j].size()>1 && bf[i][j].get(0).getPower()!=1 && bf[i][j].get(0).getPower()==1) 
                    s += ":"+bf[i][j].get(0)+":";
                else s += PURPLE_BOLD+"%%%"+RESET;
            }
            s += "\n";
        }


        return s;
    }
}