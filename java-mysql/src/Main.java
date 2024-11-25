import java.awt.*;
import java.sql.*;
import javax.swing.*;

// compile - javac -cp lib/mysql-connector-j-9.1.0.jar -d bin src/Main.java
// run - java -cp bin:lib/mysql-connector-j-9.1.0.jar Main


public class Main {
    // Database credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/user_management";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {
        // Create UI
        JFrame frame = new JFrame("User Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Form Components
        JLabel nameLabel = new JLabel("Name:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel contactLabel = new JLabel("Contact:");
        JLabel addressLabel = new JLabel("Address:");

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField contactField = new JTextField();
        JTextField addressField = new JTextField();

        JButton submitButton = new JButton("Submit");
        JButton viewButton = new JButton("View Users");

        // Layout
        frame.setLayout(new GridLayout(6, 2));
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(contactLabel);
        frame.add(contactField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(submitButton);
        frame.add(viewButton);

        // Submit Button Action
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String email = emailField.getText();
            String contact = contactField.getText();
            String address = addressField.getText();

            if (name.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Name and Email are required!");
                return;
            }

            // Save to Database
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String sql = "INSERT INTO users (name, email, contact, address) VALUES (?, ?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, name);
                stmt.setString(2, email);
                stmt.setString(3, contact);
                stmt.setString(4, address);
                stmt.executeUpdate();

                JOptionPane.showMessageDialog(frame, "User added successfully!");
                nameField.setText("");
                emailField.setText("");
                contactField.setText("");
                addressField.setText("");
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error saving user!");
            }
        });

        // View Button Action
        viewButton.addActionListener(e -> {
            StringBuilder userList = new StringBuilder("Users:\n");
            try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD)) {
                String sql = "SELECT * FROM users";
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                while (rs.next()) {
                    userList.append("ID: ").append(rs.getInt("id"))
                            .append(", Name: ").append(rs.getString("name"))
                            .append(", Email: ").append(rs.getString("email"))
                            .append("\n");
                }

                JOptionPane.showMessageDialog(frame, userList.toString());
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Error retrieving users!");
            }
        });

        frame.setVisible(true);
    }
}
