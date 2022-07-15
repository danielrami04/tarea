
package com.proyecto.controller;


import com.proyecto.domain.Estado;
import com.proyecto.service.EstadoService;
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
    private EstadoService estadoService;
    
    @GetMapping("/")
    public String inicio(Model model){
        var productos = estadoService.getEstados();
        model.addAttribute("productos",productos);
        return"index";
       }
    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Producto producto){
        return "modificarProducto";
      }
    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto){
        estadoService.save(producto);
        return "redirect:/";
          }
     @GetMapping("/modificarProducto/{idproducto}")
    public String modificarProducto(Producto producto, Model model){
        producto=estadoService.getEstado(producto);
        model.addAttribute("producto",producto);
        return "modificarProducto";
    } 
    @GetMapping("/eliminarProducto/{idproducto}")
    public String eliminarProducto(Producto producto){
        estadoService.delete(producto);
        return "redirect:/";
}
}
