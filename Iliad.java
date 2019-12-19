import java.awt.*;
import javax.swing.*;

public class Iliad{
    public static void main(String[] args) throws InterruptedException {
        BattleField bf = new BattleField();
        BFVisual p = new BFVisual(bf);
        JPanel label = new JPanel();

        JFrame f = new JFrame("BattleField");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(BFVisual.getSIZE(),BFVisual.getSIZE()+120);

        JLabel jl = new JLabel(bf.showLife());
        jl.setSize(10,10);
        jl.setFont(new Font("Avenir", Font.PLAIN, 16));
        //label.setLayout(new FlowLayout()); 
        label.add(jl);

        f.add(p,BorderLayout.CENTER);
        f.add(jl,BorderLayout.SOUTH);

        while(bf.getT().size()>0 && bf.getG().get(1).toString()=="P"){
            Thread.sleep(1000);   
            p.update();
            jl.setText(bf.showLife());
        }
        jl.setText(bf.showLife());
    }
}