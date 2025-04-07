<<<<<<<< HEAD:src/main/java/org/medicmmk/dtos/GetDoctorProfile.java
package org.medicmmk.dtos;
========
package org.medicmmk.dtos.requests;
>>>>>>>> main:src/main/java/org/medicmmk/dtos/requests/GetDoctorProfile.java

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetDoctorProfile {
    private String username;
    private String email;
    private String password;
}
