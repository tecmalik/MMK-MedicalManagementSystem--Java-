package org.medicmmk.dtos.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientSignUpRequest {

    private String FirstName;
    private String LastName;
    private String email;
    private String password;

}