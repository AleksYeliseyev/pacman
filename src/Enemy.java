import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Enemy {
    Image img = new ImageIcon ("D:\\Project\\JAVA\\Pacman\\resources\\Blinky.png").getImage();

    char course = 'd'; // direction 'u' - 'd' - 'l' - 'r'
    boolean life = true; // live or die
    boolean angry = false; // normal or angry
    int x = 260;
    int y = 280;
    int dx = 0;
    int dy = 20;
    int sp = 20; // SPEED


    Level l = new Level();
    String[][] field = l.wall();

    public void move() {
        x += dx;
        y += dy;

        /*if (x < 20) x=20;
        if (x > 520) x = 520;
        if (y < 20) y = 20;
        if (y > 580) y = 580;*/

        if (field [y/20][x/20].equals("0") && course == 'u') y += sp;
        if (field [y/20][x/20].equals("0") && course == 'd') y -= sp;
        if (field [y/20][x/20].equals("0") && course == 'l') x += sp;
        if (field [y/20][x/20].equals("0") && course == 'r') x -= sp;

    }
}
