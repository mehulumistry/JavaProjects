package gui;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by apple on 23/06/17.
 */
public class ButtonEvent extends Frame{
    TextField tf;
    ButtonEvent(){

//create components
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,80,30);
        Button b1=new Button("Erase Me");
        b1.setBounds(100,160,80,30);
//register listener
        b.addActionListener(this::actionPerformed);//passing current instance
        b1.addActionListener(this::actionPerformed);

//add components and set size, layout and visibility
        add(b);add(b1);add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("Welcome");
    }
    public static void main(String args[]){
        new ButtonEvent();
    }
}
