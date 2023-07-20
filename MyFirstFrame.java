package a.ac.tut.ui;


import java.awt.Color;
import javax.swing.JFrame;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyFirstFrame extends JFrame{
    public MyFirstFrame(){
        setTitle("My First Frame");
        setSize(600 , 650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setVisible(true);
    }
}
