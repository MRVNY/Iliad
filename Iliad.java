public class Iliad{
    public static void main(String[] args) throws InterruptedException{
        BattleField bf = new BattleField();
        //System.out.println(bf);
        for(int i=0;i<20;i++){
            System.out.println(bf);
            Thread.sleep(500);   
            bf.update();
        }
    }
}