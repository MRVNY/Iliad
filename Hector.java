public class Hector extends Trojan implements Hero{
    
    public Hector(){
        super((int)(0.375*SIZE),(int)(0.5*SIZE),90,9);
    }

    public void move(BattleField bf){
        
    }
    
    public String toString(){
        return GREEN_BOLD+"H"+RESET;
    }
}