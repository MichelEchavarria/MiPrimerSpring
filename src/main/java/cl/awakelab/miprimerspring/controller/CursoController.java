package cl.awakelab.miprimerspring.controller;

import cl.awakelab.miprimerspring.entity.Curso;
import cl.awakelab.miprimerspring.entity.Profesor;
import cl.awakelab.miprimerspring.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    ICursoService objCursoService;
    @GetMapping
    public String listarCurso(Model model){
        List<Curso>listaCurso = objCursoService.listarCurso();
        model.addAttribute("atributoListaCurso", listaCurso);
        return "templateListarCursos";
    }
    @PostMapping("/crearCurso")
    public String crearCurso(@ModelAttribute Curso curso) {
        objCursoService.crearCurso(curso);
        return "redirect:/curso";
    }

    @PostMapping("/editar/{id}")
    public String editarCurso(@PathVariable int id,@ModelAttribute Curso curso){
        objCursoService.actualizarCurso(id, curso);
        return "redirect:/curso";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarCurso(@PathVariable int id){
        objCursoService.eliminarCurso(id);
        return  "redirect:/curso";
    }

}