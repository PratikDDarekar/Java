
package dmlqueriesusingpreparedstatementusingjdbc;
import java.sql.*;
import java.util.*;

public class DMLqueriesUsingPreparedStatementUsingJDBC {

   
    public static void main(String[] args)throws Exception {
     
          Class.forName("org.sqlite.JDBC");
       
        Connection con = DriverManager.getConnection("jdbc:sql:C://sqlite//univ");
        
        PreparedStatement stm=con. prepareStatement("insert into student values(?,?,?,?)"); 
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Student Data");
        int r=sc.nextInt();
        String name=sc.next();
        String city=sc.next();
        int dno=sc.nextInt();
        
        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        
        stm.executeUpdate();
        
        
         stm.close();
         con.close();
    
    }
    
}
