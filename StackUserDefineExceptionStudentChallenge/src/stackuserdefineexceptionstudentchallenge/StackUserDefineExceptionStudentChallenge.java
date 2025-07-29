/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stackuserdefineexceptionstudentchallenge;

class StackOverflowException extends Exception
{
    public String toString()
    {
        return "StackOverflowException";
    }
}
class StackUnderflowException extends Exception
{
    public String toString()
    {
        return "StackUnderflowException";
    }
}

 class Stack
{
    public  int size;
    public  int s[];
    public  int top=-1;
    
    Stack(int sz)//parameterize constructor
    {
        size = sz;
        s = new int[sz];
    }
    
    public  void push(int x)throws  StackOverflowException
    {
        if(top==size-1)
        {
            throw new StackOverflowException();
        }
        top++;
        s[top]=x;    
    }
    public int pop()throws  StackUnderflowException
    {
        int x = -1;
        if(top==-1)
        {
           throw new  StackUnderflowException();  
        }       
        x=s[top];
        top--;
        return x;                
    }   
}

class Test
{
    public static void main(String[] args) //throws StackOverflowException
    {
        Stack s = new Stack(5);
        try
        {
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        s.push(2);
        //s.push(6);
        }
        catch(StackOverflowException e)
        {
            System.out.println(e);
        }
        
        //pop operation stack         
          try
        {
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        }
        catch( StackUnderflowException e)
        {
            System.out.println(e);
        }
      
        
    }
}