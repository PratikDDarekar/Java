/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

public class Constructor{ //Actually class made for the Rectangle
          
  
   
        // TODO code application logic here
        private int length;
        private int breadth;
        
        public Constructor()//Non-Parameterize constructor
        {
            length =1;
            breadth=1;
        }
        
        public Constructor(int l, int b)//Parameterize constructor
        {
            length =l;
            breadth = b;
        }
        public Constructor(int s)
        {
            length=breadth=s;
        }
        
        public int Area()//printing the area of a rectangle
        {
            return length*breadth;
        }
        
       public String toString()
       {
       return "length : "+length+ " breadth : "+breadth;
       }
}

class CallConstructor{
    
 public static void main(String[] args) 
 {
     Constructor con = new Constructor();//Non-Parameterize constructor object creation
     System.out.println("Non-Parameterize  Area : "+con.Area());
     
     Constructor con1 = new Constructor(10,5);//Parameterize constructor object creation
     System.out.println("Parameterize  Area : "+con1.Area());
 }
}

    