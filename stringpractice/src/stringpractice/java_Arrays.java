
package stringpractice;

public class java_Arrays {
    
    public static void main(String [] rags){
    
//    int A[]={5,9,6,10,12,7,3,5,4,2};
//    int dup[]= new int [A.length];
//    
//    int temp;
//    temp =A[0];
//    for(int i=0; i<A.length;i++){
//        
//       if( i<A.length-1){
//        A[i]=A[i+1];
//        }
//       else if(i==A.length-1){
//       A[A.length-1]= temp;//or A[i]=temp;
//       }
//    }   
//    for(int X:A){
//    System.out.print(X+",");
//    }
    


    //2-D Array
//    int a[][]=new int [5][5];
//    int b[][]={{1,2,3},{7,4,5},{1,3,5}};
//    
//    for(int i=0;i<b.length;i++){
//      for(int j=0;j<b[0].length;j++)
//      {
//      System.out.print(b[i][j]+" ");
//      }
//    System.out.println("");
//    }
//
//for(int x[]:b){
//   for(int y:x){
//   System.out.print(y);
// }
//   System.out.println("");
//  }
//
//int A[][]= new int[3][];
//A[0]=new int[2];
//A[1]=new int[5];
//A[2]=new int[8];
//
//
//for(int i=0;i<A.length;i++)
//{
//  for(int j=0;j<A[i].length;j++)
//  {
//      System.out.print(A[i][j]+" ");
//  }
//  System.out.println("");
//}


//
////Adding 2 matrices
//int A[][]={{3,5,9},{7,6,2},{4,3,5}};
//int B[][]={{1,5,2},{6,8,4},{3,9,7}};
//int C[][]=new int[3][3];
//
//for(int i =0;i<3;i++){
//  for(int j=0;j<3;j++){
//    C[i][j]=A[i][j]+B[i][j];
//    System.out.print(C[i][j]+" ");
//   }
//  System.out.println("");
//   }




//Multiplying 2 matrices
int A[][]={{3,5,9},{7,6,2},{4,3,5}};
int B[][]={{1,5,2},{6,8,4},{3,9,7}};
int C[][]=new int[3][3];

for(int i =0;i<3;i++){
  for(int j=0;j<3;j++){
    C[i][j]=A[i][j]+B[i][j];
    System.out.print(C[i][j]+" ");
   }
  System.out.println("");
   }


//Sorting String in alphabetical order using the build in function
String arr[]={"java","python","pascal","smalltalk","ada","basic"};
int a[]={5,4,0,8,1,4,6,7,3,8};
java.util.Arrays.sort(arr);
for(String X:arr)
{
System.out.println(X);

//sorting numbers
java.util.Arrays.sort(a);
 for(int Y:a)
{
System.out.println(Y);}
   }
}
}


