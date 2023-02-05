import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connection = null;

    public static Connection connect() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/education_plus", "root","1423");
            System.out.println("You are connected!");

        } catch (Exception exception) {
            System.out.println(exception);
        }
        return connection;
    }
}
