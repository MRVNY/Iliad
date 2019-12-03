public class Patroclus extends Greek{
    public Patroclus(){
        super((int)(0.625*SIZE+1),(int)(0.5*SIZE),50,5);
    }

    @Override
    public void attack() {
        
    }

    public String toString(){
        return YELLOW_BOLD+"P"+RESET;
    }
}