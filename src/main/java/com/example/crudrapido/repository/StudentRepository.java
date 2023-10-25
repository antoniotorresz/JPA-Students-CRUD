package com.example.crudrapido.repository;

import com.example.crudrapido.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    
}
