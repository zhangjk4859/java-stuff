package com.cago.mapper;

import com.cago.model.StudentEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by kevin on 2016/12/16.
 */
/*
接口没有实现
 */
@Repository
@Transactional
public class StudentMapper {

    public StudentEntity getStudent(String studentID){
        return null;
    };

    public StudentEntity getStudentAndClass(String studentID){
        return null;
    };

    public List<StudentEntity> getStudentAll(){
        return null;
    };

    public void insertStudent(StudentEntity entity){

    };

    public void deleteStudent(StudentEntity entity){

    };

    public void updateStudent(StudentEntity entity){

    };
}
