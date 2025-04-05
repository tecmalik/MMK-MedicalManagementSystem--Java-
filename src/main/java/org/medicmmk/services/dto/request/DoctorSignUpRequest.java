package org.medicmmk.services.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorSignUpRequest {
    @NotBlank(message = "Email cannot be Empty")
    private String FirstName;
    @NotBlank(message = "Email cannot be Empty")
    private String LastName;
    @NotBlank(message = "Email cannot be Empty")
    @Email(message= "invalid Email format")
    private String email;

    private String password;
}
