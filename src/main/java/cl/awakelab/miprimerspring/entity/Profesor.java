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
@Table(name = "profesores")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column(unique = true, nullable = false, length = 50)
    private String nombre;

    @Column(length = 50)
    private String apellido1;

    @Column(length = 50)
    private String apellido2;

    @Column(length = 100)
    private String especialidad;

    @ManyToMany
    @JoinTable(name = "Curso_Profesor",
            joinColumns = @JoinColumn(name = "FK_Profesor", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "FK_Curso", nullable = false))
    private List<Curso> listarCursos;
}
