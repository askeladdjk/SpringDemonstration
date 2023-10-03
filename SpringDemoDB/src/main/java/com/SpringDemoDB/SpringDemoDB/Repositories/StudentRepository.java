package com.SpringDemoDB.SpringDemoDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDemoDB.SpringDemoDB.Models.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query(value = " SELECT student.name, student.school, student.course, student.FK_BookId, book.title " +
            " FROM student " +
            " LEFT JOIN book ON student.FK_bookId = book.id " +
            " WHERE student.name =:student ", nativeQuery = true)
    List<Student> findAllByStudent(@Param("student") String student);
}