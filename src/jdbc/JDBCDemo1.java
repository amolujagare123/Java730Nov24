package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1.  loading the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. create connection
        String user = "root";
        String pass = "root";
        String url = "jdbc:mysql://localhost:3306/730batch";

        Connection con = DriverManager.getConnection(url,user,pass) ;

        // 3. creating statement
        Statement st = con.createStatement();

        // 4. execute the query ( DML )
        String sql = "INSERT INTO student VALUES (1, 'Charlie Brown', 'CSE', 89);";
        st.executeUpdate(sql);

    }
}
