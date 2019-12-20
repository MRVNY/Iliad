import java.awt.*;
import javax.swing.*;

public class Iliad{
    public static void main(String[] args) throws InterruptedException {
        BattleField bf = new BattleField();

        JFrame f = new JFrame("BattleField");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(BFVisual.getFSize(), BFVisual.getFSize() + 120);

        BFVisual p = new BFVisual(bf); 
        
        JPanel label = new JPanel(); //For showLife()
        JLabel jl = new JLabel(bf.showLife());
        jl.setSize(10,10);
        jl.setFont(new Font("Avenir", Font.PLAIN, 16));
        label.add(jl);

        f.add(p,BorderLayout.CENTER);
        f.add(jl,BorderLayout.SOUTH);

        while(bf.getT().size()>0 && bf.getG().get(1).toString()=="P"){
            Thread.sleep(1000);   
            p.update();
            jl.setText(bf.showLife());
        }
    }
}