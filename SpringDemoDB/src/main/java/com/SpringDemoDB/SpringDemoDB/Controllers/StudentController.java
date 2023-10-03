package com.SpringDemoDB.SpringDemoDB.Controllers;

import com.SpringDemoDB.SpringDemoDB.Models.Student;
import com.SpringDemoDB.SpringDemoDB.Repositories.StudentRepository;
import com.SpringDemoDB.SpringDemoDB.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController{

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/update/{id}")
    public Student updateStudent(@PathVariable int id){

        Student student = studentRepository.findById(id).get();
        return studentService.updateStudent(student);
    }

    @GetMapping("/getStudentWithBook")
    public List<Student> getStudentWithBook (@RequestParam String student){

    return studentService. findAllByStudent(student);
    }

}