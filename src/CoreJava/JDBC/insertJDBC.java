package CoreJava.JDBC;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by p-star on 3/30/2017.
 */
public class insertJDBC
{
    public static void main(String[] args) throws ClassNotFoundException,SQLException
    {
        //Loading Drivers
        Class.forName("com.mysql.jdbc.Driver");

        //creating Connection
        String url="jdbc:mysql://localhost:3306/dbname";
        String uNAme="root";
        String password="root";
        Connection con=DriverManager.getConnection(url, uNAme, password);

        //Creating Stratment
        Statement st=con.createStatement();

        String id="888";
        String name="Krish";
        String branch="Comps";


        //Creating Query
        String sqlInsert="insert into class values("+id+",'"+name+"','"+branch+"')";
        st.executeUpdate(sqlInsert);
        System.out.println( "Query executed !");

    }
}
