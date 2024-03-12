package com.projet1.springdemo.employe;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryEmployeService implements EmployeService{
    private final InMemoryEmployeDao dao;

    public InMemoryEmployeService(InMemoryEmployeDao dao) {
        this.dao = dao;
    }


        @Override
    public Employe save(Employe e) {
            return dao.save(e);
    }

    @Override
    public Employe update(Employe e) {
        return dao.update(e);
    }


    @Override
    public Employe findById(int id) {
        return dao.findById(id);
    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }


    @Override
    public List<Employe> findAllEmployes() {
        return dao.findAllEmployes();
    }

}
