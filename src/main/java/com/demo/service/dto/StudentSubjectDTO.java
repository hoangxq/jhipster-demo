package com.demo.service.dto;

import com.demo.domain.StudentSubject;

public class StudentSubjectDTO {
    private Long id;
    private StudentDTO studentDTO;
    private SubjectDTO subjectDTO;

    private Double attendancePoint;
    private Double testPoint;
    private Double practicePoint;
    private Double examPoint;
    private Double finalPoint;
    private Double gpa;
    private Double letterPoint;

    public StudentSubjectDTO(StudentSubject studentSubject, StudentDTO studentDTO, SubjectDTO subjectDTO) {
        this.id = studentSubject.getId();
        this.studentDTO = studentDTO;
        this.subjectDTO = subjectDTO;

        this.attendancePoint = studentSubject.getAttendancePoint();
        this.testPoint = studentSubject.getTestPoint();
        this.practicePoint = studentSubject.getPracticePoint();
        this.examPoint = studentSubject.getExamPoint();
        this.finalPoint = studentSubject.getFinalPoint();
        this.gpa = studentSubject.getGpa();
        this.letterPoint = studentSubject.getLetterPoint();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    public Double getAttendancePoint() {
        return attendancePoint;
    }

    public void setAttendancePoint(Double attendancePoint) {
        this.attendancePoint = attendancePoint;
    }

    public Double getTestPoint() {
        return testPoint;
    }

    public void setTestPoint(Double testPoint) {
        this.testPoint = testPoint;
    }

    public Double getPracticePoint() {
        return practicePoint;
    }

    public void setPracticePoint(Double practicePoint) {
        this.practicePoint = practicePoint;
    }

    public Double getExamPoint() {
        return examPoint;
    }

    public void setExamPoint(Double examPoint) {
        this.examPoint = examPoint;
    }

    public Double getFinalPoint() {
        return finalPoint;
    }

    public void setFinalPoint(Double finalPoint) {
        this.finalPoint = finalPoint;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getLetterPoint() {
        return letterPoint;
    }

    public void setLetterPoint(Double letterPoint) {
        this.letterPoint = letterPoint;
    }
}
