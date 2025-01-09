package jdbc;

import java.sql.*;

public class JDBCDemo2 {

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

        // 4. execute the query ( DDL )
        String sql = "select * from student where name like '%i%'";
        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("rno") + "\t"  );
            System.out.print(rs.getString("name")+ "\t");
            System.out.print(rs.getString("branch")+ "\t");
            System.out.println(rs.getInt("marks"));
        }

    }
}
