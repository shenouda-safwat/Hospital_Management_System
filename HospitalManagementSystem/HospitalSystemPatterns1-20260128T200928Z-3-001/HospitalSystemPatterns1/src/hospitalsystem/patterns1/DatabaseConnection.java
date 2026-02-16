package hospitalsystem.patterns1;  
import java.sql.*;
import javax.swing.JOptionPane;

public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    private final String url = "jdbc:sqlserver://localhost\\ADVSOFTAREEIG;databaseName=HospitalDataBase;user=sa;password=111111;";
    private Connection connection;
    
    private DatabaseConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url);
            System.out.println(" Database connected!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Cannot connect to database!");
            ex.printStackTrace();
        }
    }
    
    public static  DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    public Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                connection = DriverManager.getConnection(url);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    
    public ResultSet executeQuery(String query) {
        try {
            Statement stmt = getConnection().createStatement();
            return stmt.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Query Error: " + ex.getMessage());
            return null;
        }
    }
    
    public int executeUpdate(String query) {
        try {
            Statement stmt = getConnection().createStatement();
            return stmt.executeUpdate(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Update Error: " + ex.getMessage());
            return -1;
        }
    }
}