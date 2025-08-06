
package lambdaexpressionintro;


@FunctionalInterface
interface MyLambDa
{
    void display();
}



public class LambdaExpressionIntro {

    
    public static void main(String[] args) {
      
        MyLambDa v=()->{System.out.println("hello world");};
        
          v.display();//inside main method
    }   
}

