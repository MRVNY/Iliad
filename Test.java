public class Test{
//For testing in Terminal, we can't move Achilles
    public static void main(String[] args) throws InterruptedException{
        BattleField bf = new BattleField();
        for(int i=0;i<20;i++){
            System.out.println(bf);
            Thread.sleep(500);   
            bf.update();
        }
    }
}