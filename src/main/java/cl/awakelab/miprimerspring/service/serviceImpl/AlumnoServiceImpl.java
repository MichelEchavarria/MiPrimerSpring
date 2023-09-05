package cl.awakelab.miprimerspring.service.serviceImpl;

import cl.awakelab.miprimerspring.entity.Alumno;
import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.repository.IAlumnoRepository;
import cl.awakelab.miprimerspring.repository.ICursoRepository;
import cl.awakelab.miprimerspring.service.IAlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("alumnoServiceImpl")
public class AlumnoServiceImpl implements IAlumnoService {
    @Autowired
    IAlumnoRepository objAlumnoRepo;

    @Autowired
    ICursoRepository objCursoRepo;

    @Override
    public Alumno crearAlumno(Alumno crearAlumno) {
        Alumno nuevoAlumno = new Alumno();
        Curso cursoAsignado = new Curso();
        cursoAsignado = objCursoRepo.findById(crearAlumno.getCursoAsignado().getId()).orElse(null);
        crearAlumno.setCursoAsignado(cursoAsignado);
        nuevoAlumno = objAlumnoRepo.save(crearAlumno);
        return nuevoAlumno;
    }
    @Override
    public List<Alumno> listarAlumnos() {
        return objAlumnoRepo.findAll();
    }

    @Override
    public Alumno listarAlumnoId(int id) {
        return objAlumnoRepo.findById(id).orElse(null);
    }

    @Override
    public Alumno actualizarAlumno(int id, Alumno alumnoActualizar) {
        if (objAlumnoRepo.existsById(id)) {
            alumnoActualizar.setId(id);
            objAlumnoRepo.save(alumnoActualizar);
        }
        return alumnoActualizar;
    }

    @Override
    public void borrarAlumno(int id) {
        objAlumnoRepo.deleteById(id);
    }
}

