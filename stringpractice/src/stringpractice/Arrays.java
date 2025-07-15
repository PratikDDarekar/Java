
package stringpractice;


public class Arrays {
    public static void main(String args[]){
    
//    int A[]=new int[10];
//    int B[]={1,2,3,4,5};
//    
//    for(int x:A){
//    System.out.print(x);
//      }
//    System.out.println();
//     for(int x:B){
//    System.out.print(x);
//      }
//    System.out.println();
//    
//    for(int i=0;i<A.length;i++){
//    System.out.print(A[i]++);
//    }
    


//STUDENT CHALLENGE :-1.FINDING SUM OF ALL THE ELEMENTS.
//                    2.SEARCHING AN ELEMENT 
//                    3.FINDINGTHMAXIMUM ELEMENT 
//                    4.FINDING THE SECOND LARGEST ELEMENT




//int[] a = {3,9,7,8,6,15,5,4,10,11};
//int b=5, sum=0;
//int max = Integer.MIN_VALUE;
//int secMax = Integer.MIN_VALUE;
//int thirdMax = Integer.MIN_VALUE;
//
//
//for(int i=0;i<a.length;i++){
//
////1.FINDING SUM OF ALL THE ELEMENTS.     
//    sum += a[i];
//    
////or    
////for(int X : a){
////sum +=X;
////}
//
//
////2.SEARCHING AN ELEMENT     
//   if(a[i]==5){
//   System.out.println("Found the element which is at index position : "+i);
//   } 
// //3.FINDING THE MAXIMUM/LARGEST ELEMENT   
//   if(max<a[i]){
//   max=a[i];
//   }
//   
////4.FINDING THE SECOND LARGEST ELEMENT   
//    if(max<a[i]){
//       secMax=max; 
//        max=a[i];
//   }
//    else if(a[i]>secMax && a[i] != max){
//         secMax = a[i];
//   }
//    
////5.FINDING THE THIRD LARGEST ELEMENT 
//
//    if(max<a[i]){
//            
//        secMax=max;   
//         max=a[i];
//           
//   }
//    
//     else if(a[i]>secMax && a[i] != max){
//         thirdMax = secMax ;
//         secMax = a[i];    
//   }      
//}
//
//System.out.println("Maximum element in an array is : "+max);
//System.out.println("Second Maimum element in an array is : "+secMax);
//System.out.println("Third Maimum element in an array is : "+thirdMax);








//System.out.println("Sum is : "+sum);
//System.out.println("Maximum element in an array is : "+max);
//System.out.println("Second Maimum element in an array is : "+secMax);
//System.out.println("Third Maimum element in an array is : "+thirdMax);
//




//(QSPIDER ASSIGNMENT)
  //merging two arrays and reversing the second one and store it in the dup)

//int ar1[]={1,2,3,4,5};
//int ar2[]={6,7,8,9,10};
//
//int tlength = (ar1.length)+(ar2.length);
//int dup[]= new int[tlength];
//for(int i=0;i<tlength;i++){
//if(i<(ar1.length)){
//   dup[i]= ar1[i];
//}
//else{
//dup[i]=ar2[tlength-(i+1)];
//}
//}
//for(int X:dup){
// System.out.print(X+",");
//}



 //merging two arrays and reversing both the arrays)
//int ar1[]={1,2,3,4,5};
//int ar2[]={6,7,8,9,10};
//
//int tlength = (ar1.length)+(ar2.length);
//int dup[]= new int[tlength];
////for(int i=tlength-1;i>0;i--){
//for(int i=0, j=1;i<dup.length;i++){
//    
//if(i<ar2.length){
//dup[i]=ar2[4-i];
//}
//else{
// dup[i]= ar1[i-j];
////System.out.print(i-j);
//j=j+2;
//}  
//}
//for(int X:dup){
// System.out.print(X+",");
//}



//ZIGZAK PATTERN(alternate pattern)

//int ar1[]={1,2,3,4,5};
//int ar2[]={6,7,8,9,10};
//
//int tlength = (ar1.length)+(ar2.length);
//int dup[]= new int[tlength];
//int j=0;
//for(int i=0;i<dup.length;i++){ 
//dup[i]=ar1[i-j];
//i++;
//j++;
//dup[i]=ar2[i-j];
//}
//for(int X:dup){
// System.out.print(X+",");
// }




 
}
}
