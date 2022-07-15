
package com.examen_1.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="publicacion")
public class Publicacion implements Serializable{
    //para utlizarlo en la generacion de la llave primaria autoincrmental
    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_publicacion;
    String titulo;
    String paginas;
    String fecha_publicacion;
    public Publicacion(){//Constructor default
        
    }
        public Publicacion(String titulo,String paginas,String fecha_publicacion){
        this.titulo = titulo;
        this.paginas = paginas;
        this.fecha_publicacion = fecha_publicacion;
    }
}
