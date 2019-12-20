public class Patroclus extends Greek{
    public Patroclus(){
        super((int)(0.625*SIZE+1),(int)(0.5*SIZE),100,5);
    }
    
    @Override
    public void move(Object o){
        BattleField bf = (BattleField)o;

        if(bf.getT().size()>0){
            int hx = bf.getT().get(0).getX();
            int hy = bf.getT().get(0).getY();
            double distH = Math.sqrt(Math.pow((hx-x),2)+Math.pow((hy-y),2));

            //Run from Hector
            if(bf.getT().get(0).toString()=="H" && distH<5 && x>0&&y>0&&x<SIZE&&y<SIZE && (hx!=x||hy!=y)){
                if(hx>x) x--;
                else if(hx<x) x++;

                if(hy>y) y--;
                else if(hy<y) y++;
            }
            //Move like a Greek
            else super.move(bf);
        }
    }

    public String toString(){return "P";}
}