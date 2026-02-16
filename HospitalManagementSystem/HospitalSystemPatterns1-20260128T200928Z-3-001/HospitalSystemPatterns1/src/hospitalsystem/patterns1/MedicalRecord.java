
package hospitalsystem.patterns1;

import java.util.Date;


public class MedicalRecord implements Cloneable {
    private int recordId;
    private String patientName;
    private int patientAge;
    private String doctorName;
    private Date date;
    private String diagnosis;
    private String prescription;
    private String notes;
    
    public MedicalRecord(int recordId, String patientName, int patientAge, 
                        String doctorName, Date date, String diagnosis, 
                        String prescription, String notes) {
        this.recordId = recordId;
        this.patientName = patientName;
        this.patientAge = patientAge;
        this.doctorName = doctorName;
        this.date = date;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.notes = notes;
    }
    
    @Override
    public MedicalRecord clone() {
        try {
            MedicalRecord cloned = (MedicalRecord) super.clone();
            cloned.date = (Date) this.date.clone();
            return cloned;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    

    public int getRecordId() { return recordId; }
    public void setRecordId(int recordId) { this.recordId = recordId; }
    
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    
    public int getPatientAge() { return patientAge; }
    public void setPatientAge(int patientAge) { this.patientAge = patientAge; }
    
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    
    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    
    public String getDiagnosis() { return diagnosis; }
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    
    public String getPrescription() { return prescription; }
    public void setPrescription(String prescription) { this.prescription = prescription; }
    
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    
    @Override
    public String toString() {
        return "MedicalRecord{" +
                "recordId=" + recordId +
                ", patientName='" + patientName + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", date=" + date +
                '}';
    }
}