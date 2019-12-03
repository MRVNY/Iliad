public class Hector extends Trojan{
    
    public Hector(){
        super((int)(0.375*SIZE),(int)(0.5*SIZE),90,9);
    }

    @Override
    public void attack() {
        
    }

    public String toString(){
        return GREEN_BOLD+"H"+RESET;
    }
}