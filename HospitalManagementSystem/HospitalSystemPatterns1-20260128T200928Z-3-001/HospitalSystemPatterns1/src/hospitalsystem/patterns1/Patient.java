/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalsystem.patterns1;  


public class Patient {

    private final int id;
    private final String name;
    private String phone;
    private String age;
    private String bloodGroup;
    private String address;
    private String gender;
    private String majorDisease;
    
    public Patient(PatientBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.phone = builder.phone;
        this.age = builder.age;
        this.bloodGroup = builder.bloodGroup;
        this.address = builder.address;
        this.gender = builder.gender;
        this.majorDisease = builder.majorDisease;
    }
    

    public int getId() { return id; }
    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getAge() { return age; }
    public String getBloodGroup() { return bloodGroup; }
    public String getAddress() { return address; }
    public String getGender() { return gender; }
    public String getMajorDisease() { return majorDisease; }
}