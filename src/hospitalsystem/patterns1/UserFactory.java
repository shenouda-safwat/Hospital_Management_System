package hospitalsystem.patterns1;

public class UserFactory {
    public static User createUser(String role, String username, String password) {
        if (role == null || role.isEmpty()) {
            return null;
        }
       
        String roleLower = role.toLowerCase().trim();
        
        switch (roleLower) {
            case "admin":
                return new AdminUser(username, password);
            case "doctor":
                return new DoctorUser(username, password);
            case "reception":
                return new ReceptionUser(username, password);
            default:
                System.err.println("Unknown role: " + role);
                return null;
        }
    }
}