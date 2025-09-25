
package layoutandpanes2fx;


public class Patterns {
    //Odd Numbers Pattern
    

    public static void main(String[] args) 
//2 
//3 5 
//7 9 11 
//13 15 17 19 
//21 23 25 27 29 
    {
//       int n=5;
//       int a=1;
//       for(int i=0;i<n;i++)
//       {
//           for(int j=0;j<=i;j++)
//           {
//               if(i==0 && j==0)
//               {
//                    System.out.print(2+" ");
//                    a+=2;
//                    continue;
//               }
//               
//               System.out.print(a+" ");
//               a+=2;
//           }
//           System.out.println();
//       }
        
        // Use this editor to write, compile and run your Java code online

//A 
//1 2 
//B C D 
//3 4 5 6 
//E F G H I 


//        int n=5;
//       int a=1;
//       char ch='A';
//       for(int i=0;i<n;i++)
//       {
//           for(int j=0;j<=i;j++)
//           {
//              if(i%2==0)
//              {
//                  System.out.print(ch++ + " ");
//              }
//              else
//              {
//                   System.out.print(a++ + " ");
//              }
//           }
//           System.out.println();
//       }


//1 
//0 1 
//1 0 1 
//0 1 0 1 
//1 0 1 0 1 
//
// int n=5;
//      for(int i=0;i<n;i++)
//      {
//          for(int j=0;j<=i;j++)
//          {
//              if( (j+i)%2==0)
//              {
//                    System.out.print(1+" ");
//                
//              }
//              else{
//              System.out.print(0+" ");
//          
//              }
//          }
//          System.out.println();
//      }


//1 
//3 2 
//6 5 4 
//10 9 8 7 
//15 14 13 12 11 

  int rows = 5;
        int num = 1;

        // First, calculate the starting number of each row
        for (int i = 1; i <= rows; i++) {
            int start = num + i - 1;

            // Print the row in reverse
            for (int j = 0; j < i; j++) {
                System.out.print((start - j) + " ");
            }

            // Update num for next row
            num += i;
            System.out.println();
        }

    }
}
    

    

