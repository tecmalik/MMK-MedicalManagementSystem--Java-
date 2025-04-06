package org.medicmmk.services.dtos.requests;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PatientLoginRequest {

    @Email(message = "Invalid Email Format")
    @NotBlank(message = "Email cannot be Empty")
    @NotNull(message = "Email cannot be Null")
    private String email;
    @NotBlank(message = "password cannot be empty")
    @NotNull(message = "password cannot be Null")
    private String password;
}