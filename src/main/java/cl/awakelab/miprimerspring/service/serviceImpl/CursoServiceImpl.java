package cl.awakelab.miprimerspring.service.serviceImpl;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.repository.ICursoRepository;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements ICursoService {

    @Autowired
    ICursoRepository objCursoRepo;

    @Autowired
    public CursoServiceImpl(ICursoRepository cursoRepository) {
        this.objCursoRepo = cursoRepository;
    }

    @Override
    public List<Curso> listarCursos() {
        return objCursoRepo.findAll();
    }

    @Override
    public Curso listarCursoId(int id) {
        return objCursoRepo.findById(id).orElse(null);
    }

    @Override
    public Curso crearCurso(Curso curso) {
        return objCursoRepo.save(curso);
    }

    @Override
    public Curso actualizarCurso(int id, Curso curso) {
        if (objCursoRepo.existsById(id)) {
            curso.setId(id);
            objCursoRepo.save(curso);
        }
        return curso;
    }

    @Override
    public void borrarCurso(int id) {
        objCursoRepo.deleteById(id);
    }
}

