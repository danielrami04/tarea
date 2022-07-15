
package com.phaed.controller;

import com.practica01.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        
        
        var clientes = clienteService.getClientes();
        
        model.addAttribute("clientes",clientes);
        
        return "index";
    }
}