package com.study.java_study.연습용;

import com.study.java_study.ch08_클래스03.Student;

public class StudentRepository {

    // 학생Id
    private int studentId;

    public int autoIncrementId(){
        return ++studentId;
    }


    // <학생등록>
    // 1. 배열 확장
    private StudentEntity[] students;

    private void extendStudent(){
        StudentEntity[] newStudents = new StudentEntity[students.length + 1];

        for (int i= 0; i < students.length; i++){
            newStudents[i] = students[i];
        }
        students = newStudents;
    }
    // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온  객체를 대입한다.
    private int getLastIndex(){
        return students.length -1;
    }

    public void saveStudent(StudentEntity student){
        extendStudent();

        students[getLastIndex()] = student;
    }

    // 학생검색
    private int getNewArraySize(int option, String searchText){
        int newArraySize = 0;

        switch (option) {
            case 1: // 통합검색
                for(StudentEntity student : students) {
                    if (student.getGrade().contains(searchText)
                            || student.getGender().contains(searchText)
                            || student.getStudentName().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;
            case 2: // 학년검색
                for(StudentEntity student : students) {
                    if (student.getGrade().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;
            case 3: // 성별검색
                for(StudentEntity student : students) {
                    if(student.getGender().contains(searchText)){
                        newArraySize++;
                    }
                }
                break;
            case 4: // 이름 검색
                for(StudentEntity student : students) {
                    if(student.getStudentName().contains(searchText)){
                        newArraySize++;
                    }
                }

        }
        return newArraySize;
    }

    public StudentEntity[] searchStudents (int option, String searchText){
        int newArraySize = getNewArraySize(option, searchText);
        StudentEntity[] searchStudents = new StudentEntity[newArraySize];

        int i = 0;
        switch (option){
            case 1:
                for(StudentEntity student : students) {
                    if (student.getGrade().contains(searchText)
                            || student.getGender().contains(searchText)
                            || student.getStudentName().contains(searchText)){
                        searchStudents[i] = student;
                        i++;
                    }
                }
                break;
            case 2:
                for(StudentEntity student : students) {
                    if (student.getGrade().contains(searchText)){
                        searchStudents[i] = student;
                        i++;
                    }
                }
                break;
            case 3:
                for(StudentEntity student : students) {
                    if(student.getGender().contains(searchText)){
                        searchStudents[i] = student;
                        i++;
                    }
                }
                break;
            case 4:
                for(StudentEntity student : students) {
                    if(student.getStudentName().contains(searchText)){
                        searchStudents[i] = student;
                        i++;
                    }
                }
        }
        return searchStudents;
    }


}
