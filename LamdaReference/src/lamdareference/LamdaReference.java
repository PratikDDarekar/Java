//refer book and examples on it
package lamdareference;



//Example 5(using more than 1 parameterize constructor )

@FunctionalInterface
interface Mylambda
{
    public int display(String s1, String s2);//change its returntype
}

 class LambdaDemo{
    
public LambdaDemo(String s)//not in use 
{
   System.out.println(s.toUpperCase()); 
}

    
    public static void main(String[] args) {
    
       
        Mylambda ml = String::compareTo;//  assigning calssname reference->scope resolution operator->compareTo() method
       System.out.println(ml.display("zello","wello")) ;//LAst point of execution
    }
    
}







////Example 4(using single parameterize constructor )
//
//@FunctionalInterface
//interface Mylambda
//{
//    public void display(String s);
//}
//
// class LambdaDemo{
//    
//public LambdaDemo(String s)
//{
//   System.out.println(s.toUpperCase()); //last point of execution
//}
//
//    
//    public static void main(String[] args) {
//    
//       
//        Mylambda ml = LambdaDemo::new;// assigning calssname reference->scope resolution operator->new  keyword for the constructor
//        ml.display("hello guys");
//    }
//    
//}
//






////Example 3(without static class)
//
//@FunctionalInterface
//interface Mylambda
//{
//    public void display(String str);
//}
//
// class LamdaDemo {
//
//    public  void reverse(String str)
//    {
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();//second last execution point
//        System.out.println(sb);//last execution point
//    }
//    
//    public static void main(String[] args) {
//    
//        LamdaDemo ld = new LamdaDemo();//creating an object
//        Mylambda ml = ld::reverse;// and than assigning it's reference->scope resolution operator->reverse method
//        ml.display("hello guys");
//    }
//    
//}






////Example 2(with static class)
//
//@FunctionalInterface
//interface Mylambda
//{
//    public void display(String str);
//}
//
// class LamdaDemo {
//
//    public static void reverse(String str)
//    {
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();//second last execution point
//        System.out.println(sb);//last execution point
//    }
//    
//    public static void main(String[] args) {
//    
//        Mylambda ml = LamdaDemo::reverse;//assinging with the classname->scope resolution operator->reverse method
//        ml.display("hello guys");
//    }
//    
//}




//Example 1(with static class)
//
//@FunctionalInterface
//interface Mylambda
//{
//    public void display(String str);
//}
//
//public class LamdaReference {
//
//    public static void main(String[] args) {
//    
//        Mylambda ml = System.out::println; //assinging with the classname->object->scope resolution operator->println method
//        ml.display("hello guys");
//    }
//    
//}
