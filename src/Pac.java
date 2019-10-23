import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Pac {
    Image img = new ImageIcon ("D:\\Project\\JAVA\\Pacman\\resources\\Pacman.png").getImage();

    //Ќужно найти пнг с закрытым ртом с прозрачностью
    //Image img_0 = new ImageIcon ("res/Pacman_0.png").getImage();
    //Image img_1 = new ImageIcon ("res/Pacman_1.png").getImage();
    //Image img = img_1;

    char course = 'r'; // direction 'u' - 'd' - 'l' - 'r'
    boolean life = true; // live or die
    boolean angry = false; // normal or angry
    int x = 260;
    int y = 460;
    int dx = 0;
    int dy = 0;
    int sp = 20; // SPEED


    Level l = new Level();
    String[][] field = l.wall();

    public void move() {
        x += dx;
        y += dy;

        if (x < 20 && y == 280) {
            x=520;
            System.out.println("SLIDE");
        }
        if (x > 520 && y == 280) {
            x = 20;
            System.out.println("SLIDE");
        }

        if (field [y/20][x/20].equals("0") && course == 'u') y += sp;
        if (field [y/20][x/20].equals("0") && course == 'd') y -= sp;
        if (field [y/20][x/20].equals("0") && course == 'l') x += sp;
        if (field [y/20][x/20].equals("0") && course == 'r') x -= sp;
        /*if (field [y/20][x/20].equals("<") && course == 'r') x = 520;
        if (field [y/20][x/20].equals(">") && course == 'r') x = 20;    ******** НЕ РАБОТАЕТ *********/

    }

    public void keyPressed (KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_RIGHT:
                dx = sp;
                course = 'r';
                break;
            case KeyEvent.VK_LEFT:
                dx = -sp;
                course = 'l';
                break;
            case KeyEvent.VK_UP:
                dy = -sp;
                course = 'u';
                break;
            case KeyEvent.VK_DOWN:
                dy = sp;
                course = 'd';
                break;
        }
    }

    public void keyReleased (KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_LEFT || key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dx = 0;
            dy = 0;
        }
    }
}
