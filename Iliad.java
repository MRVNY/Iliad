//import javax.swing.JFrame;
//import java.util.Scanner;

public class Iliad{
    public static void main(String[] args) throws InterruptedException {
        BattleField bf = new BattleField();
        while(1==1){
            System.out.println(bf);
            Thread.sleep(1000);   
            bf.update();     
        }
    }
}