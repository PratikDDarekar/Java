
package paralambdaexpression;


//examlpl no. 3 (LambdaExpression without returntype and blocks)

@FunctionalInterface
interface LambDa
{
    public int display(int a,int b);//does have return type
}


public class ParaLambdaexpression {

    public static void main(String[] args) {
    
        LambDa l=(a, b)-> a+b; //without return type passing to the arguement and also not  passing insidethe  method and also not using the blocks
        
       
        System.out.println(l.display(10,20));        
    }   
}




////examlpl no. 2
//
//@FunctionalInterface
//interface LambDa
//{
//    public int display(int n);//does have return type
//}
//
//
//public class ParaLambdaexpression {
//
//    public static void main(String[] args) {
//    
//        LambDa l=(a)->{return a;}; //without return type passing the arguement but passing inside method and using the blocks
//        
//       
//        System.out.println(l.display(5));        
//    }   
//}






//examlpl no. 1

//@FunctionalInterface
//interface LambDa
//{
//    public void display(String s);//doesn't have return type
//}
//
//
//public class ParaLambdaexpression {
//
//    public static void main(String[] args) {
//    
//        LambDa l=(str)->{System.out.print(str);}; //without return type passing the arguement  and using the blocks
//        
//        l.display("Hello World");        
//    }   
//}
