/**
 * @author Pratik Darekar
 * @version 2.0
 * @since 2015
 **/

package javadocdemo;

/**
 *
 * @author darek
 */
public class Book 
{
    /**
     * @value 10 default value
     */
    static int val = 10;
    
    /**
     * Parameterized Constructor
     * @param s Book Name
     */
    public Book(String s){}
    
    /**
     * Issue a Book to the Student
     * @param roll roll number of a Student
     * @throws Exception  if book is not available, throws Exception
     */
    public void issue(int roll)throws Exception
    {
    }
    
    /**
     * Check if Book is available
     * @param str Book Name
     * @return if Book is available returns true else false
     */
    public boolean available(String str)
    {
        return true;
    }
    
    /**
     * Get Book Name
     * @param id Book ID
     * @return returns book name
     */    
    public String getName(int id)
    {
        return "";
    }
}
