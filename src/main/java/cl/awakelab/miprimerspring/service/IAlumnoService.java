package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Alumno;
import java.util.List;

public interface IAlumnoService {
    List<Alumno> listarAlumnos();

    Alumno listarAlumnoId(int id);

    public Alumno crearAlumno(Alumno alumno);

    public Alumno actualizarAlumno(int id, Alumno alumno);

    void borrarAlumno(int id);
}
