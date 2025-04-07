<<<<<<<< HEAD:src/main/java/org/medicmmk/dtos/DoctorLoginRequest.java
package org.medicmmk.dtos;
========
package org.medicmmk.dtos.requests;
>>>>>>>> main:src/main/java/org/medicmmk/dtos/requests/DoctorLoginRequest.java

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DoctorLoginRequest {
    private String email;
    private String password;
}
