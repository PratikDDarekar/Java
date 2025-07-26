/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statickeyword2;

class HondaCity
{
    static long price =10;
    
    int a,b;
    
    static double onRoadPrice(String s)
    {
        switch(s)
        {
            case "Delhi": return price+price*0.1;
            case "Mumbai": return price+price*0.9;
            case "Pune": return price+price*0.5;
        }
        return -1;
    }
}
class Test
{
    public static void main(String asrgs[])
    {
        System.out.println(HondaCity.price);//you can see the value has been chande for price
        
        System.out.println("For Mumbai = "+ HondaCity.onRoadPrice("Pune"));//calling static method using static variable
        
         System.out.println();
        
        HondaCity h = new HondaCity();
        
        System.out.println(h.price);
        h.price =70;
        System.out.println(h.price);
        
        System.out.println("For Mumbai = "+h.onRoadPrice("Mumbai"));
    }
}