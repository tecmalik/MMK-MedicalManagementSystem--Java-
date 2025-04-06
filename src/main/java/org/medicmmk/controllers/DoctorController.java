package org.medicmmk.controllers;

import jakarta.validation.Valid;
import org.medicmmk.services.DoctorServicesImpl;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.medicmmk.services.dto.request.DoctorSignUpRequest;
import org.medicmmk.services.dto.response.DoctorLoginResponse;
import org.medicmmk.services.dto.response.DoctorSignUpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorServicesImpl doctorServices;

    @PostMapping("/Signup")
    public DoctorSignUpResponse signUpDoctor(@Valid @RequestBody DoctorSignUpRequest doctorSignUpRequest){
        return doctorServices.signUp(doctorSignUpRequest);
    }

    @PostMapping("/loggin")
    public DoctorLoginResponse loginDoctor(@RequestBody DoctorLoginRequest doctorLoginRequest){
        return doctorServices.login(doctorLoginRequest);
    }



}
