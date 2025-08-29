
package ddlusingjdbc;
import java.sql.*;
import java.util.*;

//create and drop for DDL also we are using executeUpdate as Llike DML

public class DDLusingJDBC {


    public static void main(String[] args)throws Exception
    {
        Class.forName("org.sqlite.JDBC");
       
        Connection con = DriverManager.getConnection("jdbc:sql:C://sqlite//univ");
        
        Statement stm=con.createStatement(); 
        
        stm.executeUpdate("create table Temp(a integer,b float)");//create
        stm.executeUpdate("drop table Temp");//drop
        
        stm.close();
        con.close();
    }
    
}
