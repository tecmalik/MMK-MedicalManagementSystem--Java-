package org.medicmmk.services.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorLoginRequest {
    @Email(message = "Invalid Email Format")
    @NotBlank(message = "Email cannot be Empty")
    private String email;
    @NotBlank(message = "password cannot be empty")
    private String password;
}
