package org.medicmmk.services;

import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Patient;
import org.medicmmk.data.models.PatientAppointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class PatientAppointmentServiceImpl implements PatientService {

    @Override
    public void register(String firstName, String LastName, String email, String password) {

    }

    @Override
    public void login(String email, String password) {

    }

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
}
