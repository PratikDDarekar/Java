
package deprecateddateclass;
import java.util.Date;

public class DeprecatedDateClass 
{
    public static void main(String[] args) {
                       //mm/dd/yyyy
        Date d=new Date("10/11/2023");
        
        System.out.println(d.getDay());//wednesday
        System.out.println(d.getMonth());//october
        System.out.println(d.getYear()+1900);
        
        
              System.out.println(System.currentTimeMillis());
              System.out.println(System.currentTimeMillis()/1000/60/60/24/365);//how many years passed
              System.out.println(Long.MAX_VALUE);
    }
    
}
