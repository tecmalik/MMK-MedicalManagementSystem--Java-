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
    private DoctorServicesImpl doctorServices;

    @Test
    void DoctorCanRegisterTest(){
        DoctorServicesImpl doctorServices = new DoctorServicesImpl();
        doctorServices.register("firstName","lastName","user@email.com","password", Specialty.NEUROLOGIST);

    }

}