package com.learn.app.controller;


import com.learn.app.dto.MultiStudentRequestDto;
import com.learn.app.dto.StudentRequestDto;
import com.learn.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(path = "/student", method = RequestMethod.POST)
    public ResponseEntity addStudent(@RequestBody StudentRequestDto studentRequestDto) {

        studentService.addStudent(studentRequestDto.getStudentName(),studentRequestDto.getPhoneNumber());
        return new ResponseEntity<>( HttpStatus.OK);
    }

    @RequestMapping(path = "/multiple_students", method = RequestMethod.POST)
    public ResponseEntity addMultipleStudents(@RequestBody MultiStudentRequestDto students) {


        for(StudentRequestDto s:students.getStudents()){
            studentService.addStudent(s.getStudentName(),s.getPhoneNumber());
        }

        return new ResponseEntity<>(HttpStatus.OK);
    }



        /*@RequestMapping(path = "/student/{id}/{name}/{phoneMunber}", method = RequestMethod.POST)
        public ResponseEntity addStudent(@PathVariable Integer id,@PathVariable String name,@PathVariable Integer phoneNumber) {

            studentService.addStudent(id,name,phoneNumber);
            return new ResponseEntity<>( HttpStatus.OK);
        }

        @RequestMapping(path = "/multiple_students", method = RequestMethod.POST)
        public ResponseEntity addMultipleStuents(@RequestBody MultiStudentRequestDto students) {

            int i=1;
            for(String studentName:students.getStudents()){
                studentService.addStudent(i++,studentName,phoneNumber);
            }

            return new ResponseEntity<>( HttpStatus.OK);
        }

        @RequestMapping(path = "/student/{id}", method = RequestMethod.GET)
        public ResponseEntity searchStudentFromId(@PathVariable Integer id) {

            // studentService.getAllStudent(name);
            return new ResponseEntity<>(studentService.getStudentOfId(id), HttpStatus.OK);*/
    }


