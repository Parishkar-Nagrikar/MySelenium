package CoreJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by p-star on 3/31/2017.
 */
public class DeleteJDBC
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


        String id="888";

        String sqlDelete="delete from class where id="+id+"";

        st.executeUpdate(sqlDelete);
        System.out.println( "Query executed !");
    }

}
