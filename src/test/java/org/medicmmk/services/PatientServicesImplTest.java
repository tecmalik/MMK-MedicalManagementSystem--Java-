package org.medicmmk.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.request.PatientSignUpRequest;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.medicmmk.services.dto.response.PatientSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientServicesImplTest {

    @Autowired
    private PatientServicesImpl patientServiceImpl;

    @BeforeEach
    public void setUp() {
        patientServiceImpl.deleteAllPatients();
    }


    @Test
    public void A_PatientCanSignUpTest(){
        PatientSignUpRequest patientSignUpRequest = new PatientSignUpRequest();
        patientSignUpRequest.setFirstName("FirstName");
        patientSignUpRequest.setLastName("LastName");
        patientSignUpRequest.setEmail("email@email.com");
        patientSignUpRequest.setPassword("password");
        PatientSignUpResponse patientSignUpResponse = patientServiceImpl.signUp(patientSignUpRequest);
        assertThat(patientSignUpResponse, notNullValue());
        assertEquals(1,patientServiceImpl.patientsCount());
    }


}