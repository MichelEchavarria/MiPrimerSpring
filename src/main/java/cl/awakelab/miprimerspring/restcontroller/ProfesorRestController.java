package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/profesor")
public class ProfesorRestController {

    @Autowired
    IProfesorService objProfesorService;

    @GetMapping("/{id}")
    public Profesor listarProfesorId(@PathVariable int id) {

        return objProfesorService.listarProfesorId(id);
    }

    @PostMapping
    public Profesor crearProfesor(@RequestBody Profesor profesor){

        return objProfesorService.crearProfesor(profesor);

    }
    @GetMapping
    public List<Profesor> listarProfesor(){

        return objProfesorService.listarProfesores();
    }

    @PutMapping("/{id}")
    public Profesor actualizarProfesor(@PathVariable int id, @RequestBody Profesor profesor){

        return objProfesorService.actualizarProfesor(id, profesor);

    }

    @DeleteMapping("/{id}")
    public void borrarProfesor(@PathVariable int id, Profesor profesor){
        objProfesorService.borrarProfesor(profesor.getId());
    }
}
