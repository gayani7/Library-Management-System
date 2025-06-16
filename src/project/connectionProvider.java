
package project;

import java.sql.Connection;
import java.sql.*;

/**
 *
 * @author User
 */
public class connectionProvider {
     private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mariadb://localhost:3307/library_management";
    private static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(dataconn,username,password);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    
    }
    
    
}
