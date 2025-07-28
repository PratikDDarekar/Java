/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package limitinobjectupto5variables;



//limiting the object upto 5 variables.
class CoffeeMachine
{
    private float cqty;
    private float Wqty;
    
    static private  CoffeeMachine our1;//static variable use as reference for an object
     static private  CoffeeMachine our2;
      static private  CoffeeMachine our3;
       static private  CoffeeMachine our4;
       static private  CoffeeMachine our5;
    static int a=0;
    
    private  CoffeeMachine()
    {
      cqty=1;
      Wqty=1;
    }
    
    public float fillSugar()
    {
        return 0.15f;
    }

    static  CoffeeMachine getInstance(int n)
    {
        if(a==0)//if reference is null than only object will get created once 
        {
            our1 = new  CoffeeMachine();
             return our1 ;
        }      
        else if(a==1)//if reference is null than only object will get created once 
        {
            our2 = new  CoffeeMachine();
             return our2 ;
        }
         else if(a==2) 
         {
            our3 = new  CoffeeMachine();
             return our3 ;
        }
         else if(a==3) 
         {
            our4 = new  CoffeeMachine();
             return our4 ;
        }
         else if(a==4) 
         {
            our5 = new  CoffeeMachine();
             return our5 ;
        }
        return null ;
    }
}

class Test
{
    public static void main(String[] args)
    {
         CoffeeMachine cm1 =  CoffeeMachine.getInstance(1);
         CoffeeMachine cm2 =  CoffeeMachine.getInstance(2);
         CoffeeMachine cm3 =  CoffeeMachine.getInstance(3);
         CoffeeMachine cm4 =  CoffeeMachine.getInstance(4);
         CoffeeMachine cm5 =  CoffeeMachine.getInstance(5);
             
         System.out.println(cm1+" != \n"+cm2+" !=\n" +cm3+" !=\n "+cm2+" != \n" +cm3);
    }
}
