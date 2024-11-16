package TDB2024II.MsSecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TDB2024II.MsSecurity.model.AlumnoModel;
import TDB2024II.MsSecurity.repository.IAlumnoRepository;

@Service
public class AlumnoService implements IAlumnoModel{
    
    @Autowired // para que se pueda comunicar y reconozca directamente las clases
    IAlumnoRepository repository;

    @Override
    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>)repository.findAll();
    }

    @Override
    public AlumnoModel findById(Integer id) {
        return (AlumnoModel)repository.findById(id).get();
    }

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return repository.save(model);
    }

    @Override
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
   
}
