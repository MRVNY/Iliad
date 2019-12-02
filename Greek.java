public class Greek extends Soldier{
    
    public Greek(){
        super(10,1);
    }

    public Greek(int l,int p){
        super(l,p);
    }

    public void attack(){

    }

    public String toString(){
        return BLUE_BOLD + "G" + RESET;
    }
}