package com.cago.mapper;

import com.cago.model.StudentEntity;

import java.util.List;

/**
 * Created by kevin on 2016/12/16.
 */
public class StudentMapper {

    public StudentEntity getStudent(String studentID);

    public StudentEntity getStudentAndClass(String studentID);

    public List<StudentEntity> getStudentAll();

    public void insertStudent(StudentEntity entity);

    public void deleteStudent(StudentEntity entity);

    public void updateStudent(StudentEntity entity);
}
