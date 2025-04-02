package org.medicmmk.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@Document(collection = "doctor schedule")
public class DoctorSchedule {
    @Id
    private String id;
    @DBRef
    private Patient patient;
    @DBRef
    private Doctor doctor;
    @DBRef
    private PatientAppointment appointment;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
}
