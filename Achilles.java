public class Achilles extends Greek{
    public Achilles(){
        super((int)(0.625*SIZE),(int)(0.5*SIZE),10000,20);
    }

    //Contolled by keyboard
    @Override
    public void move(Object o){
        String s = (String)o;
        switch(s){
            case "R": if(x!=SIZE-1) x++; break;
            case "L": if(x!=0) x--; break;
            case "U": if(y!=SIZE-1) y++; break;
            case "D": if(y!=0) y--; break;
        }
    }

    public String toString(){return "A";}
}