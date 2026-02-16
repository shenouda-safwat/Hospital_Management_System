package hospitalsystem.patterns1;

public class PatientBuilder {
   
    final int id;
    final String name;
    String phone = "";
    String age = "";
    String bloodGroup = "";
    String address = "";
    String gender = "";
    String majorDisease = "No";
    
    public PatientBuilder(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public PatientBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }
    
    public PatientBuilder age(String age) {
        this.age = age;
        return this;
    }
    
    public PatientBuilder bloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
        return this;
    }
    
    public PatientBuilder address(String address) {
        this.address = address;
        return this;
    }
    
    public PatientBuilder gender(String gender) {
        this.gender = gender;
        return this;
    }
    
    public PatientBuilder majorDisease(String majorDisease) {
        this.majorDisease = majorDisease;
        return this;
    }
    
    public Patient build() {
        return new Patient(this);
    }
}