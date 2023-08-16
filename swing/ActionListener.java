import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
      JFrame f = new Frame();
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setLayout(null);
      f.setSize(500, 500);
      
      JTextField tf = new JTextField();
      tf.setBounds(60, 50, 180, 25);
  
      button = new Jbutton("Click Here");
      button.setBounds(100, 120, 80, 30);
      button.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
          tf.setText("Hello World!");
        }
      });  
      f.add(tf);
      f.add(button);
      f.setVisible(true);
  }
}
