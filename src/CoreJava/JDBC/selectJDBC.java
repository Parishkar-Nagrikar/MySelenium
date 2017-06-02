package CoreJava.JDBC;

import java.sql.*;

/**
 * Created by p-star on 3/31/2017.
 */
public class selectJDBC
{
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        //Loading Drivers
        Class.forName("com.mysql.jdbc.Driver");

        //creating Connection
        String url="jdbc:mysql://localhost:3306/dbname";
        String uNAme="root";
        String password="root";
        Connection con= DriverManager.getConnection(url, uNAme, password);

        //Creating Stratment
        Statement st=con.createStatement();

        //Creating Query
      String sqlSelect="select * from class;";

        ResultSet rs=st.executeQuery(sqlSelect);


        System.out.println("ID  NAME BRANCH");
        while(rs.next())
        {
            System.out.println(rs.getInt("id")+"  "+rs.getString("name")+" "+ rs.getString("branch"));

        }

        System.out.println("Select Query executed !");

    }
}
