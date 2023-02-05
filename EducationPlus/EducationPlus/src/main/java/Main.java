import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/education_plus", "root", "1423");

            System.out.println("You are connected with DB!");

        } catch (Exception ex) {
            System.out.println("Not connected!");
        }


//        statement =
//                connection.prepareStatement("INSERT INTO `companies` (`username`, `password`, `name`, `town`)\n" +
//                        "VALUES (\n" +
//                        "'qwerty', '12345678', 'education', 'ruse'\n" +
//                        ");");

//        stmt.execute();


    }
}
