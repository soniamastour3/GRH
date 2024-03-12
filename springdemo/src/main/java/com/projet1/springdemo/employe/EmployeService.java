package com.projet1.springdemo.employe;



import java.util.List;


public interface EmployeService {
    Employe save(Employe e);
    Employe update(Employe e);
    Employe findById(int id);
    void delete(int id);
    List<Employe> findAllEmployes();
}
