package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.Specialty;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;

import java.util.List;

public interface DoctorsServices {


   void register(String firstName, String lastName, String email, String password, Specialty specialty);
   void login(String email, String password);
   List<Doctor> findAvailableDoctors();
   void setAvailability(String doctorId, String availability);
   List<Patient> findAvailablePatients();
   Doctor findById(String doctorId);
   DoctorSignUpResponse signUp(DoctorSignUpRequest doctorSignUpRequest);

}
