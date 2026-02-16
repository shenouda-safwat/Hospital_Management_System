package hospitalsystem.patterns1;  


import java.util.*;

public class RealDataAccess {
    private DatabaseAdapter dbAdapter;
    
    public RealDataAccess() {
        this.dbAdapter = new DatabaseAdapter();
    }
    
    public boolean addData(String table, Map<String, String> data) {
        return dbAdapter.insert(table, data);
    }
    
    public boolean updateData(String table, Map<String, String> data, String condition) {
        return dbAdapter.update(table, data, condition);
    }
    
    public boolean deleteData(String table, String condition) {
        return dbAdapter.delete(table, condition);
    }
    
    public List<Map<String, String>> getData(String table, String condition) {
        return dbAdapter.select(table, condition);
    }
}