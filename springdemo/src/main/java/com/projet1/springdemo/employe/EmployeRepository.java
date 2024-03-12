package com.projet1.springdemo.employe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Integer> {
        Employe findById(int id);

        void deleteById(int id);
}
