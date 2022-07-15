
package com.proyecto.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="estado")
public class Estado implements Serializable {
    //para utlizarlo en la generacion de la llave primaria autoincrmental
    private static final long serialVersionUID = 1L;
    
  @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idestado;
    String nombre;
    String codigopostal;
    String capital;
    String poblacion;
    String Costas;
    
    public Estado(){//Constructor default
    }

    public Estado(String nombre,String codigopostal ,String capital, String poblacion, String costas) {
        this.nombre = nombre;
        this.codigopostal = codigopostal;
        this.capital = capital;
        this.poblacion = poblacion;
        this.Costas = costas;
    }    
    
}
