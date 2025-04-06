package org.medicmmk.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document(collection = "medical history")
public class MedicalHistory {
    @Id
    private String id;
    @DBRef
    private Patient patient;
    private List<String> illnesses;
    private List<String> allergies;
    private String currentMedications;
    private List<String> familyMedicalHistory;
    private boolean isSurgery;
    private BloodGroup bloodGroup;
    private BloodType bloodType;
    private LocalDateTime lastUpdatedDateAndTime;
}
