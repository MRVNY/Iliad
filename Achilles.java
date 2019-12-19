public class Achilles extends Greek{
    public Achilles(){
        super((int)(0.625*SIZE),(int)(0.5*SIZE),1000,10);
    }

    public String toString(){
        return "A";
    }

    public void move(String s){
        switch(s){
            case "R": x++; break;
            case "L": x--; break;
            case "U": y++; break;
            case "D": y--; break;
        }
    }
}