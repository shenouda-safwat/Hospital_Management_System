package hospitalsystem.patterns1;

import java.util.Date;
import java.util.Calendar;

public class MedicalRecordPrototype {
    

    private static Appointment morningAppointmentTemplate;
    private static Appointment afternoonAppointmentTemplate;
    private static Appointment emergencyAppointmentTemplate;
    private static Appointment followUpAppointmentTemplate;
    

    private static MedicalRecord standardCheckupTemplate;
    private static MedicalRecord followUpTemplate;
    
    static {
        morningAppointmentTemplate = new Appointment(
            0, "", 0, "", new Date(), "09:00 AM"
        );
        morningAppointmentTemplate.setStatus("Scheduled");
        
        afternoonAppointmentTemplate = new Appointment(
            0, "", 0, "", new Date(), "02:00 PM"
        );
        afternoonAppointmentTemplate.setStatus("Scheduled");
        
        emergencyAppointmentTemplate = new Appointment(
            0, "", 0, "", new Date(), "Immediate"
        );
        emergencyAppointmentTemplate.setStatus("Urgent");
        
        followUpAppointmentTemplate = new Appointment(
            0, "", 0, "", getDateAfterWeeks(2), "10:00 AM"
        );
        followUpAppointmentTemplate.setStatus("Scheduled");
        
        standardCheckupTemplate = new MedicalRecord(
            0, "", 0, "", new Date(),
            "Regular Checkup", 
            "Standard vitamins and supplements",
            "Follow up after 1 month"
        );
        
        followUpTemplate = new MedicalRecord(
            0, "", 0, "", new Date(),
            "Follow-up Visit",
            "Continue previous medication",
            "Monitor progress"
        );
    }
    
    public static Appointment getMorningAppointment(int id, String patientName, 
                                                    int age, String doctor) {
        Appointment appointment = morningAppointmentTemplate.clone();
        appointment.setAppointmentId(id);
        appointment.setPatientName(patientName);
        appointment.setPatientAge(age);
        appointment.setDoctorName(doctor);
        appointment.setDate(new Date());
        return appointment;
    }
    
    public static Appointment getAfternoonAppointment(int id, String patientName,
                                                      int age, String doctor) {
        Appointment appointment = afternoonAppointmentTemplate.clone();
        appointment.setAppointmentId(id);
        appointment.setPatientName(patientName);
        appointment.setPatientAge(age);
        appointment.setDoctorName(doctor);
        appointment.setDate(new Date());
        return appointment;
    }
    
    public static Appointment getEmergencyAppointment(int id, String patientName,
                                                      int age, String doctor) {
        Appointment appointment = emergencyAppointmentTemplate.clone();
        appointment.setAppointmentId(id);
        appointment.setPatientName(patientName);
        appointment.setPatientAge(age);
        appointment.setDoctorName(doctor);
        appointment.setDate(new Date());
        appointment.setTime("Immediate");
        return appointment;
    }
    
    public static Appointment getFollowUpAppointment(int id, String patientName,
                                                     int age, String doctor) {
        Appointment appointment = followUpAppointmentTemplate.clone();
        appointment.setAppointmentId(id);
        appointment.setPatientName(patientName);
        appointment.setPatientAge(age);
        appointment.setDoctorName(doctor);
        appointment.setDate(getDateAfterWeeks(2));
        return appointment;
    }
    

    private static Date getDateAfterWeeks(int weeks) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_YEAR, weeks);
        return calendar.getTime();
    }
    

    public static MedicalRecord getStandardCheckup(int recordId, String patientName,
                                                  int age, String doctor) {
        MedicalRecord record = standardCheckupTemplate.clone();
        record.setRecordId(recordId);
        record.setPatientName(patientName);
        record.setPatientAge(age);
        record.setDoctorName(doctor);
        record.setDate(new Date());
        return record;
    }
    
    public static MedicalRecord getFollowUpRecord(int recordId, String patientName,
                                                 int age, String doctor) {
        MedicalRecord record = followUpTemplate.clone();
        record.setRecordId(recordId);
        record.setPatientName(patientName);
        record.setPatientAge(age);
        record.setDoctorName(doctor);
        record.setDate(new Date());
        return record;
    }
}