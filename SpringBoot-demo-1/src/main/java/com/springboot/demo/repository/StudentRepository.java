package com.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.demo.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
