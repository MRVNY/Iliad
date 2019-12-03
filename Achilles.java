public class Achilles extends Greek{
    public Achilles(){
        super((int)(0.625*SIZE),(int)(0.5*SIZE),100,10);
    }

    @Override
    public void attack() {
        
    }

    public String toString(){
        return YELLOW_BOLD+"A"+RESET;
    }
}