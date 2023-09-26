package com.SpringDemoDB.SpringDemoDB.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SpringDemoDB.SpringDemoDB.Models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
