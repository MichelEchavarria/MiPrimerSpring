package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Curso;
import java.util.List;

public interface ICursoService {

    List<Curso> listarCursos();

    Curso listarCursoId(int id);

    public Curso crearCurso(Curso curso);

    public Curso actualizarCurso(int id, Curso curso);

    void borrarCurso(int id);
}

