package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
   static  String x="";
   static String y="";
   static char op='+';
    
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if (e.getSource() == Keypad.b0) {
            Screen.t.setText(Screen.t.getText()+"0");
        } else if (e.getSource() == Keypad.b1) {
            Screen.t.setText(Screen.t.getText()+"1");
        } else if (e.getSource() == Keypad.b2) {
            Screen.t.setText(Screen.t.getText()+"2");
        } else if (e.getSource() == Keypad.b3) {
            Screen.t.setText(Screen.t.getText()+"3");
        } else if (e.getSource() == Keypad.b4) {
            Screen.t.setText(Screen.t.getText()+ "4");
        } else if (e.getSource() == Keypad.b5) {
            Screen.t.setText(Screen.t.getText()+"5");
        } else if (e.getSource() == Keypad.b6) {
            Screen.t.setText(Screen.t.getText()+"6");
        } else if (e.getSource() == Keypad.b7) {
            Screen.t.setText(Screen.t.getText()+"7");
        } else if (e.getSource() == Keypad.b8) {
            Screen.t.setText(Screen.t.getText()+"8");
        } 
        else if (e.getSource() == Keypad.b9) {
            Screen.t.setText(Screen.t.getText()+"9");
        }
        else if (e.getSource() == Keypad.bDot) {
            Screen.t.setText(Screen.t.getText()+".");
        }
        else if (e.getSource() == Keypad.bSub) {
            
            x = Screen.t.getText();
            op= '-';
             Screen.t.setText("");
        }
        else if (e.getSource() == Keypad.bMul) {
            
             x = Screen.t.getText();
            op= '*';
             Screen.t.setText("");
        }
        else if (e.getSource() == Keypad.bDiv) {
            
             x = Screen.t.getText();
            op= '/';
            Screen.t.setText("");
        }
       else if (e.getSource() == Keypad.bAdd) {
            x = Screen.t.getText();
            op= '+';
            
             Screen.t.setText("");
        }
       else if(e.getSource()==Keypad.bEqual){
        y = Screen.t.getText();
        double a = Double.parseDouble(x);
        double b = Double.parseDouble(y);
        switch(op){
            case '+' -> Screen.t.setText(""+(a+b));
            case '-' -> Screen.t.setText((a-b) + "");
            case '*' -> Screen.t.setText((a*b) + "");
            case '/' -> Screen.t.setText((a/b) + "");
        }
         
       }
       

    }
}
