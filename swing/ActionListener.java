import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
  TextField tf;
  JButton button;
  Main() {
    tf = new TextField();
    tf.setBounds(60, 50, 180, 25);

    button = new Jbutton("Click Here");
    button.setBounds(100, 120, 80, 30);
    button.addActionListener(this);

    add(tf);
    add(button);
    setVisible(true);
  }

  //implementing method of ActionListener
  @Override
  public void actionPerformed(ActionEvent ae) {
    tf.setText("Hello World!");
  }

  public static void main(String[] args) {
    new Main();
  }
}
