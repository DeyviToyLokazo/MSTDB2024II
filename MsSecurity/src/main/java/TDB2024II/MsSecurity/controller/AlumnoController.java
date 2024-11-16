package TDB2024II.MsSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB2024II.MsSecurity.model.AlumnoModel;
import TDB2024II.MsSecurity.services.AlumnoService;



@RestController
@RequestMapping("alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/findAll")
    public List<AlumnoModel> findAll(){
        List<AlumnoModel> lista = alumnoService.findAll();
        return lista;
    }

    @PostMapping("/create")
    public AlumnoModel create(@RequestBody AlumnoModel model){
        return alumnoService.add(model);
    }

    //findById
    //update
    //delete

    @GetMapping("/findById/{id}")
    public AlumnoModel findById(@PathVariable Integer id) {
        return alumnoService.findById(id);
    }

    @PutMapping("/update")
    public AlumnoModel update(@RequestBody AlumnoModel model){
    return alumnoService.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean isDeleted = alumnoService.delete(id);
        return isDeleted ? "Usuario eliminado correctamente" : "Error al eliminar usuario";
    }


    /*
     try{
        abrir conexion
        insertar un registro
     }
     catch(Excepcion e){
        se producjo una excepcion
     }
     finally{
        cerrar conexion
     }
     */

         /* 
    @PutMapping("/update/{id}")
    public UsuarioModel update(@PathVariable Integer id, @RequestBody UsuarioModel newModelData) {
        UsuarioModel existingUser = usuarioService.findById(id);
        
        if (id == existingUser.idUsuario) {
            UsuarioModel userToUpdate = existingUser;

            return usuarioService.update(userToUpdate); // Guarda y retorna el usuario actualizado
        } else {
            // Manejo de error, por ejemplo lanzando una excepción o retornando un error
            throw new RuntimeException("Usuario no encontrado con id: " + id);
        }
    }*/

    
    /* 
    @PutMapping("/update/{id}")
    public UsuarioModel update(@PathVariable Integer id, @RequestBody UsuarioModel model) {
        model.set(id); // Asigna el ID al modelo para actualizar el usuario correspondiente
        return usuarioService.update(model);
    }*/
}
