package com.hospital.microservices.doctor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @GetMapping("/hello")
    public String hello() {
        return "Doctor Service is UP";
    }
}