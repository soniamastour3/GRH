package com.projet1.springdemo.employe;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryEmployeDao {
    private final List<Employe> EMPLOYES = new ArrayList<>();

    public Employe save(Employe e) {
        EMPLOYES.add(e);
        return e;
    }

    public Employe update(Employe e) {
        var employeIndex = IntStream.range(0, EMPLOYES.size())
                .filter( index -> EMPLOYES.get(index).getId() == (e.getId()))
                .findFirst()
                .orElse(-1);
        if(employeIndex > -1){
            EMPLOYES.set(employeIndex, e);
            return e;
        }
        return null;
    }

    public Employe findById(int id) {
        return  EMPLOYES.stream()
                .filter(s -> id == (s.getId()))
                .findFirst()
                .orElse(null);
    }

    public void delete(int id) {
        var employe= findById(id);
        if(employe != null){
            EMPLOYES.remove(employe);
        }
    }

    public List<Employe> findAllEmployes() {
        return EMPLOYES;
    }
}
