public class Patroclus extends Greek{
    public Patroclus(){
        super((int)(0.625*SIZE+1),(int)(0.5*SIZE),50,5);
    }

    public void move(BattleField bf){
        int hx = bf.trojans.get(0).getX();
        int hy = bf.trojans.get(0).getY();
        if(bf.trojans.get(0).toString()=="H" && (Math.sqrt(Math.pow((hx-x),2)+Math.pow((hy-y),2))<3)&&x>0&&y>0&&x<SIZE&&y<SIZE&&hx!=x&&hy!=y){
            if(Math.abs(hx-x)>Math.abs(hy-y)){
                if(hx>x) x--;
                else if(hx<x) x++;
            }
            else{
                if(hy>y) y--;
                else if(hy<y) y++;
            }
        }
        else super.move(bf);
    }

    public String toString(){
        return "P";
    }
}