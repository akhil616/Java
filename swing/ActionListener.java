import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener {
  Main() {
    TextField tf = new TextField();
    tf.setBounds(60, 50, 180, 25);

    JButton button = new Jbutton("Click Here");
    button.setBounds(100, 120, 80, 30);
    button.addActionListener(this);

    add(tf);
    add(button);
    setVisible(true);
  }

  //implementing method of ActionListener
  @Override
  public void actionPerformed(ActionEvent ae) {
    tf.setTextField("Hello World!");
  }

  public static void main(String[] args) {
    new Main();
  }
}
