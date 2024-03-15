
package com.prueba_a.service.impl;

import com.prueba_a.dao.eventoDao;
import com.prueba_a.domain.evento;
import com.prueba_a.service.eventoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class eventoServiceImpl implements eventoService{
    
@Autowired
    private eventoDao eventoDao;

    @Transactional(readOnly=true)
    public List<evento> geteventos(boolean activos) {
        var lista=eventoDao.findAll();
        return lista;
    }
    
    @Transactional(readOnly = true)
@Override
    public evento getevento(evento evento) {
        return eventoDao.findById(evento.getIdEvento()).orElse(null);
    }

    @Transactional
@Override
    public void save(evento evento) {
        eventoDao.save(evento);
    }

    @Transactional
@Override
    public void delete(evento evento) {
        eventoDao.delete(evento);
    } 
}
