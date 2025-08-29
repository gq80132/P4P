package com.clinic.vetApp.controller;

import com.clinic.vetApp.model.Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class AppController {

    @GetMapping("/clients")
    public List<Client> getClients() {
        System.out.println("Current client listing:");
        return Arrays.asList(
                new Client(1L, "Francis", "Fido", 12, "Dog"),
                new Client(2L, "Ellie", "Elsa", 1, "Cat"),
                new Client(3L, "Alfred", "Allie", 12, "Dog")
        );
    }

    
}
