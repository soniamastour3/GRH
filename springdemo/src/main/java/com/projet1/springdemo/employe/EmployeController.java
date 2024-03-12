package com.projet1.springdemo.employe;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/employes")
public class EmployeController {
    private final EmployeService service;

    public EmployeController(EmployeService service) {
        this.service = service;
    }


    @PostMapping
    public Employe save(
            @RequestBody Employe employe
    ){
        return service.save(employe);
    }

    @PutMapping
    public Employe updateEmploye(
            @RequestBody  Employe employe
    ){
        return service.update(employe);
    }

    @GetMapping("/{id}")
    public Employe findById(
            @PathVariable("id")   int id
    ){
        return service .findById(id);
    }


    @DeleteMapping("/{id}")
    public void delete(
            @PathVariable("id")  int id
    ){
        service.delete(id);
    }

    @GetMapping
    public List<Employe> findAllEmployes(){
        return service.findAllEmployes();
    }

}
