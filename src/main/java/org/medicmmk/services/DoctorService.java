package org.medicmmk.services;

import org.medicmmk.data.model.Doctor;
import org.medicmmk.dtos.DoctorLoginRequest;
import org.medicmmk.dtos.RegisterDoctorRequest;

import java.util.List;

public interface DoctorService {
    Doctor loginDoctorToProfile(DoctorLoginRequest request);
    Doctor registerDoctorProfile(RegisterDoctorRequest request);
    Doctor findDoctorProfileByUsername(String username);
    Doctor findDoctorProfileByPassword(String password);
    List<Doctor> findALL();
    Doctor findDoctorProfileByEmail(String email);
}
