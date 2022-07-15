
package com.practica.controller;

import com.practica.dao.practica01dao;
import com.practica.domain.Practica01;
import static java.lang.Math.log;
import java.util.Arrays;
import lombok.experimental.var;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@Slf4j
public class indexController {
    @Autowired
    private Practica01dao practica01dao;
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        var practicas = practica01dao.findAll();
        model.addAttribute("practicas",practicas);
        return "index";
    }
}

