/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interface4;

interface CarModel
{
    void Model();
}

class Client implements CarModel
{
    String Mname;
    String Cname;
    
    Client(String m, String c) {Mname = m; Cname=c; }
    
    public void Model()
    {
        System.out.println("Client name : "+ Cname + " Car Model : " + Mname+" has been Updated!");
    }
}

class TATA
{
    CarModel c[] = new CarModel[5];
    int count=0;
    
    void purchased(CarModel c)
    {
        this.c[count++]=c;
    }
    
    void status()
    {
        for(int i=0;i<count;i++)
        {
            c[i].Model();
        }
    }
}

class Test
{
    public static void main(String[] args)
    {
        TATA t = new TATA();
        
        Client c1 = new Client("Curv","Pratik");
        Client c2 = new Client("Tiago","Kartik");
        Client c3 = new Client("Avanti","Rutik");
        Client c4 = new Client("SUV","Suder");
        Client c5 = new Client("Tiago","Pankaj");
        
        t.purchased(c1);
        t.purchased(c2);
        t.purchased(c3);
        t.purchased(c4);
        t.purchased(c5);
        
        t.status();
    }
    
}