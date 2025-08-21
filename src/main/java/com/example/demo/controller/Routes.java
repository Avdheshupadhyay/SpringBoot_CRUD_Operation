package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class Routes {

    @Autowired
    private Service service;


    @GetMapping("/")
    public String home() {
        return "home";
    }


    @PostMapping("/saveStudent")
    public String register(@ModelAttribute Student newStudent) {
        service.save(newStudent);
        return "redirect:show";
    }


    @GetMapping("/show")
    public String show(Model model) {
        List<Student> listOfStudent = service.find();
        model.addAttribute("AllStudent", listOfStudent);
//        for(Student s:listOfStudent) {
//            System.out.println(s.getId() + " ," + s.getName() + "," + s.getSection());
//        }

        return "AllStudent";
    }
    @GetMapping("/register")
    public String register(){
        return "StudentForm";
    }
    @GetMapping("/delete")
    public String delete(){
        return "delete";
    }
    @PostMapping("/deleteById")
    public String remove(@ModelAttribute Student student){
        long id=student.getId();
        service.delete(id);
        return "redirect:/show";
    }
}
