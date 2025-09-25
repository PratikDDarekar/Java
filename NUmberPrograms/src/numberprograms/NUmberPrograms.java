
package numberprograms;
import java.util.Scanner;

public class NUmberPrograms {

 
    public static void main(String[] args) {
             
//      //  inp=9   7  9  11  if equidistance than print
//      Scanner sc=new Scanner(System.in);
//      
//      int n= sc.nextInt();
//      int lnum,rnum;
//      
//      for(int i=n+1;true;i++)
//      {
//          if((i%2)!=0)
//          {
//              System.out.println(i);
//              rnum=i;
//              break;
//          }
//      }
//      
//       for(int i=n-1;true;i--)
//      {
//          if((i%2)!=0)
//          {
//              System.out.println(i);
//              lnum=i;
//              break;
//          }
//      }
//      
//      if((rnum-n)==(n-lnum))
//      {
//          System.out.println("Equal difference");
//          
//          System.out.println(rnum-n);
//          
//          
//          System.out.println(n-lnum);
//      }



//inp=123=132,  1234=1243

		Scanner sc=new Scanner(System.in);

		int n= sc.nextInt();

		//length
		int len=0;
		int mod=0;
		int rev=0;
		for(int i=n; i>0; i=i/10)
		{
			mod=i%10;
			rev=(rev*10)+mod;
			len++;
		}
	
	//printing reverse order 1st
		for(int i=0;i<len/2;i++)
		{
		    System.out.print(rev%10);
		    rev=rev/10;
		}
		//printing correct order second
			for(int i=0;i<=len/2;i++)
		{
		    System.out.print(n%10);
		    n=n/10;
		}
	

    }
    
}
