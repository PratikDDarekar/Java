/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgtry.catchblock;

import java.util.Scanner;


public class TryCatchBlock {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();//15
        int b = sc.nextInt();//0
        int c;
        
        try
        {
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
          System.out.println(e);
        }
        System.out.println("bye"); 
    }
    
}
