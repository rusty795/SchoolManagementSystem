package com.learn.app.controller;


import com.learn.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(path = "/students", method = RequestMethod.GET)
    public ResponseEntity getQuestion() {

        return new ResponseEntity<>(studentService.getAllStudent(), HttpStatus.OK);
    }

    @RequestMapping(path = "/student/{id}/{name}", method = RequestMethod.POST)
    public ResponseEntity getQuestion(@PathVariable Integer id,@PathVariable String name) {

        studentService.addStudent(id,name);
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
    public ResponseEntity searchStudentFromId(@PathVariable Integer id) {

        // studentService.getAllStudent(name);
        return new ResponseEntity<>(studentService.getStudentOfId(id), HttpStatus.OK);
    }

}
