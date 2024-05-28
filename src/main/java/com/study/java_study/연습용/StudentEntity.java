package com.study.java_study.연습용;

public class StudentEntity {

    private  int studentId;
    private  String studentName;
    private  String grade;
    private  String gender;

    public StudentEntity() {
    }

    public StudentEntity(int studentId, String studentName, String grade, String gender) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.gender = gender;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", grade='" + grade + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
