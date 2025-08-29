
package preparedstatementsinjdbc;
import java.sql.*;
import java.util.*;

public class PreparedStatementsinJDBC {

    
    public static void main(String[] args)throws Exception
    {
        Class.forName("org.sqlite.JDBC");
       
        Connection con = DriverManager.getConnection("jdbc:sql:C://sqlite//univ");
        
        PreparedStatement stm=con. prepareStatement("Select * from student where deptno=?"); 
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Dept Number");
        int dno= sc.nextInt();
        
        stm.setInt(1, dno);
        
        ResultSet rs= stm.executeQuery();
        
        while(rs.next())
        {
            System.out.print(rs.getInt("roll")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getInt("city")+" ");
            System.out.println(rs.getInt(4)+" ");
        }
        
            stm.close();
            con.close();
    }
    
}
