// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class PostgresJDBC {
//     public static void main(String[] args) {
//         String url = "jdbc:postgresql://localhost:5432/demo"; // Change DB name if needed
//         String user = "postgres"; // Your PostgreSQL username
//         String password = "postgres"; // Your PostgreSQL password

//         try (
            
//         Class.forName("org.postgresql.Driver");
//              Connection conn = DriverManager.getConnection(url, user, password);
//              Statement stmt = conn.createStatement()) {

//             System.out.println("✅ Connected to PostgreSQL!");

//             // Create Table (if not exists)
//             String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
//                                     "id SERIAL PRIMARY KEY, " +
//                                     "name VARCHAR(50), " +
//                                     "age INT)";
//             stmt.executeUpdate(createTableSQL);
//             System.out.println("✅ Table created!");

//             // Insert Data
//             String insertSQL = "INSERT INTO students (name, age) VALUES ('Tushar', 24)";
//             stmt.executeUpdate(insertSQL);
//             System.out.println("✅ Data inserted!");

//             // Retrieve Data
//             ResultSet rs = stmt.executeQuery("SELECT * FROM students");
//             while (rs.next()) {
//                 System.out.println("ID: " + rs.getInt("id") +
//                                    ", Name: " + rs.getString("name") +
//                                    ", Age: " + rs.getInt("age"));
//             }

//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
// }


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresJDBC {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/demo"; // Ensure the database 'demo' exists
        String user = "postgres";
        String password = "postgres"; // Use the correct password

        try {
            // Load the PostgreSQL JDBC Driver
            Class.forName("org.postgresql.Driver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL database successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver not found. Add the JAR file to the classpath.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed! Check output console.");
            e.printStackTrace();
        }
    }
}
