package org.medicmmk.services;

import org.medicmmk.data.models.Patient;
import org.medicmmk.dtos.requests.PatientLoginRequest;
import org.medicmmk.dtos.requests.PatientSignUpRequest;
import org.medicmmk.dtos.response.PatientLoginResponse;
import org.medicmmk.dtos.response.PatientSignUpResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface PatientService {

    Patient getPatient(String email);
//    void bookAppointment(Doctor doctor, LocalDate date, LocalTime time);
//    List<PatientAppointment> getListOfAppointments();
    void updatePatientProfile(String PatientId, String updates);

    PatientLoginResponse login(PatientLoginRequest patientLoginRequest);
    void deleteAllPatients();
    PatientSignUpResponse signUp(PatientSignUpRequest patientSignUpRequest);
    long patientsCount();

}