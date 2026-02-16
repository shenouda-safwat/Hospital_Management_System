package hospitalsystem.patterns1;  

public class Doctor {
    private final int id;
    private final String name;
    private String email;
    private String phone;
    private String specialization;
    private String consultation;
    private String yearsOfExperience;
    
    public Doctor(DoctorBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.specialization = builder.specialization;
        this.consultation = builder.consultation;
        this.yearsOfExperience = builder.yearsOfExperience;
    }
    
    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public String getSpecialization() { return specialization; }
    public String getConsultation() { return consultation; }
    public String getYearsOfExperience() { return yearsOfExperience; }
}