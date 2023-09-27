package com.SpringDemoDB.SpringDemoDB.Services;

import com.SpringDemoDB.SpringDemoDB.Models.Student;

import java.rmi.StubNotFoundException;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    List<Student> getStudentWithBook(String getStudentWithBook);
    Student saveStudent (Student student);
    Student updateStudent(Student student);
    Student studentservice();
}
