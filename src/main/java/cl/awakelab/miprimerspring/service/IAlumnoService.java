package cl.awakelab.miprimerspring.service;
import cl.awakelab.miprimerspring.entity.Alumno;
import java.util.List;

public interface IAlumnoService {
    List<Alumno> listarAlumno();

    Alumno listaAlumnoId(int idAlumno);

    Alumno crearAlumno(Alumno crearAlumno);

    Alumno actualizarAlumno(int id, Alumno alumnoActualizado);

    Alumno asignarCursoAlumno(int idAlumno, int cursoId);

    void eliminarAlumno(int id);
}