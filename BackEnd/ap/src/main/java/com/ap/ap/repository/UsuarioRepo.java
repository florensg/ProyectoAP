package com.ap.ap.repository;

import com.ap.ap.models.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepo extends JpaRepository<Usuario, Long>{
    public List<Usuario> findByUserAndPassword(String user, String password);
}
