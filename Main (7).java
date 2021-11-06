import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class dbaseConnx 
{
    final static String url = "jdbc:mysql://127.0.0.1:3306/crimeDetection";
    final static String driver = "com.mysql.jdbc.Driver";
    final static String username = "root";
    final static String password = "";
 
    public static Connection openConnection()
    {  
        try
        {
            Class.forName(driver);
           Connection conn = (Connection) DriverManager.getConnection(url,username,password);
           return conn;
        }
        catch (ClassNotFoundException | SQLException e)
        {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    }
}