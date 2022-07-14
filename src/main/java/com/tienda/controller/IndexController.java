package com.tienda.controller;

import com.tienda.service.ArticuloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ArticuloService articuloService;

    //Se crea en tiempo de ejecución si aún no se ha creado...
    @GetMapping("/")
    public String inicio(Model model) {

        var articulos = articuloService.getArticulos(true);

        model.addAttribute("articulos", articulos);
        return "index";
    }

    //@GetMapping("/nuevoCliente")
    //public String nuevoCliente(Cliente cliente) {
    //  return "modificarCliente";
    //}
    //@PostMapping("/guardarCliente")
    //public String guardarCliente (Cliente cliente){
    //clienteService.save(cliente);
    //  return "redirect:/";
    //}
    // @GetMapping("/modificarCliente/{idCliente}")
    //public String modificarCliente (Cliente cliente, Model model){
    //  cliente = clienteService.getCliente(cliente);
    //model.addAttribute("cliente", cliente);
    //return "modificarCliente";
    //}
    //@GetMapping ("/eliminarCliente/{idCliente}")
    //public String eliminarCliente(Cliente cliente){
    //clienteService.delete(cliente);
    //return "redirect:/";
    //}
}
