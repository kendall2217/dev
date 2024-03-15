
package com.prueba_a.dao;

import com.prueba_a.domain.evento;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author kensa
 */
public interface eventoDao extends JpaRepository <evento, Long> {
    
}
