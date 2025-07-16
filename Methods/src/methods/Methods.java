
package methods;

public class Methods {      
//    static int Max(int arr[], int max){
//    for(int i=0;i<arr.length;i++){
//    if(arr[i]>max)
//    max=arr[i];
//    }
//     return max;
//    }
    
//    static boolean isPrime(int n){
//      for(int i=2;i<=n/2;i++){
//        if(n%i==0)
//           return false;
//          }
//      return true;
//     }
      
       
//       static int GCD(int m, int n){
//       for(int i=0;true;i++){    
//       if(m==n) 
//          return m;
//       else if(m>n) m=m-n;
//       else if(n>m) n=n-m;
//       }      
//      }
        
//    static double area(double radius){
//    return Math.PI*radius*radius;
//    }
//    static int area(int l, int b){
//    return l*b; 
//    }
//        public static void main(String[] args) {
        
//        int arr[] ={1,2,3,4,5,6,7}; 
//          System.out.println( Max(arr,0));
          
          
//        System.out.println(GCD(25, 15));     
        
//        if(isPrime(15))
//         System.out.println("prime");
//        else
//            System.out.println("not prime");

//System.out.println( area(4.4));
 //      }
    
    
    
    
//VARIABLE ARGUEMENTS    
    
// static void showList(int start, String ...S)// variable arguement should be the last passing arguement
// {
//  for(int i=0;i<S.length;i++)
//  {
//      System.out.println(start +". "+S[i]);
//      start++;
//  }
// }   
//    public static void main(String [] args){
//        showList(5,"john","sita","gita","payal","sweta");
//    }
    
    
    //maximum of numbers using varagrs
//    static int max(int max, int ...n)
//    {
//    for(int i=0;i<n.length;i++)
//    {
//        if(n[i]>max)
//        {
//            max = n[i];
//        }
//        else if(n.length==0)
//            return Integer.MIN_VALUE;
//        else if(n.length==1)
//            return n[0];
//    }
//    return max;
//    }
    
    //sumation of a numbers using varagrs    
//    static int sum(int sum, int ...n)
//    {
//    for(int i=0;i<n.length;i++)
//    {
//       sum +=n[i];
//    }
//    return sum;
//    }
//    
    //DIscount calculation for the given price using varagrs
//    static double discount(double ...price){
//        double totalPrice=0;
//        
//      for(int i=0;i<price.length;i++){
//      totalPrice +=price[i];
//      }
//      if(totalPrice<500)
//          return totalPrice*0.1;
//      else if(totalPrice<1000)
//          return totalPrice*0.15;
//       else if(totalPrice>1000)
//          return totalPrice*0.2;
//      return totalPrice;
//    }
    
    
    
 //       public static void main(String [] args){
//       System.out.println(max (0,4,6,3,9,5,0,6,4));
//       System.out.println(max (0,5));
//       System.out.println(sum ());// for this we need to pass only one arguement //       System.out.println(max (0,4,6,3,9,5,0,6,4));

//       System.out.println(sum (0,5));
//       System.out.println(sum (0,4,6,3,9,5,0,6,4));

//      System.out.println("Discounted amount is : "+discount (10,40,60,13,19,50,1000,60,40));
//        }
    
    
    
    
    public static void main(String []args){
    fun(3);
    }
    
    static void fun(int n)
    {
    if(n>0){
        fun(n-1);
        System.out.println(n);
     
    }
    }
    }


