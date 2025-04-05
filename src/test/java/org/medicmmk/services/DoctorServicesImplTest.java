package org.medicmmk.services;

import org.junit.jupiter.api.Test;
import org.medicmmk.data.models.Doctor;
import org.medicmmk.data.models.Specialty;
import org.medicmmk.data.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class DoctorServicesImplTest {

    @Autowired
    private DoctorRepository doctorRepository;

    @Test
    void A_DoctorCanSignUpTest(){
        DoctorRequest doctorRequest = new DoctorsRequest();
        doctor.setFirstName("FirstName");
        doctor.setLastName("LastName");
        doctor.setEmail("email@email.com");
        doctor.setPassword("password");


    }

}