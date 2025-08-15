
package genericdefineclass1;

class Data<T>
{
    private T obj;
    
    public void setData(T v)
    {
        obj=v;
    }
    public T getData()
    {
        return obj;
    }
}

public class GenericDefineClass1 {

    public static void main(String[] args)
    {
        
        Data<String> d = new Data<>();
        d.setData("Hii");
      // d.setData(10); //CTE
        
        System.out.println(d.getData());
    }
    
}
