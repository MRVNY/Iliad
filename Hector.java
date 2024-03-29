public class Hector extends Trojan{
    
    public Hector(){
        super((int)(0.375*SIZE),(int)(0.5*SIZE),200,9);
    }

    @Override
    public void move(Object o){
        BattleField bf = (BattleField)o;
        if(bf.getG().size()>1){
            int ax = bf.getG().get(0).getX();
            int ay = bf.getG().get(0).getY();
            int px = bf.getG().get(1).getX();
            int py = bf.getG().get(1).getY();
            double distA = Math.sqrt(Math.pow((ax-x),2)+Math.pow((ay-y),2));
            double distP = Math.sqrt(Math.pow((px-x),2)+Math.pow((py-y),2));

            //Run from Achillies
            if(distA<5 && x>1&&y>1&&x<SIZE-1&&y<SIZE-1){
                if(ax>x) x-=2;
                else if(ax<x) x+=2;

                if(ay>y) y-=2;
                else if(ay<y) y+=2;

                if(ax==x&&ay==y) super.move(bf);
            }
            
            //Hunt Patroclus
            else if(bf.getG().get(1).toString()=="P" && distP<5 && x>1&&y>1&&x<SIZE-1&&y<SIZE-1){
                if(px>x)   
                    if(px-x>1) x+=2; 
                    else x++;
                else if(px<x) 
                    if(x-px>1) x-=2; 
                    else x--;
            
                if(py>y) 
                    if(py-y>1) y+=2; 
                    else y++;
                else if(py<y) 
                    if(y-py>1) y-=2; 
                    else y--;
            }
            //Move like a Trojan
            else super.move(bf);
        }
    }
    
    public String toString(){return "H";}
}