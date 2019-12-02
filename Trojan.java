public class Trojan extends Soldier{
    
    public Trojan(){
        super(10,1);
    }

    public Trojan(int l,int p){
        super(l,p);
    }

    public void attack(){
        
    }

    public String toString(){
        return RED_BOLD +"T" + RESET;
    }
}