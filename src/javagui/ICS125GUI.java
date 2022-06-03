package javagui;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ics125gui;
/**
 *
 * @author C0525746
 */
public class ICS125GUI {
    JPanel p;
    JFrame f;
    JButton b;
    JLabel label;
    JTextField text;
    
    public ICS125GUI(){
 
        f = new JFrame("Basic Test!");   
        p = new JPanel();
        
        text = new JTextField("Request");
        
        b = new JButton("Click Me");
        //b = new JButton("New Document", new ImageIcon("C:\\Users\\gary2\\Documents\\NetBeansProjects\\JavaGUI\\src\\images\\g.jpg"));
        //b.setRolloverEnabled(true);
        //b.setRolloverIcon(new ImageIcon("C:\\Users\\gary2\\Documents\\NetBeansProjects\\JavaGUI\\src\\images\\r.jpg"));
        
        b.addActionListener(new ButtonListener());
        label = new JLabel("Hello World!");
        p.setBackground(Color.blue);
        p.add(b);
        p.add(label);
        p.add(text);
        f.getContentPane().add(p);
        //quit Java after closing the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(400, 400); //set size in pixels
        f.setVisible(true); //show the window
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        ICS125GUI gui = new  ICS125GUI();

    }
    
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           label.setText("Click"); 
        }
        
    } 

}
