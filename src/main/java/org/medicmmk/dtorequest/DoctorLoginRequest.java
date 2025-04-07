package org.medicmmk.dtorequest;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DoctorLoginRequest {
    private String email;
    private String password;
}
