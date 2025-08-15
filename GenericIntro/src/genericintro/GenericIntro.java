
package genericintro;


class GenericDemo<T>//should have to assign the class as generic
{
    T data[]=(T[])new Object[3];//giving the datatype of generic and typecating it to the generic
}



public class GenericIntro {

    public static void main(String[] args) {
        
        GenericDemo<String> gd=new GenericDemo();//should give the type while creating the object
        
        gd.data[0]="hi";
        gd.data[1]="hello";
     //   gd.data[2]=10;//giving the compile time error
     
     
    String str = gd.data[1];//we not need to typecaste it
    }
    
}
