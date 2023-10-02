package com.SpringDemoDB.SpringDemoDB.Services;

import com.SpringDemoDB.SpringDemoDB.Models.Book;
import com.SpringDemoDB.SpringDemoDB.Models.Student;
import com.SpringDemoDB.SpringDemoDB.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImplementation (StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public List<Student> getStudentWithBook (String student){
        return studentRepository.getStudentWithBook(student);
    }

    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student){
        return studentRepository.save(student);
    }

}
