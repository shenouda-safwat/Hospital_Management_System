package hospitalsystem.patterns1;

import javax.swing.JOptionPane;
import java.util.*;

public class AccessControlProxy {
    private RealDataAccess realDataAccess;
    private User currentUser;
    
    public AccessControlProxy(User currentUser) {
        this.currentUser = currentUser;
    }
    

    public AccessControlProxy() {
        this.currentUser = null;
    }
    
    private RealDataAccess getRealDataAccess() {
        if (realDataAccess == null) {
            realDataAccess = new RealDataAccess();
        }
        return realDataAccess;
    }
    
   
    private boolean checkPermission(String operation, String table, String condition) {

        if (currentUser == null) {
            
            return true;
        }

        if (currentUser.getRole().equals("Admin")) {
            return true;
        }
        
        
        if (table.equals("User") && operation.equals("SELECT")) {
           
            String userCondition = "username = '" + currentUser.getUsername() + "'";
            if (condition != null && condition.equals(userCondition)) {
                 return true;
            } 

            return false;
        }


        if (currentUser.getRole().equals("Reception")) {
            if (table.equals("DoctorInformation") && 
                (operation.equals("DELETE") || operation.equals("UPDATE"))) {
                return false;
            }
        }
        
        if (currentUser.getRole().equals("Doctor")) {
            if (table.equals("DoctorInformation") && 
                (operation.equals("DELETE") || operation.equals("UPDATE"))) {
                return false;
            }
        }
        
        
        return true;
    }
    
    private void logOperation(String operation, String table, boolean success) {
        String username = (currentUser != null) ? currentUser.getUsername() : "System";
        System.out.println(String.format("[%s] User: %s, Operation: %s, Table: %s, Status: %s",new Date(),username,operation,table,success ? "SUCCESS" : " FAILED"
        ));
    }
    


    public boolean addData(String table, Map<String, String> data) {
        
        if (!checkPermission("INSERT", table, null)) { 
            JOptionPane.showMessageDialog(null, 
                "Access Denied: You don't have permission to add to " + table);
            logOperation("INSERT", table, false);
            return false;
        }
        
        boolean result = getRealDataAccess().addData(table, data);
        logOperation("INSERT", table, result);
        return result;
    }
    
    public boolean updateData(String table, Map<String, String> data, String condition) {
        
        if (!checkPermission("UPDATE", table, null)) { 
            JOptionPane.showMessageDialog(null, 
                "Access Denied: You don't have permission to update " + table);
            logOperation("UPDATE", table, false);
            return false;
        }
        
        boolean result = getRealDataAccess().updateData(table, data, condition);
        logOperation("UPDATE", table, result);
        return result;
    }
    
    public boolean deleteData(String table, String condition) {
     
        if (!checkPermission("DELETE", table, null)) { 
            JOptionPane.showMessageDialog(null, 
                "Access Denied: You don't have permission to delete from " + table);
            logOperation("DELETE", table, false);
            return false;
        }
        
        boolean result = getRealDataAccess().deleteData(table, condition);
        logOperation("DELETE", table, result);
        return result;
    }
    
    public List<Map<String, String>> getData(String table, String condition) {
       
        if (!checkPermission("SELECT", table, condition)) {
            JOptionPane.showMessageDialog(null, 
                "Access Denied: You don't have permission to view " + table + " with the specified condition.");
            logOperation("SELECT", table, false);
            return Collections.emptyList();
        }

        List<Map<String, String>> data = getRealDataAccess().getData(table, condition);
        logOperation("SELECT", table, true);
        return data;
    }
}