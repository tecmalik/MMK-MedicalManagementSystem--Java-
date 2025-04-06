package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.PatientAppointment;
import org.medicmmk.services.dto.request.PatientLoginRequest;
import org.medicmmk.services.dto.request.PatientSignUpRequest;
import org.medicmmk.services.dto.response.PatientLoginResponse;
import org.medicmmk.services.dto.response.PatientSignUpResponse;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface PatientService {

    Patient getPatient(String email);
    void bookAppointment(Doctor doctor, LocalDate date, LocalTime time);
    List<PatientAppointment> getListOfAppointments();
    void updatePatientProfile(String PatientId, String updates);
    public PatientLoginResponse login(PatientLoginRequest patientLoginRequest);
    void deleteAllPatients();
    public PatientSignUpResponse signUp(PatientSignUpRequest patientSignUpRequest);
    long patientsCount();
}
