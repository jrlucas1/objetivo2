package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDAO {
    public static Connection getConnection() {

        try {
            final String url = "jdbc:mariadb://localhost:3306/lpoo";
            return DriverManager.getConnection(url, "mariadb", "mariadb");
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(BaseDAO.getConnection());
    }
}
