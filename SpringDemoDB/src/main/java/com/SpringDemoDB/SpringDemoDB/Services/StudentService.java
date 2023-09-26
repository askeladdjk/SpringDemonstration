package com.SpringDemoDB.SpringDemoDB.Services;

import com.SpringDemoDB.SpringDemoDB.Models.Student;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();
    Student saveStudent (Student student);
    Student updateStudent(Student student);

    Student studentservice();
}
