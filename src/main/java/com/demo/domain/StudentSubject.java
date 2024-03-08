package com.demo.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tbl_student_subjects")
public class StudentSubject extends AbstractAuditingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    @Column(name = "attendance_point")
    private Double attendancePoint;

    @Column(name = "test_point")
    private Double testPoint;

    @Column(name = "practice_point")
    private Double practicePoint;

    @Column(name = "exam_point")
    private Double examPoint;

    @Column(name = "final_point")
    private Double finalPoint;

    @Column(name = "gpa")
    private Double gpa;

    @Column(name = "letter_point")
    private Double letterPoint;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
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
