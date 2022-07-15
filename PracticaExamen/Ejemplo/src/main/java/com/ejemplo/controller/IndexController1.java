
package com.ejemplo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController1 {
    @GetMapping("/")
    public String inicio(){
          log.info("Ahora se usa arquitectura MVC");
    return"index";
  }
}
