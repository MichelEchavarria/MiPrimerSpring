package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Usuario;
import cl.awakelab.miprimerspring.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioRestController {

    @Autowired
    IUsuarioService objUsuarioService;

    @GetMapping("/{id}")
    public Usuario listarUsuarioId(@PathVariable int id) {

        return objUsuarioService.listarUsuarioId(id);
    }

    @PostMapping
    public Usuario crearUsuario(@RequestBody Usuario usuario) {

        return objUsuarioService.crearUsuario(usuario);

    }

    @GetMapping
    public List<Usuario> listarUsuarios() {

        return objUsuarioService.listarUsuarios();
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable int id, @RequestBody Usuario usuario){

        return objUsuarioService.actualizarUsuario(id, usuario);

    }

    @DeleteMapping("/{id}")
    public void borrarUsuario(@PathVariable int id){
        objUsuarioService.borrarUsuario(id);
    }
}
