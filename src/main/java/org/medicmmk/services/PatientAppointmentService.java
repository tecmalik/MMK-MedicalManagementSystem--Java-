package org.medicmmk.services;

import java.time.LocalDate;
import java.time.LocalTime;

public interface PatientAppointmentService {
    void BookAppointment(String PatientId, String doctorsId, LocalDate appointmentDate, LocalTime appointmentTime);

}
