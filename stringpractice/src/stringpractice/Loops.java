package stringpractice;
import java.lang.*;
import java.util.Scanner;


public class Loops {
    public static void main(String [] args){
     Scanner sc = new Scanner(System.in);
// int a =5;
// int fact=1;
// for(int i=1;i<=a;i++)
// {
// fact=fact*i;
// }
// System.out.println("factorial of "+ a +" is : "+fact);
 
//STUDENTCHALLENGE-2 
//DISPLAYING DIGITS OF A NUMBER.
//Count Digits of a number.
//finding a number is Armstrong or not.

//int n =153;
//int dig, Arms;
//int sum =0;
//for(int i=n; i>0; i/=10){
//dig = i%10;
//Arms =dig*dig*dig;
//sum += Arms;
//}
//System.out.println(sum);
// 
//if(n == sum){
//    System.out.println("yes");
//}
//else{
//System.out.println("no");}



//reversing a number 
//check palindrome or not

//int num = 12291, mod, rev=0;
//for(int i=num; i>0; i/=10){
//mod=i%10;
//rev = (rev*10)+mod;
//}
//System.out.println(rev);
//if(rev==num)
//{
//System.out.println("its a palindrome");
//}
//else
//{
//System.out.println("its not a palindrome");
//}



//PRINTING THE WORDS FROM THE NUMBER

//int no = 123, rem;
//String name="";
//for(int i=no; i>0;i/=10){
//  rem = i%10;
////  if(rem==1)
////  name+="one ";
//// else if(rem==2)
////  name+="two "; 
////   else if(rem==3)
////  name+="three "; 
////   else if(rem==4)
////  name+="four ";
////   else if(rem==5)
////  name+="five ";
////   else if(rem==6)
////  name+="six ";
////   else if(rem==7)
////  name+="seven"; 
////   else if(rem==8)
////  name+="eight ";
////   else if(rem==9)
////  name+="nine ";
////    else if(rem==0)
////  name+="zero "; 
////}
////OR
//switch(rem){
//    case 0: name+="zero ";
//     break;
//    case 1: name+="one ";
//     break;
//    case 2: name+="two ";
//     break;
//    case 3: name+="three ";
//     break;
//    case 4: name+="four ";
//     break;
//    case 5: name+="five ";
//     break;
//    case 6: name+="six ";
//     break;
//    case 7: name+="seven ";
//     break;
//    case 8: name+="eight ";
//     break;
//    case 9: name+="nine ";
//     break;
//}
//} 
////System.out.println(name);
//String[] f= name.split(" ");
//for(int j=f.length-1;j>=0;j--){
//System.out.print(f[j]+" ");
//}


//REVERSING A WORDS USING THE SPLIT FUNCTION
//String str = "hello how are you";
//String[] f= name.split(" ");
//for(int j=f.length-1;j>=0;j--){
//System.out.print(f[j]+" ");
//}
  

//Find ARITHEMATIC PROGRESSION(formula:- a+ad+a2d+a3d+......)
//System.out.println("Enter the starting number");
//int a=sc.nextInt();
//System.out.println("Enter the common difference");
//int d=sc.nextInt();
//System.out.println("Enter frequency of the number uptil you want to print");
//int n=sc.nextInt();
//
// System.out.print("A.P = ");
//while(n>0){    
//    System.out.print(a+ " ");
// a += d ;
//n--;
//}


//Find GEOMETRIC PROGRESSION(formula:- s+sr+sr^2+sr^3+......)
//System.out.println("Enter the starting number");
//int s=sc.nextInt();
//System.out.println("Enter the common ratio");
//int r=sc.nextInt();
//System.out.println("Enter frequency of the number uptil you want to print");
//int l=sc.nextInt();
//
// System.out.print("G.P = ");
//while(l>0){    
//    System.out.print(s+ " ");
// s *= r ;
//l--;
//}


////fibonacci series
//int a=0, b=1,c;
//System.out.print(a+","+b+",");
//for(int i=0;i<5;i++){
//    c=a+b;
//System.out.print(c+",");
//a=b;
//b=c;
//} 




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


//ZIGZAK PATTERN(alternate pattern)
int ar1[]={1,2,3,4,5};
int ar2[]={6,7,8,9,10};

int tlength = (ar1.length)+(ar2.length);
int dup[]= new int[tlength];
int j=0;
for(int i=0;i<dup.length;i++){ 
dup[i]=ar1[i-j];
i++;
j++;
dup[i]=ar2[i-j];
}
for(int X:dup){
 System.out.print(X+",");
 }


 }
 }
