package com.hospital.microservices.appointment_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class PatientClient {

    private final WebClient webClient;

    public PatientClient(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public String verifyPatient(Long patientId) {
        return webClient
                .get()
                .uri("lb://patient-service/patients/hello")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}

