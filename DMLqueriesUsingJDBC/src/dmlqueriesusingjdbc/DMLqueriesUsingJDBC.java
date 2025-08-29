
package dmlqueriesusingjdbc;
import java.util.*;
import java.sql.*;

public class DMLqueriesUsingJDBC {

    
    public static void main(String[] args)throws Exception {
      
        Class.forName("org.sqlite.JDBC");
       
        Connection con = DriverManager.getConnection("jdbc:sql:C://sqlite//univ");
        
        Statement stm=con.createStatement(); 
        
        stm.executeUpdate("insert into dept values(70,'chem')");//Insert
        stm.executeUpdate("delete from dept where dept>=60");//Delete
        stm.executeUpdate("updatedept set dname='Chem' where deptno=50");//update
        
        
         stm.close();
         con.close();
    }
    
}
