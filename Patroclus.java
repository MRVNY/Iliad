public class Patroclus extends Greek{
    public Patroclus(){
        super((int)(0.625*SIZE+1),(int)(0.5*SIZE),100,5);
    }

    public void move(BattleField bf){
        //run from Hector
        if(bf.getT().size()>0){
            int hx = bf.getT().get(0).getX();
            int hy = bf.getT().get(0).getY();
            double disth = Math.sqrt(Math.pow((hx-x),2)+Math.pow((hy-y),2));
            if(bf.getT().get(0).toString()=="H" && disth<5 && x>0&&y>0&&x<SIZE&&y<SIZE&&hx!=x&&hy!=y){
                if(hx>x) x--;
                else if(hx<x) x++;
                if(hy>y) y--;
                else if(hy<y) y++;
            }
            else super.move(bf);
        }
    }

    public String toString(){
        return "P";
    }
}