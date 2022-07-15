
package com.practica01.dao;

import com.practica01.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends  CrudRepository<Cliente, Long> {
    
}
