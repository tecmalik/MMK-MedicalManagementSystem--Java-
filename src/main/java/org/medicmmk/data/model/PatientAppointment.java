package org.medicmmk.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

import java.time.LocalTime;

@Data
@Document(collection = "patient appointment")
public class PatientAppointment {
    @Id
    private String id;
    private LocalDate appointmentDate;
    private LocalTime startTime;
    private LocalTime endTime;
    @DBRef
    private Patient patient;
    @DBRef
    private Doctor doctor;
    private Status status;
}
