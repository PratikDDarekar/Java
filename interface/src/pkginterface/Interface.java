/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkginterface;




class Phone{
 void call(){ System.out.println("Calling"); }
 void sms(){ System.out.println("Messaging"); }
}

interface Camera
{
void click();
void record();
} 

interface MusicPlayer
{
void play();
void pause();
void stop();
}

class SmartPhone extends Phone implements Camera, MusicPlayer
{
    void videoCall()
    {
        System.out.println("video calling");
    }
    public void click()
    {
        System.out.println("clicking");
    }
    public void record()
    { 
        System.out.println("recording");
    }
    
    public void play(){ 
        System.out.println("playing");
    }
    public void pause(){ 
        System.out.println("paused");
    };
    public void stop(){ 
        System.out.println("stopped");
    }; 
}

public class Interface {   
    public static void main(String[] args) {   
        
        SmartPhone sp = new SmartPhone();
        sp.play();   
        
        Camera c = new SmartPhone();
        c.record();
        c.click();
        
        MusicPlayer mp =  new SmartPhone();
        mp.pause();
        mp.pause();
        mp.stop();
    }
}