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
@Table(name="usuario")
public class UsuarioModel {
    @Id
    @Column(name = "id_usuario")
    public Integer idUsuario;

    @Column(name = "nombre")
    public String nombre;

    @Column(name = "apellido")
    public String apellidos;

    
}
