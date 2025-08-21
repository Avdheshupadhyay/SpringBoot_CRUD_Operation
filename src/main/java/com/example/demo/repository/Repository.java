package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Student,Long> {
}
