package calculator;

import java.awt.*;
import javax.swing.*;

public class frame extends JFrame {
    frame(){
        Screen s = new Screen();
   Keypad keypad = new Keypad();
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Claculator");
        setLayout(new BorderLayout());
        
//        this.add(screen,BorderLayout.PAGE_START);
        this.add(s,BorderLayout.PAGE_START);
        this.add(keypad,BorderLayout.CENTER);
    }
}
