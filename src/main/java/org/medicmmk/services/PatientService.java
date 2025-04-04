package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.PatientAppointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface PatientService {

    void register (String firstName,String LastName,String email,String password);
    void login (String email, String password);
    Patient getPatient(String email);
    void bookAppointment(Doctor doctor, LocalDate date, LocalTime time);
    List<PatientAppointment> getListOfAppointments();
    void updatePatientProfile(String PatientId, String updates);

}
