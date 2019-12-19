import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class BFVisual extends JPanel implements KeyListener{
    public static final Color LIGHTBLUE = new Color(153, 240, 255);
    public static final Color LIGHTORANGE = new Color(255, 204, 153);
    public static final Color PURPLE = new Color(127, 0, 255);
    private final int sqsize = 20;
    private int SIZE;
    private BattleField bf;

    public BFVisual(BattleField bff){
        super();
        bf = bff;
        this.addKeyListener(this);
        this.setBackground(Color.WHITE);
        this.setSize(SIZE,SIZE);
        SIZE = bf.SIZE*sqsize;
        
    }

    public void addNotify() {
        super.addNotify();
        requestFocus();
    }

    public int getSIZE(){return SIZE;}

    public void paint(Graphics gg){
        Graphics2D g = (Graphics2D) gg;
        String[][] tab = bf.makeTab();
        for(int j=0;j<SIZE/sqsize;j++){
            for(int i=0;i<SIZE/sqsize;i++){
                if(tab[i][j]!=null){
                    switch(tab[i][j]){
                        case "G": g.setColor((LIGHTBLUE)); break;
                        case "T": g.setColor((LIGHTORANGE)); break;
                        case "A": g.setColor((Color.BLACK)); break;
                        case "P": g.setColor((Color.GREEN)); break;
                        case "H": g.setColor((Color.RED)); break;
                        case "%%%": g.setColor((PURPLE)); break;
                        case "TTT": g.setColor((Color.ORANGE)); break;
                        case "GGG": g.setColor((Color.BLUE)); break;
                    }
                    g.fillRect(i*sqsize, j*sqsize, sqsize-5, sqsize-5);
                }
            }
        }
    }

    public void update(){
        bf.update();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()==KeyEvent.VK_RIGHT) {bf.achimove("R"); repaint();}
        else if(e.getKeyCode()==KeyEvent.VK_LEFT) {bf.achimove("L"); repaint();}
        else if(e.getKeyCode()==KeyEvent.VK_UP) {bf.achimove("D"); repaint();}
        else if(e.getKeyCode()==KeyEvent.VK_DOWN) {bf.achimove("U"); repaint();}
    }
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}


    public static void main(String[] args) throws InterruptedException {
        BattleField bf = new BattleField();
        BFVisual p = new BFVisual(bf);

        JFrame f = new JFrame("BattleField");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setSize(p.getSIZE(),p.getSIZE());

        f.add(p,BorderLayout.CENTER);

        for(int i=0;i<1000;i++){
            Thread.sleep(1000);   
            p.update();
        }
    }
}