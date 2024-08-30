package org.example.jpastudent.controller;


import org.example.jpastudentdat.model.Student;
import org.example.jpastudentdat.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class studentController {

    @Autowired

    private StudentRepository studentRepository;

    @GetMapping("/students")
    public List<Student> students() {
        return studentRepository.findAll();
    }
}
