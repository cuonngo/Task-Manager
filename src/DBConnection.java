/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Ngo
 */
public class DBConnection {
    private Connection DBConnection;
    public Connection connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connection Success");
        }
        catch (ClassNotFoundException cnfe){
            System.out.println("Connection Fail" + cnfe);
        }
        String url = "jdbc:mysql://supremebot.net:3306/b0sss_TaskManager";
        try{
            DBConnection = (Connection) DriverManager.getConnection(url, "b0sss_admin", "Psu123");
            System.out.println("Database Connected");
        }
        catch (SQLException se)
        {
            System.out.println("No Database" + se);
        }
        return DBConnection;
    }
}
