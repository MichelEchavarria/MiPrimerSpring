package cl.awakelab.miprimerspring.service.serviceImpl;

import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.repository.IProfesorRepository;
import cl.awakelab.miprimerspring.service.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("profesorServiceImpl")
public class ProfesorServiceImpl implements IProfesorService {

    private final IProfesorRepository profesorRepository;

    @Autowired
    public ProfesorServiceImpl(IProfesorRepository profesorRepository) {
        this.profesorRepository = profesorRepository;
    }

    @Override
    public List<Profesor> listarProfesores() {
        return profesorRepository.findAll();
    }

    @Override
    public Profesor listarProfesorId(int id) {
        return profesorRepository.findById(id).orElse(null);
    }

    @Override
    public Profesor crearProfesor(Profesor profesor) {return profesorRepository.save(profesor);}

    @Override
    public Profesor actualizarProfesor(int id, Profesor profesor) {
        try {
            if (profesorRepository.existsById(id)) {
                profesor.setId(id);
                profesorRepository.save(profesor);
            } else {
                throw new RuntimeException("UPS!!!! " + id + " no existe");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return profesor;
    }

    @Override
    public void borrarProfesor(int id) {
        profesorRepository.deleteById(id);
    }
}

