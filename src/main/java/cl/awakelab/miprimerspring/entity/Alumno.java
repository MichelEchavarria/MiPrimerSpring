package cl.awakelab.miprimerspring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.net.ssl.SSLSession;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumnos")
public class Alumno {

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

    @Column(nullable = false)
    private int edad;

    @Column(length = 100)
    private String direccion;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "FK_Curso", nullable = false)
    private Curso cursoAsignado;
}

