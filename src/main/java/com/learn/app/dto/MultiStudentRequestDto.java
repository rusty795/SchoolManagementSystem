package com.learn.app.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class MultiStudentRequestDto {

    List<StudentRequestDto> students=new ArrayList<>();

    public List<StudentRequestDto> getStudents() {
        return students;
    }

    public void setStudents(List<StudentRequestDto> students) {
        this.students = students;
    }
}
