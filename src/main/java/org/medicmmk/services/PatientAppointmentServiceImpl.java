package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.PatientAppointment;
import org.medicmmk.services.dtos.requests.PatientLoginRequest;
import org.medicmmk.services.dtos.requests.PatientSignUpRequest;
import org.medicmmk.services.dtos.response.PatientLoginResponse;
import org.medicmmk.services.dtos.response.PatientSignUpResponse;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PatientAppointmentServiceImpl implements PatientService {


    @Override
    public Patient getPatient(String email) {
        return null;
    }

    @Override
    public void bookAppointment(Doctor doctor, LocalDate date, LocalTime time) {

    }

    @Override
    public List<PatientAppointment> getListOfAppointments() {
        return List.of();
    }

    @Override
    public void updatePatientProfile(String PatientId, String updates) {

    }

    @Override
    public PatientLoginResponse login(PatientLoginRequest patientLoginRequest) {
        return null;
    }

    @Override
    public void deleteAllPatients() {

    }

    @Override
    public PatientSignUpResponse signUp(PatientSignUpRequest patientSignUpRequest) {
        return null;
    }

    @Override
    public long patientsCount() {
        return 0;
    }
}
