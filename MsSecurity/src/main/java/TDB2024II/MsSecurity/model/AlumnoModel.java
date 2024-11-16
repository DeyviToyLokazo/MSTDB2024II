package TDB2024II.MsSecurity.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import lombok.Getter;
//import lombok.Setter;
import jakarta.persistence.Table;

//@Getter -> ya no se requiere el hacer los metodos getter and setter
//@Setter
@Entity
@Table(name="alumno")
public class AlumnoModel {
    @Id
    @Column(name = "id_alumno")
    public Integer idAlumno;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "nota")
    public double nota;

    
}
