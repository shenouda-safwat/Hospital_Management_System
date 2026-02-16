package hospitalsystem.patterns1;  

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class DatabaseAdapter {
    
    private DatabaseConnection dbConnection;
    
    public DatabaseAdapter() {
        this.dbConnection = DatabaseConnection.getInstance();
    }
    
    public boolean insert(String table, Map<String, String> data) {
        try {
            StringBuilder columns = new StringBuilder();
            StringBuilder values = new StringBuilder();
            
            for (Map.Entry<String, String> entry : data.entrySet()) {
                if (columns.length() > 0) {
                    columns.append(", ");
                    values.append(", ");
                }
                columns.append(entry.getKey());
                values.append("'").append(entry.getValue()).append("'");
            }
            
            String query = String.format("INSERT INTO %s (%s) VALUES (%s)",
                                       table, columns.toString(), values.toString());
            
            int result = dbConnection.executeUpdate(query);
            return result > 0;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Insert Error: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean update(String table, Map<String, String> data, String condition) {
        try {
            StringBuilder setClause = new StringBuilder();
            
            for (Map.Entry<String, String> entry : data.entrySet()) {
                if (setClause.length() > 0) {
                    setClause.append(", ");
                }
                setClause.append(entry.getKey())
                        .append(" = '")
                        .append(entry.getValue())
                        .append("'");
            }
            
            String query = String.format("UPDATE %s SET %s WHERE %s",
                                       table, setClause.toString(), condition);
            
            int result = dbConnection.executeUpdate(query);
            return result > 0;
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Update Error: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean delete(String table, String condition) {
        try {
            String query = String.format("DELETE FROM %s WHERE %s", table, condition);
            int result = dbConnection.executeUpdate(query);
            return result > 0;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Delete Error: " + ex.getMessage());
            return false;
        }
    }
    
    public List<Map<String, String>> select(String table, String condition) {
        List<Map<String, String>> results = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM " + table;
            if (condition != null && !condition.isEmpty()) {
                query += " WHERE " + condition;
            }
            
            ResultSet rs = dbConnection.executeQuery(query);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            
            while (rs.next()) {
                Map<String, String> row = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    row.put(metaData.getColumnName(i), rs.getString(i));
                }
                results.add(row);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Select Error: " + ex.getMessage());
        }
        
        return results;
    }
    
   public int getNextId(String table, String idColumn) {
    int nextID = 1; 

    try {
        String query = String.format(
            "SELECT %s FROM %s ORDER BY %s ASC",
            idColumn, table, idColumn
        );

        ResultSet rs = dbConnection.executeQuery(query);

        while (rs.next()) {
            int id = rs.getInt(idColumn);

            if (id == nextID) {
                nextID++;        
            } else if (id > nextID) {
                break;           
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }

    return nextID;
}
}