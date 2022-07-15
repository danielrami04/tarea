/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.examen_1.service;

import com.examen_1.domain.Publicacion;
import java.util.List;

public interface PublicacionService {

     public List<Publicacion> getPublicaciones();
    
    public void save(Publicacion publicacion);
            
    public void delete(Publicacion publicacion);
    
    public Publicacion getPublicacion(Publicacion publicacion);
}
