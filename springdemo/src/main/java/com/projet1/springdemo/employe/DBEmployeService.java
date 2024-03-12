package com.projet1.springdemo.employe;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class DBEmployeService implements EmployeService{
    private final EmployeRepository repository;

    public DBEmployeService(EmployeRepository repository) {
        this.repository = repository;
    }//Add Constructor parameter

    @Override
    public Employe save(Employe e) {
        return repository.save(e);

    }

    @Override
    public Employe update(Employe e) {
        return repository.save(e);
    }

    @Override
    public Employe findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employe> findAllEmployes() {
        return repository.findAll();
    }
}
