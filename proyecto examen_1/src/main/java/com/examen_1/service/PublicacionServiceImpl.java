
package com.examen_1.service;

import com.examen_1.dao.PublicacionDao;
import com.examen_1.domain.Publicacion;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class PublicacionServiceImpl implements PublicacionService {
    
    //se crea en tiempo de ejeccucion si aun  no se ha creado
    @Autowired
    private PublicacionDao publicacionDao;

    @Override
    @Transactional(readOnly= true)
    public List<Publicacion> getPublicaciones() {
        return (List<Publicacion>) publicacionDao.findAll();
    } 

    @Override
    @Transactional
    public void save(Publicacion publicacion) {
        publicacionDao.save(publicacion);
    }

    @Transactional
    public void delete(Publicacion publicacion) {
        publicacionDao.delete(publicacion);
    }

    @Override
    @Transactional(readOnly= true)
    public Publicacion getPublicacion(Publicacion publicacion) {
        return publicacionDao.findById(publicacion.getId_publicacion()).orElse(null);
    }
}
