package org.medicmmk.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.medicmmk.exceptions.DuplicateDoctorException;
import org.medicmmk.exceptions.InvalidPasswordException;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


@SpringBootTest
class DoctorServicesImplTest {

    @Autowired
    private DoctorServicesImpl doctorServiceImpl;
    @Autowired
    private DoctorServicesImpl doctorServicesImpl;

    @BeforeEach
    public void setUp() {
        doctorServiceImpl.deleteAllDoctors();
    }


    @Test
    public void A_DoctorCanSignUpTest(){
        DoctorSignUpRequest doctorSIgnUpRequest = new DoctorSignUpRequest();
        doctorSIgnUpRequest.setFirstName("FirstName");
        doctorSIgnUpRequest.setLastName("LastName");
        doctorSIgnUpRequest.setEmail("email@email.com");
        doctorSIgnUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSIgnUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        assertEquals(1,doctorServicesImpl.doctorsCount());
        }

    @Test
    public void A_DoctorCanLoginTest(){

        DoctorSignUpRequest doctorSIgnUpRequest = new DoctorSignUpRequest();
        doctorSIgnUpRequest.setFirstName("FirstName");
        doctorSIgnUpRequest.setLastName("LastName");
        doctorSIgnUpRequest.setEmail("email@email.com");
        doctorSIgnUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSIgnUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        DoctorLoginRequest doctorLoginRequest = new DoctorLoginRequest();
        doctorLoginRequest.setEmail("email@email.com");
        doctorLoginRequest.setPassword("password");
        DoctorLoginResponse doctorLoginResponse = doctorServiceImpl.login(doctorLoginRequest);
        assertThat(doctorLoginResponse, notNullValue());



    }
    @Test
    public void MoreThanOneDoctorCanSIgnUpTest(){
        DoctorSignUpRequest doctorSignUpRequest = new DoctorSignUpRequest();
        doctorSignUpRequest.setFirstName("FirstName");
        doctorSignUpRequest.setLastName("LastName");
        doctorSignUpRequest.setEmail("email@email.com");
        doctorSignUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSignUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        assertEquals(1,doctorServicesImpl.doctorsCount());
        DoctorSignUpRequest doctorSignUpRequestTwo = new DoctorSignUpRequest();
        doctorSignUpRequestTwo.setFirstName("SecondFirstName");
        doctorSignUpRequestTwo.setLastName("SecondLastName");
        doctorSignUpRequestTwo.setEmail("SecondEmail@email.com");
        doctorSignUpRequestTwo.setPassword("SecondPassword");
        DoctorSignUpResponse doctorSignUpResponseTwo = doctorServiceImpl.signUp(doctorSignUpRequestTwo);
        assertThat(doctorSignUpResponseTwo, notNullValue());
        assertEquals(2,doctorServicesImpl.doctorsCount());

    }

    @Test
    public void DuplicateDoctorSignUpTest(){
        DoctorSignUpRequest doctorSignUpRequest = new DoctorSignUpRequest();
        doctorSignUpRequest.setFirstName("FirstName");
        doctorSignUpRequest.setLastName("LastName");
        doctorSignUpRequest.setEmail("email@email.com");
        doctorSignUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSignUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        assertEquals(1,doctorServicesImpl.doctorsCount());
        DoctorSignUpRequest doctorSignUpRequestTwo = new DoctorSignUpRequest();
        doctorSignUpRequestTwo.setFirstName("FirstName");
        doctorSignUpRequestTwo.setLastName("LastName");
        doctorSignUpRequestTwo.setEmail("email@email.com");
        doctorSignUpRequestTwo.setPassword("password");
        assertThrows( DuplicateDoctorException.class , ()-> doctorServiceImpl.signUp(doctorSignUpRequestTwo));
        assertEquals(1,doctorServicesImpl.doctorsCount());
    }
    @Test
    public void DoctorCanNotLoginWithInvalidUserPassword_Test(){
        DoctorSignUpRequest doctorSIgnUpRequest = new DoctorSignUpRequest();
        doctorSIgnUpRequest.setFirstName("FirstName");
        doctorSIgnUpRequest.setLastName("LastName");
        doctorSIgnUpRequest.setEmail("email@email.com");
        doctorSIgnUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSIgnUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        DoctorLoginRequest doctorLoginRequest = new DoctorLoginRequest();
        doctorLoginRequest.setEmail("email@email.com");
        doctorLoginRequest.setPassword("WrongPassword");
        assertThrows( InvalidPasswordException.class,()->doctorServiceImpl.login(doctorLoginRequest));

    }
    @Test
    public void DoctorCanNotLoginWithInvalidUserUserName_Test(){
        DoctorSignUpRequest doctorSIgnUpRequest = new DoctorSignUpRequest();
        doctorSIgnUpRequest.setFirstName("FirstName");
        doctorSIgnUpRequest.setLastName("LastName");
        doctorSIgnUpRequest.setEmail("email@email.com");
        doctorSIgnUpRequest.setPassword("password");
        DoctorSignUpResponse doctorSignUpResponse = doctorServiceImpl.signUp(doctorSIgnUpRequest);
        assertThat(doctorSignUpResponse, notNullValue());
        DoctorLoginRequest doctorLoginRequest = new DoctorLoginRequest();
        doctorLoginRequest.setEmail("email@email.com");
        doctorLoginRequest.setPassword("WrongPassword");
        assertThrows( InvalidPasswordException.class,()->doctorServiceImpl.login(doctorLoginRequest));

    }





}
