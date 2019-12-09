public class Greek extends Soldier{
    
    public Greek(int x,int y){
        super(x,y,10,1);
    }

    public Greek(int x,int y,int l,int p){
        super(x,y,l,p);
    }

    public String toString(){
        return BLUE_BOLD + "G" + RESET;
    }
}