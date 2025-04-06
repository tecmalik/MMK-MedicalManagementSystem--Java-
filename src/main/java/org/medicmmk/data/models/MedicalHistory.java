package org.medicmmk.data.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class MedicalHistory {
    @Id
    private String medicalID;
    private String patientID;
    private String illnesses;
    private String allergies;
    private BloodGroup bloodGroup;
    private BloodType bloodType;
    private Genotype genotype;
    private boolean isSurgery;
    private String familyMedicalHistory;
    private LocalTime lastUpdateTime ;


}
