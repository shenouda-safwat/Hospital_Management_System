package hospitalsystem.patterns1;  

public class DoctorBuilder {
    final int id;
    final String name;
    String email = "";
    String phone = "";
    String specialization = "";
    String consultation = "";
    String yearsOfExperience = "";
    
    public DoctorBuilder(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public DoctorBuilder email(String email) {
        this.email = email;
        return this;
    }
    
    public DoctorBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public DoctorBuilder specialization(String specialization) {
        this.specialization = specialization;
        return this;
    }
    
    public DoctorBuilder consultation(String consultation) {
        this.consultation = consultation;
        return this;
    }
    
    public DoctorBuilder yearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
        return this;
    }
    
    public Doctor build() {
        return new Doctor(this);
    }
}