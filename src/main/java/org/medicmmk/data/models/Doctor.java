package org.medicmmk.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "doctor")
public class Doctor {
    @Id
    private String id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Gender gender;
    private String dateOfBirth;
    private Specialisation specialisation;
    private boolean isOnCall;
}
