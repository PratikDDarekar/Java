/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moverriding;
public class moverriding{} 
//Eg1
class Super
{
    public void display(){
    System.out.println("Hello");
 }   
}

 class Sub extends Super {

public void display(){
    System.out.println("Hello Welcome");
 }   
}

class Test1
{
      public static void main(String[] args) {
       Super su = new Sub();
       su.display();
          }
}

//Eg2
class TV
{
    public void SwitchOn()
    {
        System.out.println("TV is switch ON");
    }
      public void SwitchOff()
    {
        System.out.println("TV is switch OFF");
    }
}

class SmartTV extends TV
{
      @Override
       public void SwitchOn()
    {
        System.out.println("Smart TV is switch ON");
    }
       @Override
      public void SwitchOff()
    {
        System.out.println("Smart TV is switch OFF");
    }
    public void Browse()
    {
        System.out.println("Smart TV is switch OFF");
    }
}


class Test2
{
    public static void main(String[] args)
    {
        TV t = new SmartTV();
        t.SwitchOff();//print the sun class method after giving the super class reference after
        t.SwitchOn();//because it will limit to use the method which are declare in the super class
 //     t.Browse();  //cant access because we pass the reference of the super class
    }
}

//Eg3
class Car
{
    public void start(){System.out.println("Car starts");}
     public void stop(){System.out.println("Car stops");}
      public void changeGear(){System.out.println("Gear change Manually");}
}

class LuxuryCar extends Car
{
    public void start(){System.out.println("Car starts");}
     public void stop(){System.out.println("Car stops");}
      public void changeGear(){System.out.println("Automatic Gear change ");}//OverRided
       public void selfdrive(){System.out.println("selfdriving");}
}

class Test3
{
      public static void main(String[] args)
    {
       LuxuryCar c1 = new LuxuryCar();
       c1.changeGear();
       c1.selfdrive();
       c1.stop();
       c1.start();
       
       Car c2 = new Car();
       c2.start();
       c2.stop();
       
       Car c3 =  new LuxuryCar();
       c3.start();
       c3.stop();
       c3.changeGear();//Overrided prints the sub class method but having the superclass reference
   //    c3.selfDrive();//error can't access because of superclass reference given to sub class object
    }
}