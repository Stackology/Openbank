package com.Stackology.Openbank.repository;

import com.Stackology.Openbank.model.Usuario;


/* condigo quebrado  */
 
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
