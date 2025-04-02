package org.medicmmk.data.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "doctor profile")
public class DoctorProfile {
    @Id
    private String id;
    private String username;
    private String password;
    @DBRef
    private Doctor doctor;
}
