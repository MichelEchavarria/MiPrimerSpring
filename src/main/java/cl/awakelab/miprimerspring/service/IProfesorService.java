package cl.awakelab.miprimerspring.service;

import cl.awakelab.miprimerspring.entity.Profesor;
import java.util.List;

public interface IProfesorService {

    List<Profesor> listarProfesores();

    Profesor listarProfesorId(int id);

    public Profesor crearProfesor(Profesor profesor);

    public Profesor actualizarProfesor(int id, Profesor profesor);

    void borrarProfesor(int id);
}

