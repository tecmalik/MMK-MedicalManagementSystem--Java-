package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.PatientAppointment;
import org.medicmmk.data.repository.PatientRepository;
import org.medicmmk.exceptions.InvalidPasswordException;
import org.medicmmk.exceptions.PatientDoesNotExistException;
import org.medicmmk.services.dto.request.PatientLoginRequest;
import org.medicmmk.services.dto.request.PatientSignUpRequest;
import org.medicmmk.services.dto.response.PatientLoginResponse;
import org.medicmmk.services.dto.response.PatientSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;




@Service
public class PatientServicesImpl implements PatientService{

    @Autowired
    PatientRepository patientRepository;



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

        Patient patient = patientRepository.findByEmail(patientLoginRequest.getEmail());
        if (patient == null) throw new PatientDoesNotExistException("Patient Does Not Exist");
        String password = patientLoginRequest.getPassword();
        validatePassword(password,patient);
        patient.setLoggedIn(true);
        PatientLoginResponse patientLoginResponse = new PatientLoginResponse();
        patientLoginResponse.setPatientLoginResponse("Login Successful");
        return patientLoginResponse;
    }

    private void validatePassword(String password, Patient patient) {
        if (!patient.getPassword().equals(password)) throw new InvalidPasswordException("Invalid Credentials");
    }

    @Override
    public void deleteAllPatients() {
        patientRepository.deleteAll();
    }

    @Override
    public PatientSignUpResponse signUp(PatientSignUpRequest patientSignUpRequest) {
        return null;
    }

    @Override
    public long patientsCount() {
        return patientRepository.count();
    }

}
