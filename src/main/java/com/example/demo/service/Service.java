package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;
    public void save(Student newStudent){
        repository.save(newStudent);

    }
    public List<Student> find(){
       return repository.findAll();
    }
    public void delete(long id){
        repository.deleteById(id);
    }

}
