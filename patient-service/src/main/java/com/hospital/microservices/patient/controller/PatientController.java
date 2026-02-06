package com.hospital.microservices.patient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @GetMapping("/hello")
    public String hello() {
        return "Patient Service is UP";
    }
}

