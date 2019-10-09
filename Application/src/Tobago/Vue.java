package Tobago;

import javax.swing.*;

public class Vue extends JFrame {

    protected Model model;

    public Vue(Model model) {

        this.model = model;

        pack();

        // titre, icon, position initiale et non redimensionable
        setTitle("Tobago");
        setLocation(700,400);
        setSize(1000,1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    public void display() {
        setVisible(true);
    }
}