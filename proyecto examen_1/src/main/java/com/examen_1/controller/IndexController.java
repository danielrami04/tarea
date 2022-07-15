/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1.controller;

import com.examen_1.domain.Publicacion;
import com.examen_1.service.PublicacionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class IndexController {
    @Autowired
    private PublicacionService publicacionService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var publicacion = publicacionService.getPublicaciones();
        model.addAttribute("publicaciones",publicacion);
        return"index";
       }
    @GetMapping("/nuevaNota")
    public String nuevoNota(Publicacion publicacion){
        return "modificar";
      }
    @PostMapping("/guardarNota")
    public String guardarNota(Publicacion publicacion){
        publicacionService.save(publicacion);
        return "redirect:/";
          }
     @GetMapping("/modificarNota/{id_publicacion}")
    public String modificarNota(Publicacion publicacion, Model model){
        publicacion=publicacionService.getPublicacion(publicacion);
        model.addAttribute("publicacion",publicacion);
        return "modificar";
    } 
    @GetMapping("/eliminarNota/{id_publicacion}")
    public String eliminarNota(Publicacion publicacion){
        publicacionService.delete(publicacion);
        return "redirect:/";
}
}
