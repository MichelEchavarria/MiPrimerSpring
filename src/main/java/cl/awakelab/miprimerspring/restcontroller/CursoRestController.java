package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curso")
public class CursoRestController {

    @Autowired
    ICursoService objCursoService;

    @GetMapping("/{id}")
    public Curso listarCursoId(@PathVariable int id) {

        return objCursoService.listarCursoId(id);
    }

    @PostMapping
    public Curso crearCurso(@RequestBody Curso curso){
        return objCursoService.crearCurso(curso);
    }

    @GetMapping
    public List<Curso> listarCursos(){

        return objCursoService.listarCursos();
    }

    @PutMapping("/{id}")
    public Curso actualizarCurso(@PathVariable int id, @RequestBody Curso curso){

        return objCursoService.actualizarCurso(id, curso);

    }

    @DeleteMapping("/{id}")
    public void borrarCurso(@RequestBody Curso curso){
        objCursoService.borrarCurso(curso.getId());
    }
}
