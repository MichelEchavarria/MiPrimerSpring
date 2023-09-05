package cl.awakelab.miprimerspring.restcontroller;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")
public class AlumnoRestController {

    @Autowired
    IAlumnoService objAlumnoService;

    @GetMapping("/{id}")
    public Alumno listarAlumnoId(@PathVariable int id) {
        return objAlumnoService.listarAlumnoId(id);
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody Alumno alumno){
        return objAlumnoService.crearAlumno(alumno);
    }
    @GetMapping
    public List<Alumno> listarAlumnos(){
        return objAlumnoService.listarAlumnos();
    }

    @PutMapping("/{id}")
    public Alumno actualizarAlumno(@PathVariable int id, @RequestBody Alumno alumno){
        return objAlumnoService.actualizarAlumno(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void borrarAlumno(@PathVariable int id){
        objAlumnoService.borrarAlumno(id);
    }
}
