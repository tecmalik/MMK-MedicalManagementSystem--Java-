package org.medicmmk.services;

import lombok.extern.slf4j.Slf4j;
import org.medicmmk.data.models.Doctor;

import org.medicmmk.data.models.Patient;
import org.medicmmk.data.repository.DoctorRepository;
import org.medicmmk.exceptions.DoctorDoesNotExistException;
import org.medicmmk.exceptions.DuplicateDoctorException;
import org.medicmmk.exceptions.InvalidPasswordException;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
//@Slf4j
public class DoctorServicesImpl implements DoctorsServices {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorLoginResponse login(DoctorLoginRequest doctorLoginRequest) {
        Doctor doctor = doctorRepository.findByEmail(doctorLoginRequest.getEmail());
        if (doctor == null) throw new DoctorDoesNotExistException("Doctor Does Not Exist");
        String password = doctorLoginRequest.getPassword();
        validatePassword(password,doctor);
        doctor.setLoggedIn(true);
        DoctorLoginResponse doctorLoginResponse = new DoctorLoginResponse();
        doctorLoginResponse.setLoginResponse("Login Successful");
        return doctorLoginResponse;
    }


    private void validatePassword(String password, Doctor doctor) {
        if (!doctor.getPassword().equals(password)) throw new InvalidPasswordException("Invalid Credentials");
    }


    @Override
    public List<Doctor> findAvailableDoctors() {
        return List.of();
    }

    @Override
    public void setAvailability(String doctorId, String availability) {

    }


    @Override
    public List<Patient> findAvailablePatients() {
        return List.of();
    }

    @Override
    public Doctor findById(String doctorId) {
        return null;
    }

    public DoctorSignUpResponse signUp(DoctorSignUpRequest doctorSignUpRequest) {
        ValidateDoctorsExistence(doctorSignUpRequest);
        Doctor doctor = new Doctor();
        doctor.setFirstName(doctorSignUpRequest.getFirstName());
        doctor.setLastName(doctorSignUpRequest.getLastName());
        doctor.setEmail(doctorSignUpRequest.getEmail());
        doctor.setPassword(doctorSignUpRequest.getPassword());
        doctorRepository.save(doctor);
        DoctorSignUpResponse doctorSignUpResponse = new DoctorSignUpResponse();
        doctorSignUpResponse.setResponse("SignUp Successful");
        return doctorSignUpResponse;

    }

    private void ValidateDoctorsExistence (DoctorSignUpRequest doctorSignUpRequest) {
        if(doctorRepository.findByEmail(doctorSignUpRequest.getEmail())!= null) throw new DuplicateDoctorException("Doctor Already Exist");
    }

    @Override
    public long doctorsCount() {
        return doctorRepository.count();
    }

    @Override
    public void deleteAllDoctors() {
        doctorRepository.deleteAll();
    }
}
