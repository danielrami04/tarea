package com.practica.domain;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="practica01")
public class Practica01 implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPais;

    String nombre;
    String capital;
    String poblacion;
    String cantEstados;
String moneda;

    public Practica01() {  
    }

    public Practica01(String nombre, String capital, String poblacion, String cantEstados,String moneda) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.cantEstados = cantEstados;
        this.moneda = moneda;
    }
}