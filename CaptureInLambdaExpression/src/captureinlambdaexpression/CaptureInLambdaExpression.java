//refer the book
package captureinlambdaexpression;


@FunctionalInterface
interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void calllambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo
{
    public void meth1()
    {
         UseLambda ul=new  UseLambda();
         ul.calllambda(()->{System.out.println("Hello Guys");});//no colon after the blocks as in labdaexpression we use to give it but not here 
    }
}


public class CaptureInLambdaExpression {

    
    public static void main(String[] args) {
        
        Demo d =new  Demo();
        d.meth1();
        
    }
    
}
