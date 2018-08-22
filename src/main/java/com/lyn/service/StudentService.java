package com.lyn.service;


import com.lyn.domain.Student;
import com.lyn.domain.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStu(String name){
        Student student=studentRepository.findFirstByName(name);
        return student;
    }
}
