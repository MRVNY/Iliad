public class Hector extends Trojan{
    
    public Hector(){
        super((int)(0.375*SIZE),(int)(0.5*SIZE),90,9);
    }

    public void move(BattleField bf){
        int ax = bf.greeks.get(0).getX();
        int ay = bf.greeks.get(0).getY();
        int px = bf.greeks.get(1).getX();
        int py = bf.greeks.get(1).getY();
        if(bf.greeks.get(0).toString()=="A" && (Math.sqrt(Math.pow((ax-x),2)+Math.pow((ay-y),2))<3)&&x>0&&y>0&&x<SIZE&&y<SIZE&&ax!=x&&ay!=y){
            System.out.println("RUN");
            if(Math.abs(ax-x)>Math.abs(ay-y)){
                if(ax>x) x--;
                else if(ax<x) x++;
            }
            else{
                if(ay>y) y--;
                else if(ay<y) y++;
            }
        }
        else if(bf.greeks.get(1).toString()=="P" && (Math.sqrt(Math.pow((px-x),2)+Math.pow((py-y),2))<5)&&x>0&&y>0&&x<SIZE&&y<SIZE){
            System.out.println("HUNT");
            if(Math.abs(px-x)>Math.abs(py-y)){
                if(px>x) x+=2;
                else if(px<x) x-=2;
            }
            else{
                if(py>y) y+=2;
                else if(py<y) y-=2;
            }
        }
        else super.move(bf);
    }
    
    public String toString(){
        return "H";
    }
}