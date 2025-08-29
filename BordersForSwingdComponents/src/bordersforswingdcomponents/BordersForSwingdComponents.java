/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bordersforswingdcomponents;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class MyFrame extends JFrame 
{
    JLabel l;
    JTextField tf;
    JButton b;
    
    JPanel p;
    
    MyFrame()
    {
        l=new JLabel("Name");
        tf=new JTextField(20);
        b=new JButton("OK");
        p=new JPanel();
        
        p.add(l);
        p.add(tf);
        p.add(b);
        
        Border br=BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.RED), "Login", TitledBorder.CENTER,   TitledBorder.LEFT);
        p.setBorder(br);
        
        setLayout(new FlowLayout());
        add(p);
    }
   
}
public class BordersForSwingdComponents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyFrame f=new MyFrame();
       f.setSize(800,800);
       f.setVisible(true);
       
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
