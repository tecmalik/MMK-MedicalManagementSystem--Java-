package org.medicmmk.data.models;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.aot.generate.GeneratedTypeReference;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@NoArgsConstructor
@Data
public class Doctor {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private Gender gender;
    private String password;
    private Specialty specialization;
    private boolean isOnCall;


}
