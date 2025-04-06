package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;

import java.util.List;

public interface DoctorsServices {


   DoctorLoginResponse login(DoctorLoginRequest doctorLoginRequest);
   DoctorSignUpResponse signUp(DoctorSignUpRequest doctorSignUpRequest);
   long doctorsCount();
   void deleteAllDoctors();
   List<Doctor> findAvailableDoctors();
   void setAvailability(String doctorId, String availability);
   List<Patient> findAvailablePatients();
   Doctor findById(String doctorId);
}
