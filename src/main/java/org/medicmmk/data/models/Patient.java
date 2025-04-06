package org.medicmmk.data.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Patient {
    @Id
    private String iD;
    private String firstName;
    private String lastName;
    private Gender gender;
    private String email;
    private String password;
    private String dateOfBirth;
    private String phone;
    private MedicalHistory medicalHistory;
    private boolean IsLoggedIn;

}
