package TDB2024II.MsSecurity.services;

import java.util.List;

import TDB2024II.MsSecurity.model.UsuarioModel;

public interface IUsuarioService {
    public List<UsuarioModel> findAll();
    public UsuarioModel findById(Integer id);
    public UsuarioModel add(UsuarioModel model);
    public UsuarioModel update(UsuarioModel model);
    public Boolean delete(Integer id);
}
