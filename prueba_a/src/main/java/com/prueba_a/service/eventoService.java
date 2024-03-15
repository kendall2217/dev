
package com.prueba_a.service;

import com.prueba_a.domain.evento;

public interface eventoService {
   
    public evento getevento(evento evento);
    
    public void save(evento evento);
    
    public void delete(evento evento); 
}
