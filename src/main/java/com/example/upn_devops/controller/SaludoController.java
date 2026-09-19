package com.example.upn_devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SaludoController {

    @GetMapping("/saludo")
    public String enviarSaludo() {
        return "¡Hola! Saludos desde la API Web desarrollada para la UPN. By: Anderson Belleza";
    }
}