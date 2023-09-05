package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(unique = true, nullable = false, length = 50)
    private String nombre;

    @Column(length = 100)
    private String descripcion;

    @Column(nullable = false)
    private int duracionHoras;

    @Column(length = 30)
    private String instructor;

    @ManyToMany(mappedBy = "listaCursos")
    private List<Profesor> listaProfesores;

    @OneToMany(MappedBy ="CursoAsignado")
    private  List<Alumno> listaAlumnos;
}
