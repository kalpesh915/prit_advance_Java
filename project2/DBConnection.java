
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    private static Connection conn;

    public static Connection getConnection()
    {
        try
        {
            if(conn == null || conn.isClosed())
            {
                Class.forName("org.apache.derby.jdbc.ClientDriver");

                conn = DriverManager.getConnection(
                        "jdbc:derby://localhost:1527/studentdb",
                        "root",
                        "root");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        return conn;
    }
}