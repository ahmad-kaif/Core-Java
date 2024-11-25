import java.sql.*;
//  javac -cp lib/mysql-connector-j-9.1.0.jar -d bin src/LibraryManagement.java
//  java -cp bin:lib/mysql-connector-j-9.1.0.jar LibraryManagement 

public class LibraryManagement {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/library";
        String user = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            System.out.println("Connected to the database!");

            // Insert sample data into "user" table
            String insertUser = "INSERT INTO user (name, address, contact, email) VALUES (?, ?, ?, ?)";
            PreparedStatement userStmt = conn.prepareStatement(insertUser);
            userStmt.setString(1, "John Doe");
            userStmt.setString(2, "123 Main St");
            userStmt.setString(3, "1234567890");
            userStmt.setString(4, "john.doe@example.com");
            userStmt.executeUpdate();

            // Insert sample data into "books" table
            String insertBook = "INSERT INTO books (title, publisher, authors, copies) VALUES (?, ?, ?, ?)";
            PreparedStatement bookStmt = conn.prepareStatement(insertBook);
            bookStmt.setString(1, "Java Programming");
            bookStmt.setString(2, "Tech Publishers");
            bookStmt.setString(3, "Jane Smith");
            bookStmt.setInt(4, 5);
            bookStmt.executeUpdate();

            // Insert sample data into "issue" table
            String insertIssue = "INSERT INTO issue (UID, BID, Copies) VALUES (?, ?, ?)";
            PreparedStatement issueStmt = conn.prepareStatement(insertIssue);
            issueStmt.setInt(1, 1); // UID: User ID
            issueStmt.setInt(2, 1); // BID: Book ID
            issueStmt.setInt(3, 1); // Copies issued
            issueStmt.executeUpdate();

            System.out.println("Sample data inserted successfully!");

            // Close the connection
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
