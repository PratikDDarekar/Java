import java.sql.*;

class Database {
    public static void main(String[] args) throws Exception {
        // Load the SQLite JDBC driver
        Class.forName("org.sqlite.JDBC");

        // Establish connection
        Connection con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/univ.db");

        // Create statement
        Statement stm = con.createStatement();

        // Execute query
        ResultSet rs = stm.executeQuery("SELECT * FROM dept");

        int dno;
        String dname;

        // Process results
        while (rs.next()) {
            dno = rs.getInt("deptno");
            dname = rs.getString("dname");
            System.out.println(dno + " " + dname);
        }

        // Close resources
        rs.close();
        stm.close();
        con.close();
    }
}