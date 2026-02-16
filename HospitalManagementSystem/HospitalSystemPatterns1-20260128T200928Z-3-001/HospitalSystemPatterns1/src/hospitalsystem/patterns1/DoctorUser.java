package hospitalsystem.patterns1;  

public class DoctorUser extends User {
    public DoctorUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.role = "Doctor";
    }
    

    
    @Override
public boolean hasAccess(String feature) {
    return feature.equals("ViewPatients") ||           
           feature.equals("AddMedicalRecord") || 
           feature.equals("ViewMedicalRecords") ||
           feature.equals("ViewDoctor")||
           feature.equals("ViewAppointments");  
}
}