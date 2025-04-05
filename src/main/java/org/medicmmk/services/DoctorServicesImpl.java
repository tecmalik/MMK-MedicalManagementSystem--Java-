package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.Specialty;
import org.medicmmk.data.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServicesImpl implements DoctorsServices {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public void register(String firstName, String lastName, String email, String password, Specialty specialty) {
        Doctor doctor = new Doctor();
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setEmail(email);
        doctor.setPassword(password);
        doctor.setSpecialization(specialty);
        doctorRepository.save(doctor);
    }

    @Override
    public void login(String email, String password) {
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

}
