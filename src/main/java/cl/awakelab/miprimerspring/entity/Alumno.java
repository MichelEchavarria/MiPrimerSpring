package cl.awakelab.miprimerspring.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 72)
    private String nombres;

    @Column(length = 30)
    private String apellido1;

    @Column(length = 30)
    private String apellido2;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_Curso")
    private Curso cursoAsignado;

}