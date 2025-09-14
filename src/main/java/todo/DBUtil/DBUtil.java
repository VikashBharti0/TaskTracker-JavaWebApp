package todo.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBUtil {
    private static final String URL = "jdbc:postgresql://localhost:5432/todolist?user=postgres&password=123";


    public static Connection getConnection() throws Exception{
    		Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL);
    }
}
