package com.cago.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by kevin on 2016/12/16.
 */
public class StudentEntity implements Serializable {

    private static final long serialVersionUID = 3096154202413606831L;
    private ClassEntity classEntity;
    private Date studentBirthday;
    private String studentID;
    private String studentName;
    private String studentSex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ClassEntity getClassEntity() {
        return classEntity;
    }

    public void setClassEntity(ClassEntity classEntity) {
        this.classEntity = classEntity;
    }

    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }
}
