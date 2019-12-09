public class Achilles extends Greek implements Hero{
    public Achilles(){
        super((int)(0.625*SIZE),(int)(0.5*SIZE),100,10);
    }

    public void move(BattleField bf){
        
    }

    public String toString(){
        return YELLOW_BOLD+"A"+RESET;
    }
}