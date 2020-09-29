package com.unadopcion.unadopcion.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginControlador {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
