package gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.*;

/**
 * Created by apple on 23/06/17.
 */
public class Myframe2 extends WindowAdapter {

    Button b;

    Myframe2() {
        Frame f1 = new Frame();
        //MenuBar m1 = new MenuBar();
        f1.addWindowListener(this);
        b = new Button("Login");
        b.setBounds(30, 100, 80, 30);// setting button position
        f1.add(b);

        f1.setSize(400, 400);
        f1.setLayout(null);//no layout manager
        f1.setVisible(true);

//        public void windowClosing(WindowEvent e) {
//           f1.dispose();
//    }

    }

    public static void main(String[] args) {
        Myframe2 m =new Myframe2();
    }

}
