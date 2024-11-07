package TDB2024II.MsSecurity.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TDB2024II.MsSecurity.model.UsuarioModel;
import TDB2024II.MsSecurity.services.UsuarioService;



@RestController
@RequestMapping("usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/findAll")
    public List<UsuarioModel> findAll(){
        List<UsuarioModel> lista = usuarioService.findAll();
        return lista;
    }

    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model){
        return usuarioService.add(model);
    }

    //findById

    //update

    //eliminar

    @GetMapping("/findById/{id}")
    public UsuarioModel findById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    /* 
    @PutMapping("/update/{id}")
    public UsuarioModel update(@PathVariable Integer id, @RequestBody UsuarioModel model) {
        model.set(id); // Asigna el ID al modelo para actualizar el usuario correspondiente
        return usuarioService.update(model);
    }*/
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
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean isDeleted = usuarioService.delete(id);
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
}
