package com.example.crudrapido.controller;

import com.example.crudrapido.entity.Student;
import com.example.crudrapido.service.StudentService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @GetMapping("/")
    public List<Student> getAll(){
        return studentService.getStudents();
    }

    @PostMapping
    public Student saveOrUpdate(@RequestBody Student s){
        studentService.saveOrUpdate(s);
        return s;
    }

    @DeleteMapping("/{studentId}")
    public void delete(@PathVariable("studentId") Long id){
        studentService.deleteById(id);
    }

    @GetMapping("/{studentId}")
    public Optional<Student> getStudentById(@PathVariable("studentId") Long id){
        return studentService.getStudentById(id);
    }
}
