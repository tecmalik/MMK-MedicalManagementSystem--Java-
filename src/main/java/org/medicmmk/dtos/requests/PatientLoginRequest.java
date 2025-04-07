package org.medicmmk.dtos.requests;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientLoginRequest {

    private String email;
    private String password;
}