package bankingManagement;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect {
    Connection connection;
    Statement statement;

    public Connect() {
        try {
            statement = connection.createStatement();

            System.out.println("Database is connected");
        } catch (Exception e) {
            System.out.println("connecting Database Database ");
            e.printStackTrace();
        }
}
