package org.example.crudpruebafabi.service;

import org.example.crudpruebafabi.dto.UsuarioDTO;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {

    public UserDetailsService userDetailsService();

    public List<UsuarioDTO> obtenerUsuarios();

    public UsuarioDTO actualizarUsuario(Long id, UsuarioDTO usuarioDTO);

    public boolean deshabilitarUsuario(Long id);

    public boolean habilitarUsuario(Long id);

}
