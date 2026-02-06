package com.hospital.microservices.appointment_service.client;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class DoctorClient {

    private final WebClient webClient;

    public DoctorClient(WebClient.Builder builder) {
        this.webClient = builder.build();
    }

    public String verifyDoctor(Long doctorId) {
        return webClient
                .get()
                .uri("lb://doctor-service/doctors/hello")
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}

