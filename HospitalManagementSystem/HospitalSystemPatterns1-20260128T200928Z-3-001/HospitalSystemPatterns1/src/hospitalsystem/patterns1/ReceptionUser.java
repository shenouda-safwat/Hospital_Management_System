package hospitalsystem.patterns1;  

public class ReceptionUser extends User {
    
    public ReceptionUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "Reception";
    }
    

    
    @Override
public boolean hasAccess(String feature) {
    return feature.equals("ViewPatients") || 
           feature.equals("AddPatient") ||   
           feature.equals("BookAppointment") || 
           feature.equals("ViewAppointments");
}
}