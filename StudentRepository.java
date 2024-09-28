package com.spring.web.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.SpringSecurity.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{
	
}
