package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Usuario;
import java.util.List;

public interface IUsuarioService {

    List<Usuario> listarUsuarios();

    Usuario listarUsuarioId(int id);

    public Usuario crearUsuario(Usuario usuario);

    public Usuario actualizarUsuario(int id, Usuario usuario);

    void borrarUsuario(int id);
}

