package hospitalsystem.patterns1;  

public abstract class User {
    protected String username;
    protected String password;
    protected String role;
    

    public abstract boolean hasAccess(String feature);
    
    public String getUsername() { return username; }
    
    public String getRole() { return role; }
}