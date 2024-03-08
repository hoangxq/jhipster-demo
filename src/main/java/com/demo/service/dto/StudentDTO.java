package com.demo.service.dto;

import com.demo.domain.Student;

public class StudentDTO {
    private Long id;
    private String fullName;
    private String address;
    private String phoneNumber;

    public StudentDTO(Student student) {
        this.id = student.getId();
        this.fullName = student.getFullName();
        this.address = student.getAddress();
        this.phoneNumber = student.getPhoneNumber();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
