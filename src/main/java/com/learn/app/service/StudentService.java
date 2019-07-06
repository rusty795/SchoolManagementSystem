package com.learn.app.service;

import com.learn.app.entity.StudentEntity;
import com.learn.app.jpa.StudentJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentJpaRepo studentJpaRepo;

    @Transactional
    public List<StudentEntity> getAllStudent(){

        return studentJpaRepo.findAll();

    }

    @Transactional
    public void addStudent(String name,String phoneNumber){
       StudentEntity studentEntity=new StudentEntity();
       //studentEntity.setStudentId(studentId);
       studentEntity.setStudentName(name);
       studentEntity.setStudentPhoneNumber(phoneNumber);


       studentJpaRepo.saveAndFlush(studentEntity);
    }

    public StudentEntity getStudentOfId(int id) {
        return studentJpaRepo.findOne(id);

    }
}
