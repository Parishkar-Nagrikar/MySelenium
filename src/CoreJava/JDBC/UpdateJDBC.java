package CoreJava.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by p-star on 3/31/2017.
 */
public class UpdateJDBC
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

        String name="Ram";
        String id="99";


        //String sqlUpdate="update class set name='qwerty' where id=50";
        String sqlUpdate="update class set name='"+name+"' where id="+id+"";

        st.executeUpdate(sqlUpdate);
        System.out.println( "Query executed !");

    }
}
