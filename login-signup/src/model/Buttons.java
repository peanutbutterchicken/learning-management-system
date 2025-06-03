package model;

import java.awt.Color;

import javax.swing.JButton;

public class Buttons {

    public static final JButton standardBlueButton(String name){
        JButton btn = new JButton(name);
        btn.setBackground(DesignsAndFormat.blueBackgroundColor());
        btn.setForeground(Color.WHITE);
        btn.setBorderPainted(false);
        btn.setFocusable(false);

        return btn;
    }
}
