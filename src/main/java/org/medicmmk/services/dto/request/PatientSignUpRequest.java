package org.medicmmk.services.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientSignUpRequest {

    @NotBlank(message = "Email cannot be Empty")
    @NotNull(message = "name cannot be Null")
    private String FirstName;
    @NotBlank(message = "Email cannot be Empty")
    private String LastName;
    @NotNull(message = "name cannot be Null")
    @NotBlank(message = "Email cannot be Empty")
    @Email(message= "invalid Email format")
    private String email;
    @NotNull(message = "password cannot be Null")
    @NotBlank(message = "password cannot be empty")
    private String password;

}
