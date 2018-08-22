package com.lyn.controller;

import com.lyn.domain.Student;
import com.lyn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute Student student) {
        String name = student.getName();
        String pwd = student.getPwd();
        if (studentService.getStu(name) != null) {
            return "suc";
        }
        return "fail";
    }

    @RequestMapping(value = "/query", method = RequestMethod.POST)
    public boolean query(@RequestBody Student student) {
        Student stu = studentService.getStu(student.getName());
        if (null != stu) {
            return true;
        }
        return false;
    }

}