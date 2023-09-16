package cl.awakelab.miprimerspring.service;
import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.entity.Profesor;

import java.util.List;

public interface ICursoService {
    List<Curso> listarCurso();
    Curso listaCursoId(int idCurso);

    Curso crearCurso(Curso cursoCreador);

    Curso actualizarCurso(int id, Curso cursoActualizado);

    Curso asignarProfesorACurso(Curso curso, Profesor profesor);

    void eliminarCurso(int id);
}