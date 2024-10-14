package calculator;

import java.awt.*;
import javax.swing.*;

public class Screen extends JPanel {

    static JTextField t;
    static JRadioButton on;
    static JRadioButton off;

    public Screen() {
        t = new JTextField();
        t.setEditable(false);
        t.setDisabledTextColor(Color.gray);
        t.setText("");
        t.setFont(new Font("serif", Font.BOLD, 30));

        JPanel p = new JPanel();

        ButtonGroup group = new ButtonGroup();
         on = new JRadioButton("ON");
         off = new JRadioButton("OFF");
        group.add(on);
        group.add(off);
        p.add(on);
        p.add(off);
        setLayout(new GridLayout(2, 1));
        add(t);
        add(p);

    }

}
