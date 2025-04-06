package org.medicmmk.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Document
@Data
public class PatientAppointment {
    @Id
    private String appointmentID;
    private LocalTime startTime;
    private LocalTime stopTime;
    private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    private Status status;
 }
