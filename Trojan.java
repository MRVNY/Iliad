public class Trojan extends Soldier{
    
    public Trojan(int x,int y){
        super(x,y,10,1);
    }

    public Trojan(int x,int y,int l,int p){
        super(x,y,l,p);
    }

    public void attack(){
        
    }

    public String toString(){
        return RED_BOLD +"T" + RESET;
    }
}