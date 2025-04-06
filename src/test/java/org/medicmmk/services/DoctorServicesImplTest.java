package org.medicmmk.services;

import org.junit.jupiter.api.Test;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class DoctorServicesImplTest {

    @Autowired
    private DoctorServicesImpl doctorServiceImpl;

    @Test
    void A_DoctorCanSignUpTest(){
        DoctorSignUpRequest doctorSIgnUpRequest = new DoctorSignUpRequest();
        doctorSIgnUpRequest.setFirstName("FirstName");
        doctorSIgnUpRequest.setLastName("LastName");
        doctorSIgnUpRequest.setEmail("email@email.com");
        doctorSIgnUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSIgnUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        }
    @Test
    void A_DoctorCanLogin(){
        DoctorLoginRequest doctorLoginRequest = new DoctorLoginRequest();
        doctorLoginRequest.setEmail("email@email.com");
        doctorLoginRequest.setPassword("password");
        DoctorLoginResponse doctorLoginResponse = doctorServiceImpl.login(doctorLoginRequest);
        assertThat(doctorLoginResponse, notNullValue());


    }

}
