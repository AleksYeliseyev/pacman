import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import java.lang.*;


public class GameField extends JPanel implements ActionListener {

    /**
     *
     */
    private static final long serialVersionUID = 1L;


    Timer mainTimer = new Timer(50, this); // timer 200

    Image img = new ImageIcon ("D:\\Project\\Pacmannew\\src\\main\\resources\\Background.png").getImage();

    Pac p = new Pac();
    Enemy enem = new Enemy();



    public GameField() {
        mainTimer.start();
        addKeyListener(new MyKeyAdapter());
        setFocusable(true);
    }

    private class MyKeyAdapter extends KeyAdapter {
        public void keyPressed(KeyEvent e) {

            p.keyPressed(e);
        }

        public void keyReleased(KeyEvent e) {
            p.keyReleased(e);
        }
    }

    public void actionPerformed (ActionEvent e) {
            p.move();
            enem.move();
            repaint();
        }

    public void paint(Graphics g) {
        g = (Graphics2D) g;
        g.drawImage(img, 0, 0, null);
        g.drawImage(p.img, p.x, p.y, null);
        g.drawImage(enem.img, enem.x, enem.y, null);
        g.setColor(Color.WHITE);
        g.drawString("x=" + p.x + "  y=" + p.y, 100,100);
        g.drawString("xf=" + p.x/20 + "  yf=" + p.y/20, 100,130);
        g.drawString("f=" + p.field[p.y/20][p.x/20], 100,160);
        g.drawString("course=" + p.course, 100,190);

    }



}