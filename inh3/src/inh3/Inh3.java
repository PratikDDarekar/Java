/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inh3;


public class Inh3 {

    public Inh3()
    {
        System.out.println("hello");
    } 
}


class Inh4 extends Inh3{

    public Inh4()
    {
        System.out.println("Boys");
    } 
}
class Inh5 extends Inh4 {

    public Inh5()
    {
        System.out.println("and Girls");
    } 
}

class Test
{
 public static void main(String[] args) {
   
     Inh5 h5 = new Inh5();
}        
}
