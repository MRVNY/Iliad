public class Patroclus extends Greek implements Hero{
    public Patroclus(){
        super((int)(0.625*SIZE+1),(int)(0.5*SIZE),50,5);
    }

    public void move(BattleField bf){
        
    }
    
    public String toString(){
        return YELLOW_BOLD+"P"+RESET;
    }
}