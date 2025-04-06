package org.medicmmk.services.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.medicmmk.data.models.Doctor;

@Getter
@Setter
public class DoctorSignUpRequest {
    @NotBlank(message = "Email cannot be Empty")
    @NotNull(message = "name cannot be Null")
    @Size(min = 3, message = "Name must be greater than 3 Character")
    @Size(max = 20, message = "Name must should not be greater than 20 characters")
    private String FirstName;
    @NotBlank(message = "Email cannot be Empty")
    @Size(min = 3, message = "Name must be greater than 3 Character")
    @Size(max = 20, message = "Name must should not be greater than 20 characters")
    private String LastName;
    @NotNull(message = "name cannot be Null")
    @NotBlank(message = "Email cannot be Empty")
    @Email(message= "invalid Email format")
    private String email;
    @NotNull(message = "password cannot be Null")
    @NotBlank(message = "password cannot be empty")
    private String password;

}
