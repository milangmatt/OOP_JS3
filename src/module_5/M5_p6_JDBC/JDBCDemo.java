package module_5.M5_p6_JDBC;

import java.sql.*;


public class JDBCDemo {
    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/studeets";
            String username = "root";
            String password = "Genjutsu2468";
            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String createTableQuery = "CREATE TABLE IF NOT EXISTS Student (id INT, name VARCHAR(50), age INT)";
            statement.executeUpdate(createTableQuery);

            String insertQuery = "INSERT INTO Student VALUES (24, 'Stark Wilson', 30), (4, 'Chris Well', 19)";
            statement.executeUpdate(insertQuery);

            String selectQuery = "SELECT * FROM Student";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close resources
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
