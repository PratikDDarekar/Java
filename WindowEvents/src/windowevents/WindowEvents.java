/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package windowevents;

import java.awt.*;
import java.awt.event.*;


class MyFrame extends Frame implements WindowListener
{
    
    Label l;
    
    MyFrame()
    {
        super("Window Event Demo");
        l=new Label("No Message from Window");
        
        setLayout(new FlowLayout());
        add(l);
        
        addWindowListener(this);
        
        
    }
    public void windowOpened(WindowEvent we)
    {
        l.setText("Window Opened");
        
    }
    
    public void windowClosing(WindowEvent e) 
    {
        l.setText("Window Closing");
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) 
    {
        l.setText("Window Closed");
    }

    public void windowIconified(WindowEvent e) 
    {
        l.setText("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) 
    {
        l.setText("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) 
    {
        l.setText("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) 
    {
        l.setText("Window DeActivated");
    }
        
}


public class WindowEvents {

   
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}
