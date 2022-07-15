
package com.practica01.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable {
    //para utilizarlo en la generacion de la llave primaria autoincremental
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    String nombre;
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {//Cosntructor default
    }

    public Cliente(String nombre, String apellidos, String correo, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }
    
}
