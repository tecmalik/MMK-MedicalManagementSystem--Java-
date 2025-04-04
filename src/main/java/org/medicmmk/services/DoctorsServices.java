package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.Specialty;

import java.util.List;

public interface DoctorsServices {


   void register(String firstName, String lastName, String email, String password, Specialty specialty);
   void login(String email, String password);
   List<Doctor> findAvailableDoctors();
   void setAvailability(String doctorId, String availability);
   List<Patient> findAvailablePatients();
   Doctor findById(String doctorId);
}
