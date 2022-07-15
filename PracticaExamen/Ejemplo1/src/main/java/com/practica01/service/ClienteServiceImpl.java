
package com.practica01.service;
import com.practica01.dao.ClienteDao;
import com.practica01.domain.Cliente;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceImpl implements ClienteService{
    //Se crea en tiempo de ejecucion si aun no se ha creado
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional(readOnly = true)
    public List<Cliente> getClientes() {
        return (List<Cliente>) clienteDao.findAll();
    }

    @Override
    @Transactional
    public void save(Cliente cliente) {
        clienteDao.save(cliente);    
    }

    @Override
    @Transactional
    public void delete(Cliente cliente) {
         clienteDao.delete(cliente);  
        
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    } 
    
}
