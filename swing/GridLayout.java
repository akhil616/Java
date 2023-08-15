import java.awt.*;
import javax.swing.*;

public class Main{
  public static void main(Strings [] args){
    JFrame frame = new Frame();
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new GridLayout(3, 3, 10, 10)); // GridLayout(int rows, int columns, int hgap, int vgap)
    frame.setVisible(true);

    JButton b1 = new Jbutton("1");
    JButton b2 = new Jbutton("2");
    JButton b3 = new Jbutton("3");
    JButton b4 = new Jbutton("4");
    JButton b5 = new Jbutton("5");
    JButton b6 = new Jbutton("6");
    JButton b7 = new Jbutton("7");
    JButton b8 = new Jbutton("8");
    JButton b9 = new Jbutton("9");

    frame.add(b1);
    frame.add(b2);
    frame.add(b3);
    frame.add(b4);
    frame.add(b5);
    frame.add(b6);
    frame.add(b7);
    frame.add(b8);
    frame.add(b9);
  }
}

    
