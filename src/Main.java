
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cuonngo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = new DBConnection().connect();
        Login newLogin = new Login();
        newLogin.setConnection(con);
        newLogin.show();
    }
    
}
