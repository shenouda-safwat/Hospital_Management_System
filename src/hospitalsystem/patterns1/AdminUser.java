package hospitalsystem.patterns1;  
public class AdminUser extends User {
    public AdminUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "Admin";
    }
    

    
@Override
public boolean hasAccess(String feature) {
    return true;
}
}