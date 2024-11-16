package TDB2024II.MsSecurity.services;

import java.util.List;

import TDB2024II.MsSecurity.model.AlumnoModel;

public interface IAlumnoModel {
    public List<AlumnoModel> findAll();
    public AlumnoModel findById(Integer id);
    public AlumnoModel add(AlumnoModel model);
    public AlumnoModel update(AlumnoModel model);
    public Boolean delete(Integer id);
}
