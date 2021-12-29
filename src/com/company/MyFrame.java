package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    MyFrame(){
        this.setVisible(true); //make frame visible
        this.setTitle("Master Program"); //set the title of the frame
        this.setSize(420,420);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        this.setResizable(false); //frame cannot be resizable

        //Adding a image icon to the frame
        ImageIcon image = new ImageIcon("instaLogo.png"); //create an image icon
        this.setIconImage(image.getImage()); //change icon of frame
        this.getContentPane().setBackground(new Color(75, 25, 32)); //change color of the background
    }

}
