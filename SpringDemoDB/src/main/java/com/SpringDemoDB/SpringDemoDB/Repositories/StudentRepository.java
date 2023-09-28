package com.SpringDemoDB.SpringDemoDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDemoDB.SpringDemoDB.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query(value = "SELECT student.name, student.school, student.course, book.id, book.title " +
            "FROM student LEFT JOIN book ON student.id = book.id " +
            "WHERE student.name = :student " +
            "ORDER BY book.id ASC", nativeQuery = true)

    List<Student> getStudentWithBook(@Param("student") String student);
}