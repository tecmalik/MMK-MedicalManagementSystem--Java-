package org.medicmmk.controllers;

import jakarta.validation.Valid;
import org.medicmmk.services.DoctorServicesImpl;
import org.medicmmk.services.dto.request.DoctorLoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    @Autowired
    private DoctorServicesImpl doctorServices;

    @PostMapping("/login")
    public ResponseEntity<String> Login(@Valid @RequestBody DoctorLoginRequest doctorLoginRequest){
        return ResponseEntity.ok("Login Success");
    }


}
