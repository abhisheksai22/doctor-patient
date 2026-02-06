package com.hospital.microservices.appointment_service.controller;

import com.hospital.microservices.appointment_service.client.DoctorClient;
import com.hospital.microservices.appointment_service.client.PatientClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointments")
public class AppointmentController {

    private final DoctorClient doctorClient;
    private final PatientClient patientClient;

    public AppointmentController(DoctorClient doctorClient,
                                 PatientClient patientClient) {
        this.doctorClient = doctorClient;
        this.patientClient = patientClient;
    }

    @GetMapping("/create")
    public String createAppointment() {

        String doctorResponse = doctorClient.verifyDoctor(1L);
        String patientResponse = patientClient.verifyPatient(1L);

        return doctorResponse +  " ... "+patientResponse;
    }
}


