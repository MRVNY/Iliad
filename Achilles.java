public class Achilles extends Greek{
    public Achilles(){
        super((int)(0.625*SIZE),(int)(0.5*SIZE),1000,20);
    }

    public String toString(){
        return "A";
    }

    public void move(String s){
        switch(s){
            case "R": if(x!=SIZE-1) x++; break;
            case "L": if(x!=0) x--; break;
            case "U": if(y!=SIZE-1) y++; break;
            case "D": if(y!=0) y--; break;
        }
    }
}