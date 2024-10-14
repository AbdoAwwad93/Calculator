package calculator;

import java.awt.GridLayout;
import javax.swing.*;

public class Keypad extends JPanel {

    static JButton b0;
    static JButton b1;
    static JButton b2;
    static JButton b3;
    static JButton b4;
    static JButton b5;
    static JButton b6;
    static JButton b7;
    static JButton b8;
    static JButton b9;
    static JButton bDot;
    static JButton bEqual;
    static JButton bAdd;
    static JButton bSub;
    static JButton bMul;
    static JButton bDiv;

    public Keypad() {
        // setButtons
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        bAdd = new JButton("+");
        bSub = new JButton("-");
        bMul = new JButton("*");
        bDiv = new JButton("/");
        bEqual = new JButton("=");
        bDot = new JButton(".");
        //
        this.setLayout(new GridLayout(4, 4, 5, 5));
        add(b1);
        add(b2);
        add(b3);
        add(bAdd);

        add(b4);
        add(b5);
        add(b6);
        add(bSub);

        add(b7);
        add(b8);
        add(b9);
        add(bMul);

        add(bDot);
        add(b0);
        add(bEqual);
        add(bDiv);
        MyListener listener = new MyListener();
        b0.addActionListener(listener);
        b1.addActionListener(listener);
        b2.addActionListener(listener);
        b3.addActionListener(listener);
        b4.addActionListener(listener);
        b5.addActionListener(listener);
        b6.addActionListener(listener);
        b7.addActionListener(listener);
        b8.addActionListener(listener);
        b9.addActionListener(listener);
        bAdd.addActionListener(listener);
        bSub.addActionListener(listener);
        bMul.addActionListener(listener);
        bDiv.addActionListener(listener);
        bDot.addActionListener(listener);
        bEqual.addActionListener(listener);
    }
}
