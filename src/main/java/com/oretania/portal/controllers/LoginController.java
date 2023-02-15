package com.oretania.portal.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @GetMapping(value = { "/welcome" })
    public String welcome() {

        return "welcome";
    }

    // ejemplos controladores para las asignaturas
    // con rutas protegidas
    @GetMapping(value = { "/asignaturas/matematicas" })
    @PreAuthorize("hasAnyAuthority('DIC','MAT')")
    public String mat() {

        return "asignaturas/matematicas";
    }

    @GetMapping(value = { "/asignaturas/lengua" })
    @PreAuthorize("hasAnyAuthority('DIC','LEN')")
    public String len() {

        return "asignaturas/lengua";
    }


}