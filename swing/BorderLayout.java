import java.awt.*;
import javax.swing.*;

public class Main{
  public static void main(String [] args){
    JFrame frame = new Frame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLayout(new BorderLayout); //By default layout in Border
    frame.setVisible(true);

    JButton b1 = new JButton("NORTH");
    JButton b2 = new JButton("SOUTH");
    JButton b3 = new JButton("EAST");
    JButton b4 = new JButton("WEST");
    JButton b5 = new JButton("CENTER");

    frame.add(b1, BorderLayout.NORTH);
    frame.add(b2, BorderLayout.SOUTH);
    frame.add(b3, BorderLayout.EAST);
    frame.add(b4, BorderLayout.WEST);
    frame.add(b5, BorderLayout.CENTER);
  }
}
    
