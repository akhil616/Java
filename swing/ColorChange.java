import java.awt.*;
import java.awt.event*;
import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLayout(null);
    f.setSize(500, 500);
    
    TextField tf = new TextField();
    tf.setBounds(60, 50 180, 25);

    JButton button = new JButton("Click Here");
    button.setBounds(100, 120, 80 30);
    button.addActionListener(new ActionListener() {        //Anonymous Class
          public void actionPerformed(ActionEvent e) {
              tf.setText("Welcome to Java Swing");
              f.getContentPane().setBackground(Color.RED);
          }
    });
    
    f.add(tf);
    f.add(button);
    f.setVisible(true);
  }
}    
    

    
    
  
