package com.ap.ap.repository;

import com.ap.ap.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    
}
