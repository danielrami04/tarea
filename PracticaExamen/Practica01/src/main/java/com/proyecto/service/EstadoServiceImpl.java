 
package com.proyecto.service;

import com.proyecto.dao.EstadoDao;
import com.proyecto.domain.Estado;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService{
    //se crea en tiempo de ejeccucion si aun  no se ha creado
    @Autowired
    private EstadoDao estadoDao;

    @Override
    @Transactional(readOnly= true)
    public List<Estado> getEstados() {
        return (List<Estado>) estadoDao.findAll();
    } 

    @Override
    @Transactional
    public void save(Estado estado) {
        estadoDao.save(estado);
    }

    @Override
    @Transactional
    public void delete(Estado estado) {
        estadoDao.delete(estado);
    }

    @Override
    @Transactional(readOnly= true)
    public Estado getEstado(Estado estado) {
        return estadoDao.findById(estado.getIdestado()).orElse(null);
    }
    
}
