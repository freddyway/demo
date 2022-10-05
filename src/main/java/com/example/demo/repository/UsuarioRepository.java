package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

//Mas cambios
public interface UsuarioRepository extends CrudRepository<Usuario,Long> {
}
