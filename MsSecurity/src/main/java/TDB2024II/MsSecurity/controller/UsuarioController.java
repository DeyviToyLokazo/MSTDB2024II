package TDB2024II.MsSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model){
        return usuarioService.add(model);
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
