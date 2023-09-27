package com.SpringDemoDB.SpringDemoDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDemoDB.SpringDemoDB.Models.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT student.name, student.school, student.course, book.id, book.title " +
            "FROM student RIGHT JOIN book ON student.id = book.id ORDER BY book.id ASC", nativeQuery = true)
    List<Student> getStudentWithBook(String getStudentWithBook);

}
