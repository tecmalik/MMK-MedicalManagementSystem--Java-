package org.medicmmk.controllers;

import jakarta.validation.Valid;
import org.medicmmk.services.DoctorServicesImpl;
import org.medicmmk.services.PatientServicesImpl;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.request.PatientLoginRequest;
import org.medicmmk.services.dto.request.PatientSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.medicmmk.services.dto.response.PatientLoginResponse;
import org.medicmmk.services.dto.response.PatientSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientServicesImpl patientServices;

    @PostMapping("/Signup")
    public PatientSignUpResponse signUpPatient(@Valid @RequestBody PatientSignUpRequest patientSignUpRequest){
        return patientServices.signUp(patientSignUpRequest);
    }

    @PostMapping("/login")
    public PatientLoginResponse loginPatient(@RequestBody PatientLoginRequest patientLoginRequest){
        return patientServices.login(patientLoginRequest);
    }



}
